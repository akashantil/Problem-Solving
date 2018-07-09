import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SherlockAndAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();

		for (int i = 0; i < not; i++) {
			HashMap<String, Integer> map = new HashMap<>();

			String inp = sc.next();

			for (int j = 0; j < inp.length(); j++) {

				String x = "";
				for (int k = j; k < inp.length(); k++) {
					char ch = inp.charAt(k);
					x += ch;
					int[] arr = new int[26];

					for (int m = 0; m < x.length(); m++) {
						char b = x.charAt(m);
						arr[b - 'a']++;
					}
					String key = "";
					for (int m = 0; m < 26; m++) {
						while (arr[m] != 0) {
							key = key + (char) ('a' + m);
							arr[m]--;
						}

					}

					map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);

				}

			}
			ArrayList<String> keys = new ArrayList<>(map.keySet());
			int count = 0;

			for (String a : keys) {
				int curr = map.get(a);
				count += (curr * (curr - 1)) / 2;

			}
			System.out.println(count);
		}

	}

}
