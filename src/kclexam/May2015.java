package kclexam;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class May2015 extends JFrame{
	
	public May2015(){
		super("Mixing Desk");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		addWidgets();
	}
	
	private void addWidgets(){
		setLayout(new BorderLayout());
		
		add(new JLabel("HELLO"), BorderLayout.NORTH);
		
		JPanel jpSlider = new JPanel(new GridLayout(1, 6));
		
		for(int i = 0; i < 6; i++){
			JPanel mixerPanel = new JPanel(new BorderLayout());
			JPanel mixerLabelPanel = new JPanel(new FlowLayout());
			JLabel mixerLabel = new JLabel("Mix");
			JTextField mixerText = new JTextField();
			mixerText.setEditable(false);
			
			mixerLabelPanel.add(mixerLabel);
			mixerPanel.add(createMixer(mixerText), BorderLayout.CENTER);
			mixerPanel.add(mixerLabelPanel, BorderLayout.NORTH);
			mixerPanel.add(mixerText, BorderLayout.SOUTH);
			jpSlider.add(mixerPanel);
		}
		
		add(jpSlider, BorderLayout.CENTER);

	}
	
	private JSlider createMixer(JTextField mixerText){
		
		JSlider mixer = new JSlider();
		mixer.addChangeListener(new ChangeListener() {
			
		//THIS IS THE SECOND PART OF THE QUESTION
			@Override
			public void stateChanged(ChangeEvent e) {
				
				mixerText.setText(Integer.toString(mixer.getValue()));
			}
		});
		
		mixer.setOrientation(SwingConstants.VERTICAL);
		mixer.setMajorTickSpacing(10);
		mixer.setMinimum(0);
		mixer.setMaximum(100);
		mixer.setPaintLabels(true);
		mixer.setPaintTicks(true);

		return mixer;
	}
	
	public static void main(String[] args){
		new May2015().setVisible(true);
	}
	
}