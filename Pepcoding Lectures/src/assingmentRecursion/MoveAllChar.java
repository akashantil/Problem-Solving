package assingmentRecursion;

import java.util.Scanner;

public class MoveAllChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String s;
		char c;
		Scanner sc = new Scanner(System.in);

		s = sc.next();
		i = sc.nextInt();
		c = sc.next().charAt(0);

		StringBuilder sb = new StringBuilder("");
		StringBuilder cb = new StringBuilder("");
		moveAll(s, c, 0, sb,cb);
		System.out.println(sb.charAt(i));
		System.out.println(sb);
		

	}

	public static StringBuilder moveAll(String s, char c,  int idx, StringBuilder sb,StringBuilder cb) {
		if (idx == s.length()) {
			return sb.append(cb);

		}
		char x = s.charAt(idx);
		if (x != c) {
			sb.append(s.charAt(idx));
			return moveAll(s, c,  idx + 1, sb,cb);
			
			
		} else {

			cb.append(c);
			return moveAll(s, c,  idx + 1, sb,cb);
			

		}

	}

}
