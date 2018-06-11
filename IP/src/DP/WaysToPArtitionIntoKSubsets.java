package DP;

import java.util.Scanner;

public class WaysToPArtitionIntoKSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int k=sc.nextInt();
		
		
		System.out.println(count(k, n));
		
		
		

	}
	public static int count(int k,int n){
		
		if(n==0 ||k==0 ||k>n)
			return 0;
		if(k==1 |n==k)
			return 1;
		
		//(k,n-1)*k--> the chosen element can go into any one of k subsets and
		//asks remaining  n-1 elements to give their count of subsets
		//or it will say i had made one subsett and asks remaining n-1 elements to form k-1 subsets
		
		int cnt=count(k, n-1)*k + count(k-1, n-1);
		
		
		return cnt;
		
		
		
		
	}

}
