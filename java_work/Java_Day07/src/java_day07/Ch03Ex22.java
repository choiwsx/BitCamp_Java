package java_day07;

public class Ch03Ex22 {
	public static void main(String[] args) {
		int[] scoreArr = {95,80,100,65,60,70,90,95,100,30};
		int total = 0;
		for(int i=0; i<10; i++)
		{
			if(i>1&&i<6)
				total+=scoreArr[i];
		}
		System.out.println(total);
		
	}
}