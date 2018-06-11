package assingmentRecursion;

import java.util.Scanner;

public class BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		StringBuilder sb = new StringBuilder("");
		boolean res = balancedParenthesis(s, sb, 0);
		System.out.println(res);
	}

	public static boolean balancedParenthesis(String s, StringBuilder sb, int idx) {
		if (idx == s.length()) {
			if (sb.length() == 0) {
				return true;
			} else
				return false;
		}
		if (s.charAt(idx) == '(' || s.charAt(idx) == '{' || s.charAt(idx) == '[') {
			char ch = s.charAt(idx);
			sb.append(ch);
			
			return balancedParenthesis(s, sb, idx + 1);
		} else if (s.charAt(idx) == ')' || s.charAt(idx) == '}' || s.charAt(idx) == ']') {
			if(sb.length()==0){
				return false;
			}
			char ch = s.charAt(idx);
			char p = sb.charAt(sb.length()-1);

			if (p == '('&&ch == ')'||p == '{'&&ch == '}'||p == '['&&ch == ']') {
				sb.deleteCharAt(sb.length() - 1);

			}
			
			return balancedParenthesis(s, sb, idx + 1);
		} else {
			return balancedParenthesis(s, sb, idx + 1);

		}

	}

}
