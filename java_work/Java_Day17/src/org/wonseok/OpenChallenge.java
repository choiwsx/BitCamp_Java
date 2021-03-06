package org.wonseok;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class OpenChallenge {
	public void play() {

	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new FileReader("words.txt"));
		Scanner scan2 = new Scanner(System.in);
		Vector<String> wordVector = new Vector<String>();
		while (scan.hasNext()) {
			String word = scan.nextLine();
			wordVector.add(word);
		}
		System.out.println("지금부터 행맨 게임을 시작합니다.");
		while (true) {
			Random rand = new Random();
			int idx = rand.nextInt(wordVector.size());

			// 랜덤 단어 고르기
			String tmp = wordVector.get(idx);

			// 2자리 랜덤 구하기.
			int tmp1 = rand.nextInt(tmp.length());
			int tmp2;
			while (true) {
				tmp2 = rand.nextInt(tmp.length());
				if (tmp1 != tmp2)
					break;
			}

			HashMap<Integer, Character> map = new HashMap<>();
			map.put(tmp1, tmp.charAt(tmp1));
			map.put(tmp2, tmp.charAt(tmp2));
			int cnt = 0;
			while (map.size() > 0) {
				for (int i = 0; i < tmp.length(); i++) {
					if (map.containsKey(i)) {
						System.out.print('-');
					} else {
						System.out.print(tmp.charAt(i));
					}
				}
				System.out.println();
				System.out.print(">>");
				char ans = scan2.next().charAt(0);
				Iterator<Integer> keys = map.keySet().iterator();
				Vector<Integer> vv = new Vector<>();
				while (keys.hasNext()) {
					int k = keys.next();
					if (map.get(k).equals(ans)) {
						vv.add(k);
					}
				}
				for (int i : vv) {
					map.remove(i);
				}
				cnt++;
				if (cnt == 5) {
					System.out.println("5번 실패하였습니다.");
					for (int j = 0; j < tmp.length(); j++) {
						System.out.print(tmp.charAt(j));
					}
					break;
				}
				if (map.size() == 0) {
					for (int j = 0; j < tmp.length(); j++) {
						System.out.print(tmp.charAt(j));
					}
					break;
				}
			}
			System.out.println();
			System.out.print("Next(y/n)?");
			char end = scan2.next().charAt(0);
			if (end == 'y')
				continue;
			else
				break;
		}

	}
}
