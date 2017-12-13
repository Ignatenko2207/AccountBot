package org.itstep.view;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class AccUI extends JFrame{

	public AccUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Account manager");
		setLocation(200, 200);
		setSize(400, 400);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 374, 350);
		getContentPane().add(tabbedPane);
		
		JTabbedPane saveAccTab = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Save account", null, saveAccTab, null);
		
		JTabbedPane getAccTab = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Get account", null, getAccTab, null);
		
		JTabbedPane updateAccTab = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Update account", null, updateAccTab, null);
		
		JTabbedPane deleteAccTab = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Delete account", null, deleteAccTab, null);
		setVisible(true);
		
		
	}
}
