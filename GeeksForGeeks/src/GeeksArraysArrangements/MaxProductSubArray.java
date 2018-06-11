package GeeksArraysArrangements;

import java.util.Scanner;

public class MaxProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		boolean winner = false;
		int product = 1;
		int maxp = 0;
		int si = 0;
		int fsi=0;

		int fei = 0;
		if (arr[0] > 0) {
			winner = true;
			product *= arr[0];
			si = 0;
			if(product>maxp){
				fsi=si;
			}
		}
		int i = 1;
		while (i < n) {
			if(product==0){
				product=arr[i];
				if(arr[i]>0){
					winner=true;
				}
				else winner = false;
				
			}
			else if (winner == true && arr[i] >= 0) {
				product *= arr[i];
				
				if (maxp < product) {
					maxp = product;
					fei = i;
					
				}

			} else if (winner == true && arr[i] <= 0) {
				winner = false;
				product *= arr[i];
				if (maxp < product) {
					maxp = product;
					fei = i;
				}

			} else if (winner == false && arr[i] <= 0) {
				winner = true;
				product *= arr[i];
				if (maxp < product) {
					maxp = product;
					fei = i;
				}
			} else if (winner == false && arr[i] >= 0) {
				winner = true;
				product = arr[i];
				si = i;
				if (maxp < product) {
					maxp = product;
					fei = i;
				}

			}
			i++;

		}
		System.out.println("Max product possible of subarray is "+ maxp);
		System.out.println();
		for(int i1=si;i1<=fei;i1++){
			System.out.print(arr[i1]+" ");
			
		}

	}
}
