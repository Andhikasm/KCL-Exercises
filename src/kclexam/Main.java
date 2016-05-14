package kclexam;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Main {

	public static void printResult(int i, int j, Operation o){
		System.out.println(o.cal(i, j));
	}
	
	public static void print1(int[] i){
		i[0] = i[0]+3;
		System.out.println(i[0]);
	}
	
	public static void print2(int i){
		i = i + 5;
		System.out.println(i);
	}
	
	public static interface Action{
		public String perform(String s);
	}
	private static void debug(Action a){
		System.out.println(a.perform("Test"));
	}
	
	public static void main(String[] args) {
	}

}
