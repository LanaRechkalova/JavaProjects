package class5_Jan9;

public class home_work_temperature_check {

	public static void main(String[] args) {

		int temp = 29;

		if (temp >= 100) {
			System.out.println("Stay inside, it's too hot.");
		} else if (temp >= 30 && temp <= 99) {
			System.out.println("Wear winter clothes.");
		} else if (temp >= 10 && temp <= 29) {
			System.out.println("Stay inside, it's too cold.");
		} else if (temp <= 10) {
			System.out.println("Call for help, it's too cold outside.");

		}
	}
}
