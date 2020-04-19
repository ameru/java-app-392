package ruHW1;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		System.out.println("This program will calculate your Body Mass Index.");
		
		System.out.println("Please enter your weight in pounds:");
		Scanner userInput = new Scanner(System.in);
		double weight = userInput.nextDouble();
		
		System.out.println("Please enter your height in inches:");
		double height = userInput.nextDouble();
		
		double BMI = (weight / (height * height)) * 703;
		
		System.out.println("Your BMI is " + BMI + ", but these aren't accurate anyway so don't worry.");

	}

}
