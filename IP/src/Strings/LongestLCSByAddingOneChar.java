package temp;

public class LongestLCSByAddingOneChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fs = "abab";
		String ss = "abc";

		char[] farr = fs.toCharArray();
		char[] sarr = ss.toCharArray();

		// finding missing characters
		int[] fa = new int[26];
		boolean[] ctba = new boolean[26];
		int[] sa = new int[26];
		for (int i = 0; i < farr.length; i++) {
			char x = farr[i];
			fa[x - 'a']++;
		}
		for (int i = 0; i < sarr.length; i++) {
			char x = sarr[i];
			sa[x - 'a']++;
		}

		for (int i = 0; i < sa.length; i++) {
			if (sa[i] != 0) {
				if (sa[i] > fa[i])
					ctba[i] = true;

			}
		}
		// find lcs
		int[][] prefix = new int[sarr.length][farr.length];

		if (farr[farr.length - 1] == sarr[sarr.length - 1])
			prefix[sarr.length - 1][farr.length - 1] = 1;
		else
			prefix[sarr.length - 1][farr.length - 1] = 0;

		for (int i = farr.length - 2; i >= 0; i--) {
			if (farr[i] == sarr[sarr.length - 1])
				prefix[sarr.length - 1][i] = 1;
			else
				prefix[sarr.length - 1][i] = prefix[sarr.length - 1][i + 1];
		}

		for (int i = sarr.length - 2; i >= 0; i--) {
			if (sarr[i] == farr[farr.length - 1])
				prefix[i][farr.length - 1] = 1;
			else
				prefix[i][farr.length - 1] = 0;

		}

		for (int i = prefix.length - 2; i >= 0; i--) {
			for (int j = prefix[0].length - 2; j >= 0; j--) {
				if (sarr[i] == farr[j]) {
					if (i + 1 < sarr.length && j + 1 < farr.length)
						prefix[i][j] = 1 + prefix[i + 1][j + 1];
					else
						prefix[i][j] = 0;

				} else {
					prefix[i][j] = Math.max(prefix[i + 1][j], prefix[i][j + 1]);

				}

			}
		}
		

		int[][] suffix = new int[sarr.length][farr.length];
		int[] temp1 = new int[farr.length];
		int[] temp2 = new int[sarr.length];
		
		for (int i = 0 , j=farr.length-1; i < temp1.length; i++) {
			temp1[i]=farr[j];
			j--;

		}
		for (int i = 0 , j=sarr.length-1; i < temp2.length; i++) {
			temp2[i]=sarr[j];
			j--;

		}
		
		


		if (temp1[temp1.length - 1] == temp2[temp2.length - 1])
			suffix[temp2.length - 1][temp1.length - 1] = 1;
		else
			suffix[temp2.length - 1][temp1.length - 1] = 0;

		for (int i = temp1.length - 2; i >= 0; i--) {
			if (temp1[i] == temp2[temp2.length - 1])
				suffix[temp2.length - 1][i] = 1;
			else
				suffix[temp2.length - 1][i] = suffix[temp2.length - 1][i + 1];
		}

		for (int i = temp2.length - 2; i >= 0; i--) {
			if (temp2[i] == temp1[temp1.length - 1])
				suffix[i][temp1.length - 1] = 1;
			else
				suffix[i][temp1.length - 1] = 0;

		}

		for (int i = suffix.length - 2; i >= 0; i--) {
			for (int j = suffix[0].length - 2; j >= 0; j--) {
				if (temp2[i] == temp1[j]) {
					if (i + 1 < temp2.length && j + 1 < temp1.length)
						suffix[i][j] = 1 + suffix[i + 1][j + 1];
					else
						suffix[i][j] = 0;

				} else {
					suffix[i][j] = Math.max(suffix[i + 1][j], suffix[i][j + 1]);

				}

			}
		}


	}

}
