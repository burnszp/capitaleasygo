/*
 * Copyright 2005 MH-Software-Entwicklung. All rights reserved.
 * Use is subject to license terms.
 */

package com.esoon.capitaleasygo.action.docgen.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import com.esoon.capitaleasygo.action.docgen.util.DocGenUtil;
import com.esoon.capitaleasygo.ui.ButtonPanel;
import com.esoon.capitaleasygo.ui.CheckBoxPanel;
import com.esoon.capitaleasygo.ui.ComboBoxPanel;
import com.esoon.capitaleasygo.ui.DialogPanel;
import com.esoon.capitaleasygo.ui.IDemoApp;
import com.esoon.capitaleasygo.ui.InternalFramePanel;
import com.esoon.capitaleasygo.ui.ProgressBarPanel;
import com.esoon.capitaleasygo.ui.RadioButtonPanel;
import com.esoon.capitaleasygo.ui.SliderPanel;
import com.esoon.capitaleasygo.ui.TabPanePanel;
import com.esoon.capitaleasygo.ui.TablePanel;
import com.esoon.capitaleasygo.ui.TextAreaPanel;
import com.esoon.capitaleasygo.ui.TextFieldPanel;
import com.esoon.capitaleasygo.ui.TextFieldSpinnerPanel;
import com.esoon.capitaleasygo.ui.ToggleButtonPanel;
import com.esoon.capitaleasygo.ui.WidgetPanel;
import com.mentor.capital.project.Wire;

/**
 *
 * @author Michael Hagen
 */
public class DocGenPanel extends JPanel {

	/**
	 * @Fields field:field:{todo}(用一句话描述这个变量表示什么)
	 */

	private static final long serialVersionUID = 1L;
	private Component parent = null;
	private JTabbedPane tabbedPane = null;
	private InternalFramePanel internalFramePanel = null;
	private JPanel widgetPanel = null;
	private SliderPanel sliderPanel = null;
	private DialogPanel dialogPanel = null;
	private JPanel textFieldPanel = null;
	private TextAreaPanel textAreaPanel = null;
	private ComboBoxPanel comboBoxPanel = null;
	private ButtonPanel buttonPanel = null;
	private ToggleButtonPanel toggleButtonPanel = null;
	private CheckBoxPanel checkBoxPanel = null;
	private RadioButtonPanel radioButtonPanel = null;
	private ProgressBarPanel progressBarPanel = null;
	private TabPanePanel tabPanePanel = null;
	private TablePanel tablePanel = null;

	public DocGenPanel(Component aParent) {
		super(new BorderLayout());
		parent = aParent;
		init();
	}

	private void init() {
		internalFramePanel = new InternalFramePanel();
		try {

			Map<String, List<Object>> map = DocGenUtil.getDocGenUtilInstance().getComponentsFromHarnessDesign();

			List<Object> colNames = new ArrayList<Object>();
			List<List<Object>> dataList = new ArrayList<List<Object>>();

			for (Entry<String, List<Object>> entry : map.entrySet()) {
				System.out.println(entry.getKey());
				// 只显示导线信息
				if (Wire.class.getName().equals(entry.getKey())) {
					Field[] fileArr = Wire.class.getDeclaredFields();
					for (Field field : fileArr) {
						colNames.add(field.getName());
					}

					for (Object object : entry.getValue()) {
						List<Object> wireInfo = new ArrayList<Object>();
						Wire wire = (Wire) object;

						for (Field field : fileArr) {
//							wireInfo.add(field.get(wire));
							Method m = (Method) wire.getClass().getMethod("get" + getMethodName(field.getName()));

							Object val =  m.invoke(wire);// 调用getter方法获取属性值
							wireInfo.add(val);
						}

						dataList.add(wireInfo);

					}
				}
			}

			widgetPanel = new ComponentInfoPanel(colNames, dataList);
		} catch (Throwable t) {
			t.printStackTrace();
			widgetPanel = new WidgetPanel();
		}
		sliderPanel = new SliderPanel();
		dialogPanel = new DialogPanel(parent);
		try {
			textFieldPanel = new TextFieldSpinnerPanel();
		} catch (Throwable t) {
			textFieldPanel = new TextFieldPanel();
		}
		textAreaPanel = new TextAreaPanel();
		comboBoxPanel = new ComboBoxPanel();
		buttonPanel = new ButtonPanel();
		toggleButtonPanel = new ToggleButtonPanel();
		checkBoxPanel = new CheckBoxPanel();
		radioButtonPanel = new RadioButtonPanel();
		progressBarPanel = new ProgressBarPanel();
		tabPanePanel = new TabPanePanel();
		tablePanel = new TablePanel();

		JPanel bigButtonPanel = new JPanel(new BorderLayout());
		bigButtonPanel.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
		JButton bigButton = new JButton("Extra Large");
		bigButtonPanel.add(bigButton, BorderLayout.CENTER);

		tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.add(internalFramePanel.getName(), internalFramePanel);
		tabbedPane.add(widgetPanel.getName(), widgetPanel);
		tabbedPane.add(sliderPanel.getName(), sliderPanel);
		tabbedPane.add(dialogPanel.getName(), dialogPanel);
		tabbedPane.add(textFieldPanel.getName(), textFieldPanel);
		tabbedPane.add(textAreaPanel.getName(), textAreaPanel);
		tabbedPane.add(comboBoxPanel.getName(), comboBoxPanel);
		tabbedPane.add(buttonPanel.getName(), buttonPanel);
		tabbedPane.add(toggleButtonPanel.getName(), toggleButtonPanel);
		tabbedPane.add(checkBoxPanel.getName(), checkBoxPanel);
		tabbedPane.add(radioButtonPanel.getName(), radioButtonPanel);
		tabbedPane.add(progressBarPanel.getName(), progressBarPanel);
		tabbedPane.add(tabPanePanel.getName(), tabPanePanel);
		tabbedPane.add(tablePanel.getName(), tablePanel);
		tabbedPane.add("BigButton", bigButtonPanel);

		tabbedPane.setTabPlacement(JTabbedPane.LEFT);
		tabbedPane.setSelectedIndex(1);

		add(tabbedPane, BorderLayout.CENTER);
		((IDemoApp) parent).setMainTabbedPane(tabbedPane);
	}

	
	    /**
	     * @Title: getMethodName
	     * @Description: TODO(这里用一句话描述这个方法的作用)
	     * @param @param name
	     * @param @return 参数
	     * @return String 返回类型
	     * @throws
	     */
	    
	// 把一个字符串的第一个字母大写、效率是最高的、  
    private static String getMethodName(String fildeName) throws Exception{  
        byte[] items = fildeName.getBytes();  
        items[0] = (byte) ((char) items[0] - 'a' + 'A');  
        return new String(items);  
    }

	public void updateLookAndFeel() {
		progressBarPanel.updateLookAndFeel();
	}

}
