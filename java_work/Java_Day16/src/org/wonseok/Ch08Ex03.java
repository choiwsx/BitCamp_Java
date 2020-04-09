package org.wonseok;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;

public class Ch08Ex03 {

	public Ch08Ex03() throws IOException {
		// TODO Auto-generated constructor stub

		String spec ="https://support.oneskyapp.com/hc/en-us/article_attachments/202761727/example_2.json";
		URL url = new URL(spec);

		FileOutputStream fos = null;
		InputStream is = url.openStream();
		
		
		
//		File file = new File("test.jpg");
//		if (!file.exists()) {
//			if (file.createNewFile()) {
//				fos = new FileOutputStream(file);
//				int data = 0;
//				while ((data = is.read()) != -1) {
//					fos.write(data);
//				}
//				fos.close();
//			}
//		}
//		if (is != null)
//			is.close();
//		if(fos!=null)
//			fos.close();
		
	}

	public static void main(String[] args) throws IOException {
		new Ch08Ex03();
	}

	public static void test2(String[] args) {

		File file = new File("./src/org/wonseok");
		if (file.isDirectory()) {
			System.out.println("���丮�Դϴ�.");
			String[] fileNames = file.list();
			for (String fileName : fileNames) {
				System.out.println(fileName);
			}
		}

		file = new File(".");
		if (file.canRead()) {
			System.out.println("���� �� �ֽ��ϴ�.");
			System.out.println(file.getAbsolutePath());
		}

		// file = Ch08Ex03.class.
	}

	public static void test(String[] args) throws IOException {
		File file = new File("test.txt");

		if (file.exists()) {
			System.out.println("������ �����մϴ�.");
			if (file.delete()) {
				System.out.println("������ ���� �Ǿ����ϴ�.");
			}
		} else {
			System.out.println("������ �������� �ʽ��ϴ�.");
			if (file.createNewFile()) {
				System.out.println("�� ������ ���� �Ǿ����ϴ�.");
			}
		}
	}
}
