package test.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Ex_99_1 {
	public static void main(String[] args) {
		
		
		
		JSONArray studentArr = new JSONArray();
		
		JSONObject student = new JSONObject();
		student.put("name", "최원슥");
		student.put("email", "won@naver.com");
		student.put("phone", "00-11");
		studentArr.put(student);
		
		
		student = new JSONObject();
		student.put("name", "슥샥쇽");
		student.put("email", "won@com");
		student.put("phone", "00-22");
		studentArr.put(student);
		

		JSONObject jsonObj = new JSONObject();
		jsonObj.put("studentArr", studentArr);
		
		
		try {
			File file = new File("test.json");
			if(!file.exists())
			{
				file.createNewFile();
				System.out.println("파일이 없어서 새로 파일을 생성 하였습니다.");
			}
			FileWriter fw = new FileWriter(file);
			fw.write(jsonObj.toString());
			if(fw!=null)
				fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String filepath = "test.json";
		try {
			File file2 = new File(filepath);
			if(file2.exists())
			{
				FileReader fileReader = new FileReader(file2);
				JSONTokener tokener = new JSONTokener(fileReader);
				JSONObject students2 = new JSONObject(tokener);
//				System.out.println(students2.toString());
//				System.out.println(students2.get("cnt"));
				JSONArray jsonArr = students2.getJSONArray("studentArr");
				Vector<Vector> vector = new Vector<>();
				for(int i=0; i<jsonArr.length(); i++)
				{
					JSONObject jsonObj2 = (JSONObject)jsonArr.get(i);
//					System.out.println(jsonObj2);
//					System.out.println(jsonArr.get(i));
					Vector v = new Vector<>();
					v.add(jsonObj2.get("name"));
					v.add(jsonObj2.get("email"));
					v.add(jsonObj2.get("phone"));
					vector.add(v);
				}
				System.out.println(vector);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}
}

// JSONObject의 메소드
// JSONObject는 Map과 유사하고
// JSONArray는 ArrayList와 유사하다.

