package CodingBat;

public class BalancedPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "(((yy))";
		boolean res = nestParen(st);
		System.out.println(res);
	}

	public static boolean nestParen(String str) {
		StringBuilder sb = new StringBuilder("");
		int res = balancedPara(str, sb, 0);
		if (res == -1 || sb.length() != 0) {
			return false;
		} else {
			return true;
		}

	}

	public static int balancedPara(String str, StringBuilder sb, int idx) {
		if (idx == str.length()) {
			return 0;
		}
		char x = str.charAt(idx);
		int rv = 0;
		if (x == '(') {
			sb.append(x);
			rv = balancedPara(str, sb, idx + 1);
		} else if (x == ')') {

			if (sb.length() == 0) {
				return -1;
			} else {
				sb.deleteCharAt(sb.length() - 1);
				rv = balancedPara(str, sb, idx + 1);
			}

		} else {
			rv = balancedPara(str, sb, idx + 1);
		}

		return rv;
	}
}