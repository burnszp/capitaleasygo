
/**  
 * @Title: MingXiBiaoTest.java
 * @Package com.esoon.capitaleasygo.action.docgen
 * @Description: TODO(用一句话描述该文件做什么)
 * @author 35725
 * @date 2019年11月13日 上午11:01:13 
 * @version V1.0  
 */

package com.esoon.capitaleasygo.action.docgen;

import java.io.File;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.SAXParserFactory;

import org.apache.commons.io.FileUtils;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import com.mentor.capital.project.Capitaltopologydesign;
import com.mentor.capital.project.Connectivity;
import com.mentor.capital.project.Designmgr;
import com.mentor.capital.project.Harnessdesign;
import com.mentor.capital.project.Harnessdiagram;
import com.mentor.capital.project.Project;
import com.mentor.capital.project.Property;
import com.mentor.capital.project.Wire;

/**
 * @ClassName: MingXiBiaoTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 35725
 * @date 2019年11月13日
 *
 */

public class MingXiBiaoTest {

	static Project project = null;
//	static String filePath = "C:\\Users\\35725\\eclipse-workspace\\capitaleasygo\\docs\\DocGen\\Project\\project\\DocGentTest.xml";
//	static String filePath = "C:\\Users\\35725\\eclipse-workspace\\capitaleasygo\\docs\\DocGen\\Project\\project\\Test_PDM集成.xml";
//	static String filePath = "C:\\Users\\35725\\eclipse-workspace\\capitaleasygo\\docs\\DocGen\\Project\\project\\Automotive Generative.xml";
//	static String filePath = "C:\\Users\\35725\\eclipse-workspace\\capitaleasygo\\docs\\DocGen\\Project\\design\\harnessdesign\\DOOR_RF.xml";
	static String filePath = "C:\\Users\\35725\\eclipse-workspace\\capitaleasygo\\docs\\DocGen\\Project\\design\\harnessdesign\\DOOR_LF.xml";

	public static void main(String[] args) {

		// 获得项目
		project = getProject();
//		project = getProject1();

		// 输出项目的自定义属性
		showProjectProperty(project);

		// 输出项目下所有的设计
		Designmgr dm = project.getDesignmgr();

		// 输出Capitaltopologydesign集合【topologydesign】
		System.out.println("start----------topologyDesign-------------");
		showTopologyDesign(dm);
		System.out.println("end----------topologyDesign-------------");

		// 输出HarnessDesign集合
		System.out.println("start----------harnessDesign-------------");
		showHarnessDesign(dm);
		System.out.println("end----------harnessDesign-------------");

	}

	/**
	 * @Title: getProject1 @Description: TODO(这里用一句话描述这个方法的作用) @param @return
	 *         参数 @return Project 返回类型 @throws
	 */

	private static Project getProject1() {
		try {
			JAXBContext context = JAXBContext.newInstance("me.test"); // package名称

			Unmarshaller unmarshaller = context.createUnmarshaller();

			// 创建并设定一个 Unmarshaller.Listener

			// create a new XML parser
			SAXParserFactory factory = SAXParserFactory.newInstance();
			factory.setNamespaceAware(true);
			XMLReader reader = factory.newSAXParser().getXMLReader();

			// 流式解析XML，主要使用了该方法。
			// 缺点就是造成了业务逻辑代码片段被分割成一个一个的片段，而无法连续。
			// FIXME : 如何使用 StAX + JAXB? 且同时做到代码尽可能的简单?
			reader.setContentHandler(unmarshaller.getUnmarshallerHandler());

			reader.parse(new InputSource(MingXiBiaoTest.class.getResourceAsStream(filePath)));
		} catch (Exception e) {
			// 如果觉得将业务异常变成RuntimeExcepiton不合适的话，
			// 就应该在 ExamUnmarshallListener 中设定结果正确标志，
			// 如果正确，就取得正确结果，否则取得异常信息。
			System.out.println("捕获了异常 ：" + e.getMessage());
			e.printStackTrace();
		}
		return project;
	}

	/**
	 * @Title: showHarnessDesign @Description: TODO(这里用一句话描述这个方法的作用) @param @param
	 *         dm 参数 @return void 返回类型 @throws
	 */

	private static void showHarnessDesign(Designmgr dm) {
		List<Harnessdesign> hdList = dm.getHarnessdesign();
		for (Harnessdesign hd : hdList) {
			System.out.println(hd.getName());
			getComponentsFromHarnessDesign(hd);
		}
	}

	/**
	 * @Title: getComponentsFromHarnessDesign @Description:
	 *         TODO(这里用一句话描述这个方法的作用) @param @param hd 参数 @return void 返回类型 @throws
	 */

