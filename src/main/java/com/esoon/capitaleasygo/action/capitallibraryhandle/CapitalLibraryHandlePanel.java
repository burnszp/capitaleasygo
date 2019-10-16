
/**  
 * @Title: CapitalLibraryHandlePanel.java
 * @Package com.esoon.capitaleasygo.action.capitallibraryhandle
 * @Description: TODO(用一句话描述该文件做什么)
 * @author 35725
 * @date 2019年10月16日 下午6:02:43 
 * @version V1.0  
 */

package com.esoon.capitaleasygo.action.capitallibraryhandle;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.esoon.capitaleasygo.action.capitallibraryhandle.entity.ParseTest;
import com.esoon.capitaleasygo.action.capitallibraryhandle.util.CapitalLibraryFileUpdateUtil;
import com.esoon.capitaleasygo.action.capitallibraryhandle.util.ConstantsUtil;
import com.esoon.capitaleasygo.action.capitallibraryhandle.util.CustomerPropertiesExcel2Xml;
import com.esoon.capitaleasygo.action.capitallibraryhandle.util.ParseXmlTest;
import com.esoon.capitaleasygo.action.capitallibraryhandle.util.PropertieUtil;
import com.esoon.capitaleasygo.action.capitallibraryhandle.util.TwoExcel2OneExcel;
import com.esoon.capitaleasygo.action.capitallibraryhandle.util.UIUtil;
import com.esoon.capitaleasygo.action.capitallibraryhandle.util.WObjectServiceImpl;

/**
 * @ClassName: CapitalLibraryHandlePanel
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 35725
 * @date 2019年10月16日
 *
 */

public class CapitalLibraryHandlePanel extends JPanel implements ActionListener {

	public static Logger logger;

	private int WIDTH = 900;
	private int HEIGHT = 400;
	private JTabbedPane contentPanel;
	private JButton jkXmlB;
	private JButton jkXml2ExcelB;
	private JButton jkExcelB;
	private JButton khExcelB;
	private AbstractButton mergeExcelB;
	private JButton mergedExcel2XmlB;
	private JTextField jkXmlTF;
	private JTextField jkXml2ExcelTF;
	private JTextField jkExcelTF;
	private JTextField khExcelTF;
	private JTextField mergeExcelTF;
	private JTextField mergedExcel2XmlTF;

	private JPanel xml2ExcelTab;

	private JPanel excel2XmlTab;

	private GridBagConstraints constraints;

	private JPanel xml2ExcelTabParent;

	private JPanel excel2XmlTabParent;

	private JTextArea xml2ExcelTabComment;

	private JTextArea excel2XmlTabComment;

	private JComboBox checkCompTypeCB;

	private JButton chooseMergedExcelB;

	private JButton openCreatedExcelB;

	private JButton openMergedExcelB;

	private PropertieUtil propertieUtil;

	private JProgressBar jProgressBar;

	private JPanel jkFilePreHandlePanel;

	private JTextArea jkFilePreHandleComment;

	private JPanel jkFilePreHandleTab;

	private JTextField partNumberSuffixTF;

	private JTextField jkXmlPathTF;

	private JButton jkXmlPathB;

	private JTextField jkUpdatedXmlPathTF;

	private JButton jkUpdatedXmlPathB;

	private JTextField jkExcelPathTF;

	private JButton jkExcelPathB;

	private JTextField jkUpdatedExcelPathTF;

	private JButton jkUpdatedExcelPathB;

	private JPanel excelInfoUpdateXmlPanel;

	private JPanel excelInfoUpdateXmlTab;

	private JTextArea excelInfoUpdateXmlComment;

	private JTextField mergedExcel4TF;

	private JButton mergedExcel4B;

	private JTextField jkXml4TF;

	private AbstractButton selectXmlPath4B;

	private JTextField updatedXmlPath4TF;

	private JButton updateXml4B;

	private JProgressBar jpb1;

	private File updatedXmlFile;

	private JProgressBar jpb4;

