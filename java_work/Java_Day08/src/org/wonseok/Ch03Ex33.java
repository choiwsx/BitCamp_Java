package org.wonseok;


class callByReference{
	int value;
	callByReference(int value){
		this.value = value;
	}
	public static void swap(callByReference x, callByReference y)
	{
		int temp = x.value;
		x.value = y.value;
		y.value = temp;
		
	}
}
public class Ch03Ex33 {
	
	static int add(int a, int b)
	{
		int total = 0;
		for(int i=a; i<=b; i++)
		{
			total += i;
		}
		return total;
	}
	static void swap(int a[], int b, int c)
	{
		int temp = a[b];
		a[b] = a[c];
		a[c] = temp;
	}
	
	public static void main(String[] args) {
		callByReference t1 = new callByReference(10);
		callByReference t2 = new callByReference(20);
		int[] aa = {1,2};
//		System.out.println(t1.value);
//		System.out.println(t2.value);
//		callByReference.swap(t1, t2);
//		System.out.println(t1.value);
//		System.out.println(t2.value);
//		
//		
//		int ans = add(1, 10);
//		System.out.println(ans);
		
		System.out.println(aa[0]+" "+aa[1]);
		swap(aa,0,1);
		System.out.println(aa[0]+" "+aa[1]);
		
		
	}
}
