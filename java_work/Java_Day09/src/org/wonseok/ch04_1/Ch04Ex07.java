package org.wonseok.ch04_1;


class Test{
	public void printArr(int[] arr){
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public void printArr(int[][] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int temp : arr[i])
			{
				System.out.print(temp+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	public int[] joinArr(int[] a, int[] b)
	{
		int al = a.length;
		int bl = b.length;
		int[] arr = new int[al+bl];
		for(int i=0; i<al; i++)
		{
			arr[i] = a[i];
		}
		for(int i=0; i<bl; i++)
		{
			arr[i+al] = b[i];
		}
		return arr;	
	}
	
	public int[][] mkArr(int[] a, int[] b)
	{
		int max = 0;
		if(a.length>b.length)
			max = a.length;
		else
			max = b.length;
		int[][] arr = new int[2][max];

		for(int i=0; i<2; i++)
		{
			for(int j=0; j<((i==0)? a.length : b.length);j++)
			{
				arr[i][j] = (i==0)?a[j]:b[j];
			}
		}
		
		return arr;
	}
	public int[][] mkArr1(int[] ... arr2)
	{
		return arr2;
	}
	
}


public class Ch04Ex07 {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {20,60,80,30};
		Test test = new Test();
//		test.printArr(arr);
		int[] arr3 = test.joinArr(arr1,arr2);
		test.printArr(arr3);
		System.out.println();
		int[][] arr4 = test.mkArr1(arr1,arr2);
		test.printArr(arr4);
	
	}
}
