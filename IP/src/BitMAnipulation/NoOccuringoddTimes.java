package BitMAnipulation;

import java.util.Scanner;

public class NoOccuringoddTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for(int i=0;i<soa;i++){
			arr[i]=sc.nextInt();
		}
		int res = 0;

		for (int i = 0; i < arr.length; i++) {
			res ^= arr[i];

		}
		System.out.println(res);

	}

}
