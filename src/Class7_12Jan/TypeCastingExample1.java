package Class7_12Jan;

public class TypeCastingExample1 {

	public static void main(String[] args) {
		//when both data types is INT, result will be in INT only
		int num1 = 356; 
		System.out.println(num1 / 10);

		
		//when 1 of the value is DOUBLE, then the result will be be in DOUBLE only
int num3 = 356;
double num2 = 10.0;
System.out.println(num3/num2);

//when we divide any number by 10, the answer will be the number w/o the last digit
// 546 / 10 = 54
		//1000 / 10 = 100
		//763 / 10 = 76
		int num4 = 356;
System.out.println(num4 / 10);
	}
}