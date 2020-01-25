/*This program checks eligibility for people to donate blood.

This program was developed by SprintQA and all copyrights are reserved*/

package Class4_Jan8;

import java.util.Scanner;

public class Nested_if_else {
//write a program if a person is eligible for blood donation or not based on age and weight
	//if age>18 - > eligible for blood donation
	//if weight >=50 - > they can do blood donation
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int age, weight, bloodCount = 100;
//create object of scanner class
Scanner sc = new Scanner(System.in);

//we get age input from user
System.out.println("Please enter your age");
age = sc.nextInt();

System.out.println("Please enter your weigth");
weight = sc.nextInt();

System.out.println("Please enter your blood count");
bloodCount = sc.nextInt();

if (age>18)  {
	if (weight>=50) {
		if (bloodCount > 100) {
	System.out.println("You are eligible for blood drive");
		}else {
			System.out.println("You are eligible but cannot donate blood due to blood count");
		}
	}else {
		if (age>15) {
			System.out.println("You are 3 years to go");
		System.out.println("You are eligible to donate but underweight");
}else {
	System.out.println("You are NOT eligible for blood drive");
}
	}
}
	}}

