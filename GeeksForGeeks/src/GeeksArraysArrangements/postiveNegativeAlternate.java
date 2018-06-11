package GeeksArraysArrangements;

import java.util.Scanner;

public class postiveNegativeAlternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		
		int nc=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				nc++;
				int temp=arr[nc];
				arr[nc]=arr[i];
				arr[i]=temp;
			}
		}
			int pc=nc+1,inc=0;
			while(pc<n &&inc<pc && arr[inc]<0){
				int temp=arr[inc];
				arr[inc]=arr[pc];
				arr[pc]=temp;
				inc+=2;
				pc++;
				
				
				
			}
			
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i]+" ");

			}
	}

}
