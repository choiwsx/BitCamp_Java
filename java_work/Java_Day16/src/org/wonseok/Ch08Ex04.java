package org.wonseok;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Ch08Ex04 {
	public static void main(String[] args) throws IOException, JSONException {
		InputStream is = Ch08Ex04.class.getResourceAsStream("Person.json");
//		int data = 0;
//		while((data=is.read())!=-1)
//		{
//			https://cafe.naver.com/bikecargogo/3277554System.out.println((char)data);
//		}
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(isr);
//		String line = "";
//		while((line=br.readLine())!=null)
//		{
//			System.out.println(line);
//		}
//		JSONTokener tokener = new JSONTokener(is);
//		JSONObject json = new JSONObject(tokener);
//		System.out.println(json.get("name"));
//		
//		JSONObject json2 = new JSONObject();
//		json2.put("name", "하잉~");
//		System.out.println(json2);
//		String jsonStr = json2.toString();
//		System.out.println(jsonStr);
		
		String spec ="https://support.oneskyapp.com/hc/en-us/article_attachments/202761727/example_2.json";
		URL url = new URL(spec);

		FileOutputStream fos = null;
		InputStream is2= url.openStream();
		File file = new File("testjson.txt");
		fos = new FileOutputStream(file);
		int data2 = 0;
		while ((data2 = is2.read()) != -1) {
			fos.write(data2);
		}
//		fos.close();
		
	}
}
