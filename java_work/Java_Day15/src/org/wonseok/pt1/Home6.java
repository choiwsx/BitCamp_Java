package org.wonseok.pt1;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

// 1�� ����
//class MyPoint {
//	int x;
//	int y;
//
//	public MyPoint() {
//
//	}
//
//	public MyPoint(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "Point(" + x + "," + y + ")";
//	}
//
//	public int getX() {
//		return x;
//	}
//
//	public void setX(int x) {
//		this.x = x;
//	}
//
//	public int getY() {
//		return y;
//	}
//
//	public void setY(int y) {
//		this.y = y;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof MyPoint) {
//			MyPoint pp = (MyPoint) obj;
//			if (this.x == pp.getX() && this.y == pp.getY()) {
//				return true;
//			}
//		} 
//		return false;
//	}
//}

//2�� ����
//class Circle
//{
//	int x;
//	int y;
//	int radius;
//	public Circle(int x,int y, int radius)
//	{
//		this.x = x;
//		this.y = y;
//		this.radius = radius;
//	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "Circle("+x+","+y+") ������"+radius;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		if(obj instanceof Circle)
//		{
//			Circle c = (Circle)obj;
//			if(this.x==c.x&&this.y==c.y)
//			{
//				return true;
//			}
//		}
//		return false;
//	}
//	
//}

//6�� ����
//class timeGame {
//	int resultTime;
//	String name;
//	Scanner scan = new Scanner(System.in);
//	public timeGame(String name) {
//		this.name = name;
//	};
//
//	public void game() {
//		Calendar time = Calendar.getInstance();
//		System.out.print(name + "���� <Enter>Ű>>");
//		scan.nextLine();
//		System.out.print("     ���� �� �ð� = ");
//		int first = getTime();
//		System.out.println(first);
//		System.out.print("10�� ������ <Enter>Ű>>");
//		scan.nextLine();
//		System.out.print("     ���� �� �ð� = ");
//		int second = getTime();
//		System.out.println(second);
//		if(second<first)
//		{
//			second += 60;
//			setResultTime(Math.abs(second-first));
//		}else{
//			setResultTime(Math.abs(second-first));
//		}
//	}
//	
//	public int getResultTime() {
//		return resultTime;
//	}
//
//	public void setResultTime(int resultTime) {
//		System.out.println(resultTime);
//		this.resultTime = resultTime;
//	}
//
//	public int getTime()
//	{
//		Calendar time = Calendar.getInstance();
//		int time1 = time.get(Calendar.SECOND);
//		return time1;
//	}
//	public void compare(timeGame t)
//	{
//		System.out.println(this.name+"�� ��� "+ Math.abs(10 - this.resultTime) +", "+t.name+"�� ��� "
//				+Math.abs(10 - t.resultTime)+", ");
//		if(Math.abs(10 - this.resultTime)> Math.abs(10 - t.resultTime))
//			System.out.println("���ڴ� "+t.name);
//		else if(Math.abs(10 - this.resultTime) == Math.abs(10 - t.resultTime))
//			System.out.println("����");
//		else
//			System.out.println("���ڴ� "+this.name);
//	}
//}

//7������
//class Seven {
//	Scanner scan = new Scanner(System.in);
//
//	public Seven() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public void first() {
//		String s = "q";
//		while (!s.equals("�׸�")) {
//			System.out.print(">>");
//			s = scan.nextLine();
//			StringTokenizer st = new StringTokenizer(s, " ");
//			if (!s.equals("�׸�"))
//				System.out.println("���� ������ " + st.countTokens());
//		}
//	}
//
//	public void second() {
//		String s = "q";
//		while (!s.equals("�׸�")) {
//			System.out.print(">>");
//			s = scan.nextLine();
//			String[] s2 = s.split(" ");
//			int cnt = 0;
//			for (String tmp : s2)
//				cnt++;
//			if (!s.equals("�׸�"))
//				System.out.println("���� ������" + cnt);
//		}
//
//	}
//
//}

