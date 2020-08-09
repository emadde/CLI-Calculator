package part1;

import java.util.Scanner;

public class operations {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the CLI Calculator");
		System.out.println("1. Addition" + '\n' + "2. Subtraction" + '\n' + 
				"3. Multiplication" + '\n' + "4. Division");
		System.out.println("Choose your operation: ");
		
		
		
		
		Scanner input = new Scanner(System.in);
		int operation = input.nextInt();
		
		System.out.println("First Number : ");	
		double a = input.nextDouble();
		
		System.out.println("Second Number : ");
		double b = input.nextDouble();
		
		
		double result = 0;
		
		switch(operation) {
		case 1:
			result = a + b;
			System.out.println("Result of " + a + " + " + b + " = " + result);
			break;
		case 2:
			result = a - b;
			System.out.println("Result of " + a + " - " + b + " = " + result);
			break;
		case 3:
			result = a * b;
			System.out.println("Result of " + a + " * " + b + " = " + result);
			break;
		case 4:
			if(b <= 0) System.out.println("Error");
			else {
				result = a / b;
			System.out.println("Result of " + a + " / " + b + " = " + result);
			}
			break;
			
			
		
		}
			
		
		
		
		
		
		
		
	}
}