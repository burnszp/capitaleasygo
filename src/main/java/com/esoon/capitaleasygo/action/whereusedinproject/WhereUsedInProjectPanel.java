package com.esoon.capitaleasygo.action.whereusedinproject;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.tree.DefaultTreeModel;


/**
 * WhereUsedInProject的弹出框
 * 
 * @author Administrator
 * 
 */
public class WhereUsedInProjectPanel extends JPanel implements
		ActionListener {

	/**
	 * 
	 */
	public static final String[] headers = { "器件型号", "器件名称", "器件类型", "管脚数",
			"器件描述", "颜色", "材料", "院物资编码", "所物资编码", "集团物资编码", "质量等级", "详细规范",
			"生产厂家", "Group Name", "Type Code", "Status", "使用次数", "所在型号名称",
			"型号使用次数", "所在设计名称", "设计使用次数" };
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	private PropertieUtil propertieUtil;
	private String fileName;
	private JLabel fileDirL;
	private String fullFilePath;
	private JButton createFileB;
	private JButton openDirB;
	private JButton openFileB;
//	private JPanel contentPane;
	private JTextField fileDirT;

	private CisUtil cisUtil;
	private List<String> projectList;
	private List<DesignModelUI> designModelUIList;
	private JProgressBar progressBar;
	private JTextArea logTA;
	private static CountDownLatch designCountDownLatch;
	private static CountDownLatch projectCountDownLatch;
	private Timer timer;
	private JScrollPane scrollPane;
	private JButton getAllDesignsB;
	private List<String> projectNameList;
	private JScrollPane projectListScrollPane;
	private JTree tree;
	private ArrayList<String> selectedProjectNameList;
	private JButton createFileB2;
	private JTextField allLibraryFileDirT;
	private JLabel allLibraryFileDirL;
	private Component parent;

	private static Map<String, ComponentUsedModel> map;

	public WhereUsedInProjectPanel(Component aParent)  {
		 parent = aParent;
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// 设置界面的观感器
		} catch (Exception e) {
			System.exit(0);
		}
		propertieUtil = new PropertieUtil().getPropertieUtil();
		cisUtil = CisUtil.getCisUtil();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		setLocation((width - WIDTH) / 2, (height - HEIGHT) / 2);
		setSize(WIDTH, HEIGHT);
		initData();
		initUI();
	}

	private void initData() {
		try {
			projectNameList = CisUtil.getAllProjectName();
		} catch (Exception e) {
			e.printStackTrace();
		}
		tree = new JTree();
		CheckBoxTreeNode rootNode = new CheckBoxTreeNode("所有项目");
		for (String projectName : projectNameList) {
			CheckBoxTreeNode projectNode = new CheckBoxTreeNode(projectName);
			rootNode.add(projectNode);
		}
		DefaultTreeModel model = new DefaultTreeModel(rootNode);
		tree.addMouseListener(new CheckBoxTreeNodeSelectionListener());
		tree.setModel(model);
		tree.setCellRenderer(new CheckBoxTreeCellRenderer());

		projectListScrollPane = new JScrollPane(tree);
		projectListScrollPane.setBorder(BorderFactory
				.createTitledBorder("所有项目列表"));
	}

	void initUI() {
//		contentPane = new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.BOTH;// 当格子有剩余空间时，填充空间；其他还有，HORIZONTAL:只在水平方向上填充，VERTICAL:只在垂直方向是填充，NONE:保持原状。
		constraints.anchor = GridBagConstraints.NORTHWEST;// 当组件没有空间大时，居中缩小：其他的还有NORTH:顶部缩小，NORTHEAST:左上角缩小，EAST;右侧缩小
		constraints.weightx = 3;// x方向上的增量：当窗口缩放时，组件完全填充单元格，当为0.0时，保持不变
		constraints.weighty = 7;
		constraints.insets = new Insets(1, 1, 1, 1);// 组件彼此间的间距
		constraints.ipadx = 0;// 组件内部填充空间，即给组件的最小宽度添加多大的空间
		constraints.ipady = 0;// 组件内部填充空间，即给组件的最小高度添加多大的空间

		JLabel cisIpL = new JLabel("cis.ip:");
		JLabel cisPortL = new JLabel("cis.port:");
		JLabel cisUserNameL = new JLabel("cis.userName:");
		JLabel cisPasswordL = new JLabel("cis.password:");
		fileDirL = new JLabel("file.dir:");
		allLibraryFileDirL = new JLabel("allLibraryFile.dir:");

		JTextField cisIpT = new JTextField(20);
		cisIpT.setText(propertieUtil.getValue(Constants.CIS_IP));
		JTextField cisPortT = new JTextField(20);
		cisPortT.setText(propertieUtil.getValue(Constants.CIS_PORT));
		JTextField cisUserNameT = new JTextField(20);
		cisUserNameT.setText(propertieUtil.getValue(Constants.CIS_USERNAME));
		JPasswordField cisPasswordT = new JPasswordField(20);
		cisPasswordT.setText(propertieUtil.getValue(Constants.CIS_PASSWORD));
		fileDirT = new JTextField(20);
		fileDirT.setText(propertieUtil.getValue(Constants.FILE_DIR));
		allLibraryFileDirT = new JTextField(20);
		allLibraryFileDirT.setText(propertieUtil.getValue(Constants.ALLLIBRARYXLSPATH));

		createFileB = new JButton("生成设计中元器件使用情况文件");
		createFileB.setActionCommand("createFile");
		createFileB.addActionListener(this);
		createFileB2 = new JButton("生成常用元器件信息表");
		createFileB2.setActionCommand("createFile2");
		createFileB2.addActionListener(this);
		// getAllDesignsB = new JButton("获得所有项目列表");
		// getAllDesignsB.setActionCommand("getAllProjects");
		// getAllDesignsB.addActionListener(this);
		// openDirB = new JButton("打开目录");
		// openDirB.setActionCommand("openDir");
		// openDirB.addActionListener(this);
		// openFileB = new JButton("打开文件");
		// openFileB.setActionCommand("openFile");
		// openFileB.addActionListener(this);

		progressBar = new JProgressBar();
		progressBar.setOrientation(JProgressBar.HORIZONTAL);
		progressBar.setMinimum(0);
		progressBar.setMaximum(100);
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		logTA = new JTextArea(10, 20);
		scrollPane = new JScrollPane(logTA);
		scrollPane.setAutoscrolls(true);
		scrollPane.setBorder(BorderFactory.createTitledBorder("输入信息"));

		JSplitPane bottomPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		bottomPane.setLeftComponent(projectListScrollPane);
		bottomPane.setRightComponent(scrollPane);

		add(cisIpL, constraints, 0, 0, 2, 1);
		add(cisIpT, constraints, 1, 0, 2, 1);
		add(cisPortL, constraints, 0, 1, 2, 1);
		add(cisPortT, constraints, 1, 1, 2, 1);
		add(cisUserNameL, constraints, 0, 2, 2, 1);
		add(cisUserNameT, constraints, 1, 2, 2, 1);
		add(cisPasswordL, constraints, 0, 3, 2, 1);
		add(cisPasswordT, constraints, 1, 3, 2, 1);
		add(fileDirL, constraints, 0, 4, 2, 1);
		add(fileDirT, constraints, 1, 4, 2, 1);
		add(allLibraryFileDirL, constraints, 0, 5, 2, 1);
		add(allLibraryFileDirT, constraints, 1, 5, 2, 1);
		add(createFileB, constraints, 0, 6, 1, 1);
		add(createFileB2, constraints, 1, 6, 1, 1);
		// add(openDirB, constraints, 1, 5, 1, 1);
		// add(openFileB, constraints, 2, 5, 1, 1);
		add(progressBar, constraints, 0, 7, 3, 1);
		add(bottomPane, constraints, 0, 8, 3, 1);
		// System.out.println(createFileB.getActionCommand());

	}

	/**
	 * 此方法将组件添加到容器中
	 * 
	 * @param c
	 *            --组件
	 * @param constraints
	 *            --约束
	 * @param x
	 *            --列
	 * @param y
	 *            --行
	 * @param w
	 *            --横占w个单元格
	 * @param h
	 *            --列占h个单元格
	 */
	public void add(Component c, GridBagConstraints constraints, int x, int y,
			int w, int h) {
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight = h;
		add(c, constraints);
	}

	public static void main(String[] args) {
		WhereUsedInProjectPanel ui = new WhereUsedInProjectPanel(null);
		ui.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ("createFile2".equals(e.getActionCommand())) {
			GetAllLibraryInfo getAllLibraryInfo = new GetAllLibraryInfo();
		}
		if ("createFile".equals(e.getActionCommand())) {
			/**
			 * 获得选中的项目集合
			 */
			selectedProjectNameList = new ArrayList<String>();
			DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
			CheckBoxTreeNode rootNode = (CheckBoxTreeNode) model.getRoot();
			int childCount = rootNode.getChildCount();
			for (int i = 0; i < childCount; i++) {
				CheckBoxTreeNode projectNode = (CheckBoxTreeNode) rootNode
						.getChildAt(i);
				if (projectNode.isSelected()) {
					selectedProjectNameList.add(projectNode.getUserObject()
							.toString());
					// System.out.println("选中的项目:" +
					// projectNode.getUserObject().toString());
				}
			}
			if (selectedProjectNameList.size() == 0) {
				JOptionPane.showMessageDialog(
						WhereUsedInProjectPanel.this, "请至少选中一个项目再生成文件");
			} else {
				 GetComponentInfo1 getComponentInfo1 = new GetComponentInfo1();
				 Thread getInfo1 = new Thread(getComponentInfo1);
				 getInfo1.start();
			}
			// GetComponentInfo getComponentInfo = new GetComponentInfo();
			// Thread getInfo = new Thread(getComponentInfo);
			// getInfo.start();
		}
		// if("getAllProjects".equals(e.getActionCommand())){
		// List<String> projectNameList = null;
		// try {
		// projectNameList = CisUtil.getAllProjectName();
		// } catch (Exception e1) {
		// e1.printStackTrace();
		// }
		// }
	}

	private void appendInfo(String info) {
		logTA.append(info);
		logTA.append("\n");
		// logTA.setCaretPosition(logTA.getDocument().getLength());
		logTA.setCaretPosition(logTA.getDocument().getLength());
		// int height = 20;
		// Point p = new Point();
		// p.setLocation(0, logTA.getLineCount() * height);
		// scrollPane.getViewport().setViewPosition(p);

	}

	private void writeMap2Excel(Map<String, ComponentUsedModel> map2)
			throws Exception {
		// 先将map2转化为ExcelModel，然后再将ExcelModel集合生成Excel;
		List<ExcelModel> eList = convertMap2ExcelModelList(map2);
		// 将emList集合生成Excel文件
		File outFile = new File(fileDirT.getText());
		if (!outFile.exists()) {
			File parentDir = outFile.getParentFile();
			if (!parentDir.exists()) {
				parentDir.mkdirs();
			}
			outFile.createNewFile();
		}
		PoiUtil.getPoiUtil().writeList2Excel("元器件信息使用情况", headers, eList,
				outFile);
	}

	private List<ExcelModel> convertMap2ExcelModelList(
			Map<String, ComponentUsedModel> map2) {
		List<ExcelModel> eList = new ArrayList<ExcelModel>();
		for (String partNumber : map2.keySet()) {
			ComponentUsedModel cuModel = map2.get(partNumber);
			Map<String, ProjectModel> projectMap = cuModel.getProjectMap();
			if(projectMap != null && projectMap.size()>0){
				for (String projectName : projectMap.keySet()) {
					ProjectModel projectModel = projectMap.get(projectName);
					Map<String, Integer> designMap = projectModel.getDesignMap();
					for (String designName : designMap.keySet()) {
						ExcelModel eModel = new ExcelModel();
						if (cuModel.isWrited()) {
							eModel.setAllUsedCount(-1);
							eModel.setCiModel(null);
						} else {
							eModel.setAllUsedCount(cuModel
									.getUsedInAllProjectCount());
							eModel.setCiModel(cuModel.getcInfoModel());
							cuModel.setWrited(true);
						}
						if (projectModel.isWrited()) {
							eModel.setProjectName("-");
							eModel.setAllUsedInOneProjectCount(-1);
						} else {
							eModel.setProjectName(projectName);
							eModel.setAllUsedInOneProjectCount(projectModel
									.getUsedInAllDesignCount());
							projectModel.setWrited(true);
						}
						eModel.setAllUsedInOneDesignCount(designMap.get(designName));
						eModel.setDesignName(designName);
						eList.add(eModel);
					}
				}
			}else{
				ExcelModel eModel = new ExcelModel();
				eModel.setCiModel(cuModel.getcInfoModel());
				eList.add(eModel);
			}
		}
		return eList;
	}

	private void insertComponentInfo() {
		Map<String, ComponentInfoModel> componentInfoMap = ExportPartsUsedInLibrary
				.getComponentInfoByXML();
		 Map<String, ComponentUsedModel> tempMap = new HashMap<String, ComponentUsedModel>();
		for (String partNumber : componentInfoMap.keySet()) {
			ComponentInfoModel cInfoModel = componentInfoMap.get(partNumber);
			if(map.get(partNumber) !=null){
				map.get(partNumber).setcInfoModel(cInfoModel);
			}else{
				ComponentUsedModel componentUsedModel = new ComponentUsedModel();
				componentUsedModel.setcInfoModel(cInfoModel);
				tempMap.put(partNumber, componentUsedModel);
			}
		}
		for (String partNumber : tempMap.keySet()) {
			map.put(partNumber,tempMap.get(partNumber));
		}
	}

	
	class GetComponentInfo1 implements Runnable {

		@Override
		public void run() {
			try {
				fileDirT.setText(propertieUtil.getValue(Constants.FILE_DIR)
						+ propertieUtil.getValue(Constants.FILE_PRENAME)
						+ "_"
						+ new SimpleDateFormat("yyyyMMddHHmmss")
								.format(new Date()) + ".xls");
				designModelUIList = new ArrayList<DesignModelUI>();
				map = new LinkedHashMap<String, ComponentUsedModel>();
				projectCountDownLatch = new CountDownLatch(
						selectedProjectNameList.size());
				appendInfo("项目个数一共有:" + selectedProjectNameList.size());
				for (String projectName : selectedProjectNameList) {
					appendInfo("项目名称：【" + projectName + "】");
				}
				// 开始获取所有设计
				appendInfo("-----------------------------------------------------------");
				appendInfo("开始获取所有设计。。。");
				for (String projectName : selectedProjectNameList) {
					appendInfo("开始获取【" + projectName + "】下的所有设计。。。");
					List<DesignModelUI> designModelUIs = cisUtil
							.getDesignByProjectName(projectName);
					for (DesignModelUI design : designModelUIs) {
						appendInfo("-设计名称/版本：【" + design.getDesignName() + "/"
								+ design.getDesignRevision() + "】");
						designModelUIList.add(design);
					}
				}
				appendInfo("所有设计获取完成！");
				appendInfo("开始获取设计中的包含的元器件信息...");
				designCountDownLatch = new CountDownLatch(
						designModelUIList.size());
				/**
				 * 循环遍历设计，每个设计进行获取元器件信息操作。
				 */
				appendInfo("-----------------------------------------------------------");
				appendInfo("开始获取每个设计中的元器件信息...");
				int designSize = designModelUIList.size();
				float designUnit = (float) (100 - 2) / (float) designSize;
				for (DesignModelUI design : designModelUIList) {
					appendInfo("开始获取【" + design.getDesignName() + "/"
							+ design.getDesignRevision() + "】设计中的元器件信息...");
					cisUtil.getComponentUsedInfoInDesign(
							design.getProjectName(), design.getDesignName(),
							design.getDesignRevision(), map);
					designCountDownLatch.countDown();
					appendInfo("获取【" + design.getDesignName() + "/"
							+ design.getDesignRevision() + "】设计中的元器件信息完成！");
					progressBar
							.setValue((int) ((designSize - designCountDownLatch
									.getCount()) * designUnit));
				}

				/**
				 * 开始获取元器件的详细信息
				 */
				appendInfo("正在查询元器件详情信息");
				progressBar.setValue(99);
				insertComponentInfo();

				/**
				 * 将信息写入到Excel中
				 */
				appendInfo("正在将数据写入Excel");
				writeMap2Excel(map);
				progressBar.setValue(100);
				appendInfo("数据获取完成");
				JOptionPane.showMessageDialog(
						WhereUsedInProjectPanel.this, "生成文件成功", "消息",
						JOptionPane.INFORMATION_MESSAGE);
			} catch (Exception e1) {
				e1.printStackTrace();
				JOptionPane.showMessageDialog(
						WhereUsedInProjectPanel.this, "生成文件失败", "消息",
						JOptionPane.ERROR_MESSAGE);
			}
		}

	}
}
