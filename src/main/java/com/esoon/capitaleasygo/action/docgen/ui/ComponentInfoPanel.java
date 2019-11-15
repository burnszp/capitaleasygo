/*
 * Copyright 2005 MH-Software-Entwicklung. All rights reserved.
 * Use is subject to license terms.
 */

package com.esoon.capitaleasygo.action.docgen.ui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

import com.esoon.capitaleasygo.util.GridBagHelper;
import com.esoon.capitaleasygo.util.JTBorderFactory;

/**
 *
 * @author Michael Hagen
 */
public class ComponentInfoPanel extends JPanel {
	private JPanel widgetPanel = null;
	private JScrollPane tablePanel = null;
	private JSplitPane splitPane = null;

	private JComboBox addressCombo = null;
	private JTextField firstNameField = null;
	private JTextField lastNameField = null;
	private JTextField streetField = null;
	private JTextField cityField = null;
	private ButtonGroup buttonGroup = null;
	private JRadioButton redButton = null;
	private JRadioButton greenButton = null;
	private JRadioButton blueButton = null;
	private JCheckBox bananaButton = null;
	private JCheckBox burgerButton = null;
	private JCheckBox icecreamButton = null;

	private JButton updateButton = null;
	private JButton insertButton = null;
	private JButton deleteButton = null;
	private JTable table = null;

	private List colNames = new ArrayList();
	private List<List<Object>> dataList = new ArrayList<List<Object>>();
	private Object[][] dataArr = null;
	private Object[] headArr = null;

	public ComponentInfoPanel(List<Object> colNames, List<List<Object>> dataList) {
		super(new BorderLayout());
		setName("componentInfoForm");
		this.colNames = colNames;
		this.dataList = dataList;
		initControls();
	}

