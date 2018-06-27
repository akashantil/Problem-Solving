package C04July16;

import java.util.Scanner;

public class NCRCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		int r = sc.nextInt();
		boolean[] placed = new boolean[soa];

		solve(arr,  -1, 0, r, placed);

	}

	public static void solve(int[] arr,  int lpi, int count, int r, boolean[] placed) {

		if (count == r) {
			for (int i = 0; i < arr.length; i++) {
				if (placed[i] == true)
					System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = lpi + 1; i < arr.length; i++) {
			placed[i] = true;

			solve(arr,  i, count + 1, r, placed);
			placed[i] = false;

		}

	}

}
