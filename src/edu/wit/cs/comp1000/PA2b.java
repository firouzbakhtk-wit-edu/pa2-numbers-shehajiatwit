package edu.wit.cs.comp1000;
import java.util.Scanner;

/**
 * Solutions to pa2b assigment
 * Solved a quadratic equation through quadratic formula
 * @author Ilgert Shehaj
 * 
 */
public class PA2b {
	/**
	 * Starts the program, asks for output
	 * 
	 * @param args command-line arguments, ignored
	 */

	public static void main(String[] args) {
		
		//double variables for a b and c
		double a; 
		double b;
		double c;
		int expo = 2;
		//array is used for the variables to be put in from input
		double[] arr = new double[3];
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a b c: ");
		for(int i=0; i<arr.length;i++) {
			double num = input.nextDouble();
			arr[i] = num;
		}
		
		//variables are initialized from the array
		a = arr[0];
		b = arr[1];
		c = arr[2];
		
		
		
		//discriminant formula
		double discriminant =  Math.pow(b,expo) - (4*a*c);
		//statements to check for roots
		if(discriminant < 0) {
			System.out.printf("Roots: imaginary\n");
		}else if(discriminant == 0) {
			double root = -b/(2*a);
			System.out.printf("Root: %.2f\n", root);
		}else {
			//quadratic formula both positive and negative
			double quadraticFormulaPos = (-b + Math.sqrt(discriminant)) / (2*a);
			double quadraticFormulaNeg = (-b - Math.sqrt(discriminant)) / (2*a);
			
			System.out.printf("Roots: %.2f, %.2f\n", quadraticFormulaNeg , quadraticFormulaPos);
			
		}
	
		input.close();
	}

}
