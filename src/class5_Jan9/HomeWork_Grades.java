package class5_Jan9;

import java.util.Scanner;

public class HomeWork_Grades {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char grade;
			System.out.println("What is your grade?");
		grade = sc.next().charAt(0);
		
		switch (grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'E':
			System.out.println("Bad");
			break;
		default:
			System.out.println("Use on;y A, B, C or E for your answer.");
		}
	}
}