	private static void getComponentsFromHarnessDesign(Harnessdesign hd) {
		List<Harnessdiagram> harnessDiagramList = hd.getHarnessdiagram();
		for (Harnessdiagram d : harnessDiagramList) {
			System.out.println(d.getName());
		}

		Connectivity connectivity = hd.getHarnesscontainer().getConnectivity();

		List<Object> allComponentList = new ArrayList<Object>();

		// connectivity所有的元器件获取如下

		allComponentList.addAll(connectivity
				.getDeviceOrSpliceOrConnectorOrGrounddeviceOrBlockdeviceOrInterconnectdeviceOrTerminalbarOrFunction());
		allComponentList.addAll(connectivity.getNetOrWireOrShieldOrInterconnectOrFunccond());
		allComponentList.addAll(connectivity.getAssembly());
		allComponentList.addAll(connectivity.getHighway());
		allComponentList.addAll(connectivity.getMulticore());

		Map<String, List<Object>> componentTypeNameAndComponentListMap = new HashMap<String, List<Object>>();
		Map<String, List<Object>> fullComponentTypeNameAndComponentListMap = new HashMap<String, List<Object>>();
		System.out.println("start------------------------components-----------------");
		for (Object component : allComponentList) {
			String componentType = component.getClass().getSimpleName();
			List<Object> componentList = componentTypeNameAndComponentListMap.get(componentType);
			if(componentList==null) {
				componentList = new ArrayList<Object>();
			}
			componentList.add(component);
			componentTypeNameAndComponentListMap.put(componentType, componentList);
			
			
			String fullComponentType = component.getClass().getName();
			List<Object> componentList1 = componentTypeNameAndComponentListMap.get(fullComponentType);
			if(componentList1==null) {
				componentList1 = new ArrayList<Object>();
			}
			componentList1.add(component);
			fullComponentTypeNameAndComponentListMap.put(fullComponentType, componentList);
		}
		
		for (Entry<String, List<Object>> entry : componentTypeNameAndComponentListMap.entrySet()) {
			System.out.println("类型>>"+entry.getKey());
			for (Object component : entry.getValue()) {
				System.out.println(component.getClass().getName() + ">>" + component);
			}
			
			//获取导线的信息
			if(entry.getKey()==Wire.class.getSimpleName()) {
				for (Object component : entry.getValue()) {
					Wire wire = (Wire) component; 
				}
			}
			
		}
		for (Entry<String, List<Object>> entry : fullComponentTypeNameAndComponentListMap.entrySet()) {
			System.out.println("类型>>"+entry.getKey());
			try {
				Class c = Class.forName(entry.getKey());
				Object obj = c.newInstance();
				System.out.println(c);
				System.out.println(obj);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (Object component : entry.getValue()) {
				System.out.println(component.getClass().getName() + ">>" + component);
			}
			
			//获取导线的信息
			if(entry.getKey()==Wire.class.getSimpleName()) {
				for (Object component : entry.getValue()) {
					Wire wire = (Wire) component; 
				}
			}
			
		}
		
		
		System.out.println("end------------------------components-----------------");

	}

	/**
	 * @Title: showTopologyDesign @Description: TODO(这里用一句话描述这个方法的作用) @param @param
	 *         dm 参数 @return void 返回类型 @throws
	 */

	private static void showTopologyDesign(Designmgr dm) {
		List<Capitaltopologydesign> topologyDesignList = dm.getCapitaltopologydesign();
		for (Capitaltopologydesign ctd : topologyDesignList) {
			System.out.println(ctd.getName());

		}
	}

	/**
	 * 
	 * @Title: getProject @Description: 获得项目 @param @return 参数 @return Project
	 *         返回类型 @throws
	 */
	public static Project getProject() {
		Project project = null;
		try {
			File file = new File(filePath);
			String xmlStr = FileUtils.readFileToString(file, "UTF-8");
			Reader reader = new StringReader(xmlStr);
			Unmarshaller unmarshaller = JAXBContext.newInstance(Project.class).createUnmarshaller();
			project = (Project) unmarshaller.unmarshal(reader);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return project;
	}

	/**
	 * 
	 * @Title: showProjectProperty @Description: 输出项目的自定义属性 @param @param project
	 *         参数 @return void 返回类型 @throws
	 */
	public static void showProjectProperty(Project project) {
		List<Property> propertyList = project.getProperty();
		for (Property property : propertyList) {
			System.out.println(property);
			System.out.println(property.getName());
			System.out.println(property.getStability());
			System.out.println(property.getTemplate());
			System.out.println(property.getType());
			System.out.println(property.getVal());
			System.out.println(property.getClass());

		}
	}

}
