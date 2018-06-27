package C13June26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class NumbersofTimesStringOccursInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		String patt = sc.nextLine();

		int[] arr = new int[patt.length()];

		for (int i = inp.length() - 1; i >= 0; i--) {

			char cs = inp.charAt(i);

			for (int j = 0; j < patt.length(); j++) {
				char cp = patt.charAt(j);
				if (cs == cp) {
					if (j != patt.length() - 1)
						arr[j] += arr[j + 1];
					else
						arr[j]++;

				}

			}

		}
		System.out.println(arr[0]);

	}

}
