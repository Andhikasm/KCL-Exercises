package kclexam;

import java.awt.*;

import javax.swing.*;


public class Main extends JFrame{
	
	public Main(){
		setLayout(new BorderLayout());
		setSize(400, 400);
		//JPanel panel = new JPanel(new FlowLayout());
	
		//panel.add(new JButton("HELL0"));
		//add(panel);
		add(new JButton("WESSSSSST"), BorderLayout.CENTER);
		//add(new JButton("CENTEERRRRRRRRRRRRR"), BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private  static class Display{
		public void display(){
			System.out.println("Display!");
		}
	};
	
	public static class MyDisplay extends Display{
		public void display(){
			System.out.println("My Display!");
		}
	}
	
	public static void runTest(){
		System.out.println("Test Running...");
	}
	
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}

}
