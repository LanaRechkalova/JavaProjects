package class_12_Jan_19;

public class findGreatestNum {

	public static void main(String[] args) {
		//write prog to find largest num
//		
//		int numbers[] = {10, 35, 76, 89, 45, 65, 40};
//		int maxNum =  numbers[0];
//		
//		for (int i = 0; i<numbers.length; i++) {
//			if (numbers[i]>maxNum) {
//				maxNum = numbers[i];
//			}
//	}
//		System.out.println("greatest number is " + maxNum);
//	}

// smallest num
    	int numbers[] = {10, 35, 76, 89, 45, 65, 40};
    	int minNum= numbers[0];
    	
    	for (int i=0; i< numbers.length; i++) {
    		if (numbers[i]< minNum) {
    			minNum=numbers[i];
    		}}
    			System.out.println("minimum number is "  + minNum);
    			
    		}}