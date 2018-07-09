package LRJuly18;

import java.util.Scanner;

public class MagicSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();

		for (int i = 0; i < not; i++) {
			int soa = sc.nextInt();
			int[] arr = new int[soa];

			int m = sc.nextInt();

			for (int j = 0; j < arr.length; j++)
				arr[j] = sc.nextInt();
			
			System.out.println(solve(arr, m)-1);
			 
		}
 
	}
	public static int solve(int [] arr ,int m){
		int count=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%m==0)
				count++;
				
		}
		return (int) (Math.pow(2, count));
	}
 
}
