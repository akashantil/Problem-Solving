package HackerRankAlgo;

import java.util.Scanner;

public class MakingAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1;
		String s2;
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int[] arr = new int[26];
		int[] arr1 = new int[26];
		s1 = sc.nextLine();
		s2 = sc.nextLine();

		for (int i = 0; i < s1.length(); i++) {
			char x = s1.charAt(i);
			arr[x - 'a']++;
		}
		for (int i = 0; i < s2.length(); i++) {
			char x = s2.charAt(i);
			arr1[x - 'a']++;
		}

		for (int i = 0; i < arr.length; i++) {
			count += Math.abs((arr[i] - arr1[i]));

		}

		System.out.println(count );
	}

}