//8�� ����
//class Eight{
//	Scanner scan = new Scanner(System.in);
//	public Eight() {
//	}
//	public void start()
//	{
//		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�̳� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
//		String s = scan.nextLine();
//		int scnt = s.length();
//		int cnt = 0;
//		while(scnt>cnt)
//		{
//			String t1 = String.valueOf(s.charAt(0));
//			String t2 = s.substring(1);
//			s = t2+t1;
//			System.out.println(s);
//			cnt++;
//		}
//	}
//}

//9�� ����
//class Nine {
//	Scanner scan = new Scanner(System.in);
//
//	public Nine() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public void start() {
//		while (true) {
//			System.out.print("ö��[����(1), ����(2), ��(3), ������(4)]>>");
//			int no = scan.nextInt();
//			switch (no) {
//			case 1:
//				System.out.print("ö��(����) : ");
//				com(1);
//				break;
//			case 2:
//				System.out.print("ö��(����) : ");
//				com(2);
//				break;
//			case 3:
//				System.out.print("ö��(��) : ");
//				com(3);
//				break;
//			case 4:
//				System.exit(0);
//			}
//		}
//	}
//
//	public void com(int p) {
//		int comR = (int) Math.random() * 3 + 1;
//		switch (comR) {
//		case 1:// ����
//			System.out.println("��ǻ��(����)");
//			if (p == 1)
//				System.out.println("�����ϴ�.");
//			else if (p == 2)
//				System.out.println("ö���� �̰���ϴ�.");
//			else
//				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
//			break;
//		case 2:// ����
//			System.out.println("��ǻ��(����)");
//			if (p == 1)
//				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
//			else if (p == 2)
//				System.out.println("�����ϴ�.");
//			else
//				System.out.println("ö���� �̰���ϴ�.");
//			break;
//		case 3:// ��
//			System.out.println("��ǻ��(��)");
//			if (p == 1)
//				System.out.println("ö���� �̰���ϴ�.");
//			else if (p == 2)
//				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
//			else
//				System.out.println("�����ϴ�.");
//		}
//	}
//}

