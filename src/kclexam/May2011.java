package kclexam;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class May2011 extends JFrame{
	
	public May2011(){
		super("MayExams 2010/2011");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 450);
		setLayout(new BorderLayout());
		JPanel jpNorth = new JPanel();
		JPanel jpSouth = new JPanel();
		JLabel jlChoice = new JLabel("Make a choice:");
		JComboBox jcbList = new JComboBox(new String[]{"World", "Hello", "This"});
		JButton jbAdd = new JButton("Add");
		
		
		JTextArea text = new JTextArea();
		JScrollPane scroll = new JScrollPane(text, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JButton jbOk = new JButton("OK");
		JButton jbCancel = new JButton("Cancel");
		
		jbAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String input = (String) jcbList.getSelectedItem();
				String textInput = text.getText();
				text.setText(textInput + "\n" + input);
				
			}
		});
		
		jpNorth.add(jlChoice); jpNorth.add(jcbList); jpNorth.add(jbAdd);
		add(scroll, BorderLayout.CENTER);
		jpSouth.add(jbOk); jpSouth.add(jbCancel);
		add(jpNorth, BorderLayout.NORTH);
		add(jpSouth, BorderLayout.SOUTH);
		pack();
	}
	 
	
	public static void main(String[] args){
		new May2011().setVisible(true);
	}

}
