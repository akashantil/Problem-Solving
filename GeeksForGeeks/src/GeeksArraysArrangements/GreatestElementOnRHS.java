package GeeksArraysArrangements;

import java.util.Scanner;

public class GreatestElementOnRHS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		int last=arr[arr.length-1];
		arr[arr.length-1]=-1;
		int max=Integer.MIN_VALUE;
		int temp=arr[arr.length-2];
		arr[arr.length-2]=last;
		for(int j=arr.length-3;j>=0;j--){
			if(temp>last){
				last=arr[j];
				max=temp;
			}
			else{
				 max=last;
				 temp=arr[j];
			}
			arr[j]=max;
			
			
			
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
