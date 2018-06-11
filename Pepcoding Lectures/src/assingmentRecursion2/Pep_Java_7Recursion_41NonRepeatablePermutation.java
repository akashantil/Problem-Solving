package assingmentRecursion2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pep_Java_7Recursion_41NonRepeatablePermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char [] arr = new char[a.length()];
		arr=a.toCharArray();
		Arrays.sort(arr);
		String b= new String (arr);
		
//		permutationQbA(a, "");
//		System.out.println(count);
		

		 ArrayList<String> ab = permutation(a);
		 System.out.println(ab.size());
		 permutationQA(b, "");
		 
		// TODO Auto-generated method stub

	}

	// public static ArrayList<String> permutation(String s) {
	// int[] arr = new int[26];
	//
	// char ch = s.charAt(0);
	// String ros = s.substring(1);
	// arr[ch - 'a']++;
	// ArrayList<String> res = permutation(ros);
	// ArrayList<String> myres = new ArrayList<String>();
	//
	// for (String ab : res) {
	// for (int i = 0; i <= s.length(); i++) {
	// StringBuilder sb = new StringBuilder(ab);
	// sb.insert(i, s.charAt(i));
	// myres.add(sb.toString());
	//
	// }
	//
	// }
	// return myres;
	//
	// }
	static int count = 0;

	public static void permutationQA(String ques, String ans) {
		int[] arr = new int[26];
		if (ques.length() == 0) {
			System.out.println(ans);

			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String bp = ques.substring(0, i);
			String ap = ques.substring(i + 1);
			String roq = bp + ap;

			if (arr[ch - 'a'] == 0) {
				arr[ch - 'a']++;
				permutationQA(roq, ans + ques.charAt(i));
			}
		}

	}

	public static void permutationQbA(String ques, String ans) {
		int[] arr = new int[26];
		if (ques.length() == 0) {
			count++;
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String bp = ques.substring(0, i);
			String ap = ques.substring(i + 1);
			String roq = bp + ap;

			if (arr[ch - 'a'] == 0) {
				arr[ch - 'a']++;
				permutationQA(roq,  ques.charAt(i)+ans);
			}
		}

	}

	public static ArrayList<String> permutation(String ques) {

		if (ques.length() == 0) {
			ArrayList<String> ab = new ArrayList<String>();
			ab.add("");
			return ab;
		}

		int[] arr = new int[26];
		ArrayList<String> myres = new ArrayList<String>();
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String bp = ques.substring(0, i);
			String ap = ques.substring(i + 1);
			String roq = bp + ap;

			if (arr[ch - 'a'] == 0) {
				arr[ch - 'a']++;
				ArrayList<String> res = permutation(roq);

				for (String as : res) {
					myres.add(ch + as);
				}
			}
		}

		return myres;
	}

}
