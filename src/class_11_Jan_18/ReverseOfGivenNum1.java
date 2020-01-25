package class_11_Jan_18;

public class ReverseOfGivenNum1 {

	public static void main(String[] args) {
	
		int num1 = 123;
		
		int lastDigit, reverseNumber=0;
		while (num1 !=0) {
			lastDigit = num1 %10;
			reverseNumber = reverseNumber*10 + lastDigit;
			num1 = num1/10;
	}
	System.out.println(reverseNumber);	
	}}
