package java_day07;

import java.util.Arrays;
import java.util.Random;

public class Ch03Ex25 {
	public static Random rand = new Random();
	
	public static void main(String[] args) {
		int[] lotto = new int[6];
		int[] lotto2 = new int[6];
		int[] lotto3 = new int[6];
		boolean flag = false;
		int temp = 0;
		//����1. �ζ�		
		for(int i=0; i<6; i++)
		{
			flag = true;
			temp = 1 + rand.nextInt(6);
			for(int j=0; j<i; j++)
			{
				if(lotto[j]==temp)
				{
					flag = false;
					break;
				}
			}
			if(flag)
				lotto[i] = temp;
			else
			{
				i--;
			}
		}
		
		for(int i=0; i<6; i++)
		{
			flag = false;
			while(!flag)
			{
				temp = 1 + rand.nextInt(6);				
				if(i==0)
					flag = true;
				for(int j=0; j<i; j++)
				{
					if(temp==lotto2[j])
					{
						flag = false;
						break;
					}
					if(j==i-1&&temp!=lotto2[j])
						flag = true;
				}				
			}
			lotto2[i] = temp;
		}
		
		
		int count = 0;
		while(count<6)
		{
			flag = false;			
			if(count==0)
				flag = true;
			temp = 1 + rand.nextInt(6);
			for(int i=0; i<count; i++)
			{
				if(temp==lotto3[i]){
					flag = false;
					break;
				}
				if(i==count-1&&temp!=lotto3[i]){
					flag = true;
				}
			}
			if(flag){
				lotto3[count] = temp;
				count++;
			}
		}
		
		System.out.println(Arrays.toString(lotto));
		System.out.println(Arrays.toString(lotto2));
		System.out.println(Arrays.toString(lotto3));
	}


}