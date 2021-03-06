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
		
		for(int i=1; i<searchArr.length; i++)
		{
			System.out.printf("%d.%s ",i,searchArr[i]);
		}
		System.out.println();
		System.out.print("검색하고 싶은 항목을 입력하세요 > ");
		int searchNum = scan.nextInt();
		data.searchNumber = searchNum;
	}
	
	public void display(HashMap<Integer, Dto> map)
	{
		for (Map.Entry<Integer, Dto> elem : map.entrySet()) {
			int key = elem.getKey();
			Dto value = elem.getValue();
			System.out.println("key=" + key + " : " + value.toString());
		}
	}


	public void display(int searchNumber) {
		// TODO Auto-generated method stub
		switch(searchNumber)
		{
		case 1:
			System.out.print("검색하고 싶은 이름을 입력하세요 > ");
			String name = scan.next();
			Dto dto = new Dto();
			dto.setName(name);
			data.dto = dto;
			break;
			
		case 2:
			System.out.print("국어 과목 몇점 이상의 학생을 검색하고 싶은지 점수를 입력하세요 > ");
			int Korean = scan.nextInt();
			Dto dto2 = new Dto();
			dto2.setKorean(Korean);
			data.dto = dto2;
			break;
		case 3:
			System.out.print("영어 과목 몇점 이상의 학생을 검색하고 싶은지 점수를 입력하세요 > ");
			int English = scan.nextInt();
			Dto dto3 = new Dto();
			dto3.setEnglish(English);
			data.dto = dto3;
			break;
		case 4:
			System.out.print("수학 과목 몇점 이상의 학생을 검색하고 싶은지 점수를 입력하세요 > ");
			int Math = scan.nextInt();
			Dto dto4 = new Dto();
			dto4.setMath(Math);
			data.dto = dto4;
			break;
		case 5:
			System.out.print("평균 몇점 이상의 학생을 검색하고 싶은지 점수를 입력하세요 > ");
			double avg = scan.nextDouble();
			Dto dto5 = new Dto();
			dto5.setAvg(avg);
			data.dto = dto5;
			break;
		}
		
	}
	

}
