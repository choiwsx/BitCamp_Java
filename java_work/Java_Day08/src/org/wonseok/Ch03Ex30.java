package org.wonseok;

import java.util.Arrays;
import java.util.Random;

public class Ch03Ex30 {
	
	public static final int SIZE;
	public static final int MAX;
	public static final Random rand;
	public static final int[] lotto;
	
	
	static {
		SIZE = 6;
		MAX = 6;
		rand = new Random();
		lotto = new int[SIZE];
	}
	public static void main(String[] args) {
		
		
		int[] ball = new int[45];
		for(int i=0; i<45; i++)
		{
			ball[i] = i+1;
		}
		System.out.println(Arrays.toString(ball));
	
		for(int i=0; i<lotto.length;)
		{
			int idx = rand.nextInt(ball.length);
			if(ball[idx]!=0){
				lotto[i] = ball[idx];
				ball[idx] = 0;
				i++;
			}
		}
		System.out.println(Arrays.toString(lotto));
	
	
	
	}
	
	public static void test2(String[] args) {
		int cnt = 0 ;
		while(cnt<6)
		{
			int num = 1+ rand.nextInt(SIZE);
			boolean flag = true;
			for(int i=0; i<cnt; i++)
			{
				if(num==lotto[i])
				{
					flag = false;
					break;
				}
				
			}
			if(flag){
				lotto[cnt++] = num;
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
	}
	
	
	public static void test1(String[] args) {
	
		int[] lotto =  new int[SIZE];
		
		
		
		for(int i=0; i<SIZE; i++)
		{
			lotto[i] = 1 + rand.nextInt(MAX);
			for(int j=0; j<i; j++)
			{
				if(lotto[j]==lotto[i])
				{
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		
	}
}
