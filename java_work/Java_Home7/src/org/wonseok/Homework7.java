package org.wonseok;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

//6번 문제
=======
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Vector;


class Word{
	String english;
	String Korean;
	public Word() {
		// TODO Auto-generated constructor stub
	}
	public Word(String eng, String Kor)
	{
		this.english = eng;
		this.Korean = Kor;
	}
}

class OC
{
	Scanner scan = new Scanner(System.in);
	Vector<Word> v = new Vector<Word>();
	
	public OC() {
		// TODO Auto-generated constructor stub
		v.add(new Word("love","사랑"));
		v.add(new Word("bear","곰"));
		v.add(new Word("door","문"));
		v.add(new Word("animal","동물"));
		v.add(new Word("pitcure","그림"));
		v.add(new Word("human","사람"));
		v.add(new Word("moon","달"));
		v.add(new Word("leg","다리"));
		v.add(new Word("arm","팔"));
		
		System.out.println("명품영어의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재"+v.size()+"개의 단어가 들어 있습니다.");
		Vector<String> v2 = new Vector<>();
		for(int i=0; i<v.size(); i++)
		{
			v2.add(v.get(i).Korean);
			
		}
		while(true)
		{
			int ran = v.size();
			int rand = (int)(Math.random()*ran);
			Word[] wArr = new Word[4];
			int cnt=0;
			for(int i=0; i<4; i++)
			{
				wArr[i] = new Word();
				if(rand+cnt==v.size()) {
					rand = 0;
					cnt = 0;
				}
				wArr[i] = v.get(rand+cnt);
				cnt++;
			}
			Word w = v.get(rand);
			System.out.println(wArr[0].english+"?");
			List<String> list = new ArrayList<String>();
			for(int i=0; i<4; i++)
			{
				list.add(wArr[i].Korean);
			}
			Collections.shuffle(list);
			System.out.print("(1)"+list.get(0)+"(2)"+list.get(1)+"(3)"+list.get(2)+"(4)"+list.get(3)+" : >");
			int no = scan.nextInt();
			if(no==-1) {
				System.out.println("명품영어를 종료합니다..");
				break;
			}
			if(list.get(no-1).equals(wArr[0].Korean))
				System.out.println("정답!");
			else
				System.out.println("No!!!");
			
		}
		
	}
	
	
	
}




//11번 문제
//class Nation {
//	String country;
//	String capital;
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
//
//	public String getCapital() {
//		return capital;
//	}
//
//	public void setCapital(String capital) {
//		this.capital = capital;
//	}
//
//	public boolean equals(Nation n) {
//		// TODO Auto-generated method stub
//		if(this.country.equals(n.getCountry()))
//			return true;
//		return false;
//	}
//
//}
//
//class Eleven {
//
//	Scanner scan = new Scanner(System.in);
//	Vector<Nation> v = new Vector<>();
//
//	public Eleven() {
//		// TODO Auto-generated constructor stub
//		System.out.println("***수도 맞추기 게임을 시작합니다. ****");
////		label:
//		while (true) {
//			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
//			int no = scan.nextInt();
//			switch (no) {
//			case 1:
//				System.out.println("현재 " + v.size() + "개 나라와 수도가 입력되어 있습니다.");
//				while (true) {
//					System.out.print("나라와 수도 입력" + v.size() + ">>");
//					String co = scan.next();
//					if (co.equals("그만"))
//						break;
//					String ca = scan.next();
//					Nation n = new Nation();
//					n.setCountry(co);
//					n.setCapital(ca);
//					boolean flag = false;
//					for(Nation tm : v)
//					{
//						if(tm.equals(n)) {
//							System.out.println(co + "는 이미 있습니다!");
//							flag = true;
//						}
//					}
//					if(!flag)
//						v.add(n);
//				}
//				break;
//			case 2:
//				while(true)
//				{
//					int ran = v.size();
//					int rand = (int)(Math.random()*ran);
//					Nation n = v.get(rand);
//					System.out.print(n.getCountry()+"의 수도는?");
//					String ans = scan.next();
//					if(ans.equals("그만"))
//						break;
//					if(n.getCapital().equals(ans))
//						System.out.println("정답!");
//					else
//						System.out.println("아닙니다!");
//				}
//				break;
//			case 3:
//				System.out.println("게임을 종료합니다.");
//				System.exit(0);
//			}
//		}
//	}
//
//}

