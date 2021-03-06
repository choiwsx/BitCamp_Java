package org.wonseok.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Vector;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Dao {

	FileReader reader = null;
	FileWriter writer = null;
	String filepath="src/org/wonseok/resource/data.json";
	
	
	public Dao() {
		// TODO Auto-generated constructor stub
	}
	
	
	private JSONObject getJsonObject()
	{
		try {
			File file = new File(filepath);
			reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(reader);
		JSONObject jsonObject = new JSONObject(tokener);
		
		
		
		return jsonObject;
	}
	

	public Vector<Vector> selectAll() {
		// TODO Auto-generated method stub
		Vector<Vector> vector = new Vector<>();
		
		JSONObject rootObject = getJsonObject();
		JSONArray array = rootObject.getJSONArray("members");
		for(int i=0; i<array.length(); i++)
		{
			JSONObject obj = (JSONObject)array.getJSONObject(i);
			Vector v = new Vector<>();
			v.add(obj.getInt("no"));
			v.add(obj.get("name"));
			v.add(obj.get("email"));
			v.add(obj.get("phone"));
			vector.add(v);			
		}
		
		return vector;
	}

}
