package DP;

import java.util.Scanner;

public class MinJumpsToReachEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		
		
		int [] temp = new int [soa];
		temp[soa-1]=0;
		
		
		
		
		for(int  i= soa-2;i>=0;i--){
		int	mtn=Integer.MAX_VALUE;
			
			for(int j=1;(j+i)<soa && j<=arr[i];j++){
				if(1+temp[i+j]<mtn)
					mtn=1+temp[i+j];
			}
			temp[i]=mtn;
			
		}
		System.out.println(temp[0]);

	}

}
