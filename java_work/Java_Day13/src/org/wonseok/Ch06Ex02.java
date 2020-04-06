package org.wonseok;

public class Ch06Ex02 {
	static String[] arr = {null,null,null,"Hello World",null,"Korea"};
	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++)
		{
			try {
				System.out.println(arr[i].toString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				continue;
			}
			
		}
	}
	
	
}
