package class5_Jan9;

 import  java.util.Scanner;

public class HomeWork2_SalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int regSalary = 800, bonus = 200, regSales = 10;

Scanner sc = new Scanner(System.in);

System.out.println("How many sales you have done this week?");
int regSales1 = sc.nextInt();

	if (regSales1 > 10) {
	System.out.println("The employee's extra pay is $"+ (regSalary + bonus));
	}else{
	System.out.println("Your pay is regular");}}
}
