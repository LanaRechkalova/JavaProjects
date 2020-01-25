
public class LogicalOperatorsMypractice {

	public static void main(String[] args) {
		
		int fuelLevel = 100;
		System.out.println("need more gas?");
		
		if (fuelLevel != 100) {
			System.out.println("You can proceed with your trip");
		}else {
			System.out.println("Go to a gas station");
			if (fuelLevel != 100) {
				System.out.print(" many miles to go");
		}else {
			System.out.println(" take a break");
		}}}}