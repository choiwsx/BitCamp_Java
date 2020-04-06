package org.wonseok;


class วาน่{
		
}
class พฦน่ extends วาน่{
	
}
class ฐํธ๐ extends วาน่{
	
}
class พฦต้ extends พฦน่{
	
}
class ป๏รฬ extends วาน่{
	
}
public class Ch06Ex03 {
	public static void main(String[] args) {
		วาน่ abe;
		วาน่[] arr = {new ป๏รฬ(),null, new ฐํธ๐(), new พฦต้(), new ป๏รฬ()};
		for(int i=0; i<arr.length; i++)
		{
			abe = arr[i];
			try {
				System.out.println(abe.toString());
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				continue;
			}
		}
	}
}
