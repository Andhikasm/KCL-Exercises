package kclexam;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListDataListener;

public class May2013 extends JFrame{
	
	public May2013(){
		super("Tweet Galore");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		JPanel jpNorth = new JPanel(new GridLayout(3, 1));
		JPanel jpName = new JPanel();
		JLabel name = new JLabel("Twitter name");
		JTextField nameField = new JTextField("@szschaler");
		
		JPanel jpFilter = new JPanel();
		JLabel filter = new JLabel("Filter");
		JRadioButton all = new JRadioButton("All");
		JRadioButton mine = new JRadioButton("Mine");
		JRadioButton selected = new JRadioButton("Selected");
		JComboBox select = new JComboBox();
		ButtonGroup bg = new ButtonGroup();
		bg.add(all); bg.add(mine); bg.add(selected);
		all.setSelected(true);
		
		JPanel jpText = new JPanel(new BorderLayout());
		JTextArea text = new JTextArea("");
		JButton tweet = new JButton("Tweet");
		jpText.add(text, BorderLayout.CENTER); jpText.add(tweet, BorderLayout.EAST);
		
		jpFilter.add(filter);
		jpFilter.add(all);
		jpFilter.add(mine);
		jpFilter.add(selected);
		jpFilter.add(select);
		
		jpName.add(name);
		jpName.add(nameField);
		
		jpNorth.add(jpName);
		jpNorth.add(jpFilter);
		jpNorth.add(jpText);
		add(jpNorth, BorderLayout.NORTH);

		DefaultListModel model = new DefaultListModel();
		JList list = new JList(model);
		tweet.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String newMessage = nameField.getText()+":" + text.getText();
				model.addElement(newMessage);
				
			}
		});
		JScrollPane scroll = new JScrollPane(list, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(scroll, BorderLayout.CENTER);
		pack();
		
	}

	public static void main(String[] args) {
		new May2013().setVisible(true);
	}

}
