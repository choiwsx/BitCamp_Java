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
			System.out.println("저장된 사람이 한명도 없습니다.");
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
		if (!flag && map.size() > 0) {
			System.out.println("존재하지 않는 이름입니다.");
		}
		return tmpmap;
	}

	public HashMap<Integer, Dto> searchScore(int searchNum, Dto dto) {
		boolean flag = false;
		HashMap<Integer, Dto> tmpmap = new HashMap<>();
		for (Map.Entry<Integer, Dto> elem : map.entrySet()) {
			int key = elem.getKey();
			Dto value = elem.getValue();
			switch (searchNum) {
			case 2:
				if (value.getKorean() >= dto.getKorean()) {
					flag = true;
					tmpmap.put(key, value);
				}
				break;
			case 3:
				if (value.getEnglish() >= dto.getEnglish()) {
					flag = true;
					tmpmap.put(key, value);
				}
				break;
			case 4:
				if (value.getMath() >= dto.getMath()) {
					flag = true;
					tmpmap.put(key, value);
				}
				break;
			case 5:
				if (value.InitAvg() >= dto.getAvg()) {
					flag = true;
					tmpmap.put(key, value);
				}
				break;
			}
		}
		if (!flag && map.size() > 0) {
			System.out.println("해당조건에 존재하는 사람이 없습니다.");
		}
		return tmpmap;
	}

	public void delete(HashMap<Integer, Dto> map2, int keynumber) {
		boolean flag = false;
		if (map.containsKey(keynumber)) {
			for (Map.Entry<Integer, Dto> elem : map2.entrySet()) {
				int key = elem.getKey();
				if (key == keynumber) {
					map.remove(keynumber);
					flag = true;
				}
			}
		}
		if (flag) {
			System.out.println("삭제 완료");
		} else {
			System.out.println("해당 키 값이 없습니다, 삭제 실패.");
		}
	}

	public void update(HashMap<Integer, Dto> map2, Dto dto, int keynumber) {
		boolean flag = false;
		for (Map.Entry<Integer, Dto> elem : map2.entrySet()) {
			int key = elem.getKey();
			if (key == keynumber) {
				map.put(key, dto);
				flag = true;
			}
		}
		if (flag) {
			System.out.println("수정 완료");
		}
	}

	public void Raking() {
		
		if(map.size()==0)
		{
			System.out.println("저장된 사람이 없습니다.");
			return;
		}
		
		int cnt = 1;
		double max = 0;
		HashMap<Integer, Dto> tmpmap1 = new HashMap<>();
		HashMap<Integer, Dto> tmpmap2 = new HashMap<>();
		for (Map.Entry<Integer, Dto> elem : map.entrySet()) {
			int key = elem.getKey();
			Dto value = elem.getValue();
			double tmpAvg = value.InitAvg();
			tmpmap1.put(key, value);
			if (max <= tmpAvg) {
				max = tmpAvg;
			}
		}

		while (map.size() > cnt-1) {

			for (Map.Entry<Integer, Dto> elem : tmpmap1.entrySet()) {
				int key = elem.getKey();
				Dto value = elem.getValue();
				double tmpAvg = value.InitAvg();
				if (max == tmpAvg) {
					tmpmap2.put(cnt, value);
					tmpmap1.remove(key);
					cnt++;
					break;
				}
			}
			max = 0;

			for (Map.Entry<Integer, Dto> elem : tmpmap1.entrySet()) {
				Dto value = elem.getValue();
				double tmpAvg = value.InitAvg();
				if (max <= tmpAvg) {
					max = tmpAvg;
				}
			}
		}

		for (Map.Entry<Integer, Dto> elem : tmpmap2.entrySet()) {
			int key = elem.getKey();
			Dto value = elem.getValue();
			System.out.println(key+"등 " + " : " + value.toString());
		}

	}

}
