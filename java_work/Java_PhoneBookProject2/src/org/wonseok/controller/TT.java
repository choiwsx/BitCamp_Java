package org.wonseok.controller;

import java.util.ArrayList;
import java.util.Collections;

public class TT  {
	
	public static void main(String[] args) {
		int[] a = {1,7,6,5,3};
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0; i<a.length; i++)
		{
			arr.add(a[i]);
		}
		Collections.sort(arr);
		System.out.println(arr);
	}
	
	


	
	
}