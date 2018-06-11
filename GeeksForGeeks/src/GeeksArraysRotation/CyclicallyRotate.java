package GeeksArraysRotation;

import java.util.Scanner;

public class CyclicallyRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		cyclicallyrotate(arr);

	}
	public static void cyclicallyrotate(int [] arr){
		int temp=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--){
			arr[i+1]=arr[i];
		}
		arr[0]=temp;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
