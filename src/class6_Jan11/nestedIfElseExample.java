package class6_Jan11;

public class nestedIfElseExample {

	public static void main(String[] args) {
		// multi choice, 2nd cond depends on the 1st cond

		// 1 is inside the other
		// write the program to authanticate user based on the credentials

		// if user name is not correct - break the condition and print "USER NAME IS NOT
		// CORRECT'
		// if username is correct and PW is incorrect > print PW IS INCORRECT
		// if both are valid-> "login successful"

		int expetedUserName = 400, expectedPassword = 1234;

		if (expetedUserName == 300) {
			if (expectedPassword == 1234) {
				System.out.println("Login sucessful");
			} else {
				System.out.println("Incorrect password");
			}
		} else {
			System.out.println("Entered user name is not found");
		}

	}

}
