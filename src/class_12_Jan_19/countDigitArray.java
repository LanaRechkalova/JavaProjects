package class_12_Jan_19;

public class countDigitArray {

	public static void main(String[] args) {
		// write a prog to print number of digit in the given number
		// 123 - 3, 12345 - 5
		
		int num1 = 12368, count=0;
		while(num1!=0) {
			num1=num1/10;
			count++;
			
		}
		System.out.println(count);
	}

}
