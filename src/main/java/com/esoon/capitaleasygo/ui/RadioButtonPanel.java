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
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import com.esoon.capitaleasygo.util.GridBagHelper;

/**
 *
 * @author  Michael Hagen
 */
public class RadioButtonPanel extends JPanel {
    private JRadioButton standardRadioButton = null;
    private JRadioButton selectedRadioButton = null;
    private JRadioButton htmlRadioButton = null;
    private JRadioButton disabledRadioButton = null;
    private JRadioButton disabledSelectedRadioButton = null;
    private JRadioButton coloredRadioButton = null;
    
    public RadioButtonPanel() {
        super(new BorderLayout());
        init();
    }
    
    private void init() {
        setName("RadioButton");
        setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        GridBagLayout layout = new GridBagLayout();
        JPanel contentPanel = new JPanel(layout);
        
        standardRadioButton = new JRadioButton("Standard");
        selectedRadioButton = new JRadioButton("Selected");
        selectedRadioButton.setSelected(true);
        htmlRadioButton = new JRadioButton("<html><b>HTML</b>-RadioButton</html>");
        disabledRadioButton = new JRadioButton("Disabled");
        disabledRadioButton.setEnabled(false);
        disabledSelectedRadioButton = new JRadioButton("Disabled selected");
        disabledSelectedRadioButton.setSelected(true);
        disabledSelectedRadioButton.setEnabled(false);
        coloredRadioButton = new JRadioButton("Colored");
        coloredRadioButton.setForeground(Color.blue);
        ButtonGroup group = new ButtonGroup();
        group.add(standardRadioButton);
        group.add(selectedRadioButton);
        group.add(htmlRadioButton);
        group.add(disabledRadioButton);
        group.add(coloredRadioButton);
        
        GridBagHelper.addComponent(contentPanel, standardRadioButton,           0, 1, 1, 1, 16, 8,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, selectedRadioButton,           0, 2, 1, 1, 16, 8,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, htmlRadioButton,               0, 3, 1, 1, 16, 8,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, disabledRadioButton,           0, 4, 1, 1, 16, 8,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, disabledSelectedRadioButton,   0, 5, 1, 1, 16, 8,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, coloredRadioButton,            0, 6, 1, 1, 16, 8,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        add(scrollPane, BorderLayout.CENTER);
    }
    
}
