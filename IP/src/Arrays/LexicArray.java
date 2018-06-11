package Arrays;

import java.util.Scanner;

public class LexicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa=sc.nextInt();
		int [] arr = new int[soa];
		for(int i=0;i<soa;i++)
			arr[i]=sc.nextInt();
		int k = sc.nextInt();
		int sp = 0;
		
		int idx = 0;
		while (k != 0 && sp<arr.length) {
			int msf = Integer.MAX_VALUE;
			for (int i = sp; i <= sp + k && i<arr.length ; i++) {
				if (arr[i] < msf) {
					msf = arr[i];
					idx = i;
				}
			}
			for (int i = idx; i > sp; i--) {
				int temp = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = temp;
				k--;
			}
			sp++;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
