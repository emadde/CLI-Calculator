package CLI;

import java.util.Scanner;

public class updatedOperations {
	public static void main(String[] args) {
		
		System.out.println("Welcome to the CLI Calculator");
		System.out.println("a. Addition" + '\n' + "s. Subtraction" + '\n' + 
				"m. Multiplication" + '\n' + "d. Division" + '\n' + "e. Exit");
		System.out.println("Choose your operation: ");
		
		
		// Prompt user for opertion
		// store the operation in operation variable
		// check which operation user wants to perform
		// if operation is valid perform opertion
		// else exit
		
		
		Scanner input = new Scanner(System.in);
		char operation = input.next().charAt(0);
		
		while(operation != 'e') {
		
			System.out.println("First Number : ");	
			double a = input.nextDouble();
		
			System.out.println("Second Number : ");
			double b = input.nextDouble();
		
			double result = 0;
		
		
			if (operation == 'a') {
				result = a + b;
				System.out.println("Result of " + a + " + " + b + " = " + result);
			}
			else if (operation == 's') {
				result = a - b;
				System.out.println("Result of " + a + " - " + b + " = " + result);
			}
			else if (operation == 'm') {
				result = a * b;
				System.out.println("Result of " + a + " * " + b + " = " + result);
			}
			else if (operation == 'd') {
				if	(b == 0) {
					System.out.println("Cannot divide by 0");
				} else {
					result = a / b;
					System.out.println("Result of " + a + " / " + b + " = " + Math.round(result * 100d) / 100d);
				}
			}
			System.out.println("Choose your operation: ");
			operation = input.next().charAt(0);
		}
		
			System.out.println("Goodbye");
			System.exit(0);
			}
		}
