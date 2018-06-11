package May31;

import java.util.HashMap;

public class FindNoOFTimesStringOccurASSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ques = "GeeksForGeeks";
		String patt = "Gks";

		int arr[] = new int[patt.length()];

		for (int i = ques.length() - 1; i >= 0; i--) {

			for (int j = patt.length() - 1; j >= 0; j--) {
				char x = ques.charAt(i);
				char y = patt.charAt(j);

				if (x == y && j == patt.length() - 1) {
					arr[j]++;

				}
				else if (x == y ) {
					arr[j]+=arr[j+1];

				}

			}

		}
		System.out.println(arr[0]);

	}

}
