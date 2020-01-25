package class5_Jan9;

import java.util.Scanner;

public class HomeWork_Work_Qualifier {

	public static void main(String[] args) {
		int age, num1 = 18, num2 = 60;
		System.out.println("Please enter your age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		if (age >= num1 && age <= num2) {
			System.out.println("You are eligible to apply for a job.");
		} else {
			System.out.println("You don't qualify for this job based on the age.");
		}
	}
}
