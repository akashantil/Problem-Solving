package DP;

import java.util.ArrayList;
import java.util.Scanner;

public class MobileNumericKeyPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>[] numpad = new ArrayList[10];

		for (int i = 0; i < 10; i++) {
			numpad[i] = new ArrayList<>();
		}

		numpad[0].add(0);
		numpad[0].add(8);
		numpad[1].add(1);
		numpad[1].add(2);
		numpad[1].add(4);
		numpad[2].add(1);
		numpad[2].add(2);
		numpad[2].add(3);
		numpad[2].add(5);
		numpad[3].add(2);
		numpad[3].add(3);
		numpad[3].add(6);
		numpad[4].add(1);
		numpad[4].add(7);
		numpad[4].add(4);
		numpad[4].add(5);
		numpad[5].add(2);
		numpad[5].add(5);
		numpad[5].add(8);
		numpad[5].add(6);
		numpad[5].add(4);
		numpad[6].add(6);
		numpad[6].add(5);
		numpad[6].add(3);
		numpad[6].add(9);
		numpad[7].add(7);
		numpad[7].add(4);
		numpad[7].add(8);
		numpad[8].add(8);
		numpad[8].add(5);
		numpad[8].add(9);
		numpad[8].add(7);
		numpad[8].add(0);
		numpad[9].add(9);
		numpad[9].add(8);
		numpad[9].add(6);
        
		Scanner sc = new Scanner(System.in);
		int moves = sc.nextInt();

		int[][] arr = new int[10][moves + 1];
		for (int i = 0; i <= 9; i++) {
			arr[i][0] = 0;

			arr[i][1] = 1;
		}

		for (int j = 2; j <= moves; j++) {
			for (int i = 0; i < 10; i++) {

				for (int k = 0; k < numpad[i].size(); k++) {
					int idx = numpad[i].get(k);
					int x = arr[idx][j - 1];
					arr[i][j] += x;

				}

			}
		}
		int ways = 0;
		for (int i = 0; i < 10; i++) {
			ways += arr[i][moves];

		}
		System.out.println(ways);

	}

}
