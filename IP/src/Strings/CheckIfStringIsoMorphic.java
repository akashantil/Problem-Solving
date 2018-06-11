package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class CheckIfStringIsoMorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();

		if (str1.length() != str2.length())
			System.out.println("FAlse");

		HashMap<Character, Character> map1 = new HashMap<>();
		HashMap<Character, Character> map2 = new HashMap<>();

		for (int i = 0; i < str1.length(); i++) {
			char x = str1.charAt(i);
			char y = str2.charAt(i);
			if (map1.containsKey(x) == false) {
				if (map2.containsKey(y) == true) {
					System.out.println(false);	
					return;
				} else {
					map1.put(x, y);
					map2.put(y, x);
				}

			} else {
				if (map2.containsKey(y) == false) {
					System.out.println("false");
					return;
				}
			}

		}
		System.out.println("YES");

	}

}
