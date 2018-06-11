package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinSumOfAbsDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr1 = new int[soa];

		for (int i = 0; i < soa; i++)
			arr1[i] = sc.nextInt();
		int soa2=sc.nextInt();

		int[] arr2 = new int[soa2];

		for (int i = 0; i < soa2; i++)
			arr2[i] = sc.nextInt();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int minsf=0;
		
		for (int i = 0; i < soa; i++){
			minsf+=Math.abs(arr1[i]-arr2[i]);
		}
		System.out.println(minsf);

	}

}
