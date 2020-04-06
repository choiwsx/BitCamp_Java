package org.wonseok.model;

public class Dao {

	public static final int MAX = 100;
	private Dto[] dtoArr = new Dto[MAX];
	private int top = 0;
	private int seq = 1;

	private Dao() {
	};

	private static Dao instance;

	public static Dao getInstance() {
		if (instance == null)
			instance = new Dao();
		return instance;
	}

	public void insert(Dto dto) {
		// TODO Auto-generated method stub
		dto.setIdx(seq);
		seq++;
		dtoArr[top] = dto;
		top++;
	}

	public Dto[] selectAll() {
		// TODO Auto-generated method stub
		Dto[] arr = new Dto[top];
		for (int i = 0; i < top; i++) {
			arr[i] = new Dto();
			arr[i].setIdx(dtoArr[i].getIdx());
			arr[i].setName(dtoArr[i].getName());
			arr[i].setPhone(dtoArr[i].getPhone());
		}

		return arr;
	}

	public Dto[] search(Dto dto) {
		Dto[] tmpArr = new Dto[top];
		int cnt = 0;
		for (int i = 0; i < top; i++) {
			if (dtoArr[i].getName().toUpperCase().equals(dto.getName().toUpperCase())) {
				tmpArr[cnt] = new Dto();
				tmpArr[cnt].setIdx(dtoArr[i].getIdx());
				tmpArr[cnt].setName(dtoArr[i].getName());
				tmpArr[cnt].setPhone(dtoArr[i].getPhone());
				cnt++;
			}
		}

		Dto[] arr = new Dto[cnt];
		for (int i = 0; i < cnt; i++) {
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
				dtoArr[i] = dto;
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.println("수정 실패");
		else
			System.out.println("수정 성공");
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
				dtoArr[top] = null;
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
