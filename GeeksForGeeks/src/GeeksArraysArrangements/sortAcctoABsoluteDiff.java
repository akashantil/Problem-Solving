package GeeksArraysArrangements;

import java.util.Scanner;

public class sortAcctoABsoluteDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int x;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		x= sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		int[]  temp = new int [n];
		for(int i =0;i<n;i++){
			temp[i]=arr[i]-x;
			temp[i]=Math.abs(temp[i]);
		}
		for (int i = 0; i < n; i++) {
			System.out.print(temp[i]+" ");

		}
		
		
		
		
	}

}
