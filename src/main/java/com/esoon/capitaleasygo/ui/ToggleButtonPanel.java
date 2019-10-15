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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;

import com.esoon.capitaleasygo.util.GridBagHelper;

/**
 *
 * @author  Michael Hagen
 */
public class ToggleButtonPanel extends JPanel {
    private JToggleButton standardButton = null;
    private JToggleButton selectedButton = null;
    private JToggleButton htmlButton = null;
    private JToggleButton disabledButton = null;
    private JToggleButton coloredButton = null;
    
    public ToggleButtonPanel() {
        super(new BorderLayout());
        init();
    }
    
    private void init() {
        setName("ToggleButtons");
        setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        GridBagLayout layout = new GridBagLayout();
        JPanel contentPanel = new JPanel(layout);
        
        standardButton = new JToggleButton("Standard");
        
        selectedButton = new JToggleButton("Selected");
        selectedButton.setSelected(true);
        
        htmlButton = new JToggleButton("<html><b>HTML</b>-ToggleButton</html>");
        
        disabledButton = new JToggleButton("Disabled");
        disabledButton.setEnabled(false);
        
        coloredButton = new JToggleButton("Colored");
        coloredButton.setForeground(Color.green);
        coloredButton.setBackground(new Color(128, 128, 255));
        
        GridBagHelper.addComponent(contentPanel, standardButton,  0, 1, 1, 1, 16, 8,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, selectedButton,  0, 2, 1, 1, 16, 8,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, htmlButton,      0, 3, 1, 1, 16, 8,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, disabledButton,  0, 4, 1, 1, 16, 8,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, coloredButton,   0, 5, 1, 1, 16, 8,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        add(scrollPane, BorderLayout.CENTER);
    }
    
}
