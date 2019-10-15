
    /**  
     * @Title: TestScroll.java
     * @Package com.esoon.capitaleasygo
     * @Description: TODO(用一句话描述该文件做什么)
     * @author 35725
     * @date 2019年10月15日 下午4:08:56 
     * @version V1.0  
     */
    
package com.esoon.capitaleasygo;


    /**
     * @ClassName: TestScroll
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author 35725
     * @date 2019年10月15日
     *
     */




import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
*
* @author Administrator
*/
public class TestScroll extends JFrame {

   private JButton[] buttons = new JButton[100];
   private JScrollPane js = new JScrollPane();

   public TestScroll() {
       init();
   }

   private void init() {
       setTitle("swing模仿web锚点效果");
       setSize(300, 300);
       setLocationRelativeTo(this);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new BorderLayout());
       JSplitPane jSplitPane = new JSplitPane();
       jSplitPane.setDividerLocation(140);
       jSplitPane.setLeftComponent(getTree());
       jSplitPane.setRightComponent(getPanel());
       this.add(jSplitPane);
   }

   private JScrollPane getPanel() {
       JPanel jpanel = new JPanel();
       jpanel.setLayout(new BoxLayout(jpanel, BoxLayout.Y_AXIS));
       for (int i = 0; i < 100; i++) {
           JButton button = new JButton("button" + i);
           jpanel.add(button);
           buttons[i] = button;
       }
       js.setViewportView(jpanel);
       return js;
   }

   private JScrollPane getTree() {
       JScrollPane scroll = new JScrollPane();
       final JTree tree = new JTree();
       DefaultMutableTreeNode node = new DefaultMutableTreeNode("序号");
       for (int i = 0; i < 100; i++) {
           node.add(new DefaultMutableTreeNode(i));
       }
       DefaultTreeModel tmode = new DefaultTreeModel(node);
       tree.setModel(tmode);
       tree.addTreeSelectionListener(new TreeSelectionListener() {

           public void valueChanged(TreeSelectionEvent e) {
               //关键代码
               String path = tree.getLastSelectedPathComponent().toString();
               int y = 0;
               try {
                   y = Integer.parseInt(path);
               } catch (NumberFormatException n) {
                   //do Nothing
               }
               JScrollBar bar = js.getVerticalScrollBar();
               bar.setValue(buttons[y].getY());
           }
       });
       scroll.setViewportView(tree);
       return scroll;
   }

   public static void main(String[] args) {
       TestScroll t = new TestScroll();
       t.setVisible(true);
   }
}
