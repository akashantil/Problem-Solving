package GeeksArraysRotation;

import java.util.Scanner;

public class maxSummationInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int [] arr = new int [n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int maxsum=Integer.MIN_VALUE;
		int cmax=Integer.MIN_VALUE;
		int sum=0;
		
		for(int r=1;r<arr.length;r++){
			GeeksArrays.Rotation.rotate(arr, r, n);
			sum=0;
			cmax=0;
			for(int i =0;i<n;i++){
				sum =sum +i*arr[i];
				cmax=sum;
			}
			cmax=sum;
			if(cmax>maxsum){
				maxsum=cmax;
			}
			
		}
		System.out.println();
		System.out.println(maxsum);
		
	}

}
