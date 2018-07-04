package C10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GroupWordsofSameSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		String[] arr = new String[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.next();
		}

		String[] sortedString = new String[soa];
		HashMap<String, ArrayList<String>> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int[] fmap = new int[26];

			String word = arr[i];
			for (int i1 = 0; i1 < word.length(); i1++) {
				char ch = word.charAt(i1);
				fmap[ch - 'a']++;

			}
			String ui = "";

			for (int i1 = 0; i1 < 26; i1++) {
				// while (fmap[i1] != 0) {
				if (fmap[i1] != 0) {
					char temp = (char) ('a' + i1);
					ui = ui + temp;
				}

				// fmap[i1]--;
				// }

			}
			sortedString[i] = ui;
			if (map.containsKey(ui)) {
				ArrayList<String> temp = map.get(ui);
				temp.add(word);
				map.put(ui, temp);
			} else {
				ArrayList<String> temp = new ArrayList<>();
				temp.add(word);
				map.put(ui, temp);
			}

		}

		for (String a : sortedString) {
			if (map.containsKey(a)) {
				ArrayList<String> SameWords = map.get(a);

				for (String x : SameWords) {
					System.out.print(x + " ");
				}
				map.remove(a);
				System.out.println();

			}
		}

	}

}
