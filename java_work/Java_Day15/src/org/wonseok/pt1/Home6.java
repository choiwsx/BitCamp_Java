package org.wonseok.pt1;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

// 1번 문제
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

//2번 문제
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
//		return "Circle("+x+","+y+") 반지름"+radius;
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

//6번 문제
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
//		System.out.print(name + "시작 <Enter>키>>");
//		scan.nextLine();
//		System.out.print("     현재 초 시간 = ");
//		int first = getTime();
//		System.out.println(first);
//		System.out.print("10초 예상후 <Enter>키>>");
//		scan.nextLine();
//		System.out.print("     현재 초 시간 = ");
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
//		System.out.println(this.name+"의 결과 "+ Math.abs(10 - this.resultTime) +", "+t.name+"의 결과 "
//				+Math.abs(10 - t.resultTime)+", ");
//		if(Math.abs(10 - this.resultTime)> Math.abs(10 - t.resultTime))
//			System.out.println("승자는 "+t.name);
//		else if(Math.abs(10 - this.resultTime) == Math.abs(10 - t.resultTime))
//			System.out.println("동점");
//		else
//			System.out.println("승자는 "+this.name);
//	}
//}

//7번문제
//class Seven {
//	Scanner scan = new Scanner(System.in);
//
//	public Seven() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public void first() {
//		String s = "q";
//		while (!s.equals("그만")) {
//			System.out.print(">>");
//			s = scan.nextLine();
//			StringTokenizer st = new StringTokenizer(s, " ");
//			if (!s.equals("그만"))
//				System.out.println("어절 개수는 " + st.countTokens());
//		}
//	}
//
//	public void second() {
//		String s = "q";
//		while (!s.equals("그만")) {
//			System.out.print(">>");
//			s = scan.nextLine();
//			String[] s2 = s.split(" ");
//			int cnt = 0;
//			for (String tmp : s2)
//				cnt++;
//			if (!s.equals("그만"))
//				System.out.println("어절 개수는" + cnt);
//		}
//
//	}
//
//}

//8번 문제
//class Eight{
//	Scanner scan = new Scanner(System.in);
//	public Eight() {
//	}
//	public void start()
//	{
//		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
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

//9번 문제
//class Nine {
//	Scanner scan = new Scanner(System.in);
//
//	public Nine() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public void start() {
//		while (true) {
//			System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
//			int no = scan.nextInt();
//			switch (no) {
//			case 1:
//				System.out.print("철수(가위) : ");
//				com(1);
//				break;
//			case 2:
//				System.out.print("철수(바위) : ");
//				com(2);
//				break;
//			case 3:
//				System.out.print("철수(보) : ");
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
//		case 1:// 가위
//			System.out.println("컴퓨터(가위)");
//			if (p == 1)
//				System.out.println("비겼습니다.");
//			else if (p == 2)
//				System.out.println("철수가 이겼습니다.");
//			else
//				System.out.println("컴퓨터가 이겼습니다.");
//			break;
//		case 2:// 바위
//			System.out.println("컴퓨터(바위)");
//			if (p == 1)
//				System.out.println("컴퓨터가 이겼습니다.");
//			else if (p == 2)
//				System.out.println("비겼습니다.");
//			else
//				System.out.println("철수가 이겼습니다.");
//			break;
//		case 3:// 보
//			System.out.println("컴퓨터(보)");
//			if (p == 1)
//				System.out.println("철수가 이겼습니다.");
//			else if (p == 2)
//				System.out.println("컴퓨터가 이겼습니다.");
//			else
//				System.out.println("비겼습니다.");
//		}
//	}
//}

//10번 문제
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
//			System.out.println("    "+p.name+"님이 이겼습니다!");
//			return true;
//		}
//		else 
//		{
//			System.out.println("       아쉽군요!");
//			return false;
//		}
//	}
//}