//class Eleven {
//
//	Scanner scan = new Scanner(System.in);
//	HashMap<String, String> map = new HashMap<>();
//
//	public Eleven() {
//		// TODO Auto-generated constructor stub
//		System.out.println("***수도 맞추기 게임을 시작합니다. ****");
//		while (true) {
//			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
//			int no = scan.nextInt();
//			switch (no) {
//			case 1:
//				System.out.println("현재 " + map.size() + "개 나라와 수도가 입력되어 있습니다.");
//				while (true) {
//					System.out.print("나라와 수도 입력" + map.size() + ">>");
//					String co = scan.next();
//					if (co.equals("그만"))
//						break;
//					String ca = scan.next();
//					if (map.containsKey(co)) {
//						System.out.println(co + "는 이미 있습니다!");
//						continue;
//					} else {
//						map.put(co, ca);
//					}
//
//				}
//				break;
//			case 2:
//				while (true) {
//					int ran = map.size();
//					int rand = (int) (Math.random() * ran);
//					String[] coArr=new String[ran];
//					int cnt=0;
//					for (Entry<String, String> elem : map.entrySet()) {
//						coArr[cnt++] = elem.getKey();
//					}
//					System.out.print(coArr[rand] + "의 수도는?");
//					String ans = scan.next();
//					if (ans.equals("그만"))
//						break;
//					if(map.containsKey(coArr[rand]))
//						if(map.get(coArr[rand]).equals(ans))
//							System.out.println("정답!");
//						else	
//							System.out.println("아닙니다!");
//				}
//				break;
//			case 3:
//				System.out.println("게임을 종료합니다.");
//				System.exit(0);
//			}
//		}
//	}
//
//}

//9번 문제
//interface IStack<T> {
//	T pop();
//
//	boolean push(T ob);
//}
//
//class MyStack<T> implements IStack<T> {
//	Vector<T> v = new Vector<>();
//
//	@Override
//	public T pop() {
//		// TODO Auto-generated method stub
//		if (v.size() != 0) {
//			T tmp = v.get(v.size() - 1);
//			v.remove(v.size() - 1);
//			return tmp;
//		}
//		return null;
//	}
//
//	@Override
//	public boolean push(T ob) {
//		// TODO Auto-generated method stub
//		v.add(ob);
//		return false;
//	}
//
//}

//8번문제 
//class Eight{
//	Scanner scan = new Scanner(System.in);
//	public Eight() {
//		// TODO Auto-generated constructor stub
//		System.out.println("** 포인트 관리 프로그램입니다 **");
//		HashMap<String, Integer> map = new HashMap<>();
//		while(true)
//		{
//			System.out.print("이름과 포인트 입력>> ");
//			String key = scan.next();
//			if(key.equals("그만"))
//				break;
//			int value = scan.nextInt();
//			if(map.containsKey(key))
//			{
//				int tmp = map.get(key);
//				tmp += value;
//				map.put(key,tmp);
//			}else
//			{
//				map.put(key,value);
//			}
//			System.out.println(map);
//		}
//	}
//}

//7번문제
//class Seven{
//	Scanner scan = new Scanner(System.in);
//	HashMap<String, Double> map = new HashMap<>();
//	public Seven() {
//		// TODO Auto-generated constructor stub
//		System.out.println("미래장학금관리시스템입니다.");
//		for(int i=0; i<5; i++)
//		{
//			System.out.print("이름과 학점 >> ");
//			String key = scan.next();
//			double value = scan.nextDouble();
//			map.put(key, value);
//		}
//		System.out.print("장학생 선발 학점 기준 입력>>");
//		double line = scan.nextDouble();
//		System.out.print("장학생 명단 : ");
//		for(Entry<String, Double> elem : map.entrySet())
//		{
//			if(line<=elem.getValue())
//				System.out.print(elem.getKey()+" ");
//		}
//	}
//	
//}

