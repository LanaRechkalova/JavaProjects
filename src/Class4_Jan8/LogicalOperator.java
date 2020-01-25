package Class4_Jan8;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 60, weight = 50;

//write a program to get input of age and weight from user
//if age is  <50, weight<50 - > you are fit
//else-> you have to run daily

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your age");

		age = sc.nextInt();

		if (age <= 50) {
			System.out.println("Please enter your weight");
			weight = sc.nextInt();
			if (weight <= 50) {

				System.out.println("You are fit");

			} else {
				System.out.println("You have to run daily");
			}}	}}