//11번 문제
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
//			System.out.print("명령: ");
//			s2 = scan.next();
//			if(s2.equals("그만")){
//				System.out.println("종료합니다.");
//				break;
//			}
//			String[] tmpS = s2.split("!");
//			if (tmpS[0].length()==0) {
//				System.out.println("잘못된 명령입니다!");
//				continue;
//			}
//			StringBuffer sb = new StringBuffer(s);
//			// System.out.println(sb.indexOf(tmpS[0]));
//			if (sb.indexOf(tmpS[0]) == -1) {
//				System.out.println("찾을 수 없습니다.");
//				continue;
//			}
//			sb.replace(sb.indexOf(tmpS[0]), sb.indexOf(tmpS[0])+tmpS[0].length(), tmpS[1]);
//			System.out.println(sb);
//		}
//	}
//}

// 12번 문제
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
// System.out.println(" "+this.name+"님이 이겼습니다!");
// return true;
// }
// else
// {
// System.out.println(" 아쉽군요!");
// return false;
// }
// }
// }

class LoveLove {
	private StringBuffer buffer;
	Scanner scan = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	private String word;
	private StringTokenizer token;
	private String key, value;

	public LoveLove() {
		// TODO Auto-generated constructor stub
		play();
	}

	public void play() {
		System.out.println(">>");
		String str = scan.nextLine();
		buffer = new StringBuffer(str);
		while (true) {
			System.out.println("명령 : ");

			word = scan2.next();
			if (word.equals("그만")) {
				System.out.println("종료합니다.");
			}
			token = new StringTokenizer(word, "!");
			if (token.countTokens() != 2) {
				System.out.println("잘못된 명령입니다.");
			}else
			{
				key = token.nextToken();
				value = token.nextToken();
				int idx = buffer.indexOf(key);
				buffer.replace(idx, idx+key.length(), value);
			}
		}
	}

}

public class Home6 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// MyPoint p = new MyPoint(3, 50);
		// MyPoint q = new MyPoint(4, 50);
		// System.out.println(p);
		// if (p.equals(q))
		// System.out.println("같은 점");
		// else
		// System.out.println("다른 점");

		// Circle a = new Circle(2,3,5);
		// Circle b = new Circle(2,3,30);
		// System.out.println("원 a: "+a);
		// System.out.println("원 b: "+b);
		// if(a.equals(b))
		// System.out.println("같은 원");
		// else
		// System.out.println("다른 원");

		// 5번 문제
		// Calendar calc = Calendar.getInstance();
		// int hourOfDay = calc.get(Calendar.HOUR_OF_DAY);
		// int min = calc.get(Calendar.MINUTE);
		// System.out.println("현재 시간은 "+hourOfDay+"시 "+min+"분입니다.");
		// if(hourOfDay>=4&&hourOfDay<=12)
		// System.out.println("Good Morining");
		// else if(hourOfDay>12&&hourOfDay<=18)
		// System.out.println("Good Afternoon");
		// else if(hourOfDay>18&&hourOfDay<=22)
		// System.out.println("Good Evening");
		// else
		// System.out.println("Good Night");

		//
		// System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		// timeGame a = new timeGame("황기태");
		// a.game();
		// timeGame b = new timeGame("이재문");
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
		// System.out.print("1번째 선수 이름>>");
		// s1 = scan.nextLine();
		// System.out.print("2번째 선수 이름>>");
		// s2 = scan.nextLine();
		//
		// p1.setName(s1);
		// p2.setName(s2);
		//
		// p1.game(p2);

//		Eleven e = new Eleven();
//		e.game();

		// System.out.print("겜블링 게임에 참여할 선수 숫자>>");
		// int no = scan.nextInt();
		// Twelve[] t = new Twelve[no];
		// for(int i=0; i<no; i++)
		// {
		// System.out.print((i+1)+"번째 선수 이름>>");
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

		LoveLove l = new LoveLove();
		
		
		
	}
}
