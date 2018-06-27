package C05July18;

import java.util.Scanner;

public class MaxSumNotAdjacent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		int inc=arr[0];
		int exc=0;
		
		for(int i=1;i<soa;i++){
			
			int temp=inc;
			inc=Math.max(arr[i],exc+arr[i]);
			exc=Math.max(exc, temp);
		}
		System.out.println(Math.max(inc, exc));

	}

}
