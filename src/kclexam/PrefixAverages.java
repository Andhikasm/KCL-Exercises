package kclexam;

import java.util.Arrays;

public class PrefixAverages {

	public static double[] prefixAverages1(double[] array, int prefix){
		double[] outArray = new double[prefix];
		
		for(int i = 0; i < prefix; i++){
			double s = array[0];
			
			for(int j = 0; j < prefix; j++){
				s = s + array[j];
				System.out.println(s);
			}
			
			array[i] = s / (i + 1);
			System.out.println(array[i]);
			
		}
		
		return outArray;
	}
	
	
	public static void main(String[] args) {
	
	}

}
