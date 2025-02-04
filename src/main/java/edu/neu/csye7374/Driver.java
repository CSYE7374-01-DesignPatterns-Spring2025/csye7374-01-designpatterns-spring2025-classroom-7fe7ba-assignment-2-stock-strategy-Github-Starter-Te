package edu.neu.csye7374;

/**
 * 
 * @author Eashan Roy
 * 
 */

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");

         //Add your code in between these two print statements
		//Demo shows factory usage
		Demo demo = new Demo();
		demo.startDemo();

		//CalculateMetrics shows Strategy Usage
		CalculateMetrics.getInstance().calculateMetrics();
		 
		System.out.println("\n\n============Main Execution End===================");
	}

}
