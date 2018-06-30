package C15June28;

import java.util.Scanner;

public class RepeatedSubsequenceOfLength2OrMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solve(str));

	}

	public static boolean solve(String str) {

		int[][] arr = new int[str.length() + 1][str.length() + 1];

		for (int i = 0; i < arr.length; i++)
			arr[i][0] = 0;
		for (int i = 0; i < arr[0].length; i++)
			arr[0][i] = 0;

		for (int i = 1; i <= str.length(); i++) {
			char a = str.charAt(i - 1);
			for (int j = 1; j <=str.length() ; j++) {
				char b = str.charAt(j - 1);
				if (a == b && i != j) {
					arr[i][j] = 1 + arr[i - 1][j - 1];
				} else
					arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);

			}
		}
		if (arr[arr.length-1][arr[0].length-1] >= 2)
			return true;
		else
			return false;
	}

}
