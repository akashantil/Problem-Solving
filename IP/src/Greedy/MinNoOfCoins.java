package Greedy;

import java.util.Scanner;

public class MinNoOfCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa= sc.nextInt();
		

		int[] arr = new int[soa];
		int amt=sc.nextInt();
		for(int i=0;i<soa;i++){
			arr[i]=sc.nextInt();
		}

		int noc = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] <= amt) {
				noc += amt / arr[i];

				amt = amt - ((amt / arr[i]) * arr[i]);

			}

		}
		System.out.println(noc);

	}

}
