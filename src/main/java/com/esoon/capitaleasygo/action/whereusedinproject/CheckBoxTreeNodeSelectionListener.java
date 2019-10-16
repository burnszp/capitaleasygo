package com.esoon.capitaleasygo.action.whereusedinproject;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTree;
import javax.swing.tree.TreePath;
import javax.swing.tree.DefaultTreeModel;

public class CheckBoxTreeNodeSelectionListener extends MouseAdapter {
	@Override
	public void mouseClicked(MouseEvent e) {
		if (MouseEvent.BUTTON1 == e.getButton()) {
			JTree tree = (JTree) e.getSource();
			int x = e.getX();
			int y = e.getY();
			int row = tree.getRowForLocation(x, y);
			TreePath path = tree.getPathForRow(row);
			if (path != null) {
				CheckBoxTreeNode node = (CheckBoxTreeNode) path
						.getLastPathComponent();
				if (node != null) {
					boolean isSelected = !node.isSelected();
					node.setSelected(isSelected);
					((DefaultTreeModel) tree.getModel())
							.nodeStructureChanged(node);
				}
			}
		}
	}
}