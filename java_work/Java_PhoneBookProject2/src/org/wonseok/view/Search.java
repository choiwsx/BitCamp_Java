package org.wonseok.view;

import java.util.HashMap;
import java.util.Map;

import org.wonseok.model.Dto;

public class Search implements View {

	@Override
	public void display() {
		System.out.println(searchTitle);
		if(dao.map.size()==0)
		{
			System.out.println("저장된 사람이 한명도 없습니다.");
			return;
		}
		System.out.print("검색하고 싶은 사람의 이름을 입력하세요 > ");
		String name = scan.next();
		Dto dto = new Dto();
		dto.setName(name);
		data.dto = dto;
	}
	
	public void display(HashMap<Integer, Dto> map)
	{
		for (Map.Entry<Integer, Dto> elem : map.entrySet()) {
			int key = elem.getKey();
			Dto value = elem.getValue();
			System.out.println("key=" + key + " : " + value.toString());
		}
	}
	

}
