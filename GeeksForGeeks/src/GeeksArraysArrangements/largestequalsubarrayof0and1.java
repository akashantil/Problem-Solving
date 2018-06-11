package GeeksArraysArrangements;

import java.util.Scanner;

public class largestequalsubarrayof0and1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tells only length of that subarray
		
		int n;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		int c0=0;
		for(int i=0;i<n;i++){
			if(arr[i]==0){
				c0++;
			}
		}
		
		
			int c1=arr.length-c0;
			
			System.out.println("no of zeroz---->"+ c0);
			System.out.println("no of ones---->"+ c1);
			if(c1==c0){
				System.out.println(c1+c0);
			}
			else if(c1>c0){
				System.out.println(2*c0);
				
			}
			else if(c0>c1){
				
			
			System.out.println(2*c1);
			}
			
		

	}

}
