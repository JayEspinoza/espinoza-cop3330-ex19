/*
 *  UCF COP3330 Summer 2021 Assignment 19 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 19 - BMI Calculator
 *  Create a program to calculate the body mass index (BMI) for a person using the person’s height in inches and weight in pounds.
 *  The program should prompt the user for weight and height.
 *
 *  Constraint:
 *  Ensure your program takes only numeric data. Don’t let the user continue unless the data is valid.
 *
 */

package ex19;
import java.util.Scanner;

public class base {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String [] args)
    {
        // Initialization of Variables
        base myBase = new base();
        double height = myBase.height();
        double weight = myBase.weight();
        // Calculations and output
        myBase.finalOutput(height, weight);
    }

    // Function returns height
    public double height()
    {
        String height;
        boolean valid = true;

        System.out.printf("Enter your height in inches: ");
        // User Input Step
        height = userInput.nextLine();

        // For loop checks for validness
        for (char variable : height.toCharArray()) {
            if (!Character.isDigit(variable)){
                valid = false;
                break;
            }

        }

        // While loop continues until valid number is inputted
        while(!valid)
        {
            System.out.printf("Please enter a valid number: ");
            height = userInput.nextLine();

            // For loop checks for validness
            for (char variable : height.toCharArray()) {
                if (!Character.isDigit(variable)){
                    valid = false;
                    break;
                }

                valid = true;
            }
        }

        return Double.parseDouble(height);
    }

    // Function returns weight
    public double weight()
    {
        String weight;
        boolean valid = true;

        System.out.printf("Enter your weight in pounds: ");
        // User Input Step
        weight = userInput.nextLine();

        // For loop checks for validity
        for (char variable : weight.toCharArray()) {
            if (!Character.isDigit(variable)){
                valid = false;
                break;
            }
        }

        // While loop continues until valid number is inputted
        while(!valid)
        {
            System.out.printf("Please enter a valid number: ");
            weight = userInput.nextLine();

            // For loop checks for validity
            for (char variable : weight.toCharArray()) {
                if (!Character.isDigit(variable)){
                    valid = false;
                    break;
                }

                valid = true;
            }
        }

        return Double.parseDouble(weight);
    }

    // Function calculates and outputs BMI
    public void finalOutput(double height, double weight)
    {
        // Calculation of BMI
        double bmi = (weight / (height * height)) * 703;

        System.out.printf("Your BMI is %.1f%n", bmi);

        // If statements determine if healthy BMI
        if(bmi > 25)
        {
            System.out.printf("You are overweight. You should see your doctor.");
        }
        else if(bmi < 18.5)
        {
            System.out.printf("You are underweight. You should see your doctor.");
        }
        else{
            System.out.printf("You are within the ideal weight range.");
        }
    }
}
