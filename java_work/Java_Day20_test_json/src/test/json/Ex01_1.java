package test.json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;

import org.json.JSONArray;
import org.json.JSONObject;

public class Ex01_1 {
	public static void main(String[] args) {

		// JSONObject, JSONArray, JSONTokener ...
		// {key:value, key:value ....}
		// [{...},{...}, ...]
		
		
		
		
		
		
		JSONObject student = new JSONObject();
		student.put("name", "홍길동");
		student.put("email", "hong@nave.rocm");
		student.put("phone", "010-1111-1111");
		
		System.out.println(student.toString(2));
		
		JSONArray studentArr = new JSONArray();
		studentArr.put(student);
		
		student = new JSONObject();
		student.put("name", "최원떡");
		student.put("email", "won@nave.rocm");
		student.put("phone", "010-2-1111");
		
		studentArr.put(student);
		
//		System.out.println(studentArr.toString(2));
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("studentArr", studentArr);
		jsonObj.put("cnt", 2);
		System.out.println(jsonObj.toString(2));
		
		
//		InputStream is = Ex01_1.class.getResourceAsStream("students.json");

		
		File file = new File("students.json");
		try {
			if(!file.exists())
			{
				if(file.createNewFile())
					System.out.println("새 파일이 생성 되었습니다.");
			}
				FileWriter fw = new FileWriter(file);
				fw.write(jsonObj.toString(2));
				System.out.println("파일 쓰기 완료!");
				if(fw != null)
				{
					fw.close();
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

// JSON-in(org-json)
// GSON - google --- 리플렉션이 가능하다.
// JSON 관련 라이브러리는 많다.