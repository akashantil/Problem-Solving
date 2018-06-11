package May30th;

public class LongestNonPalindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab = "aaab";

		if (allsame(ab)) {
			System.out.println(0);

		}

		else if (checkpalindrome(ab)) {
			System.out.println(ab.length() - 1);

		} else
			System.out.println(ab.length());

	}

	public static boolean checkpalindrome(String inp) {

		for (int i = 0, j = inp.length() - 1; i < j; i++, j--) {

			if (inp.charAt(i) != inp.charAt(j))
				return false;
		}
		return true;

	}

	public static boolean allsame(String inp) {

		char ch = inp.charAt(0);

		for (int i = 1; i < inp.length(); i++) {
			if (inp.charAt(i) != ch)
				return false;
		}

		return true;
	}

}
