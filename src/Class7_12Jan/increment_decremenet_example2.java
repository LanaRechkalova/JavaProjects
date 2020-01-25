package Class7_12Jan;

public class increment_decremenet_example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1 = 7;
int num2;
 //postfix operator first assign the value to the variable and then do increment
num2 = num1++;
System.out.println(num2);
System.out.println(num1);

//prefix - first do increment, then assign value to the variable
num2 = ++num1;
System.out.println(num2);
System.out.println(num1);
	}

}
