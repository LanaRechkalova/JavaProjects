package class9_15_Jan;
import java.util.Scanner;
public class prime_number {

	public static void main(String[] args) {
	// prog to check given num is prime or not (if divided by 1 or itself ONLY}
		
		Scanner sc = new Scanner(System.in);
		int num1= sc.nextInt();
			// num1=15
		boolean flag = false;
	for (int i= 2; i<=num1-1; i++) { 		// (num1-1) is used because any num is divisible by itself
		if (num1==0) {
			break;
		}
		if (num1 % i ==0) {				//so, we exclude 1 and num itself from the range to check
		System.out.println("number is not prime");
			if (flag == true);
			break;
		}
	}
			if (flag == false) {
			System.out.println("number is prime");

}}}