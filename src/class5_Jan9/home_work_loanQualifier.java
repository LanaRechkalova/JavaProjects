package class5_Jan9;

import java.util.Scanner;

public class home_work_loanQualifier {

	public static void main(String[] args) {
		int salary = 40000, experience = 2;
		Scanner sc = new Scanner(System.in);

		System.out.println("What is your salary per annum?");

		salary = sc.nextInt();
		if (salary >= 40000){
			System.out.println("How long have you been working in the currect job place?");
		}else if (salary <40000) {
				System.out.println("You have to make more money to be eligible to borrow money from our bank.");
			}
		experience = sc.nextInt();
		if (salary >= 40000 && experience >= 2) {
			System.out.println("You are qualified for a loan. Submit your documents for review.");
		} else if (salary <40000 || experience < 2) {
			System.out.println("You are not qualified for a loan.");
		}}}