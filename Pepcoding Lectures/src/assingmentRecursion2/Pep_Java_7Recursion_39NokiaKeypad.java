package assingmentRecursion2;

import java.util.ArrayList;
import java.util.Scanner;

public class Pep_Java_7Recursion_39NokiaKeypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		ArrayList<String> ab = NokiaKeyPad(a);
		System.out.println(ab.size());
		System.out.println(ab);
		keypadQA(a, "");
	}

	static String[] codes = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static ArrayList<String> NokiaKeyPad(String s) {
		if (s.length() == 0) {
			ArrayList<String> resu = new ArrayList<String>();
			resu.add("");
			return resu;
		}

		char ch = s.charAt(0);
		String ros = s.substring(1);

		ArrayList<String> res = NokiaKeyPad(ros);
		ArrayList<String> myres = new ArrayList<String>();

		String word = codes[ch - '0'];
		for (String ab : res) {
			for (int i = 0; i < word.length(); i++) {
				myres.add(word.charAt(i) + ab);
			}
		}
		return myres;

	}

	public static void keypadQA(String que, String ans) {
		if (que.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = que.charAt(0);
		String roq = que.substring(1);

		String ansString = codes[ch - '0'];
		for (int i = 0; i < ansString.length(); i++) {
			
			keypadQA(roq, ans+ansString.charAt(i));

		}

	}
}
