package org.wonseok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor, eng, math;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	@Override
	public int compareTo(Object o) {

		Student t = null;
		if (o instanceof Student) {
			t = (Student) o;
		}
		return this.name.compareTo(t.name);
	}
}

public class EX11_5 {

	static int getGroupCount(TreeSet tset, int from, int to) {
		int cnt = 0;

		// from ~ to 사이에 있는 해당하는 학생수 return
		Iterator it2 = tset.iterator();

		// 반복자를 통해서 매개변수로 받은 트리 순회
		while (it2.hasNext()) {
			Student tmpS = new Student("", 1, 1, 1, 1, 1);
			tmpS = (Student) it2.next();

			// from~to 사이에 해당하는 학생이 있으면 cnt++
			if (tmpS.getAverage() >= from && tmpS.getAverage() < to) {
				cnt++;
			}

		}

		// TreeSet의 subSet을 사용하라.
		return cnt;
	}

	public static void main(String[] args) {

		TreeSet set = new TreeSet(new Comparator() {
			public int compare(Object o1, Object o2) {
				if (o1 instanceof Student && o2 instanceof Student) {
					Student tmp1 = (Student) o1;
					Student tmp2 = (Student) o2;

					// int tmpAvg = (int) (tmp1.getAverage() -
					// tmp2.getAverage());
					return (tmp1.getAverage() - tmp2.getAverage() < 0) ? -1
							: ((tmp1.getAverage() - tmp2.getAverage() == 0) ? 0 : 1);
				} else {
					return -1;
				}
			}
		});
		set.add(new Student("홍길동", 1, 1, 100, 100, 100));
		set.add(new Student("남궁성", 1, 2, 90, 70, 80));
		set.add(new Student("김자바", 1, 3, 80, 80, 90));
		set.add(new Student("이자바", 1, 4, 70, 90, 70));
		set.add(new Student("안자바", 1, 5, 60, 100, 80));

		Iterator it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
		System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
		System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
		System.out.println("[90~100] :" + getGroupCount(set, 90, 101));

	}

}
