package class_12_Jan_19;

public class Array_average_salary {

	public static void main(String[] args) {
		int salary[] = {2000, 5000, 1000, 500, 400, 700, 600, 600, 1200, 900 };
		int sum=0;
		
		for (int i=0; i<salary.length; i++) {
			sum = sum + salary[i];
			
	}
	System.out.println("total cost to the company " + sum);
	System.out.print("avearge salary is " + sum/salary.length);
}}