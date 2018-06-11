package Recursion;

import java.util.Scanner;

public class CombinationalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}
		int target=sc.nextInt();
		
		solve(arr, target, 0, 0, "");
		

	}
	public static void solve(int []arr,int target,int idx,int ssf,String csf){
		
		if(ssf==target){
			System.out.println(csf);
			return;
		}
		if(idx==arr.length){
			return;
		}
		if(ssf>target)
			return;
			
		
		
		
		solve(arr, target, idx, ssf+arr[idx],csf+arr[idx]);
		solve(arr, target, idx+1, ssf, csf);
		
		
		
		
		
	}

}
