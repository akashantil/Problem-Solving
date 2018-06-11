package GeeksArraysArrangements;

import java.util.Scanner;

public class moveAllNegativeToend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		int[] arr = new int[n];
		int []temp=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		int i=0;
		int pi=0;
		
		int j=arr.length-1;
		int ni=j;
		while(pi<=ni){
			if(arr[i]>0){
				temp[pi]=arr[i];
				pi++;
			}
			if(arr[j]<0){
				temp[ni]=arr[j];
				ni--;
			}
			i++;
			j--;
			
		}
		for(int k=0;k<n;k++){
			System.out.print(temp[k]+" ");
		}
		

	}

}
