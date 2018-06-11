package DPREVISION;

import java.util.HashMap;

public class CountDistinctSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abcdb";

		HashMap<Character, Integer> map = new HashMap<>();

		map.put(ques.charAt(0), 0);

		int countOfSub = 2;

		for (int i = 1; i < ques.length(); i++) {
			countOfSub *= 2;

			char ch = ques.charAt(i);

			if (map.containsKey(ch) == false) {

				map.put(ch, i);
			} else {
				int idx = map.get(ch);
				if (idx != 0) {
					countOfSub -= 2 * (idx );

				} else
					countOfSub -= 1;

				map.put(ch, i);

			}

		}
		System.out.println(countOfSub);

	}

}
