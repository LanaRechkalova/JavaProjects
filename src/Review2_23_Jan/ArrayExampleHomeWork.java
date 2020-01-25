package Review2_23_Jan;

public class ArrayExampleHomeWork {
			// Write a program to sort array element in ascending order
		// output should be 0 2 9 14 23 37 56 67 80
	
	// LOGIC:
	//1. Find index of  min value  = 3rd position(0)
	//2. Swap 2 nums (we need an index of these min nums)
	// 3. Repeat the loop
		public static void main(String[] args) {
			int numbers[] = { 14, 56, 37, 0, 23, 9, 2, 80, 67 };
			//					0  1  2   3   4  5  6  7   8
			int min =0, temp =0, indexOfMin=0;
					//i points to the num position
			for (int i =0; i<numbers.length-1; i++) { // this FOR loop maintain the index position only
			
			min = numbers[i];
			for (int j=i; j<numbers.length;j++) { // find the min num
				if (numbers[j]<min) {
					min = numbers[j];
					indexOfMin=j;
				}
			}
			// swapping of 2 nums : numbers{indexOfMin} and numbers[i]
			temp = numbers[indexOfMin];
			numbers[indexOfMin] = numbers[i];
			numbers[i]=temp;
			}
			for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}	}}