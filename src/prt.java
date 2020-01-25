	import java.util.Scanner;
	public class prt {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	System.out.println("1.How many people will travel?");
	
	int userInput = sc.nextInt();

	if (userInput >=8 && userInput < 11) {
		System.out.println("You are going to Sarasota!");
		}else {
			System.out.println("You are going to Daytona Beach!");
			System.out.println("2. What month do you want to travel?");
			
			int userInput2 = sc.nextInt();
			if(userInput2 == 7) {
				System.out.println("You are traveling to DB in July!");
			}else {
				System.out.println("You are staying home, cause you don't know what  you want");
		
		}	}
	}}
