package class9_15_Jan;

public class pattern_prog_4 {

	public static void main(String[] args) {

		// print a full triangle with the top in the center
		// 		*
		// 	   ***
		// 	  *****
		//   *******
		//  *********
		for (int i = 1; i <=5; i++){
			for (int k= 1; k<=5-i; k++) {
				System.out.print(" ");
			}
			System.out.print("*");
				for (int j=1; j<=i-1; j++) {
					System.out.print("*");
					System.out.print("*");
				}
				System.out.println();
			}
		}
		}
