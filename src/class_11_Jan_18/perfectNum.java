package class_11_Jan_18;

public class perfectNum {

	public static void main(String[] args) {
		// check if num is perfect/not
		int num1 = 7, sum=0;

		for (int i = 1; i <num1; i++) {
			if (num1 % i == 0) {
				sum = sum+i;
				}}
				if(num1 == sum) {
				System.out.println("number is perfect");
		}else {
			System.out.println("number is NOT perfect");
		}
}}