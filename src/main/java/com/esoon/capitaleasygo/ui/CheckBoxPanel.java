/*
 * Copyright 2005 MH-Software-Entwicklung. All rights reserved.
 * Use is subject to license terms.
 */

package com.esoon.capitaleasygo.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.esoon.capitaleasygo.util.GridBagHelper;

/**
 *
 * @author  Michael Hagen
 */
public class CheckBoxPanel extends JPanel {
    private JCheckBox standardCheckBox = null;
    private JCheckBox selectedCheckBox = null;
    private JCheckBox htmlCheckBox = null;
    private JCheckBox disabledCheckBox = null;
    private JCheckBox disabledSelectedCheckBox = null;
    private JCheckBox coloredCheckBox = null;
    
    public CheckBoxPanel() {
        super(new BorderLayout());
        init();
    }
    
    private void init() {
        setName("CheckBox");
        setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        GridBagLayout layout = new GridBagLayout();
        JPanel contentPanel = new JPanel(layout);
        
        standardCheckBox = new JCheckBox("Standard");
        
        selectedCheckBox = new JCheckBox("Selected");
        selectedCheckBox.setSelected(true);
        
        htmlCheckBox = new JCheckBox("<html><b>HTML</b>-CheckBox</html>");
        
        disabledCheckBox = new JCheckBox("Disabled");
        disabledCheckBox.setEnabled(false);

        disabledSelectedCheckBox = new JCheckBox("Disabled selected");
        disabledSelectedCheckBox.setSelected(true);
        disabledSelectedCheckBox.setEnabled(false);
        
        coloredCheckBox = new JCheckBox("Colored");
        coloredCheckBox.setForeground(Color.blue);
        
        GridBagHelper.addComponent(contentPanel, standardCheckBox,          0, 1, 1, 1, 16, 8,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, selectedCheckBox,          0, 2, 1, 1, 16, 8,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, htmlCheckBox,              0, 3, 1, 1, 16, 8,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, disabledCheckBox,          0, 4, 1, 1, 16, 8,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, disabledSelectedCheckBox,  0, 5, 1, 1, 16, 8,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, coloredCheckBox,           0, 6, 1, 1, 16, 8,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        add(scrollPane, BorderLayout.CENTER);
    }
    
}
