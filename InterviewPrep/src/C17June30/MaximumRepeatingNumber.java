package C17June30;

import java.util.Scanner;

public class MaximumRepeatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		int k = sc.nextInt();

		for (int j = 0; j < soa; j++) {
			int idx = arr[j] % k;
			arr[idx] += k;
		}
		
		int max=Integer.MIN_VALUE;
		int maxi=-1;
		for(int i=0;i<soa;i++){
			if(arr[i]>max)
			{
				max=arr[i];
				maxi=i;
			}
		}
		System.out.println(maxi);

	}

}
