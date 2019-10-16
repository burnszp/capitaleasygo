/*
 * Copyright 2005 MH-Software-Entwicklung. All rights reserved.
 * Use is subject to license terms.
 */

package com.esoon.capitaleasygo.cis.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.acconsys.cws.CisServer;
import com.acconsys.cws.SOAPClient;
import com.acconsys.cws.SOAPRequest;
import com.acconsys.cws.SOAPResponse;
import com.esoon.capitaleasygo.cis.util.DomUtils;
import com.esoon.capitaleasygo.util.GridBagHelper;

/**
 *
 * @author  Michael Hagen
 */
public class GetProjectListPanel extends JPanel {
    private JTextArea payloadTextArea = null;
//    private JTextArea nonEditableTextArea = null;
//    private JTextArea disabledTextArea = null;
//    private JTextArea coloredTextArea = null;
	private JEditorPane editorPane;
    
    public GetProjectListPanel() {
        super(new BorderLayout());
        init();
    }
    
    private void init() {
        setName("获得项目列表");
        setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        GridBagLayout layout = new GridBagLayout();
        JPanel contentPanel = new JPanel(layout);
        
        payloadTextArea = new JTextArea("<projects/>");
        JScrollPane payloadScrollPane = new JScrollPane(payloadTextArea);
        payloadScrollPane.setPreferredSize(new Dimension(500, 80));
//        nonEditableTextArea = new JTextArea("Non editable");
//        nonEditableTextArea.setEditable(false);
//        JScrollPane nonEditableScrollPane = new JScrollPane(nonEditableTextArea);
//        nonEditableScrollPane.setPreferredSize(new Dimension(320, 80));
//        disabledTextArea = new JTextArea("Disabled");
//        disabledTextArea.setEnabled(false);
//        JScrollPane disabledScrollPane = new JScrollPane(disabledTextArea);
//        disabledScrollPane.setPreferredSize(new Dimension(320, 80));
//        coloredTextArea = new JTextArea("Colored");
//        coloredTextArea.setForeground(Color.green);
//        coloredTextArea.setBackground(new Color(128, 128, 255));
//        JScrollPane coloredScrollPane = new JScrollPane(coloredTextArea);
//        coloredScrollPane.setPreferredSize(new Dimension(320, 80));
        JButton executeB = new JButton("执行");
        executeB.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				String xmlString = null;
				try {
					CisServer server = new CisServer(CisPanel.getIp(), Integer.parseInt(CisPanel.getPort()));
					SOAPRequest request = new SOAPRequest();
					request.setUsername(CisPanel.getUsername());
					request.setPassword(CisPanel.getPassword());
					request.setPayload(payloadTextArea.getText());
					request.build(Boolean.valueOf(CisPanel.getAuthentication()));
					SOAPClient client = new SOAPClient();
					SOAPResponse response = client.callService(request, server.getProjectsListService());

					response.getSoapResponse();
					response.getSoapResponse().getTextContent();
					// 从Document 转成xml字符串
					xmlString = DomUtils.toStringFromDoc1(response.getSoapResponse());

//				 SOAPBody body = response.getResponse().getSOAPBody();
					// 保存内容到指定文件
					editorPane.setText(xmlString);
//					response.saveBody(new File("projects.xml"));
//				 xmlString = body.toString();
				} catch (Exception e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}

				editorPane.updateUI();
			}
		});
        
         editorPane = new JEditorPane("text/plain","");
        JScrollPane editorScrollPane = new JScrollPane(editorPane);
        editorScrollPane.setPreferredSize(new Dimension(500, 300));
        
        JLabel standardLabel = new JLabel("请求的内容:");
//        JLabel nonEditableLabel = new JLabel("Non editable:");
//        JLabel disabledLabel = new JLabel("Disabled:");
//        JLabel coloredLabel = new JLabel("Colored:");
        JLabel editorLabel = new JLabel("返回的项目集合信息:");
        
        GridBagHelper.addComponent(contentPanel, standardLabel,         0, 1, 1, 1, 16, 0,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, payloadScrollPane,    1, 1, 1, 1, 16, 0,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, executeB,      0, 2, 1, 1, 16, 0,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
//        GridBagHelper.addComponent(contentPanel, nonEditableScrollPane, 1, 2, 1, 1, 16, 0,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
//        GridBagHelper.addComponent(contentPanel, disabledLabel,         0, 3, 1, 1, 16, 0,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
//        GridBagHelper.addComponent(contentPanel, disabledScrollPane,    1, 3, 1, 1, 16, 0,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
//        GridBagHelper.addComponent(contentPanel, coloredLabel,          0, 4, 1, 1, 16, 0,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
//        GridBagHelper.addComponent(contentPanel, coloredScrollPane,     1, 4, 1, 1, 16, 0,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, editorLabel,           0, 3, 1, 1, 16, 0,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        GridBagHelper.addComponent(contentPanel, editorScrollPane,      1, 3, 1, 1, 16, 0,  0.0, 0.0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        add(scrollPane, BorderLayout.CENTER);
    }
}
