package class_12_Jan_19;

public class SumOfArray {

	public static void main(String[] args) {
		int salary[] = {2000, 5000, 1000, 500, 400, 700, 600, 600, 1200, 900 };
		int sum =0;
		// dataType varName	ArrayName	
		for (int employeeSalary : salary) { 
				
			sum = employeeSalary + sum;
			}
		System.out.println("the sum of salaries is " + sum);
	}
	}