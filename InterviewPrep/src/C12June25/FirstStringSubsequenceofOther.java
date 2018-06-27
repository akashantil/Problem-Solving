package C12June25;

import java.util.Scanner;

public class FirstStringSubsequenceofOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();

		int i = 0;
		int j = 0;
		boolean found = false;

		while (i < a.length()) {
			if (j == b.length()) {
				found = true;
				break;
			}
			char cb = b.charAt(j);
			char ca = a.charAt(i);

			if (ca == cb) {
				i++;
				j++;
			} else
				i++;

		}
		System.out.println(found);

	}

}
