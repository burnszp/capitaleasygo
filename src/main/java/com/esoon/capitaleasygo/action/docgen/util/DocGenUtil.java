
    /**  
     * @Title: DocGenUtil.java
     * @Package com.esoon.capitaleasygo.action.docgen.util
     * @Description: TODO(用一句话描述该文件做什么)
     * @author 35725
     * @date 2019年11月14日 下午2:00:00 
     * @version V1.0  
     */
    
package com.esoon.capitaleasygo.action.docgen.util;

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

import org.apache.commons.io.FileUtils;

import com.mentor.capital.project.Connectivity;
import com.mentor.capital.project.Harnessdesign;
import com.mentor.capital.project.Harnessdiagram;
import com.mentor.capital.project.Project;
import com.mentor.capital.project.Wire;

/**
     * @ClassName: DocGenUtil
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author 35725
     * @date 2019年11月14日
     *
     */

public class DocGenUtil {
	
	private static DocGenUtil docGenUtil;
	private static String designXmlPath = "C:\\Users\\35725\\eclipse-workspace\\capitaleasygo\\docs\\DocGen\\Project\\design\\harnessdesign\\DOOR_LF.xml";
	
	
	    /**
	     * 创建一个新的实例 DocGenUtil
	     *
	     * @param designXmlPath2
	     */
	    

	public static DocGenUtil getDocGenUtilInstance() {
		if(docGenUtil == null) {
			docGenUtil = new DocGenUtil();
		}
		return docGenUtil;
	}
	
	
	/**
	 * 
	 * @Title: getProject @Description: 获得项目 @param @return 参数 @return Project
	 *         返回类型 @throws
	 */
	private  Project getProject() {
		Project project = null;
		try {
			File file = new File(designXmlPath);
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
	 * @Title: getComponentsFromHarnessDesign @Description:
	 *         TODO(这里用一句话描述这个方法的作用) @param @param hd 参数 @return void 返回类型 @throws
	 */

	public  Map<String, List<Object>> getComponentsFromHarnessDesign() {
		List<Harnessdesign> hdList = getProject().getDesignmgr().getHarnessdesign();
		Harnessdesign hd = hdList.get(0);
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

		Map<String, List<Object>> fullComponentTypeNameAndComponentListMap = new HashMap<String, List<Object>>();
		System.out.println("start------------------------components-----------------");
		for (Object component : allComponentList) {
			String componentType = component.getClass().getName();
			List<Object> componentList = fullComponentTypeNameAndComponentListMap.get(componentType);
			if(componentList==null) {
				componentList = new ArrayList<Object>();
			}
			componentList.add(component);
			fullComponentTypeNameAndComponentListMap.put(componentType, componentList);
		}
		
		System.out.println("end------------------------components-----------------");
		System.out.println(fullComponentTypeNameAndComponentListMap);
		return fullComponentTypeNameAndComponentListMap;

	}

}
