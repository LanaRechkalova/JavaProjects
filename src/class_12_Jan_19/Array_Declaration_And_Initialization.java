package class_12_Jan_19;

import java.util.Scanner;

public class Array_Declaration_And_Initialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int numbers[] = new int [5]; // declaration of array and initi=n with blank valiue
			
			
			Scanner sc = new Scanner(System.in);
			// get data from excel and store inside the array
			
			numbers[0] = sc.nextInt();
			numbers[1] = sc.nextInt();
			numbers[2] = sc.nextInt();
			numbers[3] = sc.nextInt();
			numbers[4] = sc.nextInt();
			
			for (int i = 0; i <numbers.length; i++) {
			System.out.println(numbers[i]);
	}
	}
}
