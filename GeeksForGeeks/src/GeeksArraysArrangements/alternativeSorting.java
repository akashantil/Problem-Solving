package GeeksArraysArrangements;

import java.util.Arrays;
import java.util.Scanner;

public class alternativeSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		Arrays.sort(arr);
		int i=0;
		int j=arr.length-1;
		while(i<=j){
			if(i!=j){
			System.out.print(arr[j]+" "+arr[i]+" ");
			}
			else{
				System.out.println(arr[i]+" ");
			}
			i++;
			j--;
			
		}

	}

}
