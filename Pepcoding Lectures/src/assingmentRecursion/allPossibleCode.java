package assingmentRecursion;

import java.util.Scanner;

public class allPossibleCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		allCode(s, "");

	}

	public static void allCode(String ques, String soFar) {
		if (ques.length() == 0) {
			System.out.print(soFar);
			System.out.println();
		}
		if (ques.length() >= 1) {
			String ch0 = ques.substring(0, 1);
			String ros = ques.substring(1);
			int ch0code = Integer.parseInt(ch0);
			char ch01char = (char) ('a' + ch0code - 1);
			allCode(ros, soFar + ch01char);
		}
		if (ques.length() >= 2) {
			String ch0 = ques.substring(0, 2);
			String ros = ques.substring(2);
			int ch0code = Integer.parseInt(ch0);
			if (ch0code <= 26) {
				char ch01char = (char) ('a' + ch0code - 1);
				allCode(ros, soFar + ch01char);
			}
		}

	}

}
