package edu.wit.cs.comp1000;
import java.util.Scanner;

// TODO: document this class
public class PA2b {

	public static void main(String[] args) {
		double a; 
		double b;
		double c;
		int expo = 2;
		double[] arr = new double[3];
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a b c: ");
		for(int i=0; i<arr.length;i++) {
			double num = input.nextDouble();
			arr[i] = num;
		}
		
		
		a = arr[0];
		b = arr[1];
		c = arr[2];
		
		
		
		
		double discriminant =  Math.pow(b,expo) - (4*a*c);
		
		if(discriminant < 0) {
			System.out.printf("Roots: imaginary\n");
		}else if(discriminant == 0) {
			double root = -b/(2*a);
			System.out.printf("Root: %.2f\n", root);
		}else {
			double quadraticFormulaPos = (-b + Math.sqrt(discriminant)) / (2*a);
			double quadraticFormulaNeg = (-b - Math.sqrt(discriminant)) / (2*a);
			
			System.out.printf("Roots: %.2f, %.2f\n", quadraticFormulaNeg , quadraticFormulaPos);
			
		}
	
		input.close();
	}

}
