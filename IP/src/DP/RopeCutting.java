package DP;

import java.util.Scanner;

public class RopeCutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// cut rope to maximize product
		// look why we need not made call for (f5 *f6)

		Scanner sc = new Scanner(System.in);

		int no = sc.nextInt();
		
		System.out.println(maxproduct(no));

	}

	public static int maxproduct(int no) {

		if (no == 0 || no == 1)
			return 0;
		int maxvalue = Integer.MIN_VALUE;
		for (int j = 1; j < no; j++) {
			
			//search why we didnt make call for maxproduct(j)*maxproduct(n-j);
			maxvalue=Math.max(maxvalue, Math.max(j*(no-j), maxproduct(no-j)*j));

		}
		
		return maxvalue;

	}

}
