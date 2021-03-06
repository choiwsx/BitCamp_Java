package test.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;

import org.json.JSONObject;
import org.json.JSONTokener;

public class Ex01_2 {
	public static void main(String[] args) throws FileNotFoundException {
		// JSON 파일로 부터 읽어 들이기
		String filepath = "students.json";
//		InputStream inputStream =Ex01_2.class.getResourceAsStream(filepath);
//		if(inputStream == null)
//		{
//			System.out.println("파일을 읽을 수 없다.");
//			return;
//		}
//		JSONTokener tokener = new JSONTokener(inputStream);
		File file = new File(filepath);
		if(file.exists()){
			FileReader fileReader = new FileReader(file);
			JSONTokener tokener = new JSONTokener(fileReader);
			JSONObject students = new JSONObject(tokener);
			System.out.println(students.toString());
		}
	}
}
