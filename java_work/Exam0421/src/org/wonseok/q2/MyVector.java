package org.wonseok.q2;

public class MyVector {
	//Object배열 objArr 변수
	Object[] objArr;
	
	//객체배열에 저장된 객체의 개수를 저장하기 위한 변수
	int size = 0;

	//객체배열 용량.
	int capacity;
	
	//기본 생성자 capacity=16;
	public MyVector() {
		this(16);
	}
	
	//capacity를 매개변수로 받는 생성자.
	public MyVector(int capacity)
	{
		this.capacity = capacity;
		objArr = new Object[this.capacity];
	}
	
	//size의 변수값을 반환함.
	public int size()
	{
		return size;
	}
	
	//배열 objArr의 길이를 반환하는 메서드
	public int capacity()
	{
		return this.capacity;
	}
	
	//객체 배열이 비었는지 확인하는 메서드
	boolean isEmpty()
	{
		if(size()==0)
		{
			System.out.println("객체배열이 비어있습니다.");
			return true;
		}
		else{
			System.out.println("객체배열이 비어있지 않습니다.");
			return false;
		}
	}
	
	//객체 배열 objArr에 객체를 추가하는 메서드
	public void add(Object obj)
	{
		int idx = size(); // 인덱스를 크기로 구함.
		if(this.capacity>idx){ // 인덱스가 총 용량보다 작으면.
			objArr[idx] = obj;
			this.size++;
		}
		else if(this.capacity<=idx) //인덱스가 총용량을 넘으면 배열을 새로 만들어서 옮김.
		{
			this.capacity +=10;
			Object[] tmpArr = new Object[(this.capacity/10)*10];
			this.capacity =(this.capacity/10)*10;
			for(int i=0; i<idx; i++)
			{
				tmpArr[i] = objArr[i];  // 배열 복사
			}
			tmpArr[idx] = obj; //총 용량과 같아졌을 때, 매개변수로 들어온 값을 넣어줌 
			this.objArr = tmpArr; // 더 큰 크기로 만든 배열을 objArr로.
			this.size++;
		}
	}
	
	//objArr에 저장된 객체를 반환.
	public Object get(int index)
	{
		return objArr[index];
	}
	
	
	//objArr에 저장된 객체들 문자열 출력.
	@Override
	public String toString() {
		System.out.print("[ ");
		for(int i=0; i<size; i++)
		{
			Object o = get(i);
			if(i!=size-1){
				System.out.print(o.toString()+", ");
			}else
			{
				System.out.print(o.toString());				
			}
		}		
		return " ]"; 
	}

	//매개변수로 받는 객체가 저장되어 있는 위치 
	public int indexOf(Object obj)
	{
		for(int i=0; i<size; i++)
		{
			if(obj.equals(objArr[i]))
			{
				return i;
			}
		}
		return -1; //찾지 못한경우 -1 리턴.
	}
	
	// 삭제 함수
	public boolean remove(Object obj)
	{
		int startIdx = indexOf(obj);
		if(startIdx!=-1) //indexOf로 객체를 찾은경우
		{
			for(int i=startIdx; i<size; i++)
			{
				if(i+1!=this.capacity) // i+1이 최대 용량을 넘으면 안됨.
					objArr[i] = objArr[i+1];
			}
			size--;
			System.out.println("해당 값을 찾고 삭제하였습니다.");
			return true;
		}
		else //객체를 못찾을 경우
		{
			System.out.println("해당 값을 못찾았습니다.");
			return false;
		}
	}
	
	
}
