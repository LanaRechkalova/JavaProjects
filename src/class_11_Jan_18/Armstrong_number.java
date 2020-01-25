package class_11_Jan_18;

public class Armstrong_number {

	public static void main(String[] args) {
		//num1 = 173
		//1^3 + 7^3 +3^3 = num1
		
		int num1 = 371, sum = 0, lastDigit, backupOfNum1 = num1;
		
		while (num1 !=0) {
		lastDigit = num1 %10;
		sum = sum + lastDigit * lastDigit * lastDigit;
		num1 = num1/10; 
	} 
		System.out.println(sum);
		System.out.println(backupOfNum1);
		
		if (sum == backupOfNum1) {
			System.out.println("The number is armstrong");
		}else {
			System.out.println("the number is not armstrong");
		}
	}
	}