	private void initControls() {
		widgetPanel = createWidgetPanel();
		dataArr = new Object[dataList.size()][colNames.size()];
		for (int i = 0; i < dataList.size(); i++) {
			for (int j = 0; j < dataList.get(i).size(); j++) {
				dataArr[i][j] = dataList.get(i).get(j);
			}

		}
		headArr = colNames.toArray();
//        widgetPanel = createWidgetPanel();
		tablePanel = createTablePanel();
        splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, true, widgetPanel, tablePanel);
        splitPane.setDividerLocation(320);
		add(splitPane, BorderLayout.CENTER);

//        deleteButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent ev) {
////                TableColumn aColumn = table.getTableHeader().getColumnModel().getColumn(0); 
////                TableCellRenderer renderer = aColumn.getHeaderRenderer(); 
////                System.out.println("renderer: " + renderer);
////                System.out.println("defaultRenderer: " + table.getTableHeader().getDefaultRenderer());
//            }
//        });

	}

	private JPanel createWidgetPanel() {
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(createFormPanel(), BorderLayout.CENTER);
		panel.add(createButtonPanel(), BorderLayout.EAST);
		return panel;
	}

	private JScrollPane createFormPanel() {
		addressCombo = new JComboBox(new String[] { "Mr.", "Mrs.", "Sir", "Lady", "Herr", "Frau" });
		firstNameField = new JTextField();
		lastNameField = new JTextField();
		streetField = new JTextField();
		cityField = new JTextField();

		JPanel radioPanel = new JPanel(new BorderLayout());
		radioPanel.setBorder(JTBorderFactory.createTitleBorder("favorite color"));
		redButton = new JRadioButton("red");
		greenButton = new JRadioButton("green");
		blueButton = new JRadioButton("blue");
		radioPanel.add(redButton, BorderLayout.NORTH);
		radioPanel.add(greenButton, BorderLayout.CENTER);
		radioPanel.add(blueButton, BorderLayout.SOUTH);
		buttonGroup = new ButtonGroup();
		buttonGroup.add(redButton);
		buttonGroup.add(greenButton);
		buttonGroup.add(blueButton);
		redButton.setSelected(true);

		JPanel checkPanel = new JPanel(new BorderLayout());
		checkPanel.setBorder(JTBorderFactory.createTitleBorder("favorite food"));
		bananaButton = new JCheckBox("bananas");
		burgerButton = new JCheckBox("hamburgers");
		icecreamButton = new JCheckBox("icecream");
		checkPanel.add(bananaButton, BorderLayout.NORTH);
		checkPanel.add(burgerButton, BorderLayout.CENTER);
		checkPanel.add(icecreamButton, BorderLayout.SOUTH);

		JPanel panel = new JPanel(new GridBagLayout());
		// panel.setOpaque(false);
		JPanel topDistPanel = new JPanel();
		JPanel bottomDistPanel = new JPanel();
		GridBagHelper.addComponent(panel, topDistPanel, 0, 0, 1, 1, 0, 0, 0.0, 0.0, GridBagConstraints.NONE,
				GridBagConstraints.NORTHWEST);

		GridBagHelper.addComponent(panel, new JLabel("Group Name"), 0, 1, 1, 1, 0, 0, 0.0, 0.0, GridBagConstraints.NONE,
				GridBagConstraints.WEST);
		GridBagHelper.addComponent(panel, addressCombo, 1, 1, 1, 1, 0, 0, 0.3, 0.0, GridBagConstraints.HORIZONTAL,
				GridBagConstraints.NORTHWEST);
		GridBagHelper.addComponent(panel, new JPanel(), 2, 1, 1, 1, 0, 0, 0.7, 0.0, GridBagConstraints.HORIZONTAL,
				GridBagConstraints.WEST);

		GridBagHelper.addComponent(panel, new JLabel("Firstname"), 0, 2, 1, 1, 0, 0, 0.0, 0.0, GridBagConstraints.NONE,
				GridBagConstraints.WEST);
		GridBagHelper.addComponent(panel, firstNameField, 1, 2, 3, 1, 0, 0, 1.0, 0.0, GridBagConstraints.HORIZONTAL,
				GridBagConstraints.WEST);
		GridBagHelper.addComponent(panel, new JLabel("Lastname"), 0, 3, 1, 1, 0, 0, 0.0, 0.0, GridBagConstraints.NONE,
				GridBagConstraints.WEST);
		GridBagHelper.addComponent(panel, lastNameField, 1, 3, 3, 1, 0, 0, 1.0, 0.0, GridBagConstraints.HORIZONTAL,
				GridBagConstraints.WEST);
		GridBagHelper.addComponent(panel, new JLabel("Street"), 0, 4, 1, 1, 0, 0, 0.0, 0.0, GridBagConstraints.NONE,
				GridBagConstraints.WEST);
		GridBagHelper.addComponent(panel, streetField, 1, 4, 3, 1, 0, 0, 1.0, 0.0, GridBagConstraints.HORIZONTAL,
				GridBagConstraints.WEST);
		GridBagHelper.addComponent(panel, new JLabel("City"), 0, 5, 1, 1, 0, 0, 0.0, 0.0, GridBagConstraints.NONE,
				GridBagConstraints.WEST);
		GridBagHelper.addComponent(panel, cityField, 1, 5, 3, 1, 0, 0, 1.0, 0.0, GridBagConstraints.HORIZONTAL,
				GridBagConstraints.WEST);

		GridBagHelper.addComponent(panel, radioPanel, 0, 6, 2, 1, 0, 0, 0.0, 0.0, GridBagConstraints.BOTH,
				GridBagConstraints.WEST);
		GridBagHelper.addComponent(panel, checkPanel, 2, 6, 1, 1, 0, 0, 0.0, 0.0, GridBagConstraints.BOTH,
				GridBagConstraints.WEST);

		GridBagHelper.addComponent(panel, bottomDistPanel, 0, 10, 1, 1, 0, 0, 0.0, 1.0, GridBagConstraints.VERTICAL,
				GridBagConstraints.NORTHWEST);

		JScrollPane scrollPane = new JScrollPane(panel);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		return scrollPane;
	}

