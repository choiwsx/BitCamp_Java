package org.wonseok;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

//6번 문제
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
//		System.out.println("도시, 경도, 위도를 입력하세요.");
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
//			System.out.print("도시 이름 >> ");
//			String s = scan.next();
//			if(s.equals("그만"))
//				break;
//			if(map.containsKey(s))
//			{
//				System.out.println(map.get(s).toString());
//			}
//			else
//			{
//				System.out.println(s+" 는 없습니다.");
//			}
//		}
//	}
//
//}

// 5번 문제
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
// System.out.println("이름:" + this.name);
// System.out.println("학과:" + this.major);
// System.out.println("학번:" + this.number);
// System.out.println("학점평균:" + this.score);
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
// System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
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
// System.out.print("학생 이름 >>");
// String s = scan.next();
// if(s.equals("그만"))
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
// System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
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
// System.out.print("학생 이름 >>");
// String s = scan.next();
// if(s.equals("그만"))
// break;
// System.out.println(map.get(s).toString());
// }
// }
// }

// 4번 문제
// class Four {
// Scanner scan = new Scanner(System.in);
//
// public Four() {
// Vector<Integer> v = new Vector<>();
// while (true) {
// System.out.print("강수량 입력 (0 입력시 종료)>>");
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
// System.out.println("현재 평균 " + avg / v.size());
// }
// }
//
// }

// 3번 문제
// class Three
// {
// Scanner scan = new Scanner(System.in);
// HashMap<String, Integer> nations = new HashMap<String, Integer>();
// public Three() {
// System.out.println("나라 이름과 인구를 입력하세요. (예:Korea 5000");
// while(true)
// {
// System.out.print("나라 이름, 인구 >>");
// String key = scan.next();
// if(key.equals("그만"))
// break;
// int value = scan.nextInt();
// nations.put(key, value);
// }
// while(true)
// {
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
// }
// }
//
//
// }
// }

// 2번문제
// class Two{
// Scanner scan = new Scanner(System.in);
// public Two() {
//
// // TODO Auto-generated constructor stub
// System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
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
// System.out.print("정수(-1이 입력될 때 까지)>>");
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
// System.out.println("가장 큰 수는 "+max);
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

	}
}
