package C11;

import java.util.Scanner;

public class CountSetBits1ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int not =sc.nextInt();
		for(int i=0;i<not;i++){
		int no = sc.nextInt();
		System.out.println(setbits(no));
		}

	}

	public static int nod(int no) {

		int count = 0;
		while (no > 0) {
			count++;
			no /= 2;
		}
		return count;
	}

	public static int setbits(int no) {

		int digits = nod(no);
		no++;
		int bs = 2;
		int oc = 1;
		int sbc = 0;
		for (int i = 0; i < digits; i++) {

			int nob = no / bs;
			sbc = sbc + (nob * oc);
			int rem = no % bs;
			if(rem-oc >0)
				sbc = sbc +(rem-oc);

			bs *= 2;
			oc *= 2;
		}
		return sbc;

	}

}
