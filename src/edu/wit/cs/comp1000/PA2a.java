package edu.wit.cs.comp1000;

import java.util.Scanner;

public class PA2a {


    public static void main(String[] args) {
   
        int sumPos = 0; 
        int sumNeg = 0;
        int countPos = 0;
        int countNeg = 0;
        int totalSum = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter five whole numbers: ");

        for (int i = 0; i < 5; i++) {
            int userInput = input.nextInt();
            totalSum += userInput;
            if (userInput > 0) {
                sumPos += userInput;
                countPos++;
            } else {
                sumNeg += userInput;
                countNeg++;
            }
        }

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
        if (countPos == 1) {
            System.out.printf("The sum of the %d positive number: %d\n", countPos, sumPos);
        } else {
            System.out.printf("The sum of the %d positive numbers: %d\n", countPos, sumPos);
        }

        if (countNeg == 1) {
            System.out.printf("The sum of the %d non-positive number: %d\n", countNeg, sumNeg);
        } else {
            System.out.printf("The sum of the %d non-positive numbers: %d\n", countNeg, sumNeg);
        }

        System.out.printf("The sum of the 5 numbers: %d\n", totalSum);

        // Averages
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
