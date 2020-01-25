package class5_Jan9;

import java.util.Scanner;

public class simpleCalculator {

	public static void main(String[] args) {
		
		System.out.println("Enter your num1 and operator (+,-,*,/) and num2");
		double num1, num2, result=0;
		char operator;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextDouble();
		operator = sc.next().charAt(0);
		num2 = sc.nextDouble();
		
		switch (operator) {
		
			case '+':
				result = num1 + num2;
				System.out.print("result: " + result);
				break;
			case '-':
				result = num1 - num2;
				System.out.print("result: " + result);
				break;
			case '*':
				result = num1 * num2;
				System.out.print("result: " + result);
				break;
			case '/':
				if (num2 == 0)
				{System.out.print("Division by 0!");}
				else {result = num1 / num2;}
				System.out.print("result: " + result);
				break;
			default:
				System.out.println("Unknown operator");
		}}}