//
	private JScrollPane createButtonPanel() {
		JPanel panel = new JPanel(new GridBagLayout());
		updateButton = new JButton("update");
		updateButton.setDefaultCapable(true);
		insertButton = new JButton("insert");
		deleteButton = new JButton("delete");

		GridBagHelper.setMinRowHeight(panel, 0, 8);
		GridBagHelper.setMinColWidth(panel, 0, 100);
		GridBagHelper.addComponent(panel, updateButton, 0, 1, 1, 1, 0, 0, 1.0, 0.0, GridBagConstraints.HORIZONTAL,
				GridBagConstraints.NORTHWEST);
		GridBagHelper.addComponent(panel, insertButton, 0, 2, 1, 1, 0, 0, 1.0, 0.0, GridBagConstraints.HORIZONTAL,
				GridBagConstraints.NORTHWEST);
		GridBagHelper.addComponent(panel, deleteButton, 0, 3, 1, 1, 0, 0, 1.0, 0.0, GridBagConstraints.HORIZONTAL,
				GridBagConstraints.NORTHWEST);
		GridBagHelper.addComponent(panel, new JPanel(), 0, 4, 1, 1, 0, 0, 0.0, 1.0, GridBagConstraints.VERTICAL,
				GridBagConstraints.NORTHWEST);

		JScrollPane scrollPane = new JScrollPane(panel);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());

		return scrollPane;
	}

	private JScrollPane createTablePanel() {
		DefaultTableModel model = new DefaultTableModel(dataArr, headArr);
		table = new JTable(model);
//        TableColumn tableCol = table.getColumnModel().getColumn(5);
//        tableCol.setCellRenderer(new CheckBoxRenderer());
//        tableCol.setPreferredWidth(30);
		table.setRowSorter(new TableRowSorter(model));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//		initColumnSizes(table, model, dataArr);
		FitTableColumns(table);
		return new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	}

	private void initColumnSizes(JTable table, DefaultTableModel model, Object[][] tableData) {
		TableColumn column = null;
		int headerWidth = 0;
		int cellWidth = 0;

		// resize the first columan size to feet
		for (int i = 0; i < 1; i++) {
			column = table.getColumnModel().getColumn(i);
			String colName = model.getColumnName(i);
			JTextField t = new JTextField(colName);
			headerWidth = new Double((t.getPreferredSize().getWidth())).intValue();
			for (int j = 0; j < tableData.length; j++) {
				t = new JTextField(tableData[j][i].toString());
				cellWidth = Math.max(cellWidth, t.getPreferredSize().width);
			}
			column.setPreferredWidth(Math.max(headerWidth, cellWidth));
		}
	}

	public void FitTableColumns(JTable myTable) { // 設置table的列寬隨內容調整

		JTableHeader header = myTable.getTableHeader();

		int rowCount = myTable.getRowCount();

		Enumeration columns = myTable.getColumnModel().getColumns();

		while (columns.hasMoreElements()) {

			TableColumn column = (TableColumn) columns.nextElement();

			int col = header.getColumnModel().getColumnIndex(

					column.getIdentifier());

			int width = (int) myTable.getTableHeader().getDefaultRenderer()

					.getTableCellRendererComponent(myTable,

							column.getIdentifier(), false, false, -1, col)

					.getPreferredSize().getWidth();

			for (int row = 0; row < rowCount; row++) {

				int preferedWidth = (int) myTable.getCellRenderer(row, col)

						.getTableCellRendererComponent(myTable,

								myTable.getValueAt(row, col), false, false,

								row, col)
						.getPreferredSize().getWidth();

				width = Math.max(width, preferedWidth);

			}

			header.setResizingColumn(column);

			column.setWidth(width + myTable.getIntercellSpacing().width);

		}

	}

	public void setVisible(boolean aFlag) {
		super.setVisible(aFlag);
		if ((aFlag == true) && (getRootPane() != null)) {
			getRootPane().setDefaultButton(updateButton);
		}
	}

//	private class MyTableModel extends AbstractTableModel {
//		public int getColumnCount() {
//			return colNames.size();
//		}
//
//		public String getColumnName(int index) {
//			return (String) colNames.get(index);
//		}
//
//		public int getRowCount() {
//			return dataList.size();
//		}
//
//		
//		    /* (非 Javadoc)
//		     * 
//		     * 
//		     * @param rowIndex
//		     * @param columnIndex
//		     * @return
//		     * @see javax.swing.table.TableModel#getValueAt(int, int)
//		     */
//		    
//		@Override
//		public Object getValueAt(int rowIndex, int columnIndex) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
////		public Object getValueAt(int rowIndex, int colIndex) {
////			if (rowIndex < dataList.size()) {
////				ArrayList rowData = (ArrayList) dataList.get(rowIndex);
////				if (colIndex < rowData.size()) {
////					return rowData.get(colIndex);
////				}
////			}
////			return "ERROR";
////		}
//	}

//------------------------------------------------------------------------------    
//	class CheckBoxRenderer extends DefaultTableCellRenderer {
//
//		public Component getTableCellRendererComponent(JTable jTable, Object obj, boolean isSelected, boolean hasFocus,
//				int row, int col) {
//			JCheckBox checkBox = new JCheckBox("");
//			checkBox.setOpaque(true);
//			checkBox.setForeground(jTable.getForeground());
//			checkBox.setBackground(jTable.getBackground());
//			checkBox.setHorizontalAlignment(JCheckBox.CENTER);
//			if (isSelected) {
//				checkBox.setForeground(jTable.getSelectionForeground());
//				Color bc = new Color(jTable.getSelectionBackground().getRGB());
//				checkBox.setBackground(bc);
//			}
//			if (obj instanceof Boolean) {
//				checkBox.setSelected(((Boolean) obj).booleanValue());
//			}
//			return checkBox;
//		}
//	}
}
