package C2July12;

import java.util.Scanner;

public class KSmallestPAirs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int soaa = sc.nextInt();
		int[] arra = new int[soaa];
		for (int i = 0; i < soaa; i++)
			arra[i] = sc.nextInt();
		int soab = sc.nextInt();
		int[] arrb = new int[soab];
		for (int i = 0; i < soab; i++)
			arrb[i] = sc.nextInt();

		int k = sc.nextInt();

		int[] index = new int[Math.min(soaa, soab)];

		System.out.print("(" + arra[0] + " " + arrb[0] + ") ");
		k--;
		index[0] = 1;

		int minidx = 0;
		while (k > 0) {
			int minsum = Integer.MAX_VALUE;
			for (int i = 0; i < index.length; i++) {
				if (minsum > arra[i] + arrb[index[i]]) {
					minsum = arra[i] + arrb[index[i]];
					minidx = i;
				}

			}

			System.out.print("(" + arra[minidx] + " " + arrb[index[minidx]] + ") ");
			index[minidx]++;
			k--;

		}

	}

}
