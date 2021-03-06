/*
 * Copyright 2005 MH-Software-Entwicklung. All rights reserved.
 * Use is subject to license terms.
 */

package com.esoon.capitaleasygo.ui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;
import javax.swing.LookAndFeel;

import com.esoon.capitaleasygo.action.cis.ui.CisPanel;
import com.esoon.capitaleasygo.action.docgen.ui.DocGenPanel;
import com.esoon.capitaleasygo.action.whereusedinproject.WhereUsedInProjectPanel;
import com.esoon.capitaleasygo.image.ImageHelper;
import com.esoon.capitaleasygo.ui.MainPanel.CloseableTabComponent;
import com.jtattoo.plaf.JTattooUtilities;

/**
 * @author  Michael Hagen
 */
public class MainMenuBar extends JMenuBar {
    private static final ImageIcon newIcon = ImageHelper.loadImage("new.gif");
    private static final ImageIcon openIcon = ImageHelper.loadImage("open.gif");
    private static final ImageIcon saveIcon = ImageHelper.loadImage("save.gif");
    private static final ImageIcon filterIcon = ImageHelper.loadImage("filter.gif");
    
    private Component parent = null;
    private IDemoApp demoApp = null;
    private ButtonGroup plafGroup = null;
    
    public MainMenuBar(Component aParent) {
        parent = aParent;
        demoApp = (IDemoApp)parent;
        plafGroup = new ButtonGroup();
        //setBorderPainted(true);
        JMenu subMenu = new JMenu("Submenu");
        JMenuItem subMenuItem = new JMenuItem("Submenu one");
        subMenu.add(subMenuItem);
        subMenuItem = new JMenuItem("Submenu two");
        subMenu.add(subMenuItem);
        
        JMenu menu = new JMenu("File");
        menu.setMnemonic('F');
        JMenuItem menuItem = new JMenuItem("New", newIcon);
        menuItem.setMnemonic('N');
        menuItem.setAccelerator(KeyStroke.getKeyStroke('N', KeyEvent.CTRL_MASK));
        menu.add(menuItem);
        menuItem = new JMenuItem("Open...", openIcon);
        menuItem.setMnemonic('O');
        menuItem.setAccelerator(KeyStroke.getKeyStroke('O', KeyEvent.CTRL_MASK));
        menu.add(menuItem);
        menuItem = new JMenuItem("Save...", saveIcon);
        menuItem.setMnemonic('S');
        menuItem.setAccelerator(KeyStroke.getKeyStroke('S', KeyEvent.CTRL_MASK));
        menu.add(menuItem);
        menu.addSeparator();
        menu.add(subMenu);
        menu.addSeparator();
        menuItem = new JMenuItem("Exit");
        menuItem.setMnemonic('x');
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, KeyEvent.ALT_MASK));
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                demoApp.performExit();
            }
        });
        menu.add(menuItem);
        add(menu);
        
        menu = new JMenu("Check");
        menu.setMnemonic('C');
        JCheckBoxMenuItem checkMenuItem = new JCheckBoxMenuItem("CheckBoxMenuItem selected", true);
        menu.add(checkMenuItem);
        checkMenuItem = new JCheckBoxMenuItem("CheckBoxMenuItem unselected", false);
        menu.add(checkMenuItem);
        menu.addSeparator();
        checkMenuItem = new JCheckBoxMenuItem("CheckBoxMenuItem selected disabled", true);
        checkMenuItem.setEnabled(false);
        menu.add(checkMenuItem);
        checkMenuItem = new JCheckBoxMenuItem("CheckBoxMenuItem unselected disabled", false);
        checkMenuItem.setEnabled(false);
        menu.add(checkMenuItem);
        menu.addSeparator();
        checkMenuItem = new JCheckBoxMenuItem("CheckBoxMenuItem selected", filterIcon, true);
        menu.add(checkMenuItem);
        checkMenuItem = new JCheckBoxMenuItem("CheckBoxMenuItem unselected", filterIcon, false);
        menu.add(checkMenuItem);
        menu.addSeparator();
        checkMenuItem = new JCheckBoxMenuItem("CheckBoxMenuItem selected disabled", filterIcon, true);
        checkMenuItem.setEnabled(false);
        menu.add(checkMenuItem);
        checkMenuItem = new JCheckBoxMenuItem("CheckBoxMenuItem unselected disabled", filterIcon, false);
        checkMenuItem.setEnabled(false);
        menu.add(checkMenuItem);
        add(menu);
        
        menu = new JMenu("Radio");
        menu.setMnemonic('R');
        JRadioButtonMenuItem radioMenuItem = new JRadioButtonMenuItem("RadioButtonMenuItem selected", true);
        menu.add(radioMenuItem);
        radioMenuItem = new JRadioButtonMenuItem("RadioButtonMenuItem unselected", false);
        menu.add(radioMenuItem);
        menu.addSeparator();
        radioMenuItem = new JRadioButtonMenuItem("RadioButtonMenuItem selected disabled", true);
        radioMenuItem.setEnabled(false);
        menu.add(radioMenuItem);
        radioMenuItem = new JRadioButtonMenuItem("RadioButtonMenuItem unselected disabled", false);
        radioMenuItem.setEnabled(false);
        menu.add(radioMenuItem);
        menu.addSeparator();
        radioMenuItem = new JRadioButtonMenuItem("RadioButtonMenuItem selected", filterIcon, true);
        menu.add(radioMenuItem);
        radioMenuItem = new JRadioButtonMenuItem("RadioButtonMenuItem unselected", filterIcon, false);
        menu.add(radioMenuItem);
        menu.addSeparator();
        radioMenuItem = new JRadioButtonMenuItem("RadioButtonMenuItem selected disabled", filterIcon, true);
        radioMenuItem.setEnabled(false);
        menu.add(radioMenuItem);
        radioMenuItem = new JRadioButtonMenuItem("RadioButtonMenuItem unselected disabled", filterIcon, false);
        radioMenuItem.setEnabled(false);
        menu.add(radioMenuItem);
        
        add(menu);
        menu = new JMenu("Look & Feel");
        menu.setMnemonic('L');
        
        radioMenuItem = new JRadioButtonMenuItem("Metal");
        radioMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                demoApp.updateLookAndFeel(GUIProperties.PLAF_METAL);
            }
        });
        radioMenuItem.setSelected(demoApp.getGuiProps().isMetalLook());
        plafGroup.add(radioMenuItem);
        menu.add(radioMenuItem);
        
        radioMenuItem = new JRadioButtonMenuItem("Windows");
        radioMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                demoApp.updateLookAndFeel(GUIProperties.PLAF_WINDOWS);
            }
        });
        radioMenuItem.setSelected(demoApp.getGuiProps().isWindowsLook());
        radioMenuItem.setEnabled(isSupportedLookAndFeel(GUIProperties.PLAF_WINDOWS));
        plafGroup.add(radioMenuItem);
        menu.add(radioMenuItem);
        
        radioMenuItem = new JRadioButtonMenuItem("Motif");
        radioMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                demoApp.updateLookAndFeel(GUIProperties.PLAF_MOTIF);
            }
        });
        radioMenuItem.setSelected(demoApp.getGuiProps().isMotifLook());
        plafGroup.add(radioMenuItem);
        menu.add(radioMenuItem);
        
        radioMenuItem = new JRadioButtonMenuItem("Mac");
        radioMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                demoApp.updateLookAndFeel(GUIProperties.PLAF_MAC);
            }
        });
        radioMenuItem.setSelected(demoApp.getGuiProps().isMacLook());
        radioMenuItem.setEnabled(isSupportedLookAndFeel(GUIProperties.PLAF_MAC));
        plafGroup.add(radioMenuItem);
        menu.add(radioMenuItem);
        
