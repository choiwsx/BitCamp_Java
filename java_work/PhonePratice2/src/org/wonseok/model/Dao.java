package org.wonseok.model;

public class Dao {

	public static final int MAX = 100;
	private Dto[] dtoArr = new Dto[MAX];
	private int top = 0;
	private int seq = 1;

	public void insert(Dto dto) {
		// TODO Auto-generated method stub
		dto.setIdx(seq++);
		dtoArr[top] = dto;
		top++;
	}

	public Dto[] selectAll() {
		// TODO Auto-generated method stub
		Dto[] arr = new Dto[top];
		for (int i = 0; i < top; i++) {
			arr[i] = new Dto();
			arr[i].setIdx(dtoArr[i].getIdx());
			arr[i].setPhone(dtoArr[i].getPhone());
			arr[i].setName(dtoArr[i].getName());
		}
		return arr;
	}

	public Dto[] search(Dto dto) {
		// TODO Auto-generated method stub
		Dto[] arr = new Dto[top];
		int cnt = 0;
		for (int i = 0; i < top; i++) {
			if (dtoArr[i].getName().toUpperCase().equals(dto.getName().toUpperCase())) {
				arr[cnt] = new Dto();
				arr[cnt].setIdx(dtoArr[i].getIdx());
				arr[cnt].setPhone(dtoArr[i].getPhone());
				arr[cnt].setName(dtoArr[i].getName());
				cnt++;
			}
		}
		Dto[] newArr = new Dto[cnt];
		for (int i = 0; i < cnt; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}

	public void update(Dto dto) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for(int i=0; i<top; i++)
		{
			if(dto.getIdx()==dtoArr[i].getIdx())
			{
				dtoArr[i] = dto;
				flag = true;
				break;
			}
		}
		
		if(!flag)
			System.out.println("수정실패");
		else
			System.out.println("수정성공");
		
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
				
				dtoArr[top-1]=null;
				flag = true;
				top--;
				break;
			}
		}
		if(!flag)
			System.out.println("삭제 실패");
		else
			System.out.println("삭제 성공");
		
		
	}

}
