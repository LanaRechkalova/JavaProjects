package class_11_Jan_18;
import java.util.Scanner;
public class reverse_num_fromHEadTobottom3 {
	public static void main(String[] args) {
		// output console:
		//3
		//5
		//1
	Scanner sc  = new Scanner(System.in);
	System.out.println("enter your number");
	int num1 = sc.nextInt();
		int lastDigit;
	while (num1 !=0) {
		lastDigit = num1 %10;
		System.out.println(lastDigit);
		num1 = num1/10; // remove last digit from num
	} 	}	}