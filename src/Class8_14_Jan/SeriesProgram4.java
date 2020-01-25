package Class8_14_Jan;

public class SeriesProgram4 {

	public static void main(String[] args) {
		// write a prog to find result of below series:
		// 1/2 +2/3 + 3/4 + ... +10/11

		double sum =0.0;
		for (double i = 1; i<=10; i++) {
			sum = sum + i/(i+1);
		}
		System.out.println(sum);
	}

}
