package C12June25;

import java.util.Scanner;

public class LargestWordinDictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nos = sc.nextInt();
		
		String[] arr = new String[nos];
		for (int i = 0; i < nos; i++) {
			arr[i] = sc.next();

		}

		String patt = sc.next();

		int maxlen = 0;

		int[] pmap = new int[26];

		for (int i = 0; i < patt.length(); i++) {
			char ch = patt.charAt(i);
			pmap[ch - 'a']++;

		}
		String ans = "";
		int[] dmap = new int[26];

		for (int i = 0; i < nos; i++) {
			String temp = arr[i];

			for (int j = 0; j < temp.length(); j++) {
				char ch = temp.charAt(j);
				dmap[ch - 'a']++;
			}
			boolean found = true;
			for (int j = 0; j < 26; j++) {
				if (dmap[j] == 0)
					continue;
				else if (dmap[j] == pmap[j])
					continue;
				else if (pmap[j] == 0 && dmap[j] != 0) {
					found = false;
					break;
				}
			}
			if (found == true && temp.length() > ans.length()) {
				ans = temp;
			}
		}
		
		System.out.println(ans);

	}

}
