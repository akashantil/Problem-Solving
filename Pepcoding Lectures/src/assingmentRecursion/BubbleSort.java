package assingmentRecursion;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		int [] arr = new int [n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		bubbleSort(arr, 0,arr.length-1);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	
	
	public static void bubbleSort(int[] arr, int i, int j) {

		if (j==-1) {

			return;
		}

		if (i<j) {
			int temp = 0;
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i + 1] = temp;
			}
			i++;

			bubbleSort(arr, i, j);
		} else if(i==j){
			i = 0;
			j--;
			bubbleSort(arr, i, j);
		}

	}


	}

