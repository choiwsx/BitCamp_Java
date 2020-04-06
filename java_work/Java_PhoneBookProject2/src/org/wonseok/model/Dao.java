package org.wonseok.model;

import java.util.HashMap;
import java.util.Map;

public class Dao {
	public static final int MAX = 100;
	public int top = 0;
	public int seq = 1;
	public HashMap<Integer, Dto> map = new HashMap<>();

	public void insert(Dto dto) {
		map.put(seq++, dto);
	}

	public void selectAll() {
		if (map.size() == 0) {
			System.out.println("����� ����� �Ѹ��� �����ϴ�.");
			return;
		}
		for (Map.Entry<Integer, Dto> elem : map.entrySet()) {
			int key = elem.getKey();
			Dto value = elem.getValue();
			System.out.println("key=" + key + " : " + value.toString());
		}
	}
	public HashMap<Integer, Dto> search(Dto dto) {
		boolean flag = false;
		HashMap<Integer, Dto> tmpmap = new HashMap<>();
		for (Map.Entry<Integer, Dto> elem : map.entrySet()) {
			int key = elem.getKey();
			Dto value = elem.getValue();
			if (dto.getName().toUpperCase().equals(value.getName().toUpperCase())) {
				flag = true;
				tmpmap.put(key, value);
			}
		}
		if (!flag&&map.size()>0) {
			System.out.println("�������� �ʴ� �̸��Դϴ�.");
		}
		return tmpmap;
	}
	public void delete(HashMap<Integer, Dto> map2, int keynumber) {
		boolean flag = false;
		if (map.containsKey(keynumber)) {
			for (Map.Entry<Integer, Dto> elem : map2.entrySet()) {
				int key = elem.getKey();
				if (key == keynumber) {
					flag = true;
					map.remove(keynumber);
				} else {
					System.out.println("�ش� Ű���� �����ϴ�, ���� ����");
					return;
				}
			}
		}
		if (flag) {
			System.out.println("���� �Ϸ�");
		} else {
			System.out.println("�ش� Ű ���� �����ϴ�, ���� ����.");
		}
	}
	public void update(HashMap<Integer, Dto> map2, Dto dto, int keynumber) {
		boolean flag = false;
		for (Map.Entry<Integer, Dto> elem : map2.entrySet( )) {
			int key = elem.getKey();
			if (key == keynumber) {
				map.put(key, dto);
				flag = true;
			}
		}
		if (flag) {
			System.out.println("���� �Ϸ�");
		}
	}

}