package DP;

import java.util.HashSet;
import java.util.Scanner;

public class WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = { "mobile", "samsung", "sam", "sung", "man", "mango", "icecream", "and", "go", "i", "like",
				"ice", "cream" };
		
		Scanner sc = new Scanner(System.in);
		String ques = sc.nextLine();
		HashSet<String> dict = new HashSet<>();
		for (int i = 0; i < arr.length; i++)
			dict.add(arr[i]);

		System.out.println(solve(dict, ques));

	}

	public static boolean solve(HashSet<String> dict, String ques) {
		if(ques.length()==0)
			return true;
		

		for (int i = 1; i <= ques.length(); i++) {

			String tn = ques.substring(0, i);
			String rem = ques.substring(i);
			if (dict.contains(tn) &&solve(dict, rem)) {
				return true;

			}

		}

		return false;

	}

}
