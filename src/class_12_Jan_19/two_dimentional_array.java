package class_12_Jan_19;

public class two_dimentional_array {

	public static void main(String[] args) {
		// need 2 for loops
			int numbers [] [] ={ {10,20,30}, {40,50,60}, {70, 80, 90}};
			// when writing NUMBERS.LENGTH, output will give you number of rows
			for (int i=0; i<numbers.length; i++) {
				for (int j=0; j<numbers.length; j++) {
			
				System.out.print(numbers[i][j]+ " "); //prints ALL numbers
	}
			System.out.println();
	}
}
}