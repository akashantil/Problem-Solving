package HackerRankAlgo;

import java.util.Scanner;

public class pangramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if (x >= 'a' && x <= 'z') {
				arr[x - 'a']++;
			} else if (x >= 'A' && x <= 'Z') {
				arr[x - 'A']++;
			}
		}
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				flag = 0;
				break;

			} else {
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("not pangram");
		} else {
			System.out.println("pangram");
		}
	}

}
