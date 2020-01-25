package class_11_Jan_18;

public class reverse_number_2ndOption {

	public static void main(String[] args) {
		
		// 1. 1st method
//		int num = 12345; // get an output of 54321
//		int reverseNum = 0;
//		
//		while (num!=0) {
//			reverseNum = reverseNum*10 + num%10;
//			num = num/10;
//		}
//		System.out.println("Reverse number is: " + reverseNum);
//	}

		//2. StringBuffer Method
		long num1 =79283;
		System.out.print(new StringBuffer(String.valueOf(num1)).reverse());
}}