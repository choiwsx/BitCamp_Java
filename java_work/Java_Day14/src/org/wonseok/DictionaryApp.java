package org.wonseok;

abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];

	abstract String get(String key);

	abstract void put(String key, String value);

	abstract String delete(String key);

	abstract int length();
}

class Dictionary extends PairMap {
	int top = 0;

	public Dictionary(int size) {
		// TODO Auto-generated constructor stub
		keyArray = new String[size];
		valueArray = new String[size];
	}

	@Override
	String get(String key) {
		// TODO Auto-generated method stub
		for (int i = 0; i < top; i++) {
			if (keyArray[i].equals(key)) {
				return valueArray[i];
			}
		}
		return null;
	}

	@Override
	void put(String key, String value) {
		// TODO Auto-generated method stub
		if (top >= keyArray.length) {
			return;
		}
		for (int i = 0; i < top; i++) {
			if (keyArray[i].equals(key)) {
				valueArray[i] = value;
				return;
			}
		}
		
		keyArray[top] = key;
		valueArray[top] = value;
		top++;

	}

	@Override
	String delete(String key) {
		// TODO Auto-generated method stub
		String value = null;
		for (int i = 0; i < top; i++) {
			if (keyArray[i].equals(key)) {
				value =  valueArray[i];
				for(int j=i; j<top-1; j++)
				{
					valueArray[j] = valueArray[j+1];
					keyArray[j] = keyArray[j+1];
				}
				top--;
			}
		}
		
		return value;
	}

	@Override
	int length() {
		// TODO Auto-generated method stub
		return top;
	}

}

public class DictionaryApp {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));

	}
}
