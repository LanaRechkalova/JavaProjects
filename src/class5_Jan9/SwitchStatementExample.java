package class5_Jan9;
import java.util.Scanner;
public class SwitchStatementExample {

	public static void main(String[] args) {
		int choice;
		System.out.println("enter number 1-7");
	
		
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		
		switch (choice) {
		
		case 1:
			System.out.println("Monday");
		break;
		case 2:
			System.out.println("Tue");
		break;
		case 3:
			System.out.println("Wed");
		break;
		case 4:
			System.out.println("Thur");
		break;
		case 5:
			System.out.println("Fri");
		break;
		case 6:
			System.out.println("Sat");
		break;
		case 7:
			System.out.println("Sun");
		break;
		default:
			System.out.println("Enter only 1 - 7");
	}

}
}