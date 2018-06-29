package hashMap;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map.Entry;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// highestfreqchar("aabrakadabra");

		int[] a = { 1, 1, 2, 3, 2, 2, 3, 5 };
		int[] b = { 1, 1, 1, 3, 2, 2, 4, 5 };

		System.out.println(gce1(a, b));
		System.out.println(gce2(a, b));
		int[] arr = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
		consecutiveSequence(arr);

	}

	public static void highestfreqchar(String inp) {
		HashMap<Character, Integer> map = new HashMap<>();
		// for (int i = 0; i < inp.length(); i++) {
		// char ch = inp.charAt(i);
		// if (map.containsKey(ch)) {
		// map.put(ch, map.get(ch) + 1);
		// } else
		// map.put(ch, 1);
		//
		// }

		for (Character ch : inp.toCharArray()) {
			map.computeIfPresent(ch, (k, v) -> v + 1);
			map.putIfAbsent(ch, 1);
		}
		int freq = 0;
		char res = '0';

		// ArrayList<Character> keys = new ArrayList<>(map.keySet());
		// for(int i=0;i<keys.size();i++){
		// if(map.get(keys.get(i))>freq){
		// freq=map.get(keys.get(i));
		// res=keys.get(i);
		// }
		// }

		for (Entry<Character, Integer> ee : map.entrySet()) {
			if (ee.getValue() > freq) {
				freq = ee.getValue();
				res = ee.getKey();
			}
		}
		System.out.println("Char : " + res + " freq: " + freq);

	}

	public static ArrayList<Integer> gce2(int[] a, int[] b) {
		ArrayList<Integer> al = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int x : a) {
			map.put(x, map.containsKey(x) ? map.get(x) + 1 : 1);

		}
		for (int x : b) {
			if (map.containsKey(x) && map.get(x) > 0) {
				al.add(x);
				map.put(x, map.get(x) - 1);
			}
		}
		return al;

	}

	public static ArrayList<Integer> gce1(int[] a, int[] b) {

		ArrayList<Integer> al = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int x : a) {
			map.put(x, map.containsKey(x) ? map.get(x) + 1 : 1);

		}
		for (int x : b) {
			if (map.containsKey(x) && map.get(x) > 0) {
				al.add(x);
				map.remove(x);
			}
		}
		return al;

	}

	public static void consecutiveSequence(int[] arr) {

		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int a : arr) {
			map.put(a, false);
		}

		ArrayList<Integer> keys = new ArrayList<>(map.keySet());

		for (int a : keys) {

			if (map.containsKey(a + 1) && !map.containsKey(a - 1))
				map.put(a, true);

		}
		// use String Builder as string make new string which
		// isn't good for complexity
		int ovs = 0;
		int oml = 0;

		for (int i = 0; i < keys.size(); i++) {

			int len = 0;

			if (map.get(keys.get(i))) {
				int currs = keys.get(i);

				int a = keys.get(i);

				while (map.containsKey(a)) {

					len++;
					a++;
				}

				if (len > oml) {
					oml = len;
					ovs = currs;
				}

			}
		}

		for (int i = 0; i < oml; i++) {
			System.out.print(ovs + i + " ");
		}

	}

}
