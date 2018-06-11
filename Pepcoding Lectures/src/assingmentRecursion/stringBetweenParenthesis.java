package assingmentRecursion;

import java.util.Scanner;

public class stringBetweenParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		
		 betweenPara(s,  false, 0);
		

	}

	public static void betweenPara(String s, boolean para, int idx) {
		if (idx == s.length()) {
			return;

		}

		if (para == false && s.charAt(idx) == '(') {
			System.out.print(s.charAt(idx));

			para = true;
			betweenPara(s, para, idx + 1);
		} else if (para == true && s.charAt(idx) != ')') {
			System.out.print(s.charAt(idx));
			betweenPara(s, para, idx + 1);

		} else if (para == true && s.charAt(idx) == ')') {
			System.out.print(')');
			para = false;
			betweenPara(s, para, idx + 1);
		} else {
			betweenPara(s, para, idx + 1);
		}
	}

}
