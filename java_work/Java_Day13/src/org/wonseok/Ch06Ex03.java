package org.wonseok;


class �ҹ�{
		
}
class �ƹ� extends �ҹ�{
	
}
class ��� extends �ҹ�{
	
}
class �Ƶ� extends �ƹ�{
	
}
class ���� extends �ҹ�{
	
}
public class Ch06Ex03 {
	public static void main(String[] args) {
		�ҹ� abe;
		�ҹ�[] arr = {new ����(),null, new ���(), new �Ƶ�(), new ����()};
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
