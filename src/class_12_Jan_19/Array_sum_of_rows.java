package class_12_Jan_19;

public class Array_sum_of_rows {

	public static void main(String[] args) {
		
		int numbers [] [] ={ {10,20,30}, {40,50,60}, {70, 80, 90}};
		//sum of row 1 - 60
		//sum of row 2 - 150
		//sum of row 3 - 240
		
		int sum =0;
		
		for (int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				sum = sum + numbers[i][j];
				sum=0;
			}
			System.out.println("the sum of rows " +i+ " " + sum); 
		}}}