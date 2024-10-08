package edu.wit.cs.comp1000;
import java.util.Scanner;

/**
 * Solutions to pa2a assigment.
 * When it runs it gets output of 5 numbers and get sum or averages of both positive and negative
 * @author Ilgert Shehaj
 */
public class PA2a {
	
	/**
	 * Starts the program, asks for output
	 * @param args command-line arguments, ignored
	 */

    public static void main(String[] args) {
    	//initialized variables 
        int sumPos = 0; 
        int sumNeg = 0;
        int countPos = 0;
        int countNeg = 0;
        int totalSum = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter five whole numbers: ");
        //for loop to get 5 numbers and add to totalSum
        for (int i = 0; i < 5; i++) {
            int userInput = input.nextInt();
            totalSum += userInput;
            //both if statements increase the count
            if (userInput > 0) {
                sumPos += userInput;
                countPos++;
            } else {
                sumNeg += userInput;
                countNeg++;
            }
        }
        //check averages for 0 to avoid integer division
        double posAverage = 0.0;
        if (countPos > 0) {
            posAverage = (double) sumPos / countPos;
        }

        double negAverage = 0.0;
        if (countNeg > 0) {
            negAverage = (double) sumNeg / countNeg;
        }

        double averageAll = (double) totalSum / 5;

        // Output results
        //if the count of pos is 1 then output should be one number instead of numbers 
        if (countPos == 1) {
            System.out.printf("The sum of the %d positive number: %d\n", countPos, sumPos);
        } else {
            System.out.printf("The sum of the %d positive numbers: %d\n", countPos, sumPos);
        }
        //if the count of neg is 1 then output should be one number instead of numbers
        if (countNeg == 1) {
            System.out.printf("The sum of the %d non-positive number: %d\n", countNeg, sumNeg);
        } else {
            System.out.printf("The sum of the %d non-positive numbers: %d\n", countNeg, sumNeg);
        }

        System.out.printf("The sum of the 5 numbers: %d\n", totalSum);

        // Averages
        //same procedure from the counts 
        if (countPos == 1) {
            System.out.printf("The average of the %d positive number: %.2f\n", countPos, posAverage);
        } else {
            System.out.printf("The average of the %d positive numbers: %.2f\n", countPos, posAverage);
        }

        if (countNeg == 1) {
            System.out.printf("The average of the %d non-positive number: %.2f\n", countNeg, negAverage);
        } else {
            System.out.printf("The average of the %d non-positive numbers: %.2f\n", countNeg, negAverage);
        }

        System.out.printf("The average of the 5 numbers: %.2f\n", averageAll);
        input.close();
    }
}
