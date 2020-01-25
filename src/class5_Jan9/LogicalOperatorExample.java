package class5_Jan9;
import java.util.Scanner;
public class LogicalOperatorExample {

	public static void main(String[] args) {
		// vowel characters in English alphabet
		
		Scanner sc = new Scanner(System.in);
		char input = sc.nextLine().charAt(0);
		
		if(input=='a'|| input == 'o' || input == 'i' || input == 'u' || input == 'e') {
		System.out.println("vowel");
		}else {
			System.out.print("not vowel");
		}
	}

}
