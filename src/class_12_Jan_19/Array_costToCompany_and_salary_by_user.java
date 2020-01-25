package class_12_Jan_19;

import java.util.Scanner;

public class Array_costToCompany_and_salary_by_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary[] = new int [5]; 
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		// get data from excel and store inside the array
		
		salary[0] = sc.nextInt();
		salary[1] = sc.nextInt();
		salary[2] = sc.nextInt();
		salary[3] = sc.nextInt();
		salary[4] = sc.nextInt();
		
		for (int i = 0; i <salary.length; i++) {
			sum = sum + salary[i];
		}
		System.out.println("cost to company is " + sum);
}
}