package DpAndGreedy.class3;

import java.util.Scanner;

public class SubsequenceOfNatureabc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		int eaa = 0;
		int eab = 0;
		int eac = 0;

		for (int i = 0; i < inp.length(); i++) {
			char ch = inp.charAt(i);

			if (ch == 'a') {
//				if (eaa == 0){
//					eaa++;
//				}
//				else {
					eaa = 2 * eaa + 1;
//				}

			} else if (ch == 'b') {
				
//					if (eab == 0){
//						eab=eaa;
//					}
//					else {
						eab = 2 * eab + eaa;
//					}


			} else {
//				if (eac == 0){
//					eac=eab;
//				}
//				else {
					eac = 2 * eac + eab;
//				}

			}

		}
		System.out.println(eac);

	}

}
