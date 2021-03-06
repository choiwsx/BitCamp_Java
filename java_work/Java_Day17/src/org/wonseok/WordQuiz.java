package org.wonseok;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

class Word<K, V> extends Hashtable<K, V> {

	public Word(K key, V value) {
		super.put(key, value);
	}
}

public class WordQuiz {
	Vector<Word> v = new Vector<Word>();
	{
		v.add(new Word("love", "사랑"));
		v.add(new Word("animal", "동물"));
		v.add(new Word("bear", "곰"));
		v.add(new Word("pitcure", "사진"));
		v.add(new Word("society", "사회"));
		v.add(new Word("human", "인간"));
		v.add(new Word("mankind", "인류"));
		v.add(new Word("painting", "그림"));

	}
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();

	public WordQuiz() {
		// TODO Auto-generated constructor stub
		System.out.println("\"명품영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다.");
		int no = 0;
		test:
		while (no != -1) {

			int idx = rand.nextInt(v.size());
			Word word = v.get(idx);
			String eng = (String) (word.keys()).nextElement();

			// 문제 보여주기
			System.out.print(eng + "?");
			Set<String> values = new HashSet<>();
			String kor = (String) word.get(eng);
			values.add(kor);

			while (values.size() < 4) {
				idx = rand.nextInt(v.size());
				word = v.get(idx);
				eng = (String) (word.keys()).nextElement();
				values.add((String) word.get(eng));
			}

			String[] arr = new String[values.size()];
			values.toArray(arr);
			System.out.println();
			for (int i = 0; i < arr.length; i++) {
				System.out.printf("(%d)%s", i + 1, arr[i]);
			}

			do {
				System.out.print(" :>");
				no = scan.nextInt();
				if(no==-1) break test;
			} while (no < 1 || no > arr.length);
			if (kor.equals(arr[no - 1]))
				System.out.println("정답");
			else
				System.out.println("오답");

		}
		System.out.println("명품 영어 조료하.");

	}

	public static void main(String[] args) {
		new WordQuiz();
	}
}
