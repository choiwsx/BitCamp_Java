package org.wonseok.model;

public class Dao {
	public static final int MAX = 100;
	public Dto[] dtoArr = new Dto[MAX];
	public int top = 0;
	public int seq = 1;
	
	
	public void insert(Dto dto) {
		// TODO Auto-generated method stub
		dto.setIdx(seq++);
		dtoArr[top] = dto;
		top++;
	}


	public void selectAll() {
		// TODO Auto-generated method stub
		if(top==0){
			System.out.println("����� ����� �Ѹ� �����ϴ�.");
			return;
		}
		
		for(int i=0; i<top; i++)
		{
			System.out.println(dtoArr[i].toString());
		}
	}


	public Dto[] search(Dto dto) {
		// TODO Auto-generated method stub
		int cnt = 0;
		boolean flag = false;
		Dto[] tmpArr = new Dto[top];
		if(top==0)
		{
			return null;
		}
		for(int i=0; i<top; i++)
		{
			if(dto.getName().toUpperCase().equals(dtoArr[i].getName().toUpperCase()))
			{
				tmpArr[cnt] = new Dto();
				tmpArr[cnt].setIdx(dtoArr[i].getIdx());
				tmpArr[cnt].setName(dtoArr[i].getName());
				tmpArr[cnt].setPhone(dtoArr[i].getPhone());
				cnt++;
				flag = true;
			}
		}
		
		if(!flag){
			System.out.println("�������� �ʴ� �̸��Դϴ�.");
			return null;
		}
		Dto[] arr = new Dto[cnt];
		for(int i=0; i<cnt; i++)
		{
			arr[i] = tmpArr[i];
		}
		return arr;
		
	}


	public void update(Dto dto) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for(int i=0; i<top; i++)
		{
			if(dto.getIdx()==dtoArr[i].getIdx())
			{
				
				flag = true;
				dtoArr[i] = dto;
				break;
			}
		}
		if(!flag)
			System.out.println("������ �����Ͽ����ϴ�.");
		else
			System.out.println("������ �����Ͽ����ϴ�.");
		
		
	}


	public void delete(Dto dto) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for(int i=0; i<top; i++)
		{
			if(dto.getIdx()==dtoArr[i].getIdx())
			{
				for(int j=i; j<top-1; j++)
				{
					dtoArr[j] = dtoArr[j+1];
				}
				flag = true;
				dtoArr[top-1] = null;
				top--;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("�ش� Idx���� ���� ����� ã�� ���Ͽ����ϴ�.");
			return;
		}
		else
		{
			System.out.println("������ �����Ͽ����ϴ�.");
		}
		
	}
	
	
	
	
	
	
}
