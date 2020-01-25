import java.util.Scanner;

class uuu{
	public static void main(String[] args) {

	Scanner nodira = new Scanner(System.in);
	int  x, y, z, result;
	System.out.println("Dear user, please enter any positive number: ");
	x= nodira.nextInt();
	System.out.println("Dear user, please enter any negative number: ");
	y = nodira.nextInt();
	System.out.println("Dear user, please insert a coin to calculate the modulus of these numbers ");
	z = nodira.nextInt();
	System.out.println("You still owe us the money");
	result = x % y;
	System.out.println(result);
	
}}