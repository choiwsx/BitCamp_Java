package org.wonseok.pt1;

import java.util.Calendar;
import java.util.StringTokenizer;

public class CalendarEx {
	
	public static void main(String[] args) {
//		Math.random()
//		boolean b = Boolean.valueOf("true");
//		System.out.println(b);
//		//		StringTokenizer st = new StringTokenizer("a=3,b=5,c=6", ",,=");
////		int sum=0;
////		while(st.hasMoreTokens()){
////			String n = st.nextToken();
////			if(n==",")
////			{
////				sum += Integer.parseInt(n);
////			}
////			System.out.println(st.nextToken());
////		}
////		System.out.println("합은" + sum);
//
//		String c = String.valueOf('c');
//		System.out.println(c);
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2020);
		date.set(Calendar.MONTH, 11);
		date.set(Calendar.DAY_OF_MONTH, 25);
		System.out.println(date.get(Calendar.YEAR));
		System.out.println(date.get(Calendar.MONTH)+1);
		System.out.println(date.get(Calendar.DAY_OF_MONTH));
	}
	
	
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeeok = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		
		System.out.println(msg + year + "/" + month +"/" + day + "/");
		switch(dayOfWeeok)
		{
		case Calendar.SUNDAY: System.out.println("일요일"); break;
		case Calendar.MONDAY: System.out.println("월요일"); break;
		case Calendar.TUESDAY: System.out.println("화요일"); break;
		case Calendar.WEDNESDAY: System.out.println("수요일"); break;
		case Calendar.THURSDAY: System.out.println("목요일"); break;
		case Calendar.FRIDAY: System.out.println("금요일"); break;
		case Calendar.SATURDAY: System.out.println("토요일"); break;
		
		}
		
		System.out.print("("+hourOfDay + "시)");
		if(ampm==Calendar.AM) System.out.println("오전");
		else System.out.println("오후");
		
		
		System.out.println(hour + "시" + minute + "분" + second +"초" + millisecond + "밀리초");
		
	}

	public static void test(String[] args) {
		Calendar now = Calendar.getInstance();
		printCalendar("현재", now);
		
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear();
		firstDate.set(2016,11,25);
		firstDate.set(Calendar.HOUR_OF_DAY, 20);
		firstDate.set(Calendar.MINUTE ,30);
		printCalendar("처음 데이트한 날은", firstDate);
	}


}
