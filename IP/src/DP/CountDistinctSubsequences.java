package DP;

import java.util.HashMap;
import java.util.Scanner;

public class CountDistinctSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ques = sc.nextLine();

		int[] arr = new int[ques.length() ];

		HashMap<Character, Integer> map = new HashMap<>();

		arr[0] = 2;
		map.put(ques.charAt(0), 0);

		for (int i = 1; i < ques.length(); i++) {
			char x = ques.charAt(i);
			if (map.containsKey(x) == false) {
				arr[i] = 2 * arr[i - 1];
				map.put(x, i);
			} else {
				int idx = map.get(x);
				if (idx != 0) {
					arr[i] = 2 * arr[i - 1] - arr[idx - 1];
				}
				else
					arr[i] = 2 * arr[i - 1] - 1;
					
				map.put(x,i);
			}

		}
		System.out.println(arr[ques.length()-1]);

	}

}
