package temp;

import java.util.Scanner;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] a = new int[soa];
		for (int i = 0; i < soa; i++) {
			a[i] = sc.nextInt();

		}

		int sob = sc.nextInt();
		int[] b = new int[sob];
		for (int i = 0; i < sob; i++) {
			b[i] = sc.nextInt();

		}

		int i = 0;
		int j = 0;
		while (i < a.length) {
			j = 0;

			if (a[i] > b[j]) {
				int temp = a[i];
				a[i] = b[j];
				b[j] = temp;
				
				while (j < b.length - 1) {
					if (b[j] > b[j + 1]) {
						int tempb = b[j];
						b[j] = b[j + 1];
						b[j + 1] = tempb;

					}
					j++;

				}
			}
				i++;
			
		}
		for(int i1=0;i1<a.length;i1++){
			System.out.print(a[i1]+" ");
		}
			for(int j1=0;j1<b.length;j1++){
				System.out.print(b[j1]+" ");
		}

	}

}
