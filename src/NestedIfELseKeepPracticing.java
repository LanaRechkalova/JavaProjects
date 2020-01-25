import java.util.Scanner;

public class NestedIfELseKeepPracticing {

	public static void main(String[] args) {

		
int people = 10, month = 5;

System.out.println("How many people will travel?");
Scanner sc = new Scanner(System.in);
int userInput = sc.nextInt();

if (userInput >=8 && userInput < 11) {
	System.out.println("You are going to Sarasota!");
	}else {
		System.out.println("You are going to Daytona Beach!");
		System.out.println("What month do you want to travel?");
		
		int userInput2 = sc.nextInt();
		if(month != 5) {
		System.out.println("You are staying home, cause you don't know what you want");
		}else {
			System.out.println("Right! You are traveling to Daytona Beach in May!");
	
	}	}
}}