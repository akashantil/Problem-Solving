package REvision;

import java.util.HashMap;
import java.util.HashSet;

public class Cryptarithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "SEND";
		String b = "MORE";
		String c = "MONEY";

		HashMap<Character, Integer> map = new HashMap<>();
		HashSet<Integer> availaible = new HashSet<>();
		

		for (int i = 0; i < 10; i++)
			availaible.add(i);

		solve(availaible, map, 0, a, b, c, a.length() - 1, b.length() - 1, c.length() - 1);

		

	}

	public static void solve(HashSet<Integer> availaibe, HashMap<Character, Integer> map, int carry, String a, String b,
			String c, int ia, int ib, int ic) {

		if (ia < 0 && ib < 0 && ic >= 0) {
			if (map.containsKey(c.charAt(ic))) {
				if (carry == map.get(c.charAt(ic))) {
					

					System.out.println(map);

				}
			} else {
				if (availaibe.contains(carry)) {

					map.put(c.charAt(ic), carry);
					System.out.println(map);
					
				}

			}
			return;
		}
		char ca = a.charAt(ia);
		char cb = b.charAt(ib);
		char cc = c.charAt(ic);

		boolean[] changed = new boolean[4];
		int oc = carry;

		int soa = 0;
		int sob = 0;
		int soc = 0;

		int sum = 0;

		for (int i = 0; i < 10; i++) {

			if (map.containsKey(ca)) {
				soa = map.get(ca);

			} else {
				if (availaibe.contains(i)) {

					changed[0] = true;
					soa = i;
					availaibe.remove(i);
					map.put(ca, soa);
				} else
					continue;
			}

			for (int j = 0; j < 10; j++) {
				if (map.containsKey(cb)) {
					sob = map.get(cb);

				} else {
					if (availaibe.contains(j)) {
						changed[1] = true;
						sob = j;

						availaibe.remove(j);
						map.put(cb, sob);
					} else
						continue;
				}

				int temp = soa + sob + carry;
				sum = temp % 10;
				carry = temp / 10;

				if (map.containsKey(cc)) {
					soc = map.get(cc);
					if (sum == soc)
						solve(availaibe, map, carry, a, b, c, ia - 1, ib - 1, ic - 1);

				} else {

					if (availaibe.contains(sum)) {
						map.put(cc, sum);
						changed[2] = true;
						availaibe.remove(sum);
						solve(availaibe, map, carry, a, b, c, ia - 1, ib - 1, ic - 1);
					}

				}
				carry = oc;
				if (changed[2] == true) {
					availaibe.add(sum);
					map.remove(cc);
				}

				if (changed[1] == true) {
					availaibe.add(sob);
					map.remove(cb);
				}

			}

			if (changed[0] == true) {
				availaibe.add(soa);
				map.remove(ca);
			}

		}

	}

}
