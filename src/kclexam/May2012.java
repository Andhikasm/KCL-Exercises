package kclexam;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class May2012 extends JFrame{
	public May2012(){
		super("May Exams 2011 2012");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 300);
		JPanel jpNorth = new JPanel(new FlowLayout());
		JPanel jpSouth = new JPanel(new BorderLayout());
		JPanel jpSouthEast = new JPanel();
		JTextField textField= new JTextField("sdd");
		JButton jbAdd = new JButton("Add");
		String[] sampleList = {"Hogwarts", "Gryffindor", "KCL"};
		JComboBox comboBox = new JComboBox(sampleList);
		
		jpNorth.add(new JLabel("Enter Postcode: "));
		jpNorth.add(textField);
		jpNorth.add(new JLabel("Select School"));
		jpNorth.add(comboBox);
		
		jpNorth.add(jbAdd);
		
		DefaultListModel model = new DefaultListModel();
		model.addElement("Hello");
		JList listModel = new JList();
		listModel.setModel(model);
		JScrollPane pane = new JScrollPane(listModel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(pane, BorderLayout.CENTER);
		
		jbAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String text = textField.getText();
				String selection = (String) comboBox.getSelectedItem();
				model.addElement("School for " + text + ": "+ selection);
			}
		});
		
		jpSouthEast.add(new JButton("Add"));
		jpSouthEast.add(new JButton("Cancel"));
		jpSouth.add(jpSouthEast, BorderLayout.EAST);
		add(jpNorth, BorderLayout.NORTH);
		add(jpSouth, BorderLayout.SOUTH);
		pack();
	}
	
	public static void main(String[] args) {
		new May2012().setVisible(true);
	}
}
