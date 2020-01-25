package class_12_Jan_19;

public class Array_TotalNumOfEven_and_Odd_numbers {

	public static void main(String[] args) {
		// count total sum of odd numbers and even numbers from the array
		int numbers[] = { 12, 65, 78, 1, 6, 45, 71, 65, 34, 89 };
		
		int evenNum = 0, oddNum =0; 
		
		for (int i=0; i< numbers.length; i++) {
			if (numbers[i]%2 == 0) {
			evenNum = evenNum+1;
		}else {
			oddNum++;}
		}
	
		System.out.println("total number of even numbers is: " + evenNum);

		System.out.println("total number of odd numbers is: " + oddNum);

	}}
