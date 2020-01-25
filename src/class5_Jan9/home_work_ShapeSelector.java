package class5_Jan9;

import java.util.Scanner;

public class home_work_ShapeSelector {

	public static void main(String[] args) {
		int shape;
		System.out.println("enter a number");
	
		
		Scanner sc = new Scanner(System.in);
		shape = sc.nextInt();
		
		switch (shape) {
		
		case 1:
			System.out.println("You have chosen a square.");
		break;
		case 2:
			System.out.println("You have chosen a circle.");
		break;
		case 3:
			System.out.println("You have chosen a triangle.");
		break;
		case 4:
			System.out.println("You have chosen a rhombus.");
		break;
		
		default:
			System.out.println("There is no such shape!");

	}

}}