package class_11_Jan_18;

public class find_divisor_ofNum {

	public static void main(String[] args) {
		// 24 - 1, 2, 3, 4, 6, 8, 12, 24 - divisors of 24
		// 15 - 1, 3, 5, 15
		int num1 = 10;

		for (int i = 1; i < 25; i++) {
			if (num1 % i == 0)

				System.out.println("divisors are: " + i);
		}
	}
}
