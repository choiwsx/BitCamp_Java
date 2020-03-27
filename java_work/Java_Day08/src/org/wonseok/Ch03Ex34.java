package org.wonseok;

public class Ch03Ex34 {
	
	
	static int[] makeArray(int a)
	{
		int[] tempArr = new int[a];
		for(int i=0; i<tempArr.length; i++)
		{
			tempArr[i] = (i+1)*100;
		}
		
		
		
		return tempArr;
	}
	
	
	public static void main(String[] args) {
		int intArr[];
		intArr = makeArray(4);
		for(int i=0; i<intArr.length; i++)
		{
			System.out.println(intArr[i]+" ");
		}
	}
}
