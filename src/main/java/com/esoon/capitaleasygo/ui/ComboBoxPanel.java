/*
 * Copyright 2005 MH-Software-Entwicklung. All rights reserved.
 * Use is subject to license terms.
 */

package com.esoon.capitaleasygo.ui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.esoon.capitaleasygo.util.GridBagHelper;

/**
 *
 * @author  Michael Hagen
 */
public class ComboBoxPanel extends JPanel {
    private JComboBox standardComboBox = null;
    private JComboBox nonEditableComboBox = null;
    private JComboBox disabledComboBox = null;
    
    public ComboBoxPanel() {
        super(new BorderLayout());
        init();
    }
    
    private void init() {
        setName("ComboBox");
        setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        GridBagLayout layout = new GridBagLayout();
        JPanel contentPanel = new JPanel(layout);
        String items[] = new String[]{"Fred", "George", "Tom", "Bill", "Michael"};
        standardComboBox = new JComboBox(items);
        standardComboBox.setEditable(true);
        nonEditableComboBox = new JComboBox(items);
        nonEditableComboBox.setEditable(false);
        disabledComboBox = new JComboBox(items);
        disabledComboBox.setEnabled(false);
        
        JLabel standardLabel = new JLabel("Editable:");
        JLabel nonEditableLabel = new JLabel("Non editable:");
        JLabel disabledLabel = new JLabel("Disabled:");
        
        GridBagHelper.addComponent(contentPanel, standardLabel,       0, 1, 1, 1, 16, 0,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, standardComboBox,    1, 1, 1, 1, 16, 0,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, nonEditableLabel,    0, 2, 1, 1, 16, 0,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, nonEditableComboBox, 1, 2, 1, 1, 16, 0,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, disabledLabel,       0, 3, 1, 1, 16, 0,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, disabledComboBox,    1, 3, 1, 1, 16, 0,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);

        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        add(scrollPane, BorderLayout.CENTER);
    }
}
