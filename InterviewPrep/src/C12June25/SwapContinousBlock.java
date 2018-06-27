package C12June25;

import java.util.Scanner;

public class SwapContinousBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();

		boolean zero = false;
		int czc = 0;
		int coc = 0;
		if (inp.charAt(0) == '0') {
			zero = true;
			czc = 1;
		} else {
			zero = false;
			coc = 1;
		}

		for (int i = 1; i < inp.length(); i++) {
			if (zero == false && inp.charAt(i) == '0') {
				czc++;
				zero = true;

			} else if (zero == false && inp.charAt(i) == '1') {

			} else if (zero == true && inp.charAt(i) == '0') {

			}
			if (zero == true && inp.charAt(i) == '1') {
				coc++;
				zero = false;

			}

		}
		System.out.println(Math.min(czc, coc));

	}

}
