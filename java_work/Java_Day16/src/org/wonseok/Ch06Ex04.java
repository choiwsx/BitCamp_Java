package org.wonseok;

import java.util.StringTokenizer;

public class Ch06Ex04 {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("a=3,b=5,c=6", "=,");
		int total = 0;
		while(st.hasMoreTokens())
		{
			String next = st.nextToken();
			try {
				total += Integer.parseInt(next);
				System.out.println(next);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println(next);
			}
		}
	
		System.out.println(total);
	
	}
}
