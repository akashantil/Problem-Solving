package C13June26;

import java.util.Scanner;

public class FindPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();

		int si = 0;
		int ei = 0;

		boolean onefound = false;
		boolean zerofound = false;
		int css = 0;

		while (ei < inp.length()) {

			char ch = inp.charAt(ei);

			if (zerofound == false && onefound == false && ch == '0')
				continue;
			else if (zerofound == false && onefound == false && ch == '1') {
				onefound = true;
			} else if (zerofound == false && onefound == true && ch == '1') {
				onefound = true;
			} else if (zerofound == false && onefound == false && ch == '0') {
				zerofound = false;
			} else if (zerofound == true && onefound == true && ch == '1') {
				css++;
				si = ei;
				ei--;
				zerofound = false;
				onefound = false;

			} else if (zerofound == false && onefound == true && ch == '0') {
				zerofound = true;
			}

			ei++;

		}
		System.out.println(css);

	}

}
