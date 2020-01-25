package Class7_12Jan;

public class TypeCasting {

	public static void main(String[] args) {
		//Implicit type casting = widening (smaller data type gets stored into bigger data type)
		//int num1 = 10;
		//double num2;
		//num2=num1
		
		
		//Explicit Type casting = narrowing size of the memory
double num1 = 10.0;
int num2;

num2=(int)num1; // we convert double data to int, so it'll store only INT value of the DOUBLE
System.out.println(num2);
	}
}