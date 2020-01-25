package Class3Jan7;
import java.util.Scanner;

public class LadderIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to get input from user and perform operation based on user input
		
		int num1 = 10, num2 = 20;
		
				
		System.out.println("Please enter operation to perform");
		System.out.print(" 1 for add");
		System.out.print(" 2 for sub");
		System.out.print(" 3 for mul");
		System.out.print(" 4 for div");
		
		Scanner sc = new Scanner(System.in);
		
		int userInput = sc.nextInt();
		
		if(userInput == 1) {
		System.out.println(num1 + num2);
		
		}else if (userInput == 2) {
			System.out.println(num1 - num2);
			
		}else if (userInput == 3) {
			System.out.println(num1 * num2);
			
		}else if (userInput == 4) {
			System.out.println(num1 / num2);
		
		}else {
			System.out.print("Please choose another option");
		}
	}

}
