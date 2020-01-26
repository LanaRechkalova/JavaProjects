package Review2_23_Jan;
import java.util.Scanner;
public class home_work_15_languages {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] language1 = {1, 2, 3};
		
		System.out.println("Enter any programming language");
		System.out.println("1 for Java");
		System.out.println("2 for C");
		System.out.println("3 for C++");

		int language = sc.nextInt();
		switch(language) {
	case 1:
		System.out.println("Java is a programming language.");
		break;
	case 2:
		System.out.println("C is a procedural programming language.");
		break;
	case 3:
		System.out.println("C++ is a middle-level programming language.");
		break;
		
		default:
	System.out.println("Doesn't match any programming language");
	}}}