package class5_Jan9;

import java.util.Scanner;

public class home_workChange_Teller_game {

	public static void main(String[] args) {
		Scanner coin = new Scanner(System.in);
		double pennies= 0.01, nickels = 0.05, dimes =0.10, quaters = 0.25, answer, over, below;
		System.out.println("How many pennies?");
		pennies = coin.nextDouble();
System.out.println("How many nickels?");
nickels = coin.nextDouble();
System.out.println("How many dimes?");
dimes = coin.nextDouble();
System.out.println("How many quaters?");
quaters = coin.nextDouble();
answer = 0.01 * pennies + 0.05 * nickels + 0.1 * dimes + 0.25 * quaters;
System.out.println("your result is " + answer);
if (answer == 1) {
	System.out.println("You got exactly $1.00. You won!");
}else if (answer > 1) {
	over = answer - 1;
		System.out.println("Your result is more than $1.00 by " +over + ". You lost.");
	}else if (answer < 1) {
	below = 1- answer;
		System.out.println("Your result is less than $1.00 by " +below + ". You lost.");
	}
}}