//6踰� 臾몄젣
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
//class Location {
//	String name;
//	String num1;
//	String num2;
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getNum1() {
//		return num1;
//	}
//
//	public void setNum1(String num1) {
//		this.num1 = num1;
//	}
//
//	public String getNum2() {
//		return num2;
//	}
//
//	public void setNum2(String num2) {
//		this.num2 = num2;
//	}
//
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return name + " " + num1 + " " + num2;
//	}
//}
//
//class Six {
//	Scanner scan = new Scanner(System.in);
//
//	public Six() {
//		// TODO Auto-generated constructor stub
<<<<<<< HEAD
//		System.out.println("도시, 경도, 위도를 입력하세요.");
=======
//		System.out.println("�룄�떆, 寃쎈룄, �쐞�룄瑜� �엯�젰�븯�꽭�슂.");
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
//		HashMap<String, Location> map = new HashMap<>();
//		Location[] lArr = new Location[4];
//		for (int i = 0; i < 4; i++) {
//			lArr[i] = new Location();
//			System.out.print(">>");
//			String s = scan.nextLine();
//
//			String[] tmpS = s.split(",");
//			for (int j = 0; j < tmpS.length; j++) {
//				tmpS[j] = tmpS[j].trim();
//			}
//			lArr[i].setName(tmpS[0]);
//			lArr[i].setNum1(tmpS[1]);
//			lArr[i].setNum2(tmpS[2]);
//			map.put(tmpS[0], lArr[i]);
//		}
//		System.out.println("--------------");
//		for(Location t : map.values()){
//			System.out.println(t.toString());
//		}
//		System.out.println("--------------");
//		while(true)
//		{
<<<<<<< HEAD
//			System.out.print("도시 이름 >> ");
//			String s = scan.next();
//			if(s.equals("그만"))
=======
//			System.out.print("�룄�떆 �씠由� >> ");
//			String s = scan.next();
//			if(s.equals("洹몃쭔"))
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
//				break;
//			if(map.containsKey(s))
//			{
//				System.out.println(map.get(s).toString());
//			}
//			else
//			{
<<<<<<< HEAD
//				System.out.println(s+" 는 없습니다.");
=======
//				System.out.println(s+" �뒗 �뾾�뒿�땲�떎.");
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
//			}
//		}
//	}
//
//}

<<<<<<< HEAD
// 5번 문제
=======
// 5踰� 臾몄젣
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
// class Student {
// String name;
// String major;
// String number;
// String score;
//
// public String getName() {
// return name;
// }
//
// public void setName(String name) {
// this.name = name;
// }
//
// public String getMajor() {
// return major;
// }
//
// public void setMajor(String major) {
// this.major = major;
// }
//
// public String getNumber() {
// return number;
// }
//
// public void setNumber(String number) {
// this.number = number;
// }
//
// public String getScore() {
// return score;
// }
//
// public void setScore(String score) {
// this.score = score;
// }
//
// public void display() {
// System.out.println("---------------");
<<<<<<< HEAD
// System.out.println("이름:" + this.name);
// System.out.println("학과:" + this.major);
// System.out.println("학번:" + this.number);
// System.out.println("학점평균:" + this.score);
=======
// System.out.println("�씠由�:" + this.name);
// System.out.println("�븰怨�:" + this.major);
// System.out.println("�븰踰�:" + this.number);
// System.out.println("�븰�젏�룊洹�:" + this.score);
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
// }
//
// @Override
// public String toString() {
// return name + ", " + major + ", " + number + ", " + score;
// }
//
// }
//
// class Five {
// Scanner scan = new Scanner(System.in);
//
// public Five() {
// // TODO Auto-generated constructor stub
<<<<<<< HEAD
// System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
=======
// System.out.println("�븰�깮 �씠由�, �븰怨�, �븰踰�, �븰�젏�룊洹� �엯�젰�븯�꽭�슂.");
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
// Student[] sArr = new Student[4];
// ArrayList<Student> sL =new ArrayList<>();
// for(int i=0; i<4; i++)
// {
// sArr[i] = new Student();
// System.out.print(">>");
// String s = scan.nextLine();
// String[] tmpS = s.split(",");
// for(int j=0; j<tmpS.length; j++)
// {
// tmpS[j] = tmpS[j].trim();
// }
// sArr[i].setName(tmpS[0]);
// sArr[i].setMajor(tmpS[1]);
// sArr[i].setNumber(tmpS[2]);
// sArr[i].setScore(tmpS[3]);
// sL.add(sArr[i]);
// }
// for(int i=0; i<4; i++)
// {
// sArr[i].display();
// }
// System.out.println("---------------");
// while(true)
// {
<<<<<<< HEAD
// System.out.print("학생 이름 >>");
// String s = scan.next();
// if(s.equals("그만"))
=======
// System.out.print("�븰�깮 �씠由� >>");
// String s = scan.next();
// if(s.equals("洹몃쭔"))
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
// break;
// for(Student sC : sArr)
// {
// if(sC.getName().equals(s)){
// System.out.println(sC.toString());
// }
//
// }
// }
// }
// }
// class Five_2 {
// Scanner scan = new Scanner(System.in);
//
// public Five_2() {
<<<<<<< HEAD
// System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
=======
// System.out.println("�븰�깮 �씠由�, �븰怨�, �븰踰�, �븰�젏�룊洹� �엯�젰�븯�꽭�슂.");
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
// Student[] sArr = new Student[4];
// HashMap<String, Student> map = new HashMap<>();
// for(int i=0; i<4; i++)
// {
// sArr[i] = new Student();
// System.out.print(">>");
// String s = scan.nextLine();
// String[] tmpS = s.split(",");
// for(int j=0; j<tmpS.length; j++)
// {
// tmpS[j] = tmpS[j].trim();
// }
// sArr[i].setName(tmpS[0]);
// sArr[i].setMajor(tmpS[1]);
// sArr[i].setNumber(tmpS[2]);
// sArr[i].setScore(tmpS[3]);
// map.put(tmpS[0], sArr[i]);
// }
// for(int i=0; i<4; i++)
// {
// sArr[i].display();
// }
// System.out.println("---------------");
// while(true)
// {
<<<<<<< HEAD
// System.out.print("학생 이름 >>");
// String s = scan.next();
// if(s.equals("그만"))
=======
// System.out.print("�븰�깮 �씠由� >>");
// String s = scan.next();
// if(s.equals("洹몃쭔"))
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
// break;
// System.out.println(map.get(s).toString());
// }
// }
// }

<<<<<<< HEAD
// 4번 문제
=======
// 4踰� 臾몄젣
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
// class Four {
// Scanner scan = new Scanner(System.in);
//
// public Four() {
// Vector<Integer> v = new Vector<>();
// while (true) {
<<<<<<< HEAD
// System.out.print("강수량 입력 (0 입력시 종료)>>");
=======
// System.out.print("媛뺤닔�웾 �엯�젰 (0 �엯�젰�떆 醫낅즺)>>");
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
// int n = scan.nextInt();
// if (n == 0) {
// break;
// }
// v.add(n);
// System.out.println(v);
// int avg = 0;
// for (int i = 0; i < v.size(); i++) {
// avg += v.get(i);
// }
<<<<<<< HEAD
// System.out.println("현재 평균 " + avg / v.size());
=======
// System.out.println("�쁽�옱 �룊洹� " + avg / v.size());
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
// }
// }
//
// }

<<<<<<< HEAD
// 3번 문제
=======
// 3踰� 臾몄젣
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
// class Three
// {
// Scanner scan = new Scanner(System.in);
// HashMap<String, Integer> nations = new HashMap<String, Integer>();
// public Three() {
<<<<<<< HEAD
// System.out.println("나라 이름과 인구를 입력하세요. (예:Korea 5000");
// while(true)
// {
// System.out.print("나라 이름, 인구 >>");
// String key = scan.next();
// if(key.equals("그만"))
=======
// System.out.println("�굹�씪 �씠由꾧낵 �씤援щ�� �엯�젰�븯�꽭�슂. (�삁:Korea 5000");
// while(true)
// {
// System.out.print("�굹�씪 �씠由�, �씤援� >>");
// String key = scan.next();
// if(key.equals("洹몃쭔"))
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
// break;
// int value = scan.nextInt();
// nations.put(key, value);
// }
// while(true)
// {
<<<<<<< HEAD
// System.out.print("인구 검색 >> ");
// String key = scan.next();
// if(key.equals("그만"))
// break;
// if(nations.containsKey(key))
// {
// System.out.println(key+"의 인구는 "+nations.get(key));
// }else
// {
// System.out.println(key+" 나라는 없습니다.");
=======
// System.out.print("�씤援� 寃��깋 >> ");
// String key = scan.next();
// if(key.equals("洹몃쭔"))
// break;
// if(nations.containsKey(key))
// {
// System.out.println(key+"�쓽 �씤援щ뒗 "+nations.get(key));
// }else
// {
// System.out.println(key+" �굹�씪�뒗 �뾾�뒿�땲�떎.");
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
// }
// }
//
//
// }
// }

<<<<<<< HEAD
// 2번문제
=======
// 2踰덈Ц�젣
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
// class Two{
// Scanner scan = new Scanner(System.in);
// public Two() {
//
// // TODO Auto-generated constructor stub
<<<<<<< HEAD
// System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
=======
// System.out.print("6媛쒖쓽 �븰�젏�쓣 鍮� 移몄쑝濡� 遺꾨━ �엯�젰(A/B/C/D/F)>>");
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
// ArrayList<Character> a = new ArrayList<>();
// int cnt=0;
// while(true)
// {
// if(cnt==6)
// break;
// String c = scan.next();
// a.add(c.charAt(0));
// cnt++;
// }
// double avg = 0;
// for(int i=0; i<a.size(); i++)
// {
// switch(a.get(i))
// {
// case 'A':
// avg += 4.0;
// break;
// case 'B':
// avg += 3.0;
// break;
// case 'C':
// avg += 2.0;
// break;
// case 'D':
// avg += 1.0;
// break;
// case 'F':
//
// }
// }
// System.out.println(avg/6);
// }
// }

// class One{
// Scanner scan = new Scanner(System.in);
// public One() {
// // TODO Auto-generated constructor stub
<<<<<<< HEAD
// System.out.print("정수(-1이 입력될 때 까지)>>");
=======
// System.out.print("�젙�닔(-1�씠 �엯�젰�맆 �븣 源뚯�)>>");
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
// Vector<Integer> v = new Vector<>();
// int max = 0;
// while(true)
// {
// int no = scan.nextInt();
// if(no==-1)
// break;
// v.add(no);
// if(max<no)
// max = no;
// }
<<<<<<< HEAD
// System.out.println("가장 큰 수는 "+max);
=======
// System.out.println("媛��옣 �겙 �닔�뒗 "+max);
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
// }
// }

public class Homework7 {
	public static void main(String[] args) {
		// One o = new One();
		// Two t = new Two();
		// Three t = new Three();
		// Four f = new Four();
		// Five f = new Five();
		// Five_2 f2 = new Five_2();
//		Six s = new Six();
<<<<<<< HEAD

=======
//		Seven s = new Seven();
//		Eight e = new Eight();

//		IStack<Integer> stack = new MyStack<Integer>();
//		for (int i = 0; i < 10; i++)
//			stack.push(i);
//		while (true) {
//			Integer n = stack.pop();
//			if (n == null)
//				break;
//			System.out.print(n + " ");
//		}

//		Eleven e = new Eleven();

		OC o = new OC();
		
>>>>>>> 9d26f653b492355a5b8c2743645627ed279dc073
	}
}
