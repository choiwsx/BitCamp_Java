package org.wonseok.pt1;

import java.util.ArrayList;

class Person
{
	private String name;
	private String phone;
	
	public Person() {
		
	}

	public Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Person)
		{
			Person p = (Person)obj;
			if(name.equals(p.getName()))
			{
				return true;
			}
			
		}
		return false;
	}
	
	
}


public class Ex02Array {
	
	public static void main(String[] args) {
		ArrayList<Person> pList = new ArrayList<>();
		pList.add(new Person("�ֿ���","010-3123-6789"));
		pList.add(new Person("���γ�","010-1111-1111"));
		pList.add(new Person("������","010-2222-2222"));
		pList.add(new Person("����","010-3333-3333"));
		pList.add(new Person("����","010-4444-4444"));
		

		Person tmp = new Person("������","010-2222-2222");
		System.out.println(tmp.equals(pList.get(2)));
		System.out.println(pList.indexOf(tmp));
		
	}
	
	
	
	
	public static void test(String[] args) {
		// ArrayList �� �迭�� �����ϴ�. ���� �ߺ� ���
		// ��� ������ index�� �Ѵ�.
		ArrayList<String> list = new ArrayList<>();
		list.add("��¡��");
		list.add("��¡��");
		list.add("�öѱ�");
		list.add("��¡��");
		list.add("��¡��");

	
		System.out.println(list.size());
		System.out.println(list);
		list.add(2,"���");
		System.out.println(list);
		
		System.out.println(list.get(4));
		System.out.println(list.indexOf("���"));
		
		list.set(4, "�����");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
	}
}