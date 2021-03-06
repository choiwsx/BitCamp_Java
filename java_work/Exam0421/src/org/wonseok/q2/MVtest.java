package org.wonseok.q2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MVtest {

	int bingoCheck(int[][] arr) {
		int cnt = 0;
		boolean colCheck = false;
		boolean rowCheck = false;
		boolean line1 = false; // 오른쪽 아래로 향하는 대각선 체크.
		boolean line2 = false; // 오른쪽 아래로 향하는 대각선 체크.
		boolean square = false;
		// 정사각형 체크
		if (arr.length == arr[0].length)
			square = true;
		for (int i = 0; i < arr.length; i++) {
			colCheck = false;
			rowCheck = false;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0)
					colCheck = true;
				if (arr[j][i] == 0)
					rowCheck = true;
				if (i == j) {
					if (arr[i][j] == 0)
						line1 = true;
				}
				if (i + j == arr[i].length - 1) {
					if (arr[i][j] == 0)
						line2 = true;
				}
			}
			if (!colCheck)
				cnt++;
			if (!rowCheck)
				cnt++;
		}
		if (square) {
			if (!line1)
				cnt++;
			if (!line2)
				cnt++;
		}
		return cnt;
	}

	@Test
	public void test4() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 0 }, { 1, 0, 1, 0, 0 }, { 1, 0, 0, 1, 0 },
				{ 1, 0, 0, 0, 1 }, };

		assertTrue(bingoCheck(arr) == 3);
	}

	@Test
	public void test3() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0 }, };

		assertTrue(bingoCheck(arr) == 2);
	}

	@Test
	public void test2() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 }, };

		assertTrue(bingoCheck(arr) == 1);
	}

	@Test
	public void test() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1 }, };

		assertTrue(bingoCheck(arr) == 12);
	}

}