//        menu.addSeparator();
//        radioMenuItem = new JRadioButtonMenuItem("Other...");
//        radioMenuItem.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent event) {
//                demoApp.updateLookAndFeel(GUIProperties.PLAF_OTHER);
//            }
//        });
//        radioMenuItem.setSelected(demoApp.getGuiProps().isOtherLook());
//        plafGroup.add(radioMenuItem);
//        menu.add(radioMenuItem);

        menu.addSeparator();
        
        radioMenuItem = new JRadioButtonMenuItem("Acryl");
        radioMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                demoApp.updateLookAndFeel(GUIProperties.PLAF_ACRYL);
            }
        });
        radioMenuItem.setSelected(demoApp.getGuiProps().isAcrylLook());
        plafGroup.add(radioMenuItem);
        menu.add(radioMenuItem);
        
        radioMenuItem = new JRadioButtonMenuItem("Aero");
        radioMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                demoApp.updateLookAndFeel(GUIProperties.PLAF_AERO);
            }
        });
        radioMenuItem.setSelected(demoApp.getGuiProps().isAeroLook());
        plafGroup.add(radioMenuItem);
        menu.add(radioMenuItem);
        
        radioMenuItem = new JRadioButtonMenuItem("Aluminium");
        radioMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                demoApp.updateLookAndFeel(GUIProperties.PLAF_ALUMINIUM);
            }
        });
        radioMenuItem.setSelected(demoApp.getGuiProps().isAluminiumLook());
        plafGroup.add(radioMenuItem);
        menu.add(radioMenuItem);
        
        radioMenuItem = new JRadioButtonMenuItem("Bernstein");
        radioMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                demoApp.updateLookAndFeel(GUIProperties.PLAF_BERNSTEIN);
            }
        });
        radioMenuItem.setSelected(demoApp.getGuiProps().isBernsteinLook());
        plafGroup.add(radioMenuItem);
        menu.add(radioMenuItem);
        
        radioMenuItem = new JRadioButtonMenuItem("Fast");
        radioMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                demoApp.updateLookAndFeel(GUIProperties.PLAF_FAST);
            }
        });
        radioMenuItem.setSelected(demoApp.getGuiProps().isFastLook());
        plafGroup.add(radioMenuItem);
        menu.add(radioMenuItem);
        
        radioMenuItem = new JRadioButtonMenuItem("HiFi");
        radioMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                demoApp.updateLookAndFeel(GUIProperties.PLAF_HIFI);
            }
        });
        radioMenuItem.setSelected(demoApp.getGuiProps().isHiFiLook());
        plafGroup.add(radioMenuItem);
        menu.add(radioMenuItem);
        
        radioMenuItem = new JRadioButtonMenuItem("Luna");
        radioMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                demoApp.updateLookAndFeel(GUIProperties.PLAF_LUNA);
            }
        });
        radioMenuItem.setSelected(demoApp.getGuiProps().isLunaLook());
        plafGroup.add(radioMenuItem);
        menu.add(radioMenuItem);
        
        radioMenuItem = new JRadioButtonMenuItem("McWin");
        radioMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                demoApp.updateLookAndFeel(GUIProperties.PLAF_MCWIN);
            }
        });
        radioMenuItem.setSelected(demoApp.getGuiProps().isMcWinLook());
        plafGroup.add(radioMenuItem);
        menu.add(radioMenuItem);
        
        radioMenuItem = new JRadioButtonMenuItem("Mint");
        radioMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                demoApp.updateLookAndFeel(GUIProperties.PLAF_MINT);
            }
        });
        radioMenuItem.setSelected(demoApp.getGuiProps().isMintLook());
        plafGroup.add(radioMenuItem);
        menu.add(radioMenuItem);
        
        radioMenuItem = new JRadioButtonMenuItem("Noire");
        radioMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                demoApp.updateLookAndFeel(GUIProperties.PLAF_NOIRE);
            }
        });
        radioMenuItem.setSelected(demoApp.getGuiProps().isNoireLook());
        plafGroup.add(radioMenuItem);
        menu.add(radioMenuItem);
        
        radioMenuItem = new JRadioButtonMenuItem("Smart");
        radioMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                demoApp.updateLookAndFeel(GUIProperties.PLAF_SMART);
            }
        });
        radioMenuItem.setSelected(demoApp.getGuiProps().isSmartLook());
        plafGroup.add(radioMenuItem);
        menu.add(radioMenuItem);
        
        add(menu);
        
        menu = new JMenu("Help");
        menu.setMnemonic('H');
        menuItem = new JMenuItem("Content...");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HelpDialog dlg = new HelpDialog(parent);
            }
        });
        menuItem.setMnemonic('C');
        menu.add(menuItem);
        menu.addSeparator();
        menuItem = new JMenuItem("About...");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AboutDialog dlg = new AboutDialog(parent);
            }
        });
        menuItem.setMnemonic('A');
        menu.add(menuItem);
        add(menu);
        
        
        menu = new JMenu("Window");
        menu.setMnemonic('W');
        menuItem = new JMenuItem("Setting");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SettingDialog dlg = new SettingDialog(parent);
            }
        });
        menuItem.setMnemonic('S');
        menu.add(menuItem);
