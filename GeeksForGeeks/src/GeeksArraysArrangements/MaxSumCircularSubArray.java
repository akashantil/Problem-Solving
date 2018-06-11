package GeeksArraysArrangements;

import java.util.Scanner;

public class MaxSumCircularSubArray {
//This one works but TC is O(n^2)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		int sum=0;
		int maxsum=0;
		int j=0;
		
		for(int i=0;i<n;i++){
			sum=arr[i];
			if(i<n-1){
			 j=i+1;}
			else{
				j=(i+1)%n;
			}
			while(j!=i){
				sum+=arr[j];
				j=(j+1)%n;
				if(sum>maxsum){
					maxsum=sum;
				}
				
				
			}
		}
		System.out.println(maxsum);

	}

}
