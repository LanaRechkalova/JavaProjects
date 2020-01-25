package class5_Jan9;
	import java.util.Scanner;
public class KamilCode {
	public static void main (String args []) {
	System.out.print ("How many pennies?");
	Scanner scan = new Scanner(System.in);
	int pennies = scan.nextInt();
	System.out.print ("How many nickels?");
	int nickels = scan.nextInt();
	System.out.print ("How many dimes?");
	int dimes = scan.nextInt();
	System.out.print ("How many quarters?");
	int quarters = scan.nextInt();
	int result = pennies + (nickels*5) + (dimes*10) + (quarters*25);
	 if (result == 100) {System.out.println ("Hurray! It is $1! You win");}
     else { if (result>100) {System.out.println ("You went over " + (result -100) + " cents");}
     else { System.out.println ("You went under " +  (100 - result) + "cents");}
     }

}}
