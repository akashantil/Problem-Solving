package assingmentRecursion;

import java.util.Scanner;

public class countaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		int noca = counta(s, 0, 0);
		System.out.println(noca);
		int noa = smartCount(s, 0, 0);
		System.out.println(noa);

	}

	public static int counta(String s, int i, int count) {
		if (i + 2 >= s.length()) {
			return count;
		}
		char x = s.charAt(i);
		char y = s.charAt(i + 1);
		char z = s.charAt(i + 2);
		if (x == y && x == z) {
			count++;
			return counta(s, i + 1, count);
		} else {
			return counta(s, i + 1, count);

		}

	}

	public static int smartCount(String s, int i, int count) {
		if (i + 2 >= s.length()) {
			return count;
		}
		char x = s.charAt(i);
		char y = s.charAt(i + 1);
		char z = s.charAt(i + 2);
		if (x == y && x == z) {
			count++;
			return smartCount(s, i + 3, count);
		} else {
			return smartCount(s, i + 3, count);

		}

	}

}
