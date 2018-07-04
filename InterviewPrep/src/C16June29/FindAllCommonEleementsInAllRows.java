package C16June29;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FindAllCommonEleementsInAllRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];

		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				arr[i][j] = sc.nextInt();

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < col; i++) {
			map.put(arr[0][i], map.containsKey(arr[0][i]) ? 1 : 1);
		}
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {
				
				if (map.containsKey(arr[i][j])==true) {
					int count = map.get(arr[i][j]);
					if (map.get(arr[i][j]) == i) {
						map.put(arr[i][j], count+1);
					}
				}
			}
		}
		ArrayList<Integer> keys = new ArrayList<>(map.keySet());
		for (int x : keys) {
			if (map.get(x) == row)
				System.out.print(x + " ");
		}

	}

}