//10�� ����
//class Ten
//{
//	String name;
//	Scanner scan = new Scanner(System.in);
//	Random rand = new Random();
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void game(Ten p) {
//		while(true){
//		System.out.print("[" + this.name + "] : <Enter>");
//		scan.nextLine();
//		if(random(this)){
//			break;
//		}
//		System.out.print("[" + p.name + "] : <Enter>");
//		scan.nextLine();
//		if(random(p))
//			break;
//		}
//	}
//	
//	public boolean random(Ten p)
//	{
//		int[] tmpArr = new int[3];
//		for(int i=0; i<3; i++)
//		{
//			int tmp = rand.nextInt(3)+1;
//			System.out.print(tmp+" ");
//			tmpArr[i] = tmp;
//		}
//		if(tmpArr[0]==tmpArr[1]&&tmpArr[1]==tmpArr[2]){
//			System.out.println("    "+p.name+"���� �̰���ϴ�!");
//			return true;
//		}
//		else 
//		{
//			System.out.println("       �ƽ�����!");
//			return false;
//		}
//	}
//}

//11�� ����
//class Eleven {
//	Scanner scan = new Scanner(System.in);
//
//	public void game() {
//
//		String s;
//		System.out.print(">>");
//		s = scan.nextLine();
//		while (true) {
//			String s2;
//			System.out.print("����: ");
//			s2 = scan.next();
//			if(s2.equals("�׸�")){
//				System.out.println("�����մϴ�.");
//				break;
//			}
//			String[] tmpS = s2.split("!");
//			if (tmpS[0].length()==0) {
//				System.out.println("�߸��� �����Դϴ�!");
//				continue;
//			}
//			StringBuffer sb = new StringBuffer(s);
//			// System.out.println(sb.indexOf(tmpS[0]));
//			if (sb.indexOf(tmpS[0]) == -1) {
//				System.out.println("ã�� �� �����ϴ�.");
//				continue;
//			}
//			sb.replace(sb.indexOf(tmpS[0]), sb.indexOf(tmpS[0])+tmpS[0].length(), tmpS[1]);
//			System.out.println(sb);
//		}
//	}
//}

// 12�� ����
// class Twelve
// {
// String name;
// Scanner scan = new Scanner(System.in);
// Random rand = new Random();
// public Twelve() {
// // TODO Auto-generated constructor stub
// }
// public Twelve(String name)
// {
// this.name = name;
// }
// public String getName() {
// return name;
// }
//
// public void setName(String name) {
// this.name = name;
// }
//
// public void game() {
// System.out.print("[" + this.name + "] : <Enter>");
// scan.nextLine();
// if(random())
// System.exit(0);
//
// }
// public boolean random()
// {
// int[] tmpArr = new int[3];
// for(int i=0; i<3; i++)
// {
// int tmp = rand.nextInt(3)+1;
// System.out.print(tmp+" ");
// tmpArr[i] = tmp;
// }
// if(tmpArr[0]==tmpArr[1]&&tmpArr[1]==tmpArr[2]){
// System.out.println(" "+this.name+"���� �̰���ϴ�!");
// return true;
// }
// else
// {
// System.out.println(" �ƽ�����!");
// return false;
// }
// }
// }

public class Home6 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// MyPoint p = new MyPoint(3, 50);
		// MyPoint q = new MyPoint(4, 50);
		// System.out.println(p);
		// if (p.equals(q))
		// System.out.println("���� ��");
		// else
		// System.out.println("�ٸ� ��");

		// Circle a = new Circle(2,3,5);
		// Circle b = new Circle(2,3,30);
		// System.out.println("�� a: "+a);
		// System.out.println("�� b: "+b);
		// if(a.equals(b))
		// System.out.println("���� ��");
		// else
		// System.out.println("�ٸ� ��");

		// 5�� ����
		// Calendar calc = Calendar.getInstance();
		// int hourOfDay = calc.get(Calendar.HOUR_OF_DAY);
		// int min = calc.get(Calendar.MINUTE);
		// System.out.println("���� �ð��� "+hourOfDay+"�� "+min+"���Դϴ�.");
		// if(hourOfDay>=4&&hourOfDay<=12)
		// System.out.println("Good Morining");
		// else if(hourOfDay>12&&hourOfDay<=18)
		// System.out.println("Good Afternoon");
		// else if(hourOfDay>18&&hourOfDay<=22)
		// System.out.println("Good Evening");
		// else
		// System.out.println("Good Night");

		//
		// System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		// timeGame a = new timeGame("Ȳ����");
		// a.game();
		// timeGame b = new timeGame("���繮");
		// b.game();
		// a.compare(b);

		// Seven one = new Seven();
		// one.first();
		// one.second();

		// Eight t = new Eight();
		// t.start();

		// Nine n = new Nine();
		// n.start();

		// String s1, s2;
		// Ten p1 = new Ten();
		// Ten p2 = new Ten();
		//
		// System.out.print("1��° ���� �̸�>>");
		// s1 = scan.nextLine();
		// System.out.print("2��° ���� �̸�>>");
		// s2 = scan.nextLine();
		//
		// p1.setName(s1);
		// p2.setName(s2);
		//
		// p1.game(p2);

		Eleven e = new Eleven();
		e.game();

		// System.out.print("�׺��� ���ӿ� ������ ���� ����>>");
		// int no = scan.nextInt();
		// Twelve[] t = new Twelve[no];
		// for(int i=0; i<no; i++)
		// {
		// System.out.print((i+1)+"��° ���� �̸�>>");
		// String s = scan.next();
		// t[i] = new Twelve(s);
		// }
		//
		// int cnt = 0;
		// while(true)
		// {
		// t[cnt].game();
		// cnt++;
		// if(cnt==3)
		// cnt = 0;
		// }

	}
}