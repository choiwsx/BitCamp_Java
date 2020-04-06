package org.comstudy21.model;

import static org.comstudy21.resource.R.*;

public class Dao {
	// DB나 파일에 데이터를 저장하는 역할
	private People[] pArr = new People[MAX];
	private int top = 0;
	
	// 싱글톤 패턴
	private Dao() {
		// TODO Auto-generated constructor stub
	}
	
	private static Dao instance;
	
	public static Dao getInstance() {
		if(instance == null) {
			instance = new Dao();
		}
		return instance;
	}
	
	public void insert(People dto) {
		if(top >= MAX) {
			System.out.println("더이상 입력 불가입니다.");
			return;
		}
		pArr[top++] = dto;
	}
	public People[] select() {
		People[] arr = new People[top];
		for(int i=0; i<arr.length; i++) {
			People dto = new People();
			dto.setIdx(pArr[i].getIdx());
			dto.setName(pArr[i].getName());
			dto.setPhone(pArr[i].getPhone());
			arr[i] = dto;
		}
		return arr;
	}
}
