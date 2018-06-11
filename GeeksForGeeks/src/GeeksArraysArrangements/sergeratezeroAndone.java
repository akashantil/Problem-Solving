package GeeksArraysArrangements;

import java.util.Scanner;

public class sergeratezeroAndone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		int in=0;
		for(int i=0;i<c0;i++){
		arr[i]=0;
		in++;
		}
		for(int i=in;i<n;i++){
			arr[i]=1;
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}

	}

}
