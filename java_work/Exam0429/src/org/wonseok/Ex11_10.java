package org.wonseok;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex11_10 {
	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		int[][] board = new int[5][5];
		for (int i = 0; set.size() < 25; i++) {
			set.add((int) (Math.random() * 30) + 1 + "");
		}
		Iterator it = set.iterator();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String) it.next());
				System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
//				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	
	//HashSet은 저장된 순서를 보장하지 않고 자체적인 저장방식에 따라 순서가 결정되기 때문에
	//비슷한 위치에 숫자가 나온다, HashSet 에서 LinkedHashSet으로 변경한다.
}
