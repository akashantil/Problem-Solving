package GeeksArraysArrangements;

import java.util.Random;
import java.util.Scanner;

public class ShufflingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		Random r=new Random();
		for(int j=arr.length-1;j>0;j--){
			
			int rno=r.nextInt(j);
			int temp=arr[rno];
			arr[rno]=arr[j];
			arr[j]=temp;
			
			
			
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
