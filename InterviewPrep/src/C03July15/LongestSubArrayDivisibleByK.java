package C3July15;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArrayDivisibleByK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		int k = sc.nextInt();

		int sum[] = new int[soa];
		sum[0] = arr[0];

		for (int i = 1; i < soa; i++)
			sum[i] = sum[i - 1] + arr[i];
		int modsum[] = new int[soa];
		for (int i = 0; i < soa; i++)
			modsum[i] = ((sum[i] % k));

		HashMap<Integer, Integer> map = new HashMap<>();
		int maxlen = -1;
		int si = -1;

		for (int i = 0; i < soa; i++) {
			if (modsum[i] == 0)
				maxlen = i + 1;
			else if (map.containsKey(modsum[i])) {
				if (i - map.get(modsum[i]) > maxlen) {
					maxlen = i - map.get(modsum[i]);
					si = map.get(modsum[i]);
				}
			} else
				map.put(modsum[i], i);

		}
		if (maxlen > 0) {
			si++;
			while (maxlen > 0) {
				System.out.print(arr[si] + " ");
				si++;
				maxlen--;
			}

		}

	}

}
