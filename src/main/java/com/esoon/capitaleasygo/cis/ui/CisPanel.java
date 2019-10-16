/*
 * Copyright 2005 MH-Software-Entwicklung. All rights reserved.
 * Use is subject to license terms.
 */

package com.esoon.capitaleasygo.cis.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import com.esoon.capitaleasygo.image.ImageHelper;
import com.esoon.capitaleasygo.util.GridBagHelper;
import com.jtattoo.plaf.JTattooUtilities;

/**
 *
 * @author  Michael Hagen
 */
public class CisPanel extends JPanel {
	private Component parent = null;
    public JTabbedPane tabbedPane = null;
    private JCheckBox scrollableTabCheck = null;
    private JRadioButton topTabButton = null;
    private JRadioButton leftTabButton = null;
    private JRadioButton bottomTabButton = null;
    private JRadioButton rightTabButton = null;
    private JButton addTabButton = null;
	private static JTextField ipTF;
	private static JTextField portTF;
	private static JTextField userNameTF;
	private static JTextField passWordTF;
	private static JComboBox authenticationCB;
    
    public CisPanel(Component aParent) {
        super(new BorderLayout());
        this.parent = aParent;
        init();
    }
    
    private void init() {
        setName("TabPane");
        setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        
        JPanel cisInfoPanel = new JPanel(new GridLayout(1,10));
        cisInfoPanel.add(new JLabel("ip："));
        ipTF = new JTextField("127.0.0.1");
        cisInfoPanel.add(ipTF);
        
        cisInfoPanel.add(new JLabel("port："));
        portTF = new JTextField("49901");
        cisInfoPanel.add(portTF);
        
        cisInfoPanel.add(new JLabel("userName："));
        userNameTF = new JTextField("system");
        cisInfoPanel.add(userNameTF);
        
        cisInfoPanel.add(new JLabel("passWord："));
         passWordTF = new JTextField("manager");
        cisInfoPanel.add(passWordTF);
        
        cisInfoPanel.add(new JLabel("是否需要登录CIS服务器"));
        String items[] = new String[]{"是", "否"};
		 authenticationCB = new JComboBox(items);
        authenticationCB.setEditable(false);
        cisInfoPanel.add(authenticationCB);
        
        add(cisInfoPanel, BorderLayout.NORTH);
        
        
        
        JPanel contentPanel = new CisCenterPanel(parent);
        
        add(contentPanel, BorderLayout.CENTER);
    }

    public static class CloseableTabComponent extends JPanel {
        private static ImageIcon closerImage = ImageHelper.loadImage("closer.gif");
        private static ImageIcon closerRolloverImage = ImageHelper.loadImage("closer_rollover.gif");
        private static ImageIcon closerPressedImage = ImageHelper.loadImage("closer_pressed.gif");
        private JLabel titleLabel = null;
        private JButton closeButton = null; 
        private JTabbedPane tabbedPane = null;
        
        public CloseableTabComponent(String title, JTabbedPane aTabbedPane) {
            super(new BorderLayout());
            tabbedPane = aTabbedPane;
            
            setOpaque(false);
            setBorder(BorderFactory.createEmptyBorder(1, 0, 0, 0));
            
            titleLabel = new JLabel(title==null?"close me tab  ":title);
            titleLabel.setOpaque(false);

            closeButton = new JButton(closerImage);
            closeButton.setRolloverIcon(closerRolloverImage);
            closeButton.setPressedIcon(closerPressedImage);
            closeButton.setBorderPainted(false);
            closeButton.setBorder(BorderFactory.createEmptyBorder());
            closeButton.setFocusPainted(false);
            closeButton.setRolloverEnabled(true);
            closeButton.setOpaque(false);
            closeButton.setContentAreaFilled(false);
            closeButton.setPreferredSize(new Dimension(closerImage.getIconWidth(), closerImage.getIconHeight()));
            closeButton.setSize(new Dimension(closerImage.getIconWidth(), closerImage.getIconHeight()));
            closeButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i < tabbedPane.getTabCount(); i++) {
                        if (CloseableTabComponent.this.equals(tabbedPane.getTabComponentAt(i))) {
                            tabbedPane.removeTabAt(i);
                            break;
                        }
                    }
                }
            });
            
            add(titleLabel, BorderLayout.CENTER);
            add(closeButton, BorderLayout.EAST);
        }
        
        public void paint(Graphics g) {
            super.paint(g);
        }
    }
    
    /**
     * 
     * @Title: getPort
     * @Description: TODO(获得端口)
     * @param @return 参数
     * @return String 返回类型
     * @throws
     */
    public static String getIp() {
    	if(ipTF.getText() == null) {
    		return "127.0.0.1";//默认本机地址：127.0.0.1或者localhost
    	}else {
    		return ipTF.getText().trim();
    	}
    }
    /**
     * 
         * @Title: getPort
         * @Description: TODO(获得端口)
         * @param @return 参数
         * @return String 返回类型
         * @throws
     */
    public static String getPort() {
    	if(portTF.getText() == null) {
    		return "49901";//默认49901
    	}else {
    		return portTF.getText().trim();
    	}
    }
    /**
     * 
     * @Title: getIp
     * @Description: TODO(获得用户名)
     * @param @return 参数
     * @return String 返回类型
     * @throws
     */
    public static String getUsername() {
    	if(userNameTF.getText() == null) {
    		return "system";//默认system
    	}else {
    		return userNameTF.getText().trim();
    	}
    }
    /**
     * 
     * @Title: getIp
     * @Description: TODO(获得密码)
     * @param @return 参数
     * @return String 返回类型
     * @throws
     */
    public static String getPassword() {
    	if(passWordTF.getText() == null) {
    		return "manager";//默认manager
    	}else {
    		return passWordTF.getText().trim();
    	}
    }
    /**
     * 
     * @Title: getIp
     * @Description: TODO(获得ip)
     * @param @return 参数
     * @return String 返回类型
     * @throws
     */
    public static String getAuthentication() {
    	if(authenticationCB.getSelectedItem() == null) {
    		return "true";//默认返回本机地址或者localhost
    	}else {
    		return authenticationCB.getSelectedItem().toString()=="是"?"true":"false";
    	}
    }
    
}
