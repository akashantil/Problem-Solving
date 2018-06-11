import java.util.HashMap;
import java.util.HashSet;

public class CryptoArithmetic {

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

		solve(a, b, c, i1, i2, i3, map, avail, "", "", "", 0);
	}

	public static void solve(String a, String b, String c, int i1, int i2, int i3, HashMap<Character, Integer> map,
			HashSet<Integer> avail, String res1, String res2, String res3, int carry) {

		boolean flag = false;
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
					int a1 = Integer.parseInt(res1,10);
					int b2 = Integer.parseInt(res2,10);
					res3 = map.get(ch) + res3;
					int c3 = Integer.parseInt(res3,10);

					if (a1 + b2 == c3) {
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

			} else {
				sum1 = assign(ch, avail, i);
				map.put(ch, sum1);
				arr[0] = true;
				avail.remove(sum1);
			}

			for (int j = 0; j < 10; j++) {

				char ch1 = b.charAt(i2);
				if (map.containsKey(ch1)) {
					sum2 = map.get(ch1);
					flag = true;

				} else {
					sum2 = assign(ch1, avail, j);
					arr[1] = true;

					if (sum2 != -1) {
						flag = true;
						map.put(ch1, sum2);
						avail.remove(sum2);
					}
				}

				if (flag == true) {

					char ch3 = c.charAt(i3);
					if (map.containsKey(ch3)) {

						sum3 = map.get(ch3);

						sumf = sum1 + sum2 + carry;
						if (sumf >= 10) {
							sumf %= 10;
							carry /= 10;
						}
						if (sumf != sum3) {

							if (arr[1] == true) {
								map.remove(ch1);
								avail.add(sum2);
							}

						} else {
							sumf = sum1 + sum2 + carry;
							if (sumf >= 10) {
								int temp=sumf;
								sumf %= 10;
								carry = temp / 10;
							}

							solve(a, b, c, i1 - 1, i2 - 1, i3 - 1, map, avail, a.charAt(i1) + res1, b.charAt(i2) + res2,
									c.charAt(i3) + res3, carry);

							if (arr[2] == true) {
								map.remove(ch3);
								avail.add(sumf);
							}
							if (arr[1] == true) {
								map.remove(ch1);
								avail.add(sum2);
							}

						}
					} else {

						sumf = sum1 + sum2 + carry;
						if (avail.contains(sumf) == false) {
							if (arr[1] == true) {
								map.remove(ch1);
								avail.add(sum2);
							}
						} else {

							if (sumf >= 10) {
								sumf %= 10;
								carry /= 10;
							}
							map.put(ch3, sumf);
							arr[2] = true;
							avail.remove(sumf);

							solve(a, b, c, i1 - 1, i2 - 1, i3 - 1, map, avail, sum1 + res1, sum2 + res2, sumf + res3,
									carry);
							if (arr[2] == true) {
								map.remove(ch3);
								avail.add(sumf);
							}
							if (arr[1] == true) {
								map.remove(ch1);
								avail.add(sum2);
							}
						}
					}

				}

				if (arr[1] == true) {
					map.remove(ch1);
					avail.add(sum2);

				}

			}
			if (arr[0] == true) {
				map.remove(ch);
				avail.add(sum1);
			}
		}
	}

	public static int assign(char a, HashSet<Integer> avail, int prev) {

		for (int i = prev; i <= 9; i++) {
			if (avail.contains(i))
				return i;
		}

		return -1;

	}

}
