package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AnagramPermutationSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		String pat = sc.next();
		

		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> smap = new HashMap<>();

		for (int i = 0; i < pat.length(); i++) {
			char x = pat.charAt(i);
			if (map.containsKey(x) == true) {
				map.put(x, map.get(x) + 1);
			} else {
				map.put(x, 1);
			}
		}
		int start = 0;
		int end = 0;

		while (end < text.length()) {

			char x = text.charAt(end);
			if (map.containsKey(x) == false) {
				start = end + 1;
				end = start;
				// reset map here
				reset(smap);

			} else {
				if (smap.containsKey(x) == true) {
					smap.put(x, smap.get(x) + 1);
					end++;
				} else {
					smap.put(x, 1);
					end++;
				}

				if (smap.get(x) > map.get(x)) {
					
					while( start<end &&start<text.length() && smap.get(x)!=map.get(x)){
					char ch = text.charAt(start);
					smap.put(ch, smap.get(ch) - 1);
					if(smap.get(ch)==0){
						smap.remove(ch);
					}
					start++;
					}
					

					

				}
				if (checkEqual(smap, map) == true) {
					System.out.print("Found At index -> " + start);

					char ch = text.charAt(start);
					smap.put(ch, smap.get(ch) - 1);
					start++;

				}

			}

		}

	}

	public static void reset(HashMap<Character, Integer> smap) {

		ArrayList<Character> ab = new ArrayList<>(smap.keySet());

		for (int i = 0; i < ab.size(); i++) {
			smap.remove(ab.get(i));
		}

	}

	public static boolean checkEqual(HashMap<Character, Integer> smap, HashMap<Character, Integer> map) {

		ArrayList<Character> list = new ArrayList<>(map.keySet());

		if (smap.size() != map.size())
			return false;

		for (int i = 0; i < list.size(); i++) {
			char ch = list.get(i);
			if (smap.get(ch) == map.get(ch))
				continue;
			else
				return false;
		}
		return true;

	}

}
