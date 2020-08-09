package part2;

import java.util.Scanner;

public class updatedOperations {
	public static void main(String[] args) {
		
		System.out.println("Welcome to the CLI Calculator");
		System.out.println("a. Addition" + '\n' + "s. Subtraction" + '\n' + 
				"m. Multiplication" + '\n' + "d. Division" + '\n' + "e. Exit");
		System.out.println("Choose your operation: ");
		
		Scanner input = new Scanner(System.in);
		char operation = input.next().charAt(0);
		System.out.println("First Number : ");	
		double a = input.nextDouble();
		
		System.out.println("Second Number : ");
		double b = input.nextDouble();
		
		double result = 0;
//		while(operation == 'e') {
		switch(operation) {
		case 'a':
			result = a + b;
			System.out.println("Result of " + a + " + " + b + " = " + result);
			break;
		case 's':
			result = a - b;
			System.out.println("Result of " + a + " - " + b + " = " + result);
			break;
		case 'm':
			result = a * b;
			System.out.println("Result of " + a + " * " + b + " = " + result);
			break;
		case 'd':
			if(b == 0) System.out.println("Cannot divide by 0");
			else {
				result = a / b;
			System.out.println("Result of " + a + " / " + b + " = " + result);
			}
			break;
		case 'e':
			break;
			}
			System.out.println("Goodbye");
			
		}
		}
	
