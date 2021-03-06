package org.comstudy21.model;

import java.io.*;
import java.util.Vector;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Dao {
	private String pathname = "src/org/comstudy21/resource/students.json";
	private FileReader reader;
	private FileWriter writer;

	private JSONObject getJsonObject() {
		File dataFile = new File(pathname);

		try {
			reader = new FileReader(dataFile);

			JSONTokener token = new JSONTokener(reader);
			return new JSONObject(token);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}

	public Vector<Vector> selectAll() {
		JSONObject jsonObject = getJsonObject();
		if (jsonObject == null) {
			System.out.println("ó�� �� �����Ͱ� �����ϴ�!");
			return null;
		}

		JSONArray jsonArray = jsonObject.getJSONArray("studentArr");

		Vector<Vector> vector = new Vector<>();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject obj = jsonArray.getJSONObject(i);
			Vector v = new Vector<>();
			v.add(obj.get("no"));
			v.add(obj.get("name"));
			v.add(obj.get("email"));
			v.add(obj.get("phone"));
			vector.add(v);
		}

		return vector;
	}

	public void insert(Member dto) {
		// ����Ʈ�� �����´� -> ����Ʈ�� dto�� ���� �߰��Ѵ�. -> �ٽ� �����Ѵ�.
		File file = new File(pathname);
		if (!file.exists()) {
			JSONObject newObj = new JSONObject();
			newObj.put("no", 1);
			newObj.put("name", dto.getName());
			newObj.put("email", dto.getEmail());
			newObj.put("phone", dto.getPhone());
			JSONArray newArray = new JSONArray();
			newArray.put(newObj);
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("seq", 2);
			jsonObject.put("studentArr", newArray);

			try {
				writer = new FileWriter(file);
				writer.write(jsonObject.toString(2));
				// System.out.println("������ ���� ����!");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (reader != null)
						reader.close();
					if (writer != null)
						writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			return;
		}

		JSONObject jsonObject = getJsonObject();
		if (jsonObject == null) {
			System.out.println("ó�� �� �����Ͱ� �����ϴ�!");
			return;
		}

		JSONArray jsonArray = jsonObject.getJSONArray("studentArr");
		JSONObject obj = new JSONObject();
		int seq = jsonObject.getInt("seq");
		obj.put("no", seq++);
		obj.put("name", dto.getName());
		obj.put("email", dto.getEmail());
		obj.put("phone", dto.getPhone());
		jsonArray.put(obj);

		JSONObject newObj = new JSONObject();
		newObj.put("studentArr", jsonArray);
		newObj.put("seq", seq);

		try {
			writer = new FileWriter(file);
			writer.write(newObj.toString(2));
			// System.out.println("������ ���� ����!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public Vector<Vector> select(Member member) {
		Vector<Vector> vector = new Vector<>();
		
		JSONObject rootObject = getJsonObject();
		JSONArray array = rootObject.getJSONArray("studentArr");
		for(int i=0; i<array.length(); i++)
		{
			JSONObject obj = array.getJSONObject(i);
			if((member.getName().length()!=0&& (obj.get("name")).toString().indexOf(member.getName()) !=-1)
					||(member.getEmail().length()!=0&& (obj.get("email")).toString().indexOf(member.getEmail()) !=-1)
							||((member.getPhone().length()!=0&& (obj.get("phone")).toString().indexOf(member.getPhone()) !=-1)))
					{
						Vector v = new Vector<>();
						v.add(obj.getInt("no"));
						v.add(obj.get("name"));
						v.add(obj.get("email"));
						v.add(obj.get("phone"));
						vector.add(v);
					}	
		}
		
		return vector;
	}

	public void delete(Member dto) {

		JSONObject rootObject = getJsonObject();
		JSONArray array = rootObject.getJSONArray("studentArr");
		
		int seq = rootObject.getInt("seq");
		
		for(int i=0; i<array.length(); i++)
		{
			JSONObject obj = (JSONObject)array.get(i);
			if(dto.getNo()==obj.getInt("no"))
			{
				array.remove(i);
			}
		}
		try {
			File file = new File(pathname);
			writer = new FileWriter(file);
			writer.write(rootObject.toString(2));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				if(reader!=null) reader.close();
				if(writer!=null) writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
