package org.wonseok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student2 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int total; // 총점
	int schoolRank; // 전교등수
	int classRank; // 반등수

	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage()
				+ "," + schoolRank + "," + classRank;
	}

	// Q8
	public int compareTo(Object o) {
		if (o instanceof Student2) {
			Student2 t = (Student2) o;
			return t.total - this.total;
		} else
			return -1;
	}
} // class Student

// Q9
class ClassTotalComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Student2 && o2 instanceof Student2) {
			Student2 tmp1 = (Student2) o1;
			Student2 tmp2 = (Student2) o2;

			// 반
			return tmp1.ban - tmp2.ban;
		} else
			return -1;
	}
}

// Q7
class BanNoAscending implements Comparator {
	public int compare(Object o1, Object o2) {
		// Student 인스턴스들이 반과, 번호로 오름차순 정렬 되게 하시오.
		// 반이 같은 경우 번호를 비교해서 정렬한다.
		if (o1 instanceof Student2 && o2 instanceof Student2) {
			Student2 tmp1 = (Student2) o1;
			Student2 tmp2 = (Student2) o2;

			// 삼항연산자를 이용해서 반이 같지 않으면 반만 정렬,
			// 반이 같으면 번호를 이용해서 정렬
			return tmp1.ban != tmp2.ban ? tmp1.ban - tmp2.ban : tmp1.no - tmp2.no;

		} else {
			return -1;
		}

	}
}

public class EX11_7 {

	// Q8
	public static void calculateSchoolRank(List list) {
		Collections.sort(list);

		int prevRank = 0; // 이전 전교등수
		int prevTotal = -1; // 이전 총점
		int length = list.size();

		int cnt = 0; // 동점자가 몇명인지 계산하기.

		boolean flag = false; // 동점자 체크 시작

		int tmpcnt = 0;

		// 반복문을 이용해서 list에 저장된 Student 객체를 하나씩 읽는다.
		for (int i = 0; i < length; i++) {
			Student2 tmpS = (Student2) list.get(i);
			// 총점(total)이 이전총점(prevTotal)과 같으면 이전 등수(prevRank)를
			// 등수 (schoolRank)로 한다.
			if (tmpS.getTotal() == prevTotal) {
				tmpS.schoolRank = prevRank;
				cnt++;
				flag = true;
			} else if (tmpS.total != prevTotal) // 총점이 이전 총점과 다르면
			{
				// 등수(schoolRank)의 값을 알맞게 계산해서 저장한다.
				// 이전의 동점자 였다면, 그 다음 등수는 동점자의 수를 고려해야한다.

				if (flag) { // 연속으로 동점자가 있다가 동점이 아닐경우
					tmpcnt = cnt; // 동점자의 명수를 tmpcnt에 넣어준다.
					cnt = 0;
					flag = false;
				}

				if (!flag)
					tmpS.schoolRank = prevRank + 1 + tmpcnt;

				tmpcnt = 0; // tmpcnt를 0으로 초기화해준다.

				prevTotal = tmpS.total;
				prevRank = tmpS.schoolRank;
			}

		}

	}

	//Q9
	public static void calculateClassRank(List list) {
		// . 먼저 반별 총점기준 내림차순으로 정렬한다
		Collections.sort(list, new ClassTotalComparator());
		int prevBan = -1; // 이전 반
		int prevRank = -1; // 이전 등수
		int prevTotal = -1; // 이전 총함
		int length = list.size();

		int cnt = 0;// 동점자 몇명인지 count
		boolean flag = false; // 동점자 체크
		int tmpcnt = 0;

		for (int i = 0; i < length; i++) {
			Student2 tmpS = (Student2) list.get(i);
			if (tmpS.ban != prevBan) // 현재 반이 이전 반과 다르면 이전 등수와, 이전 총점을 초기화한다.
			{
				prevRank = 0;
				prevTotal = -1;
				flag = false; // 반이 바뀌면 flag 도 초기화.
				cnt = 0; // 동점자 숫자도 초기화
			}

			if (tmpS.total == prevTotal) // 총점이 동점이면
			{
				tmpS.classRank = prevRank; // 등수는 같고
				cnt++; // 동점자 수 늘리고
				flag = true;
			} 
			else if (tmpS.total != prevTotal) // 총점이 다르면.
			{
				if (flag) { // 연속으로 동점자가 있다가 동점이 아닐경우
					tmpcnt = cnt; // 동점자의 명수를 tmpcnt에 넣어준다.
					cnt = 0;
					flag = false;
				}

				if (!flag) {
					tmpS.classRank = 1 + prevRank + tmpcnt;
				}
				tmpcnt = 0;
				
				prevBan = tmpS.ban;
				prevTotal = tmpS.total;
				prevRank = tmpS.classRank;
			}

		}

	}

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student2("이자바", 2, 1, 70, 90, 70));
		list.add(new Student2("홍항행", 2, 1, 70, 90, 70));
		list.add(new Student2("이반꼴", 2, 1, 1, 90, 70));
		list.add(new Student2("안자바", 2, 2, 60, 100, 80));
		list.add(new Student2("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student2("홍길동", 3, 3, 100, 100, 100));
		list.add(new Student2("남궁성", 1, 1, 90, 70, 80));
		list.add(new Student2("일반꼴", 1, 1, 10, 70, 80));
		list.add(new Student2("남궁성2", 1, 1, 90, 70, 80));
		list.add(new Student2("김자바", 1, 2, 80, 80, 90));
		list.add(new Student2("김자바2", 1, 2, 80, 80, 90));
		list.add(new Student2("최원석", 3, 2, 79, 80, 90));
		list.add(new Student2("최원석2", 3, 2, 79, 80, 90));
		list.add(new Student2("삼반꼴", 3, 2, 9, 80, 90));
		list.add(new Student2("사반일", 4, 2, 9, 80, 90));
		// Collections.sort(list, new BanNoAscending())
		// Collections.sort(list, new ClassTotalComparator());
		calculateSchoolRank(list);
		calculateClassRank(list);
		Iterator it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}
