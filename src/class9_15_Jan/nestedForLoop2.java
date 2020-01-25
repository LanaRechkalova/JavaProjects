package class9_15_Jan;
import java.util.Scanner;
public class nestedForLoop2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int starSquareSize = sc.nextInt();
		for (int i = 1; i <= starSquareSize; i++) { 
			
			for (int j = 1; j <= starSquareSize; j++) { 
				System.out.print("*");
			} 
		System.out.println();
	} 
	}

}
