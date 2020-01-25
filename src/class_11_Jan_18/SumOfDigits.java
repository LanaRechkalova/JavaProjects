package class_11_Jan_18;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// print a prog to take a num from user and print sum of its digits
		// 3+7+2
		Scanner sc  = new Scanner(System.in);
				
		System.out.println("enter a number");
		int num1 = sc.nextInt();
		
		int lastDigit, sum =0; 
	
		
		while (num1 !=0) {
			lastDigit = num1 %10;
			num1 = num1/10;
			sum = sum+lastDigit;
			}
		System.out.println(sum);
}}
