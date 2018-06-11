package Recursion;

import java.util.Scanner;

public class PartitionKsubsetWithEqualSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();

		
		//only works if k==2;
//		int sum = 0;
//
//		for (int i = 0; i < soa; i++) {
//			sum += arr[i];
//
//		}
//		if(sum%k==0)
//			System.out.println("Yes");
//		else
//			System.out.println("No");

	}
	
}
