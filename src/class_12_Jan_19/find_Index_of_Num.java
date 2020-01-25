package class_12_Jan_19;

public class find_Index_of_Num {

	public static void main(String[] args) {
		
		//write a prog to print position of a given num
		int numbers[] = {10, 35, 76, 89, 45, 65, 40};
		int targetNumber = 89;
				// i is the same as index of a value/ position of a number in the array
		// print 89 is stored in position #3
		for (int i =0; i<numbers.length; i++) {
			if (numbers[i] == targetNumber) {
					System.out.println(i);
					break;
	}}}}