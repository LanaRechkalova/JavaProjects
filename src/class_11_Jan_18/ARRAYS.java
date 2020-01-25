package class_11_Jan_18;

import java.util.Scanner;

public class ARRAYS {

	public static void main(String[] args) {
		
		// arrays are used to store data of ONLY SAME TYPE
		int studentMarks[]; // Declaration of array
		int choice;

		studentMarks = new int[10]; // initialization of array
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter a number at postion " + i + " -");
			studentMarks[i] = sc.nextInt();
		}

		do {

			System.out.println("Enter roll number - ");
			int rollNumber = sc.nextInt();

			System.out.println(studentMarks[rollNumber - 1]);

			System.out.println("do you want to continue ");
			choice = sc.nextInt();
		} while (choice == 1);

	}
}