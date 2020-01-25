package class6_Jan11;

public class NestedIfElse_Example2 {

	public static void main(String[] args) {
	// student should be a graduate in engineering > otherwise not eligible to apply
		//student should have >= 70% score > otherwise PLEASE PASS GRADUATION AND APPLY AGAIN
		// if both criteria satisfied - YOU ARE ELIGIBLE TO APPLY
		
		
		
		boolean hasDegree = true;
		int score = 65;
		
		if (hasDegree = true) {
			System.out.println("You are eligible to apply");
			if (score >=70) {
				System.out.println("You are eligible to apply");
				
				
			}else {
				System.out.println("Please pass graduation score first");
			}
		}else {
			System.out.println("Earn your degree first");
		}
		

	}

}
