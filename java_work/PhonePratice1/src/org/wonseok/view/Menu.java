package org.wonseok.view;

public class Menu implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		for(int i=1; i<menuArr.length; i++)
		{
			System.out.printf("%d.%s ", i, menuArr[i] );
		}
		System.out.println();
		System.out.print("¼±ÅÃ : ");
		int number;
		number = scan.nextInt();
		data.number = number;
		
	}

}
