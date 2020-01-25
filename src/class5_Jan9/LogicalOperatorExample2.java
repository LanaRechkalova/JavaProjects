package class5_Jan9;

public class LogicalOperatorExample2 {
	public static void main(String [] args) {
		
		int num1=10, num2 = 20, num3 = 15;
		
		if (num1 > num2 && num1 > num3) { //we first compare number two and three
			System.out.println(num1+ "is greatest");
		}else if (num2 > num1 && num2 >num3) {
			System.out.println(num2 + "is greatest");
		}else { // if both conditions are false, then remaining num3 is the greatest
			System.out.println(num3 + "is greatest");
		}
		}
		
}
