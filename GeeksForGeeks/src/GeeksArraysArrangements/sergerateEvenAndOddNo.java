package GeeksArraysArrangements;

import java.util.Scanner;

public class sergerateEvenAndOddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					int n;
					Scanner sc = new Scanner(System.in);
			
					n = sc.nextInt();
					int[] arr = new int[n];
			
					for (int i = 0; i < n; i++) {
						arr[i] = sc.nextInt();
			
					}
		int i=0;
		int j=arr.length-1;
		while(i<=j){
			if(arr[i]%2==0 && arr[j]%2==0){
				i++;
				
			}
			else if(arr[i]%2==0 && arr[j]%2==1){
				i++;
				j--;
				
			}
			else if(arr[i]%2==1&& arr[j]%2==0){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
				
			}
			else if(arr[i]%2==1 && arr[j]%2==1){
				
				j--;
				
			}
		}
		for(int k=0;k<n;k++){
			System.out.print(arr[k]+" ");
		}

	}

}
