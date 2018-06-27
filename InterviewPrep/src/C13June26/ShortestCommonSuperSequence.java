package C13June26;

import java.util.Scanner;

public class ShortestCommonSuperSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int k = 0; k < not; k++) {
			String a = sc.next();
			String b = sc.next();
			String[][] arr = new String[a.length() + 1][b.length() + 1];

			arr[a.length()][b.length()] = "";

			for (int i = 0; i < a.length(); i++) {
				arr[i][b.length()] = a.substring(i);

			}
			for (int i = 0; i < b.length(); i++) {
				arr[a.length()][i] = b.substring(i);
			}

			for (int i = a.length() - 1; i >= 0; i--) {
				char ca = a.charAt(i);
				for (int j = b.length() - 1; j >= 0; j--) {
					char cb = b.charAt(j);
					if (ca == cb) {
						String x = arr[i + 1][j + 1];
						arr[i][j] = ca + x;
					} else {
						String bb = arr[i + 1][j];
						String aa = arr[i][j + 1];
						if (aa.length() < bb.length()) {
							arr[i][j] = cb + aa;
						} else
							arr[i][j] = ca + bb;
					}
				}
			}
			System.out.println(arr[0][0]);

		}
	}

}
