/*
 * Copyright 2005 MH-Software-Entwicklung. All rights reserved.
 * Use is subject to license terms.
 */

package com.esoon.capitaleasygo.action.cis.ui;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

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
import com.esoon.capitaleasygo.ui.WidgetWithRowSorterPanel;

/**
 *
 * @author Michael Hagen
 */
public class CisCenterPanel extends JPanel {
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
	private GetProjectListPanel getProjectListPanel;
    
    public CisCenterPanel(Component aParent) {
        super(new BorderLayout());
        parent = aParent;
        init();
    }
    
    private void init() {
    	getProjectListPanel = new GetProjectListPanel();
        internalFramePanel = new InternalFramePanel();
        try {
            widgetPanel = new WidgetWithRowSorterPanel();
        }
        catch (Throwable t) {
            widgetPanel = new WidgetPanel();
        }
        sliderPanel = new SliderPanel();
        dialogPanel = new DialogPanel(parent);
        try {
            textFieldPanel = new TextFieldSpinnerPanel();
        }
        catch (Throwable t) {
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
        bigButtonPanel.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));
        JButton bigButton = new JButton("Extra Large");
        bigButtonPanel.add(bigButton, BorderLayout.CENTER);
        
        tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
        tabbedPane.add(getProjectListPanel.getName(), getProjectListPanel);
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
        tabbedPane.setSelectedIndex(0);
        
        add(tabbedPane, BorderLayout.CENTER);
        ((IDemoApp)parent).setMainTabbedPane(tabbedPane);
    }
    
    public void updateLookAndFeel() {
        progressBarPanel.updateLookAndFeel();
    }
    
}