//        menu.addSeparator();
        add(menu);
        
        
        menu = new JMenu("Action");
        menu.setMnemonic('A');
        menuItem = new JMenuItem("Demo");
        menuItem.setToolTipText("Jtatto的代码示例效果");
        menuItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
//        		SettingDialog dlg = new SettingDialog(parent);

        		JTabbedPane tabbedPane = demoApp.getMainPanel().tabbedPane;
                if (JTattooUtilities.getJavaVersion() >= 1.6) {
                    int tabCount = tabbedPane.getTabCount();
                    tabbedPane.add("Tab", new RightPanel(parent));
                    tabbedPane.setTabComponentAt(tabCount, new CloseableTabComponent("Demo",tabbedPane));
                }
            
        	}
        });
        menuItem.setMnemonic('D');
        menu.add(menuItem);
        menu.addSeparator();
        menuItem = new JMenuItem("Cis");
        menuItem.setToolTipText("Capital Graphics 软件的Capital Integration Server模块的接口调用");
        menuItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
//        		SettingDialog dlg = new SettingDialog(parent);
        		
        		JTabbedPane tabbedPane = demoApp.getMainPanel().tabbedPane;
        		if (JTattooUtilities.getJavaVersion() >= 1.6) {
        			int tabCount = tabbedPane.getTabCount();
        			tabbedPane.add("Tab", new CisPanel(parent));
        			tabbedPane.setTabComponentAt(tabCount, new CloseableTabComponent("Cis",tabbedPane));
        		}
        		
        	}
        });
        menuItem.setMnemonic('C');
        menu.add(menuItem);
        menu.addSeparator();
        menuItem = new JMenuItem("WhereUsedInProject");
        menuItem.setToolTipText("Capital中项目下的设计中元器件的使用情况");
        menuItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
