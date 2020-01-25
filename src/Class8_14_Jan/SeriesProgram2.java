package Class8_14_Jan;

public class SeriesProgram2 {

	public static void main(String[] args) {
		//write prog to find result of multiplication of 1 to 5
		
		// 1*2*3*4*5
		
		int mul = 1;
		for (int i = 1; i<=5; i++) {
		mul = mul * i;
		}	
		System.out.println(mul);
System.out.println("Iteration " +i + "value of i " +i + "mul = " + mul);
}
}