package C12June25;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class CountOfAllAnagramsSubStringPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();

		StringBuilder sb = new StringBuilder();
		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < inp.length(); i++) {
			for (int j = i; j < inp.length(); j++) {

				sb.append(inp.charAt(j));
				if (sb.length() > 1) {
					String key = sortedstring(sb);
					if (map.containsKey(key)) {
						map.put(key, map.get(key) + 1);
					} else
						map.put(key, 0);

				} else {
					String key = sb.toString();
					if (map.containsKey(key)) {
						map.put(key, map.get(key) + 1);
					} else
						map.put(key, 0);

				}

			}
			sb = new StringBuilder();
		}
		
	ArrayList<String> keys= new ArrayList<>(map.keySet());
	int count=0;
	for(int i=0;i<keys.size();i++){
		count+=map.get(keys.get(i));
		
	}
	System.out.println(count);

	}

	public static String sortedstring(StringBuilder sb) {

		int[] arr = new int[26];
		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			arr[ch - 'a']++;
		}
		String ans = "";
		for (int i = 0; i < 26; i++) {
			while (arr[i] != 0) {
				ans += ('a' + i);
				arr[i]--;
			}

		}
		return ans;
	}

}
