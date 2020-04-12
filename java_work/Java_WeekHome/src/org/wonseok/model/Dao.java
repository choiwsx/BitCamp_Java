package org.wonseok.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class Dao {
	public HashMap<Integer, Dto> map = new HashMap<>();
	public int seq = 0;
	
	
	public void insert(Dto dto)
	{
		map.put(seq++, dto);
		
	}


	public void update(Dto dto,DefaultTableModel tableModel) {
		String[] inputArr = new String[4];
		inputArr[0] = dto.getNum();
		inputArr[1] = dto.getName();
		inputArr[2] = dto.getEmail();
		inputArr[3] = dto.getPhone();
		tableModel.addRow(inputArr);
		
	}


	public void delete(String s, DefaultTableModel tableModel) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		for(Map.Entry<Integer, Dto> elem : map.entrySet())
		{
			Dto tmpDto = elem.getValue();
			String name = tmpDto.getName();
			if(s.equals(name))
			{
//				v.add(elem.getKey());
				System.out.println(elem.getKey());
				tableModel.removeRow(elem.getKey());
			}
		}
		
		
//		for(int i=v.size()-1; i>0; i--)
//		{
//			System.out.println(v.get(i));
//			map.remove(v.get(i));
//			
//		}
	}
	
	
	
	
}