//        		SettingDialog dlg = new SettingDialog(parent);
        		
        		JTabbedPane tabbedPane = demoApp.getMainPanel().tabbedPane;
        		if (JTattooUtilities.getJavaVersion() >= 1.6) {
        			int tabCount = tabbedPane.getTabCount();
        			tabbedPane.add("Tab", new WhereUsedInProjectPanel(parent));
        			tabbedPane.setTabComponentAt(tabCount, new CloseableTabComponent("WhereUsedInProject",tabbedPane));
        		}
        		
        	}
        });
        menuItem.setMnemonic('W');
        menu.add(menuItem);
        
        menu.addSeparator();
        menuItem = new JMenuItem("DocGen");
        menuItem.setToolTipText("根据Capital设计源文件输出DocGen文件");
        menuItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
//        		SettingDialog dlg = new SettingDialog(parent);
        		
        		JTabbedPane tabbedPane = demoApp.getMainPanel().tabbedPane;
        		if (JTattooUtilities.getJavaVersion() >= 1.6) {
        			int tabCount = tabbedPane.getTabCount();
        			tabbedPane.add("Tab", new DocGenPanel(parent));
        			tabbedPane.setTabComponentAt(tabCount, new CloseableTabComponent("DocGen",tabbedPane));
        		}
        		
        	}
        });
        menuItem.setMnemonic('W');
        menu.add(menuItem);
        add(menu);
    }
    
    protected boolean isSupportedLookAndFeel(String laf) {
        try {
            Class lnfClass = Class.forName(laf);
            if (lnfClass != null) {
                LookAndFeel newLAF = (LookAndFeel)(lnfClass.newInstance());
                if (newLAF != null) {
                    return newLAF.isSupportedLookAndFeel();
                }
            }
        }
        catch(Throwable t) {
        }
        return false;
    }
    
    public void updateLookAndFeel() {
    }
    
}
