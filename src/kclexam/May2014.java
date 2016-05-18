package kclexam;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class May2014 extends JFrame{
	
	public May2014(){
		super("Train Information");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel jpNorth = new JPanel(new GridLayout(2, 2));
		JLabel jlFrom = new JLabel("From");
		JLabel jlTo = new JLabel("To");
		JTextField jtfFrom = new JTextField();
		JTextField jtfTo = new JTextField();
		jtfFrom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = jtfTo.getText();
				boolean b = stationExists(s);
				if(!b){
					new JOptionPane().showMessageDialog(jtfTo, "Please enter a correct station name");
				}
				
			}
		});
		jpNorth.add(jlFrom);
		jpNorth.add(jtfFrom);
		
		jpNorth.add(jlTo);
		jpNorth.add(jtfTo);
		
		DefaultListModel model = new DefaultListModel();
		model.addElement("Hello1");
		model.addElement("Hello2");
		model.addElement("Hello3");
		JList list = new JList(model);
		JScrollPane scroll = new JScrollPane(list, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(scroll, BorderLayout.CENTER);
		
		JPanel jpSouth = new JPanel(new BorderLayout());
		JPanel jpSouthEast = new JPanel();
		JButton jbOk = new JButton("OK");
		JButton jbCancel = new JButton("Cancel");
		jpSouthEast.add(jbOk);
		jpSouthEast.add(jbCancel);
		jpSouth.add(jpSouthEast, BorderLayout.EAST);
		
		add(jpNorth, BorderLayout.NORTH);
		add(jpSouth, BorderLayout.SOUTH);
		pack();
	}
	
	public static boolean stationExists(String stationName){
		return true;
	}

	public static void main(String[] args) {
		new May2014().setVisible(true);

	}

}
