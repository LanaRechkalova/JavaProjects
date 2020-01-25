package class_11_Jan_18;

public class palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 12, reverse = 0, lastDigit, backofnum1 = num1;;
		
			while (num1 !=0) {
			lastDigit = num1 %10;
			reverse = reverse*10 + lastDigit;
			num1 = num1/10;
			}
			
	if (reverse == backofnum1) {
	System.out.println("number is polindrome");	
	}else{
	System.out.println("number is not polindrome");	
	}
		}}