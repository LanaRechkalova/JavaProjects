package class_12_Jan_19;
import java.util.Scanner;
public class sumOfPositiveAndNegativeNums {

	public static void main(String[] args) {

		int numbers[] = new int[10];

		Scanner sc = new Scanner(System.in);
		int positiveSum = 0, negativeSum = 0;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				positiveSum = positiveSum + numbers[i];
			} else {
				negativeSum = negativeSum + numbers[i];
			}
		}
		System.out.println("positiveSum is " + positiveSum);
		System.out.println("negativeSum is " + negativeSum);
	}
}