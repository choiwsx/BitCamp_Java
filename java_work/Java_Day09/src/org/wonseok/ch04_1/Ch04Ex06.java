package org.wonseok.ch04_1;

import java.util.Scanner;

import org.wonseok.ch04.People;

public class Ch04Ex06 {

	public static final int MAX = 100;
	private People[] pArr = new People[MAX];
	private int top = 0; // 삭제가 일어나면 감소된다.
	private int sequence = 0; // 객체가 생성될 때 감소 없이 계속 증가, idx에 사용.
	public static final Scanner scan = new Scanner(System.in);

	public Ch04Ex06() {
		System.out.println("디폴트 생성자 호.출.");
		while (true) {
			System.out.println();
			run();
		}
	}

	public void run() {
		// System.out.println("달리기 시작");
		switch (menu()) {
		case 1: // 입력
			input();
			break;
		case 2: // 출력
			output();
			break;
		case 3: // 검색
			search();
			break;
		case 4: // 수정
			Modify();
			break;
		case 5: // 삭제
			delete();
			break;

		case 6: // 종료
			System.out.println("종료...");
			System.exit(0);
			break;

		default:
			System.out.println("해당사항없습니다");
		}

	}

	// pArr에 people 객체를 추가한다.
	public void input() {
		// 더 이상 입력할 수 없으면 바로 끝낸다.
		if (top >= pArr.length) {
			System.out.println("더 이상 입력 불가.");
			return;
		}
		// 1. 객체생성
		People p = new People();
		p.setIdx(sequence++);
		// 2. 데이터 넣기
		System.out.print("성명 입력>>");
		p.setName(scan.next());
		System.out.print("전화번호 입력>>");
		p.setPhone(scan.next());

		// 3. 객체를 배열 top 번지에 담기.
		pArr[top++] = p;

		System.out.println("입력 완료");

	}

	// 출력 기능
	public void output() {
		// pArr의 요소를 top까지 반복해서 출력한다.
		for (int i = 0; i < top; i++) {
			System.out.println(pArr[i].toString());
		}
		// for(People p : pArr)
		// System.out.println(p);

	}

	public void search() {

		System.out.print("검색해보고싶은 이름을 입력하세요>>");
		String searchName = scan.next();
		People[] searchPeople = new People[100];
		int j = 0;
		for (int i = 0; i < top; i++) {
			if (searchName.equals(pArr[i].getName())) {
				searchPeople[j++] = pArr[i];
			}
		}
		if (j == 0) {
			System.out.printf("%s이라는 이름을 가진 사람은 없습니다.\n", searchName);
			return;
		}
		System.out.printf("총 %d명을 찾았습니다.", j);
		System.out.println();
		for (int i = 0; i < j; i++) {
			System.out.println(searchPeople[i].toString());
		}
	}

	public void Modify() {
		System.out.print("수정하고싶은 이름을 입력하세요>>");
		String searchName = scan.next();
		People[] searchPeople = new People[100];
		int j = 0;
		for (int i = 0; i < top; i++) {
			if (searchName.equals(pArr[i].getName())) {
				searchPeople[j++] = pArr[i];
			}
		}
		if (j == 0) {
			System.out.printf("%s이라는 이름을 가진 사람은 없습니다.\n", searchName);
			return;
		}
		System.out.printf("총 %d명을 찾았습니다.", j);
		System.out.println();
		for (int i = 0; i < j; i++) {
			System.out.println(searchPeople[i].toString());
		}

		boolean flag = false;
		while (!flag) {
			int ModifyNum = 0;
			System.out.print("수정하고 싶은 사람의 idx값을 입력해주세요>>");
			ModifyNum = scan.nextInt();
			
			for (int i = 0; i < j; i++) {
				if (searchPeople[i].getIdx() == ModifyNum) {
					System.out.print("수정하고 싶은 이름을 입력하세요>>");
					searchPeople[i].setName(scan.next());
					System.out.print("수정하고 싶은 전화번호를 입력하세요>>");
					searchPeople[i].setPhone(scan.next());
					flag = true;
				}
			}
			if(!flag)
			{
				System.out.println("존재하지 않는 idx값입니다, 다시 확인해주세요.");
			}
		}

	}

	public void delete() {
		System.out.print("삭제하고싶은 이름을 입력하세요>>");
		String searchName = scan.next();
		People[] searchPeople = new People[100];
		int j = 0;
		for (int i = 0; i < top; i++) {
			if (searchName.equals(pArr[i].getName())) {
				searchPeople[j] = pArr[i];
				searchPeople[j++].setDeleIdx(i);
			}
		}
		if (j == 0) {
			System.out.printf("%s이라는 이름을 가진 사람은 없습니다.\n", searchName);
			return;
		}
		System.out.printf("총 %d명을 찾았습니다.", j);
		System.out.println();
		for (int i = 0; i < j; i++) {
			System.out.println(searchPeople[i].toString());
		}

		boolean flag = false;
		while (!flag) {
			int deleNum = 999;
			System.out.print("삭제하고 싶은 사람의 idx값을 입력해주세요>>");
			deleNum = scan.nextInt();

			for (int i = 0; i < j; i++) {
				if (searchPeople[i].getIdx() == deleNum) {
					int deleIdx = searchPeople[i].getDeleIdx();
					for(int k=deleIdx; k<top;k++)
					{
						pArr[k] = pArr[k+1];
					}
					System.out.println("삭제완료.");
					flag = true;
					
				}
			}
			if(!flag)
			{
				System.out.println("존재하지 않는 idx값입니다, 다시 확인해주세요.");
			}
			top--;
		}
		
	}

	public int menu() {
		int no = 0;
		System.out.println("1.입력 2.출력 3.검색 4.수정 5.삭제 6.종료");
		System.out.print("선택: ");
		no = scan.nextInt();
		return no;
	}

	public static void main(String[] args) {
		new Ch04Ex06();
	}
}
