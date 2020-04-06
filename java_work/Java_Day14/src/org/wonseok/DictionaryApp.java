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
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));

	}
}
