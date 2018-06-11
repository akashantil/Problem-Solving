package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PrintAllAnagramTogether {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		String[] words = new String[soa];
		for (int i = 0; i < soa; i++) {
			words[i] = sc.next();
		}

		HashMap<String, ArrayList<Integer>> map = new HashMap<>();

		for (int i = 0; i < words.length; i++) {
			int[] arr = new int[26];

			for (int j = 0; j < words[i].length(); j++) {
				char x = words[i].charAt(j);
				arr[x - 'a']++;
			}
			String res = "";
			for (int j = 0; j < 26; j++) {

				while (arr[j] != 0) {
					char ch = (char) ( j+'a');
					res += ch;
					arr[j]--;

				}

			}
			if (map.containsKey(res) == true) {
				ArrayList<Integer> ab = map.get(res);
				ab.add(i);
				map.put(res, ab);
			}

			else {
				ArrayList<Integer> ab = new ArrayList<>();
				ab.add(i);
				map.put(res, ab);
			}
		}

		ArrayList<String> mapres = new ArrayList<>(map.keySet());
		for (int i = 0; i < mapres.size(); i++) {
			ArrayList<Integer> resultarraylist = map.get(mapres.get(i));
			if (resultarraylist.size() >= 1) {
				for (int k = 0; k < resultarraylist.size(); k++) {
					System.out.println(words[resultarraylist.get(k)] + "");
				}

			}

		}

	}

}
