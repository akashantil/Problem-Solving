package May30th;

import java.util.HashMap;

public class LongestSubstringWithKUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inp = "aabbccdddddd";
		int k = 3;

		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < k; i++) {
			char x = inp.charAt(i);
			if (map.containsKey(x))
				map.put(x, map.get(x) + 1);
			else
				map.put(x, 1);

		}
		int omax = 0;
		if (map.size() == k)
			omax = k;

		int st = 0;
		int i = k;
		while (i < inp.length()) {

			if (map.size() <= k) {
				char x = inp.charAt(i);

				if (map.containsKey(x))
					map.put(x, map.get(x) + 1);
				else
					map.put(x, 1);

				i++;

			} else {
				char x = inp.charAt(st);
				map.put(x, map.get(x) - 1);
				if (map.get(x) <= 0)
					map.remove(x);

				st++;

			}

			if (map.size() == k) {
				if (i - st  > omax)
					omax = i - st ;
			}

		}

		System.out.println(omax);
	}

}
