package org.wonseok;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ch08Ex01 {
	
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		OutputStream out = System.out;
		int data = 0;
		System.out.print("입력(끝내려면 Ctrl+z) >> ");
		while((data=in.read())!=-1)
		{
			out.write(data);
		}
		
	}
	
	
	public static void test(String[] args) throws IOException {
		int data =0;
		System.out.print("데이터를 입력하세요. (끝은 Ctrl+z) >> ");
		
		while((data = System.in.read())!=-1){
			System.out.print((char)data);
		}
		
		
	}
}
