package assingmentRecursion;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		int [] arr = new int [n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		selectionSort(arr, 0,1);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void selectionSort(int[] arr, int i, int j) {

		if (i>=arr.length) {

			return;
		}

		if (j<arr.length) {
			int temp = 0;
			if (arr[i] > arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			

			selectionSort(arr, i, j+1);

			
		} else {
			i=i+1;
			j=i+1;
			
			selectionSort(arr, i,j );
		}

	}
	

	}