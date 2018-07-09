package LRJuly18;

import java.util.Arrays;
import java.util.Scanner;

public class NoStringsAttached {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int i = 0; i < not; i++) {
			String inp = sc.next();

			int inv[] = new int[inp.length()];
			int sur[] = new int[inp.length()];

			solve(inv, sur, inp);
			initCost = 0;

		}

	}

	static int initCost = 0;

	private static void solve(int[] inv, int[] sur, String inp) {

		int maxIdx = fillsurparser(inp, sur);
		int invIdx = fillinversion(inp, inv);

		// System.out.println(Arrays.toString(inv));
		//
		// System.out.println(Arrays.toString(sur));

		char msc = inp.charAt(maxIdx);

		int ovcost = initCost;

		char isc = inp.charAt(invIdx);
		for (int i = inp.length() - 1; i > maxIdx; i--) {
			int currCost = 0;
			char ch = inp.charAt(i);
			if (ch > msc) {
				currCost = initCost + Math.abs(ch - msc) - inv[i];
				ovcost = Math.min(currCost, ovcost);

			}

		}
		int lastFactor=initCost +Math.abs(isc-msc)-sur[maxIdx];
		for(int i=maxIdx+1;i<inp.length();i++){
			char ch = inp.charAt(i);
			if(isc<ch){
				lastFactor++;
			}
		}
		ovcost=Math.min(lastFactor, ovcost);
		
		
		System.out.println(ovcost);

		// TODO Auto-generated method stub

	}

	public static int fillsurparser(String s, int[] sur) {
		int maxI = 0;

		for (int i = 0; i < sur.length; i++) {
			char ch1 = s.charAt(i);

			for (int j = i + 1; j < sur.length; j++) {
				char ch2 = s.charAt(j);
				if (ch1 < ch2) {
					sur[i]++;
				}

			}
			initCost += sur[i];
			if (sur[maxI] < sur[i]) {
				maxI = i;
			}
		}
		return maxI;

	}

	public static int fillinversion(String s, int[] inv) {

		int invIdx = inv.length - 1;

		for (int i = inv.length - 1; i >= 0; i--) {
			char ch1 = s.charAt(i);

			for (int j = i - 1; j >= 0; j--) {
				char ch2 = s.charAt(j);
				if (ch1 > ch2) {
					inv[i]++;
				}

			}
			if (inv[invIdx] < inv[i]) {
				invIdx = i;
			}
		}
		return invIdx;

	}
}
