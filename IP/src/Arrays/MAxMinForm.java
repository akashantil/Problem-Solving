package Arrays;

import java.util.Scanner;

public class MAxMinForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// used mathematics to store 2 thing at a particular spot

		Scanner sc = new Scanner(System.in);
		int soa=sc.nextInt();
		int [] arr = new int[soa];
		for(int i=0;i<soa;i++)
			arr[i]=sc.nextInt();

		int max = arr[arr.length - 1] + 1;

		int k=0;//minidx
		int j = arr.length - 1;//maxidx
		
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] = ((arr[j] % max) * max) + arr[i];
				j--;

			} else {
				arr[i] = ((arr[k] % max) * max) + arr[i];
				k++;
			}

		}	
		for (int i = 0; i < arr.length; i++) {
			arr[i] /= max;
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
