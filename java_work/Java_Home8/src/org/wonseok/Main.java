package org.wonseok;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Seven {
	public Seven() {
		// TODO Auto-generated constructor stub
		File f = null;
		FileInputStream fin = null;
		FileOutputStream dest = null;
		System.out.println("a.jpg를 b.jpg로 복사합니다.");
		System.out.println("10%마다 *를 출력합니다.");
		try {
			f = new File("a.jpg");
			fin = new FileInputStream(f);
			dest = new FileOutputStream("b.jpg");

			int c, count = 0;
			int printStart = (int) f.length() / 10;
			int total = printStart;

			while ((c = fin.read()) != -1) {
				dest.write(c);
				count++;
				if (count == total) {
					System.out.print("*");
					total += printStart;
				}
			}
			fin.close();
			dest.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class Six {
	Scanner scan = new Scanner(System.in);

	public Six() {
		// TODO Auto-generated constructor stub
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		String f1, f2;
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		f1 = scan.nextLine();
		System.out.print("두번째 파일 이름을 입력하세요>>");
		f2 = scan.nextLine();
		try {
			BufferedReader bfr = new BufferedReader(new FileReader(f1));
			BufferedReader bfr2 = new BufferedReader(new FileReader(f2));

			String tmp1 = "";
			String tmp2 = "";

			String s1 = "";
			String s2 = "";

			FileWriter fout = null;
			fout = new FileWriter("append.txt");
			while ((tmp1 = bfr.readLine()) != null)
				fout.write(tmp1);

			while ((tmp2 = bfr2.readLine()) != null)
				fout.write(tmp2);

			fout.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Five {
	Scanner scan = new Scanner(System.in);

	public Five() {
		// TODO Auto-generated constructor stub
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		String f1, f2;
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		f1 = scan.nextLine();
		System.out.print("두번째 파일 이름을 입력하세요>>");
		f2 = scan.nextLine();
		FileReader fin = null;
		FileReader fin2 = null;
		boolean flag = true;
		try {
			BufferedReader bfr = new BufferedReader(new FileReader(f1));
			BufferedReader bfr2 = new BufferedReader(new FileReader(f2));

			String tmp1 = "";
			String tmp2 = "";

			String s1 = "";
			String s2 = "";

			while ((tmp1 = bfr.readLine()) != null)
				s1 += tmp1;

			while ((tmp2 = bfr2.readLine()) != null)
				s2 += tmp2;

			if (s2.equals(s1))
				System.out.println("같은 파일");
			else
				System.out.println("다른 파일");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

// Q5
// class Four{
// public Four() {
// // TODO Auto-generated constructor stub
// System.out.println("C:\\Windows\\system.ini 파일을 읽어 출력합니다.");
// try {
// Scanner fScanner = new Scanner(new FileReader("C:\\Windows\\system.ini"));
// int lineNumber =1;
// while(fScanner.hasNext())
// {
// String line = fScanner.nextLine();
// System.out.printf("%d : %s", lineNumber++,line);
// System.out.println();
// }
// } catch (FileNotFoundException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
//
// }
// }

// Q3.
// class Three{
// public Three() {
// // TODO Auto-generated constructor stub
// FileReader fin = null;
//
// try {
// fin = new FileReader("C:\\Windows\\system.ini");
// int c;
// while((c=fin.read())!=-1){
// c = Character.toUpperCase(c);
// System.out.print((char)c);
// }
// fin.close();
// } catch (FileNotFoundException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// } catch (IOException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
// }
//
// }

// Q2.
// class Two{
// public Two() {
// // TODO Auto-generated constructor stub
// FileReader fin = null;
//
// try {
// fin = new FileReader("c:\\temp\\phone.txt");
// int c;
// while((c=fin.read())!=-1){
// System.out.print((char)c);
// }
// fin.close();
// } catch (FileNotFoundException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// } catch (IOException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
//
// }
// }

// Q1.
// class One{
// Scanner scan = new Scanner(System.in);
// public One(){
// // TODO Auto-generated constructor stub
// FileWriter fout = null;
// System.out.println("전화번호 입력 프로그램입니다.");
// try{
// fout = new FileWriter("c:\\temp\\phone.txt");
// while(true)
// {
// System.out.print("이름 전화번호 >> ");
// String line = scan.nextLine();
// if(line.equals("그만"))
// break;
// fout.write(line);
// fout.write("\r\n",0,2);
// }
// fout.close();
// }
// catch(IOException e){
//
// }
// System.out.print("c:\\temp\\phone.txt에 저장하였습니다.");
// }
// }

public class Main {
	public static void main(String[] args) throws IOException {
		// One o = new One();
		// Two t = new Two();
		// Three t = new Three();
		// Four f = new Four();
		// Five f = new Five();
		// Six s = new Six();
		Seven s = new Seven();
	}
}