	public CapitalLibraryHandlePanel() {
		try {
			PropertyConfigurator.configure("log4j.properties");
			logger = Logger.getLogger(CapitalLibraryHandlePanel.class);
			// UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
			// //设置界面样式
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // 设置界面样式
			// UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			UIManager.getCrossPlatformLookAndFeelClassName();
			SwingUtilities.updateComponentTreeUI(this);
			initUI();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		propertieUtil = PropertieUtil.getPropertieUtil();
	}

	private void initUI() {

//		setTitle("8院元器件库文件转换");
//		setIconImage(new ImageIcon(this.getClass().getResource(
//				"/com/acconsys/capital/images/convert.png")).getImage());
		// setIconImage(new ImageIcon(this.getClass().getResource(
		// "/convert.png")).getImage());
		// setIconImage(new ImageIcon(this.getClass().getResource(
		// "../images/convert.png")).getImage());
		contentPanel = new JTabbedPane();
		constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(5, 5, 5, 5);
		constraints.ipadx = 5;
		constraints.ipady = 5;

		xml2ExcelTabParent = new JPanel(new BorderLayout());
		xml2ExcelTab = new JPanel(new GridBagLayout());
		xml2ExcelTabComment = new JTextArea();
		xml2ExcelTabComment.setLineWrap(true);
		xml2ExcelTabComment.setEditable(false);
		xml2ExcelTabComment.setBorder(BorderFactory.createTitledBorder("【XML文件转换成Excel说明】"));
		xml2ExcelTabComment
				.setText("1、建库xml路径：建库人员创建基础库信息文件，xml格式。 \n2、建库xml生成Excel路径：把建库的xml文件生成指定格式的Excel（xls格式）文件。");
		xml2ExcelTabParent.add(xml2ExcelTabComment, BorderLayout.NORTH);
		xml2ExcelTabParent.add(xml2ExcelTab, BorderLayout.CENTER);

		excel2XmlTabParent = new JPanel(new BorderLayout());
		excel2XmlTab = new JPanel(new GridBagLayout());
		excel2XmlTabComment = new JTextArea();
		excel2XmlTabComment.setLineWrap(true);
		excel2XmlTabComment.setEditable(false);
		excel2XmlTabComment.setBorder(BorderFactory.createTitledBorder("【Excel文件转换成Xml说明】"));
		excel2XmlTabComment.setText(
				"1、建库excel路径：建库人员给的基础库信息文件，xls格式。 \n2、自定义excel路径：用户提供的excel文件，里面保存的是用户自定义属性信息。\n3、合并之后的excel:建库excel和自定义excel合并，生成一个新的excel。里面主要在自定义excel上补充建库excel中的partNumber信息。\n4、合并后的excel生成xml路径：合并之后的xls才能生成正确格式的xls库文件。");
		excel2XmlTabParent.add(excel2XmlTabComment, BorderLayout.NORTH);
		excel2XmlTabParent.add(excel2XmlTab, BorderLayout.CENTER);

		jkFilePreHandlePanel = new JPanel(new BorderLayout());
		jkFilePreHandleTab = new JPanel(new GridBagLayout());
		jkFilePreHandleComment = new JTextArea();
		jkFilePreHandleComment.setLineWrap(true);
		jkFilePreHandleComment.setEditable(false);
		jkFilePreHandleComment.setBorder(BorderFactory.createTitledBorder("【建库信息预处理说明】"));
		jkFilePreHandleComment.setText(
				"1、建库excel路径：建库人员给的基础库信息文件，必须是xls格式。 \n2、建库excel文件只能有一个表单，其他多余表单忽略\n3、建库excel文件表单只能是第25行是PART NUMBER");
		jkFilePreHandlePanel.add(jkFilePreHandleComment, BorderLayout.NORTH);
		jkFilePreHandlePanel.add(jkFilePreHandleTab, BorderLayout.CENTER);

		// 建库excel更新xml.
		excelInfoUpdateXmlPanel = new JPanel(new BorderLayout());
		excelInfoUpdateXmlTab = new JPanel(new GridBagLayout());
		excelInfoUpdateXmlComment = new JTextArea();
		excelInfoUpdateXmlComment.setLineWrap(true);
		excelInfoUpdateXmlComment.setEditable(false);
		excelInfoUpdateXmlComment.setBorder(BorderFactory.createTitledBorder("合并后的excel更新库xml】"));
		excelInfoUpdateXmlComment.setText(
				"1、建库excel路径：建库人员给的基础库信息文件，必须是xls格式。 \n2、建库excel文件只能有一个表单，其他多余表单忽略\n3、建库excel文件表单只能是第25行是PART NUMBER,\n4、执行此页操作时请最好先停止其他耗内存的程序运行，中间出现会出现卡顿,属于正常现象。");
		excelInfoUpdateXmlPanel.add(excelInfoUpdateXmlComment, BorderLayout.NORTH);
		excelInfoUpdateXmlPanel.add(excelInfoUpdateXmlTab, BorderLayout.CENTER);

		// 加入panel
		contentPanel.addTab("建库信息预处理", null, jkFilePreHandlePanel, "对建库信息的xml文件和Excel表格进行预处理");
		/**
		 * 下面这行代码是把excel转xml功能先注释掉，后期需要的话再加上。
		 */
		contentPanel.addTab("合并excel", null, excel2XmlTabParent, "excel文件转换成Capital Library的xml文件功能");// excel转xml
		contentPanel.addTab("xml转excel", null, xml2ExcelTabParent, "Capital Library的xml转换成excel文件功能");
		contentPanel.addTab("合并后的excel更新库xml", null, excelInfoUpdateXmlPanel, "合并后的excel数据通过partnumber更新无效的自定义属性");
		initJKPreHandleTab();
		initXml2ExcelTab();
		initExcel2XmlTab();
		initexcelInfoUpdateXmlTab();
		setLayout(new BorderLayout());
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		// 设置为居中显示
		setBounds((dimension.width - WIDTH) / 2, (dimension.height - HEIGHT) / 2, WIDTH, HEIGHT);
//		setResizable(false);
		add(contentPanel, BorderLayout.CENTER);
		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void initexcelInfoUpdateXmlTab() {
		/**
		 * 一、合并后的Excel部分
		 */
		JLabel mergedExcelL = new JLabel("合并后的excel路径：", JLabel.RIGHT);
		mergedExcel4TF = new JTextField(82);
		// mergedExcel4TF
		// .setText("F:\\工作\\8院\\何海英\\2016_08_15\\航天八院Capital建库总清单2330_0815.xls");
		mergedExcel4B = new JButton("选择合并后的excel路径");
		mergedExcel4B.addActionListener(this);

		JLabel jkXml2ExcelL = new JLabel("建库xml路径：", JLabel.RIGHT);
		jkXml4TF = new JTextField(82);
		// jkXml4TF.setText("F:\\工作\\8院\\何海英\\2016_08_15\\lib-all0815.xml");
		selectXmlPath4B = new JButton("选择建库xml路径");
		selectXmlPath4B.addActionListener(this);

		JLabel updatedXmlL = new JLabel("更新后的xml路径：", JLabel.RIGHT);
		updatedXmlPath4TF = new JTextField(82);
		updateXml4B = new JButton("更新");
		updateXml4B.addActionListener(this);

		JLabel processL = new JLabel("进度：", JLabel.RIGHT);
		jpb4 = new JProgressBar();
		jpb4.setPreferredSize(new Dimension(710, 20));

		add(mergedExcelL, excelInfoUpdateXmlTab, constraints, 0, 0, 1, 1);
		add(mergedExcel4TF, excelInfoUpdateXmlTab, constraints, 1, 0, 2, 1);
		add(mergedExcel4B, excelInfoUpdateXmlTab, constraints, 0, 0, 0, 1);

		add(jkXml2ExcelL, excelInfoUpdateXmlTab, constraints, 0, 0, 1, 1);
		add(jkXml4TF, excelInfoUpdateXmlTab, constraints, 1, 0, 2, 1);
		add(selectXmlPath4B, excelInfoUpdateXmlTab, constraints, 0, 0, 0, 1);

		add(updatedXmlL, excelInfoUpdateXmlTab, constraints, 0, 0, 1, 1);
		add(updatedXmlPath4TF, excelInfoUpdateXmlTab, constraints, 1, 0, 2, 1);
		add(updateXml4B, excelInfoUpdateXmlTab, constraints, 0, 0, 0, 1);

		add(processL, excelInfoUpdateXmlTab, constraints, 0, 0, 1, 1);
		add(jpb4, excelInfoUpdateXmlTab, constraints, 0, 0, 0, 1);
	}

	private void initJKPreHandleTab() {
		/**
		 * 一、建库xml转换为Excel部分
		 */
		JLabel partNumberSuffixL = new JLabel("PartNumber添加的后缀：", JLabel.RIGHT);
		partNumberSuffixTF = new JTextField(95);

		JLabel jkXmlPathL = new JLabel("建库xml文件路径：", JLabel.RIGHT);
		jkXmlPathTF = new JTextField(95);
		jkXmlPathTF.setEditable(false);
		jkXmlPathB = new JButton("选择建库xml文件");
		jkXmlPathB.addActionListener(this);

		JLabel jkUpdatedXmlPathL = new JLabel("建库xml更新后路径：", JLabel.RIGHT);
		jkUpdatedXmlPathTF = new JTextField(95);
		jkUpdatedXmlPathTF.setEditable(false);
		jkUpdatedXmlPathB = new JButton("更新建库xml文件");
		jkUpdatedXmlPathB.addActionListener(this);

		JLabel jkExcelPathL = new JLabel("建库excel文件路径：", JLabel.RIGHT);
		jkExcelPathTF = new JTextField(95);
		jkExcelPathTF.setEditable(false);
		jkExcelPathB = new JButton("选择建库excel文件");
		jkExcelPathB.addActionListener(this);
		jkExcelPathB.setEnabled(false);

		JLabel jkUpdatedExcelPathL = new JLabel("建库excel更新后路径：", JLabel.RIGHT);
		jkUpdatedExcelPathTF = new JTextField(95);
		jkUpdatedExcelPathTF.setEditable(false);
		jkUpdatedExcelPathB = new JButton("更新建库excel文件");
		jkUpdatedExcelPathB.addActionListener(this);
		jkUpdatedExcelPathB.setEnabled(false);

		JLabel processL = new JLabel("进度：", JLabel.RIGHT);
		jpb1 = new JProgressBar();
		jpb1.setPreferredSize(new Dimension(710, 20));

		add(partNumberSuffixL, jkFilePreHandleTab, constraints, 0, 0, 1, 1);
		add(partNumberSuffixTF, jkFilePreHandleTab, constraints, 0, 0, 0, 1);

		add(jkXmlPathL, jkFilePreHandleTab, constraints, 0, 0, 1, 1);
		add(jkXmlPathTF, jkFilePreHandleTab, constraints, 1, 0, 1, 1);
		add(jkXmlPathB, jkFilePreHandleTab, constraints, 0, 0, 0, 1);

		add(jkUpdatedXmlPathL, jkFilePreHandleTab, constraints, 0, 0, 1, 1);
		add(jkUpdatedXmlPathTF, jkFilePreHandleTab, constraints, 1, 0, 1, 1);
		add(jkUpdatedXmlPathB, jkFilePreHandleTab, constraints, 0, 0, 0, 1);

		add(jkExcelPathL, jkFilePreHandleTab, constraints, 0, 0, 1, 1);
		add(jkExcelPathTF, jkFilePreHandleTab, constraints, 1, 0, 1, 1);
		add(jkExcelPathB, jkFilePreHandleTab, constraints, 0, 0, 0, 1);

		add(jkUpdatedExcelPathL, jkFilePreHandleTab, constraints, 0, 0, 1, 1);
		add(jkUpdatedExcelPathTF, jkFilePreHandleTab, constraints, 1, 0, 1, 1);
		add(jkUpdatedExcelPathB, jkFilePreHandleTab, constraints, 0, 0, 0, 1);

		add(processL, jkFilePreHandleTab, constraints, 0, 0, 1, 1);
		add(jpb1, jkFilePreHandleTab, constraints, 0, 0, 0, 1);
	}

	private void initExcel2XmlTab() {
		// "二、建库Excel和自定义Excel合并----------------------------------");

		JLabel jkExcelL = new JLabel("建库excel路径：", JLabel.RIGHT);
		jkExcelTF = new JTextField(60);
		jkExcelB = new JButton("选择建库excel");
		jkExcelB.addActionListener(this);

		JLabel khExcelL = new JLabel("自定义excel路径：", JLabel.RIGHT);
		khExcelTF = new JTextField(60);
		khExcelB = new JButton("选择自定义excel");
		khExcelB.addActionListener(this);

		JLabel mergeExcelL = new JLabel("合并之后的excel：", JLabel.RIGHT);
		mergeExcelTF = new JTextField(60);
		mergeExcelTF.setEditable(false);
		openMergedExcelB = new JButton("打开");
		openMergedExcelB.addActionListener(this);
		chooseMergedExcelB = new JButton("选择合并后的excel");
		chooseMergedExcelB.addActionListener(this);
		chooseMergedExcelB.setEnabled(false);
		mergeExcelB = new JButton("合并excel");
		mergeExcelB.addActionListener(this);

		JLabel mergedExcel2XmlL = new JLabel("合并后的excel生成xml路径：", JLabel.RIGHT);
		mergedExcel2XmlTF = new JTextField(60);
		mergedExcel2XmlTF.setEditable(false);
		mergedExcel2XmlB = new JButton("合并后的excel生成xml");
		mergedExcel2XmlB.addActionListener(this);
		mergedExcel2XmlB.setEnabled(false);
		// 第二部分
		add(jkExcelL, excel2XmlTab, constraints, 0, 0, 1, 1);
		add(jkExcelTF, excel2XmlTab, constraints, 1, 0, 3, 1);
		add(jkExcelB, excel2XmlTab, constraints, 0, 0, 0, 1);

		add(khExcelL, excel2XmlTab, constraints, 0, 0, 1, 1);
		add(khExcelTF, excel2XmlTab, constraints, 1, 0, 3, 1);
		add(khExcelB, excel2XmlTab, constraints, 0, 0, 0, 1);

		add(mergeExcelL, excel2XmlTab, constraints, 0, 0, 1, 1);
		add(mergeExcelTF, excel2XmlTab, constraints, 1, 0, 3, 1);
		add(mergeExcelB, excel2XmlTab, constraints, 1, 0, 1, 1);
		add(chooseMergedExcelB, excel2XmlTab, constraints, 0, 0, 1, 1);
		add(openMergedExcelB, excel2XmlTab, constraints, 0, 0, 0, 1);

		// 第三部分

		add(mergedExcel2XmlL, excel2XmlTab, constraints, 0, 0, 1, 1);
		add(mergedExcel2XmlTF, excel2XmlTab, constraints, 1, 0, 3, 1);
		add(mergedExcel2XmlB, excel2XmlTab, constraints, 0, 0, 0, 1);

	}

	public void add(Component c, JPanel parent, GridBagConstraints constraints, int weightx, int weighty, int gridwidth,
			int gridheight) {
		constraints.weightx = weightx;// 该方法设置组件水平的拉伸幅度，如果为0就说明不拉伸，不为0就随着窗口增大进行拉伸，0到1之间
		constraints.weighty = weighty;//
		constraints.gridwidth = gridwidth;// 该方法是设置组件水平所占用的格子数，如果为0，就说明该组件是该行的最后一个
		constraints.gridheight = gridheight;// 该方法是设置组件水平所占用的格子数，如果为0，就说明该组件是该行的最后一个
		parent.add(c, constraints);
	}

	private void initXml2ExcelTab() {
		/**
		 * 一、建库xml转换为Excel部分
		 */
		JLabel jkXmlL = new JLabel("建库xml路径：", JLabel.RIGHT);
		jkXmlTF = new JTextField(82);
		jkXmlB = new JButton("选择建库xml");
		jkXmlB.addActionListener(this);

		// JLabel checkCompTypeL = new JLabel("选择建库xml文件包含的元器件类型：");
		// String[] componentTypeArr = PropertieUtil.getPropertieUtil()
		// .getValue(ConstantsUtil.COMPONENT_TYPE).split("\\|");
		// checkCompTypeCB = new JComboBox(componentTypeArr);
		// checkCompTypeCB.setSelectedIndex(0);

		JLabel jkXml2ExcelL = new JLabel("建库xml生成excel路径：", JLabel.RIGHT);
		jkXml2ExcelTF = new JTextField(82);
		jkXml2ExcelTF.setEditable(false);
		jkXml2ExcelB = new JButton("建库xml生成excel");
		jkXml2ExcelB.addActionListener(this);
		openCreatedExcelB = new JButton("打开");
		openCreatedExcelB.addActionListener(this);

		JLabel jkXml2ExcelProgressBarL = new JLabel("建库xml生成excel进度：", JLabel.RIGHT);
		jProgressBar = new JProgressBar();
		jProgressBar.setPreferredSize(new Dimension(710, 20));

		add(jkXmlL, xml2ExcelTab, constraints, 0, 0, 1, 1);
		add(jkXmlTF, xml2ExcelTab, constraints, 1, 0, 2, 1);
		add(jkXmlB, xml2ExcelTab, constraints, 0, 0, 0, 1);

		// add(checkCompTypeL, xml2ExcelTab, constraints, 1, 0, 1, 1);
		// add(checkCompTypeCB, xml2ExcelTab, constraints, 0, 0, 0, 1);

		add(jkXml2ExcelL, xml2ExcelTab, constraints, 0, 0, 1, 1);
		add(jkXml2ExcelTF, xml2ExcelTab, constraints, 1, 0, 2, 1);
		add(jkXml2ExcelB, xml2ExcelTab, constraints, 0, 0, 1, 1);
		add(openCreatedExcelB, xml2ExcelTab, constraints, 0, 0, 0, 1);

		add(jkXml2ExcelProgressBarL, xml2ExcelTab, constraints, 0, 0, 1, 1);
		add(jProgressBar, xml2ExcelTab, constraints, 0, 0, 0, 1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 合并后的excel文件
		if (e.getSource() == mergedExcel4B) {
			JFileChooser jkXmlFC = new JFileChooser();
			jkXmlFC.setFileSelectionMode(JFileChooser.FILES_ONLY);
			jkXmlFC.showDialog(new JLabel(), "选择");
			File file = jkXmlFC.getSelectedFile();
			if (file != null && file.exists()) {
				mergedExcel4TF.setText(file.getAbsolutePath());
			}
		}
		// 建库xml文件
		if (e.getSource() == selectXmlPath4B) {
			JFileChooser jkXmlFC = new JFileChooser();
			jkXmlFC.setFileSelectionMode(JFileChooser.FILES_ONLY);
			jkXmlFC.showDialog(new JLabel(), "选择");
			File file = jkXmlFC.getSelectedFile();
			if (file != null && file.exists()) {
				jkXml4TF.setText(file.getAbsolutePath());
			}
		}
		// 更新后的建库xml文件
		if (e.getSource() == updateXml4B) {

			final String excelPath = mergedExcel4TF.getText().trim().replace("\\", "/");
			final String xmlPath = jkXml4TF.getText().trim();
			// String excelPath =
			// "F:\\工作\\8院\\何海英\\2016_08_15\\航天八院Capital建库总清单2330_0815.xls";
			// String xmlPath = "F:\\工作\\8院\\何海英\\2016_08_15\\lib-all0815.xml";
			new Thread(new Runnable() {

				private File excelInfoInsertXmlFile;

				@Override
				public void run() {
					try {
						if (!"".equals(excelPath) && !"".equals(xmlPath)) {
							UIUtil.changeProgressBarValue(jpb4, 0, true);
							excelInfoInsertXmlFile = ParseXmlTest.excelInfoInsertXml(excelPath, xmlPath);
							jpb4.setString("更新成功:" + excelInfoInsertXmlFile.getAbsolutePath());
							UIUtil.changeProgressBarValue(jpb4, 100, false);
							if (excelInfoInsertXmlFile != null && excelInfoInsertXmlFile.exists()) {
								updatedXmlPath4TF.setText(excelInfoInsertXmlFile.getAbsolutePath());
								JOptionPane.showMessageDialog(null, "更新成功！");
							}
						} else {
							JOptionPane.showMessageDialog(null, "xml文件或excel文件路径有问题，请重新选择!");
						}
						// file =
						// ModifiedXmlAttributeTest.excelInfoInsertXml(excelPath,
						// xmlPath);
					} catch (Exception e1) {
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}

				}
			}).start();

		}
		// 建库xml更新前的文件
		if (e.getSource() == jkXmlPathB) {
			JFileChooser jkXmlFC = new JFileChooser();
			jkXmlFC.setFileSelectionMode(JFileChooser.FILES_ONLY);
			jkXmlFC.showDialog(new JLabel(), "选择");
			File file = jkXmlFC.getSelectedFile();
			if (file != null && file.exists()) {
				jkXmlPathTF.setText(file.getAbsolutePath());
			}
		}
		// 建库xml更新后的文件
		if (e.getSource() == jkUpdatedXmlPathB) {

			updatedXmlFile = null;
			final String suffix = partNumberSuffixTF.getText().trim();
			final String capitalLibraryXmlFilePath = jkXmlPathTF.getText();
			if (capitalLibraryXmlFilePath != null && !"".equals(capitalLibraryXmlFilePath.trim())) {
				if (capitalLibraryXmlFilePath.endsWith("xml")) {
					new Thread(new Runnable() {

						@Override
						public void run() {
							try {
								UIUtil.changeProgressBarValue(jpb1, 0, true);
								updatedXmlFile = CapitalLibraryFileUpdateUtil
										.xmlUpdate2(capitalLibraryXmlFilePath.trim().replace("\\", "/"), suffix);
								jpb1.setString("文件生成完成:" + updatedXmlFile.getAbsolutePath());
								UIUtil.changeProgressBarValue(jpb1, 100, false);

								if (updatedXmlFile != null && (updatedXmlFile).exists()) {
									jkUpdatedXmlPathTF.setText(updatedXmlFile.getAbsolutePath());
									JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "xml文件更新成功");
								}
							} catch (Exception e1) {
								JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this,
										"xml文件解析失败,可能xml格式不正确!详情请查看日志信息。");
								logger.error(e1.getMessage());
								e1.printStackTrace();
							}
						}
					}).start();

				} else {
					JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "请确定xml文件的后缀是'xml'格式的文件");
				}
			} else {
				JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "请先选择建库xml文件路径！");
			}

		}
		// 建库excel更新前的文件
		if (e.getSource() == jkExcelPathB) {
			JFileChooser jkXmlFC = new JFileChooser();
			jkXmlFC.setFileSelectionMode(JFileChooser.FILES_ONLY);
			jkXmlFC.showDialog(new JLabel(), "选择");
			File file = jkXmlFC.getSelectedFile();
			if (file != null && file.exists()) {
				jkExcelPathTF.setText(file.getAbsolutePath());
			}
		}
		// 建库excel更新后的文件
		if (e.getSource() == jkUpdatedExcelPathB) {
			File updatedExcelFile = null;
			String suffix = partNumberSuffixTF.getText().trim();
			String capitalLibraryExcelFilePath = jkExcelPathTF.getText();
			if (capitalLibraryExcelFilePath != null && !"".equals(capitalLibraryExcelFilePath.trim())) {
				if (capitalLibraryExcelFilePath.endsWith("xls")) {
					try {
						updatedExcelFile = CapitalLibraryFileUpdateUtil.excelUpdate2(capitalLibraryExcelFilePath.trim(),
								suffix);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "请确定excel文件的后缀是'xls'格式的文件");
				}
			} else {
				JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "请先选择建库excel文件路径！");
			}
			if (updatedExcelFile != null && updatedExcelFile.exists()) {
				jkUpdatedExcelPathTF.setText(updatedExcelFile.getAbsolutePath());
				JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "Excel文件更新成功");
			}
		}

		/**
		 * 选择建库xml文件路径
		 */
		if (e.getSource() == jkXmlB) {
			JFileChooser jkXmlFC = new JFileChooser();
			jkXmlFC.setFileSelectionMode(JFileChooser.FILES_ONLY);
			jkXmlFC.showDialog(new JLabel(), "选择");
			File file = jkXmlFC.getSelectedFile();
			if (file.getAbsolutePath().endsWith("xml")) {
				if (file != null && file.exists()) {
					jkXmlTF.setText(file.getAbsolutePath());
				}
			} else {
				jkXmlTF.setText("");
				JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "请确定xml文件的后缀是'xml'格式的文件");
			}
		}
		/**
		 * 打开生成的Excel文件
		 */
		if (e.getSource() == openCreatedExcelB) {
			String jkXml2ExcelPath = jkXml2ExcelTF.getText().trim();
			if (!ConstantsUtil.EMPTY.equals(jkXml2ExcelPath)) {
				if (jkXml2ExcelPath.endsWith("xls")) {
					File jkXml2ExcelFile = new File(jkXml2ExcelPath);
					if (jkXml2ExcelFile.isFile() && jkXml2ExcelFile.exists()) {
						try {
							Desktop.getDesktop().open(jkXml2ExcelFile);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					} else {
						JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "找不到指定的文件!");
					}
				} else {
					JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "请确定excel文件的后缀是'xls'格式的文件");
				}
			} else {
				JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "文件路径不能为空");
			}
		}

		/**
		 * // 建库xml生成Excel(之前的处理方式，当xml文件大的时候，容易出现内存溢出的情况) if (e.getSource() ==
		 * jkXml2ExcelB) { String jkXmlPath = jkXmlTF.getText().trim(); File jkXmlFile =
		 * new File(jkXmlPath); String compType =
		 * checkCompTypeCB.getSelectedItem().toString().trim();
		 * 
		 * if (!ConstantsUtil.EMPTY.equals(jkXmlPath) && jkXmlFile.exists()) {
		 * 
		 * // JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this,
		 * "导出xml文件中包含的所有元器件"); GetAllLibraryInfo getAllLibraryInfo = new
		 * GetAllLibraryInfo( jkXmlPath,compType); File f =
		 * getAllLibraryInfo.getReturnOutFile(); if (f != null) {
		 * jkXml2ExcelTF.setText(f.getAbsolutePath()); } } else {
		 * JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "请选择文件再操作!"); }
		 * }
		 */
		// 建库xml生成Excel()
		if (e.getSource() == jkXml2ExcelB) {
			final String jkXmlPath = jkXmlTF.getText().trim();
			File jkXmlFile = new File(jkXmlPath);
			final String xlsPath = new File(jkXmlFile.getAbsolutePath().replace("\\", "/")).getParentFile()
					.getAbsolutePath() + "\\"
					+ propertieUtil.getValue(ConstantsUtil.JIANKU_XML2Excel_PATH).split("\\.")[0]
					+ System.currentTimeMillis() + ".xls";
			// String compType = checkCompTypeCB.getSelectedItem().toString()
			// .trim();

			if (!ConstantsUtil.EMPTY.equals(jkXmlPath) && jkXmlFile.exists()) {
				new Thread(new Runnable() {
					@Override
					public void run() {
						UIUtil.changeProgressBarValue(jProgressBar, 0, true);
						try {
							ParseTest parseTest = new ParseTest();
							parseTest.testSAX(jkXmlPath, xlsPath);
							jkXml2ExcelTF
									.setText(new File(xlsPath).exists() ? new File(xlsPath).getAbsolutePath() : "");
							UIUtil.changeProgressBarValue(jProgressBar, 100, false);
							jProgressBar.setString("文件生成成功！");
							System.out.println("文件生成成功！");
							JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "文件生成成功！");
						} catch (Exception e) {
							UIUtil.changeProgressBarValue(jProgressBar, 50, false);
							jProgressBar.setString("文件生成失败！");
							System.out.println("文件生成失败！");
							JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "文件生成失败！");
							e.printStackTrace();
						}

					}
				}).start();
			} else {
				JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "请选择文件再操作!");
				jkXml2ExcelTF.setText("");
			}
		}
		// 选择建库Excel文件路径
		if (e.getSource() == jkExcelB) {
			JFileChooser jkXmlFC = new JFileChooser();
			jkXmlFC.setFileSelectionMode(JFileChooser.FILES_ONLY);
			jkXmlFC.showDialog(new JLabel(), "选择");
			File file = jkXmlFC.getSelectedFile();
			if (file.getAbsolutePath().endsWith("xls")) {
				if (file != null && file.exists()) {
					jkExcelTF.setText(file.getAbsolutePath());
				}
			} else {
				jkExcelTF.setText("");
				JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "请确定excel文件的后缀是'xls'格式的文件");
			}
		}
		// 选择自定义Excel文件路径
		if (e.getSource() == khExcelB) {
			JFileChooser jkXmlFC = new JFileChooser();
			jkXmlFC.setFileSelectionMode(JFileChooser.FILES_ONLY);
			jkXmlFC.showDialog(new JLabel(), "选择");
			File file = jkXmlFC.getSelectedFile();
			if (file.getAbsolutePath().endsWith("xls")) {
				if (file != null && file.exists()) {
					khExcelTF.setText(file.getAbsolutePath());
				}
			} else {
				khExcelTF.setText("");
				JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "请确定excel文件的后缀是'xls'格式的文件");
			}
		}
		// 选择合并后的Excel
		if (e.getSource() == chooseMergedExcelB) {
			JFileChooser jkXmlFC = new JFileChooser();
			jkXmlFC.setFileSelectionMode(JFileChooser.FILES_ONLY);
			jkXmlFC.showDialog(new JLabel(), "选择");
			File file = jkXmlFC.getSelectedFile();
			if (file.getAbsolutePath().endsWith("xls")) {
				if (file != null && file.exists()) {
					mergeExcelTF.setText(file.getAbsolutePath());
				}
			} else {
				mergeExcelTF.setText("");
				JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "请确定excel文件的后缀是'xls'格式的文件");
			}

		}
		// 两个Excel合并
		if (e.getSource() == mergeExcelB) {
			String khExcelFilePath = khExcelTF.getText().trim();
			String jkExcelFilePath = jkExcelTF.getText().trim();
			File khExcelFile = new File(khExcelFilePath);
			File jkExcelFile = new File(jkExcelFilePath);
			if (!ConstantsUtil.EMPTY.equals(khExcelFilePath) && !ConstantsUtil.EMPTY.equals(jkExcelFilePath)
					&& khExcelFile.exists() && jkExcelFile.exists()) {
				TwoExcel2OneExcel.twoExcelMergeOneExcel(khExcelFilePath, jkExcelFilePath);
				File f = TwoExcel2OneExcel.getMergedExcelFile();
				if (f != null) {
					mergeExcelTF.setText(f.getAbsolutePath());
				} else {
					JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "文件生成失败!");
				}
			} else {
				JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "请选择文件再操作!");
			}
		}

		/**
		 * 打开生成的Excel文件
		 */
		if (e.getSource() == openMergedExcelB) {
			String mergeExcelPath = mergeExcelTF.getText().trim();
			if (!ConstantsUtil.EMPTY.equals(mergeExcelPath)) {
				File mergeExcelFile = new File(mergeExcelPath);
				if (mergeExcelFile.isFile() && mergeExcelFile.exists()) {
					try {
						Desktop.getDesktop().open(mergeExcelFile);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "找不到指定的文件!");
				}
			} else {
				JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "文件路径不能为空");
			}
		}
		// // 选择合并后的Excel文件路径
		// if (e.getSource() == mergedExcelB) {
		// JFileChooser jkXmlFC = new JFileChooser();
		// jkXmlFC.setFileSelectionMode(JFileChooser.FILES_ONLY);
		// jkXmlFC.showDialog(new JLabel(), "选择");
		// File file = jkXmlFC.getSelectedFile();
		// mergedExcelTF.setText(file.getAbsolutePath());
		// }
		// 合并后的Excel生成Xml文件
		if (e.getSource() == mergedExcel2XmlB) {
			String mergedExcelFilePath = mergeExcelTF.getText().trim();
			File mergedExcelFile = new File(mergedExcelFilePath);
			if (!ConstantsUtil.EMPTY.equals(mergedExcelFilePath) && mergedExcelFile.exists()) {
				try {
					if (CustomerPropertiesExcel2Xml.customerPropertiesExcel2Xml(mergedExcelFilePath)) {
						String parentPath = WObjectServiceImpl.getTempFileDir();
						String fileName = PropertieUtil.getPropertieUtil()
								.getValue(ConstantsUtil.IMPORTREPLACEDXML_PATH);

						mergedExcel2XmlTF.setText(new File(parentPath + fileName).getAbsolutePath());
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			} else {
				JOptionPane.showMessageDialog(CapitalLibraryHandlePanel.this, "请选择文件再操作!");
			}
		}

	}

}
