package marco.assignment1.java;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) throws Exception {

		Double number1 = null;
		Double number2 = null;
		char operator = 0;

		// create an object of Scanner class
		Scanner input = new Scanner(System.in);

		// ask users to enter numbers
		do {
			try {
				System.out.println("Enter first number");
				number1 = input.nextDouble();
			} catch (Exception e) {
				System.out.println("Invalid first number \n");
				input.nextLine();
			}
			if (number1 != null) {
				break;
			}
		} while (true);

		// ask users to enter operator
		do {
			System.out.println("Choose an operator: +, -, *, or /");
			operator = input.next().charAt(0);
			if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
				break;
			} else
				System.out.println("Invalid operator \n");
		} while (true);

		// ask users to enter operator
		do {
			try {
				System.out.println("Enter second number");
				number2 = input.nextDouble();
			} catch (Exception e) {
				System.out.println("Invalid second number \n");
				input.nextLine();
			}
			if (number2 != null) {
				break;
			}
		} while (true);

		// create object from another class
		Summation sum = new Summation(number1, number2);
		Substraction substraction = new Substraction(number1, number2);
		Multiplication multiplication = new Multiplication(number1, number2);
		Division division = new Division(number1, number2);

		switch (operator) {

		// performs addition between numbers
		case '+':
			System.out.println(sum.result());
			break;

		// performs subtraction between numbers
		case '-':
			System.out.println(substraction.result());
			break;

		// performs multiplication between numbers
		case '*':
			System.out.println(multiplication.result());
			break;

		// performs division between numbers
		case '/':
			System.out.println(division.result());
			break;

		default:
			break;
		}

		input.close();
	}

}