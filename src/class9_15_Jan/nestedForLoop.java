package class9_15_Jan;

public class nestedForLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) { // outer FOR LOOP
			System.out.print(" check" + i + "   ");
			for (int j = 1; j <= 5; j++) { // inner FOR LOOP
				System.out.print(j);
			} // end of inner FOR LOOP
		System.out.println();
	} // end of OUTER for LOOP
}}
