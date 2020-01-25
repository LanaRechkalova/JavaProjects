package Class7_12Jan;

public class forLoopExample3 {

	public static void main(String[] args) {
//write a prog to print only EVEN nums from 1 to 10
	
//1st way:
		for (int i = 1; i<=10; i++) {
			if (i % 2 ==  0) {
		System.out.println(i);
	}
	}
//2nd way:
		for (int i = 2; i <= 10; i = i+2) {
			System.out.println(i);
		}
	}}
