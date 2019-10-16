package com.esoon.capitaleasygo.action.whereusedinproject;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.xml.soap.SOAPBody;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.acconsys.cws.CisServer;
import com.acconsys.cws.SOAPClient;
import com.acconsys.cws.SOAPRequest;
import com.acconsys.cws.SOAPResponse;

public class CisUtil {

	private static final PropertieUtil propertieUtil = new PropertieUtil()
			.getPropertieUtil();
	public static final String IP = propertieUtil.getValue(Constants.CIS_IP);
	public static final String PORT = propertieUtil
			.getValue(Constants.CIS_PORT);
	public static final String USERNAME = propertieUtil
			.getValue(Constants.CIS_USERNAME);
	public static final String PASSWORD = propertieUtil
			.getValue(Constants.CIS_PASSWORD);

	private static CisUtil cisUtil;

	public static CisUtil getCisUtil() {
		if (cisUtil == null) {
			cisUtil = new CisUtil();
		}
		return cisUtil;
	}

	public static List<String> getProjectList() throws Exception {

		List<String> projectList = new ArrayList<String>();
		projectList.add(propertieUtil.getValue(
				Constants.PROJECT_NAME));
		// projectList.add("Test2");
		// projectList.add("test1");
		// projectList.add("test");
		// projectList.add("CapitalDemo");
		// CisServer server = new CisServer(IP, Integer.parseInt(PORT));
		// SOAPRequest request = new SOAPRequest();
		// request.setUsername(USERNAME);
		// request.setPassword(PASSWORD);
		// request.setPayload("<projects/>");
		// request.build(true);
		// SOAPClient client = new SOAPClient();
		// SOAPResponse response = client.callService(request,
		// server.getProjectsListService());
		//
		// SOAPBody body = response.getResponse().getSOAPBody();
		// NodeList nodeList = body.getChildNodes();
		// if (nodeList != null) {
		// for (int i = 0; i < nodeList.getLength(); i++) {
		// Node node = nodeList.item(i);
		// if ("projects".equals(node.getNodeName())
		// && node instanceof Element) {
		// // 开始循环遍历projects
		// NodeList projects = node.getChildNodes();
		// if (projects != null) {
		// for (int j = 0; j < projects.getLength(); j++) {
		// Node project = projects.item(j);
		// if ("project".equals(project.getNodeName())
		// && project instanceof Element) {
		// Node projectNameNode = project
		// .getAttributes().getNamedItem(
		// "name");
		// String projectName = projectNameNode
		// .getNodeValue();
		// System.out.println("projectName:"
		// + projectName);
		// projectList.add(projectName);
		// }
		// }
		// }
		// }
		// }
		// }
		return projectList;

	}

