package org.wonseok;

public class Ch02EX14 {
	
	
	
	public static void test04(String[] args) {
		
		int total =0;
		
		int i =1;
		while( i<=10)		
		{
			total += i;
			i++;
		}
		System.out.printf("1~10까지의 합은 ");
		System.out.print(total);
	}
	
	
	
	
	public static void test03(String[] args) {
		final int MAX = 21;
		
		int total = 2;
		boolean flag = true;
		for(int prev=0, cur=1, next=0;cur<=MAX; next = prev+cur, prev=cur, cur=next)
		{
			System.out.print(cur);
//			total += cur;
			
			if(flag)
			{
				total -= cur;
				System.out.print("+");
				flag = false;
			}else
			{
				total += cur;
				System.out.print(cur==MAX? "=" : "-");
				flag = true;
			}
			
		}
		System.out.print(total);
	}

	
	public static void test02(String[] args) {
		final int MAX = 21;
		int prev = 0;
		int cur = 1;
		int next = 0;
		int total = 0;
		for(;cur<=MAX;)
		{
			System.out.print(cur + (cur==MAX?"=":"+"));
			total += cur;
			next = prev + cur;
			prev = cur;
			cur = next;
			
		}
		System.out.print(total);
	}
	
	
	public static void test01(String[] args) {
		// 
		final int MAX = 10;
		
		int total = 2; 
		for(int i=1; i<=MAX; i++)
		{
			System.out.print(i);
			if(i%2==0)
			{
				System.out.print(i==MAX?"=":"-");
				total += i ;
			}
			else{
				System.out.print("+");		
				total -= i;
			}
		}
		
		System.out.printf("%d",total);
	}
}
