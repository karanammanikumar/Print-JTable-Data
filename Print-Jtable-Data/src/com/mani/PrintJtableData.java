package com.mani;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.MessageFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PrintJtableData {
	public static void main(String[] args) {
		JButton btnPring = new JButton("Print");
		btnPring.setIcon(new ImageIcon(PrintJtableData.class.getResource("/com/mani/images/1474462771_Print.png")));
		btnPring.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MessageFormat header = new MessageFormat("Employee Details");
				MessageFormat footer = new MessageFormat("Page{0,number,integer}");
				try
				{
					JTable table = null;
					table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});

	}

}
