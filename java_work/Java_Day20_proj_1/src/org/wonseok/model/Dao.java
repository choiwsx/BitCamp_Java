package org.wonseok.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Dao {
	private String pathname = "src/org/wonseok/resource/students.json";
	private FileReader reader;
	private FileWriter writer;

	private JSONObject getJsonObject() {
		File dataFile = new File(pathname);

		try {
			reader = new FileReader(dataFile);
			if (reader == null) {
				System.out.println("읽어 들일 파일이 없습니다!");
				return null;
			}
			JSONTokener token = new JSONTokener(reader);
			return new JSONObject(token);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Vector<Vector> search(Member dto) {
		JSONObject jsonObject = getJsonObject();
		if (jsonObject == null) {
			System.out.println("처리 할 데이터가 없습니다.");
			return null;
		}
		JSONArray jsonArray = jsonObject.getJSONArray("studentArr");
		Vector<Vector> v = new Vector<>();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject obj = jsonArray.getJSONObject(i);
			if (!dto.getName().equals("")) {
				if (obj.get("name").equals(dto.getName())) {
					Vector tmpv = new Vector<>();
					tmpv.add(obj.get("no"));
					tmpv.add(obj.get("name"));
					tmpv.add(obj.get("email"));
					tmpv.add(obj.get("phone"));
					v.add(tmpv);
				}
			}

		}
		return v;
	}

	public Vector<Vector> selectAll() {
		// JSONObject를 활용한다.
		JSONObject jsonObject = getJsonObject();
		if (jsonObject == null) {
			System.out.println("처리 할 데이터가 없습니다.");
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
		// 리스트를 가져온다 -> 리스트에 dto의 값을 추가한다. -> 다시 저장한다.
		// JSONObject jsonObject = getJsonObject();
		File file = new File(pathname);
		if (!file.exists()) {
			JSONObject newObj = new JSONObject();
			newObj.put("no", 1);
			newObj.put("name", dto.getName());
			newObj.put("email", dto.getEmail());
			newObj.put("phonel", dto.getPhone());
			JSONArray newArray = new JSONArray();
			newArray.put(newObj);
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("seq", 2);
			jsonObject.put("studentArr", newArray);

			try {
				writer = new FileWriter(file);
				writer.write(newObj.toString(2));
				JOptionPane.showMessageDialog(null, "입력 성공.");
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
			System.out.println("처리 할 데이터가 없습니다.");
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
			JOptionPane.showMessageDialog(null, "입력 성공.");
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

	public void remove(int temp, boolean check) {
		JSONObject jsonObject = getJsonObject();
		if (jsonObject == null) {
			System.out.println("처리 할 데이터가 없습니다.");
			return;
		}

		JSONArray jsonArray = jsonObject.getJSONArray("studentArr");
		Vector<Vector> vector = new Vector<>();
		if (check) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject obj = jsonArray.getJSONObject(i);
				int objTempNo = obj.getInt("no");
				if (objTempNo == temp) {
					jsonArray.remove(i);
					System.out.println("삭제 완료");
				}
			}
		} else {
			jsonArray.remove(temp);
			System.out.println("삭제 완료");
		}
		File file = new File(pathname);
		int seq = jsonObject.getInt("seq");
		JSONObject newObj = new JSONObject();
		newObj.put("studentArr", jsonArray);
		newObj.put("seq", seq);

		try {
			writer = new FileWriter(file);
			writer.write(newObj.toString(2));
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

	public void remove(int selectedRow, int rowCount) {
		JSONObject jsonObject = getJsonObject();
		if (jsonObject == null) {
			System.out.println("처리 할 데이터가 없습니다.");
			return;
		}

		JSONArray jsonArray = jsonObject.getJSONArray("studentArr");
		Vector<Vector> vector = new Vector<>();

		while(rowCount>0)
		{
			jsonArray.remove(selectedRow);
			rowCount--;
		}

		File file = new File(pathname);
		int seq = jsonObject.getInt("seq");
		JSONObject newObj = new JSONObject();
		newObj.put("studentArr", jsonArray);
		newObj.put("seq", seq);

		try {
			writer = new FileWriter(file);
			writer.write(newObj.toString(2));
			JOptionPane.showMessageDialog(null, "삭제 성공.");
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

}
