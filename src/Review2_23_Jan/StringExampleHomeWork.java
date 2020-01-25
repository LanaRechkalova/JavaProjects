package Review2_23_Jan;

public class StringExampleHomeWork {

	public static void main(String[] args) {
		String str = "This is string program we are learning from java concept";
		char c = 't';
		
		// Write a program to print frequency of given char
		int count =0;
		for (int i=0; i<str.length(); i++) { //OR i<=str.length()-1
			if (str.toLowerCase().charAt(i)==c || str.toUpperCase().charAt(i) == c) {
				count++;
			}
		}
		System.out.println(count);
	}
}