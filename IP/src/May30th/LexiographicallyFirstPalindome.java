package May30th;

public class LexiographicallyFirstPalindome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "apple";

		int[] arr = new int[26];

		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			arr[ch - 'a']++;
		}

		boolean oddfound = false;
		for (int i = 0; i < 26; i++) {
			if (a.length() % 2 == 1) {
				if (arr[i] % 2 == 1 && oddfound == false)
					oddfound = true;
				else if (arr[i] % 2 == 1 && oddfound == true) {
					System.out.println("No Palindromic Substring");
					return;
				}
			} else {
				if (arr[i] % 2 == 1) {
					System.out.println("No Palindromic Substring");
					return;

				}
			}

		}
		char[] ans = new char[a.length()];
		char oddchar = '1';
		int s = 0;
		int e = a.length() - 1;
		for (int i = 0; i < 26; i++) {
			if (arr[i] != 0) {
				if (arr[i] % 2 == 1) {
					oddchar = (char) ('a' + i);
					arr[i]--;
				}
				while (arr[i] > 0) {
					char x = (char) ('a' + i);
					ans[s] = x;
					ans[e] = x;
					arr[i] -= 2;
					s++;
					e--;

				}

			}
		}
		if (a.length() % 2 == 1) {
			ans[a.length() / 2] = oddchar;
		}
		String fans = "";

		for (int i = 0; i < ans.length; i++) {
			fans += ans[i];

		}

		System.out.println(fans);

	}

}
