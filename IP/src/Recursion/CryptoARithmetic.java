package Recursion;

import java.util.HashMap;
import java.util.HashSet;

public class CryptoARithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "SEND";
		String b = "MORE";
		String c = "MONEY";

		HashMap<Character, Integer> map = new HashMap<>();
		HashSet<Integer> avail = new HashSet<>();

		for (int i = 0; i <= 9; i++) {
			avail.add(i);

		}
		int i1 = a.length() - 1;
		int i2 = b.length() - 1;
		int i3 = c.length() - 1;

		solve(a, b, c, i1, i2, i3, map, avail, 0);
	}

	public static void solve(String a, String b, String c, int i1, int i2, int i3, HashMap<Character, Integer> map,
			HashSet<Integer> avail, int carry) {

		int nc = 0;

		boolean flag1 = false;
		boolean flag2 = false;
		boolean[] arr = new boolean[3];
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sumf = 0;

		if (i1 < 0 && i2 >= 0) {

		}
		if (i1 >= 0 && i2 < 0) {

		}

		if (i1 < 0 && i2 < 0 && i3 >= 0) {

			char ch = c.charAt(i3);
			if (map.containsKey(ch)) {
				if (carry == map.get(ch)) {

					int x = value(a, map);
					int y = value(b, map);
					int z = value(c, map);
					if (x + y == z) {
						System.out.println(map);
					}

				}
			}
			return;
		}

		for (int i = 0; i < 10; i++) {

			char ch = a.charAt(i1);
			if (map.containsKey(ch)) {
				sum1 = map.get(ch);
				flag1 = true;

			} else {
				if (avail.contains(i)) {
					sum1 = i;
					flag1 = true;
					map.put(ch, sum1);
					arr[0] = true;
					avail.remove(sum1);
				}
			}

			for (int j = 0; j < 10 && flag1 == true; j++) {

				char ch1 = b.charAt(i2);
				if (map.containsKey(ch1)) {
					sum2 = map.get(ch1);
					flag2 = true;

				} else {
					if (avail.contains(j)) {
						sum2 = j;
						arr[1] = true;

						flag2 = true;
						map.put(ch1, sum2);
						avail.remove(sum2);

					}

				}

				if (flag2 == true && flag1 == true) {

					sumf = sum1 + sum2 + carry;
					if (sumf >= 10) {
						int temp = sumf;
						sumf %= 10;
						nc = temp / 10;
					}

					char ch3 = c.charAt(i3);
					if (map.containsKey(ch3)) {

						sum3 = map.get(ch3);

						if (sumf != sum3) {

						} else {

							solve(a, b, c, i1 - 1, i2 - 1, i3 - 1, map, avail, nc);

						}
					} else {

						if (avail.contains(sumf) == false) {

						} else {

							map.put(ch3, sumf);
							arr[2] = true;
							avail.remove(sumf);

							solve(a, b, c, i1 - 1, i2 - 1, i3 - 1, map, avail, carry);
							if (arr[2] == true) {
								map.remove(ch3);
								avail.add(sumf);
							}

						}
					}

				}

				if (arr[1] == true) {
					map.remove(ch1);
					avail.add(sum2);
					flag2 = false;

				}

			}
			if (arr[0] == true) {
				map.remove(ch);
				avail.add(sum1);
				flag1 = false;
			}
		}
	}

	public static int value(String a, HashMap<Character, Integer> map) {
		String temp = "";
		int no = 0;

		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if (map.get(ch) != null)
				no = map.get(ch);
			temp += no;

		}

		return Integer.parseInt(temp, 10);
	}

}
