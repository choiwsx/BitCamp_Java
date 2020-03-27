package java_day07;

import java.util.Arrays;

public class Ch03Ex20 {
	public static void main(String[] args) {

		int[] intArr = {1,2,3,4};
		int[] intArr2 = {1,3,3,4};
		int[] intArr3 = new int[intArr.length];
		intArr3 = Arrays.copyOf(intArr, intArr.length);
		
		
		
		System.out.println(Arrays.toString(intArr));
	
		System.out.println(Arrays.equals(intArr, intArr2));
	
		System.out.println(Arrays.toString(intArr3));
	
		
	}
}
