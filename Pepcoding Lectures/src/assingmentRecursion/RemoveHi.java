package assingmentRecursion;

import java.util.Scanner;

public class RemoveHi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String s;

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("");
		s = sc.next();
		i = sc.nextInt();

		StringBuilder a = removeHi(s, false, sb, 0);
		int count = countHi(s, 0, 0);
		System.out.println(count);
		System.out.println(a.charAt(i));
		System.out.println(a);

	}

	public static int countHi(String s, int count, int idx) {

		if (idx + 1 >= s.length()) {
			return count;
		}
		char x = s.charAt(idx);
		char y = s.charAt(idx + 1);
		if (x == 'h' && y == 'i') {
			count++;
			return countHi(s, count, idx + 1);

		} else {

			return countHi(s, count, idx + 1);

		}

	}

	public static StringBuilder removeHi(String s, boolean c, StringBuilder sb, int idx) {

		if (idx + 1 >= s.length()) {
			if ((s.charAt(s.length() - 2) == 'h' && s.charAt(s.length() - 1) == 'i')) {
				return sb;
			}
			else {
				sb.append(s.charAt(s.length()-1));
				return sb;
			}

			
		}
		char x = s.charAt(idx);
		char y = s.charAt(idx + 1);
		if (x == 'h' && y == 'i') {
			c = true;

			return removeHi(s, c, sb, idx + 1);

		} else if (x == 'i' && c == true) {
			c = false;
			return removeHi(s, c, sb, idx + 1);
		}

		else {
			sb.append(x);
			return removeHi(s, false, sb, idx + 1);

		}

	}

}