	public static List<String> getAllProjectName() throws Exception {
		List<String> projectList = new ArrayList<String>();
		CisServer server = new CisServer(IP, Integer.parseInt(PORT));
		SOAPRequest request = new SOAPRequest();
		request.setUsername(USERNAME);
		request.setPassword(PASSWORD);
		request.setPayload("<projects/>");
		request.build(true);
		SOAPClient client = new SOAPClient();
		SOAPResponse response = client.callService(request,
				server.getProjectsListService());

		SOAPBody body = response.getResponse().getSOAPBody();
		NodeList nodeList = body.getChildNodes();
		if (nodeList != null) {
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				if ("projects".equals(node.getNodeName())
						&& node instanceof Element) {
					// 开始循环遍历projects
					NodeList projects = node.getChildNodes();
					if (projects != null) {
						for (int j = 0; j < projects.getLength(); j++) {
							Node project = projects.item(j);
							if ("project".equals(project.getNodeName())
									&& project instanceof Element) {
								Node projectNameNode = project.getAttributes()
										.getNamedItem("name");
								String projectName = projectNameNode
										.getNodeValue();
								System.out
										.println("projectName:" + projectName);
								projectList.add(projectName);
							}
						}
					}
				}
			}
		}
		return projectList;
	}

	public List<DesignModelUI> getDesignByProjectName(String projectName)
			throws Exception {
		List<DesignModelUI> designModelUIList = new ArrayList<DesignModelUI>();
		JOptionPane.showMessageDialog(null, "IP:" + IP + "PORT:" + PORT
				+ "USERNAME:" + USERNAME + "PASSWORD:" + PASSWORD + "PROJECT"
				+ projectName);
		CisServer server = new CisServer(IP, Integer.parseInt(PORT));
		SOAPRequest request = new SOAPRequest();
		request.setUsername(USERNAME);
		request.setPassword(PASSWORD);
		request.setPayload("<project name='" + projectName + "'/>");
		request.build(true);
		SOAPClient client = new SOAPClient();
		SOAPResponse response = client.callService(request,
				server.getDesignsListService());
		File designFile = new File(propertieUtil.getValue(
				Constants.FILE_DIR)
				+ "_Design"
				+ "_"
				+ new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())
				+ ".xml");
		if (!designFile.exists()) {
			designFile.createNewFile();
		}
		if (!designFile.exists()) {
			JOptionPane.showMessageDialog(null, designFile.getName() + "不存在！");
		}

		response.saveBody(designFile);
		SOAPBody body = response.getResponse().getSOAPBody();
		if (body.hasChildNodes()) {

			NodeList nodeList = body.getElementsByTagName("design");
			if (nodeList != null) {
				for (int i = 0; i < nodeList.getLength(); i++) {
					Node node1 = nodeList.item(i);
					if ("design".equals(node1.getNodeName())) {
						Node type = node1.getAttributes().getNamedItem(
								"designtype");
						if(type!=null){
							String designType = type.getNodeValue();
							if ("logicdesign".equals(designType)
									|| "harnessdesign".equals(designType)) {
								Node name = node1.getAttributes().getNamedItem(
										"name");
								Node revision = node1.getAttributes().getNamedItem(
										"revision");
								String designName = name.getNodeValue();
								String designRevision = revision.getNodeValue();
								DesignModelUI designModelUI = new DesignModelUI();
								designModelUI.setDesignName(designName);
								designModelUI.setDesignRevision(designRevision);
								designModelUI.setProjectName(projectName);
								designModelUIList.add(designModelUI);
							}
							
						}
					}

				}
			}
		}
		return designModelUIList;
	}

	public void getComponentUsedInfoInDesign(String projectName,
			String designName, String designRevision,
			Map<String, ComponentUsedModel> map) throws Exception {

		CisServer server = new CisServer(IP, Integer.parseInt(PORT));
		SOAPRequest request = new SOAPRequest();
		request.setUsername(USERNAME);
		request.setPassword(PASSWORD);
		// request.setPayload("<wiringdesign designtype='Logic' name='Design' projectname='Test2' revision='C' shortdesc=''/>");
		request.setPayload("<wiringdesign name='" + designName
				+ "' projectname='" + projectName + "' revision='"
				+ designRevision + "' />");
		request.build(true);
		SOAPClient client = new SOAPClient();
		SOAPResponse response = client.callService(request,
				server.getDesignBridgeOutService());

		SOAPBody body = response.getResponse().getSOAPBody();

		if (body != null) {
			NodeList nodeList = body.getChildNodes();
			if (nodeList != null) {

				for (int i = 0; i < nodeList.getLength(); i++) {
					Node node = nodeList.item(i);
					if ("wiringdesign".equals(node.getNodeName())
							|| "harnessdesign".equals(node.getNodeName())) {
						NodeList nodeList1 = node.getChildNodes();
						if (nodeList1 != null) {
							for (int j = 0; j < nodeList1.getLength(); j++) {
								Node node1 = nodeList1.item(j);
								if (node1 instanceof Element) {
									Node attrNode = node1.getAttributes()
											.getNamedItem("partnumber");
									if (attrNode != null) {
										String partNumber = attrNode
												.getNodeValue();
										if (map.get(partNumber) == null) {
											ProjectModel pModel = new ProjectModel();
											Map<String, Integer> designMap = new HashMap<String, Integer>();
											designMap.put(designName
													+ designRevision, 1);
											pModel.setDesignMap(designMap);
											pModel.setUsedInAllDesignCount(1);
											Map<String, ProjectModel> projectMap = new HashMap<String, ProjectModel>();
											projectMap.put(projectName, pModel);
											ComponentUsedModel cModel = new ComponentUsedModel();
											cModel.setProjectMap(projectMap);
											cModel.setUsedInAllProjectCount(1);
											map.put(partNumber, cModel);
										} else {
											ComponentUsedModel cModel = map
													.get(partNumber);
											Map<String, ProjectModel> projectMap = cModel
													.getProjectMap();
											ProjectModel pModel = projectMap
													.get(projectName);
											if (pModel == null) {
												pModel = new ProjectModel();
												Map<String, Integer> designMap = new HashMap<String, Integer>();
												designMap.put(designName + "_"
														+ designRevision, 1);
												pModel.setDesignMap(designMap);
												pModel.setUsedInAllDesignCount(1);
												projectMap.put(projectName,
														pModel);
											} else {
												Map<String, Integer> designMap = pModel
														.getDesignMap();
												if (designMap == null) {
													designMap = new HashMap<String, Integer>();
													designMap
															.put(designName
																	+ designRevision,
																	1);
												} else {
													Integer designCount = designMap
															.get(designName
																	+ designRevision);
													if (designCount == null) {
														designMap
																.put(designName
																		+ designRevision,
																		1);
													} else {
														designMap
																.put(designName
																		+ designRevision,
																		designCount + 1);
													}
												}
												pModel.setUsedInAllDesignCount(pModel
														.getUsedInAllDesignCount() + 1);
											}
											cModel.setUsedInAllProjectCount(cModel
													.getUsedInAllProjectCount() + 1);
										}
									}
								}
							}
						}
					}
				}

			}

		}

	}
}
