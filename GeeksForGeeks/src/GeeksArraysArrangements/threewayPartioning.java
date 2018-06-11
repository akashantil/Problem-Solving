package GeeksArraysArrangements;

import java.util.Scanner;

public class threewayPartioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int lval;
		int hval;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		lval = sc.nextInt();
		hval = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		int pi=0;
		int i=0;
		while(i<arr.length)
		{
			if(arr[i]<lval){
				int temp=arr[pi];
				arr[pi]=arr[i];
				arr[i]=temp;
				pi++;
				
			}
			i++;
			
			
		}
		i=0;
		while(i<arr.length)
		{
			if(arr[i]>=lval &&arr[i]<=hval){
				int temp=arr[pi];
				arr[pi]=arr[i];
				arr[i]=temp;
				pi++;
				
			}
			i++;

	}

		while(i<arr.length)
		{
			if(arr[i]>hval){
				int temp=arr[pi];
				arr[pi]=arr[i];
				arr[i]=temp;
				pi++;
				
			}
			i++;

	}
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]+" ");
		}

}
}
