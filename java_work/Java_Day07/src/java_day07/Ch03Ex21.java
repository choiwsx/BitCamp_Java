package java_day07;

import java.util.Arrays;

public class Ch03Ex21 {
	public static void main(String[] args) {
		String[] metroArr = {"서울","대전","대구","부산","광주","울산","인천"};

		System.out.println(metroArr[2]);
		System.out.println(metroArr[4]);
		
		
		int[] arr = new int[9];
		
		int temp =1;
		for(int i=0; i<9; i++)
		{
			if(!(i>2&&i<6))
			{
				arr[i] = temp;
				temp++;
			}
			
		}
		System.out.print(Arrays.toString(arr));
	}
}
