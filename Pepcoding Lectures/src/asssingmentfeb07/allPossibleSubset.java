package asssingmentfeb07;

import java.util.Arrays;
import java.util.Scanner;

public class allPossibleSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		
		int [] rems;
		rems= new int[arr.length];
		for(int i=0;i<(1<<arr.length);i++){
			int temp=i;
			int r=rems.length-1;
			for(int j=0;j<rems.length;j++){
				
				int rem =temp%2;
				temp=temp/2;
				
				rems[(rems.length)-1-r]=rem;
				r--;
			}
			
			System.out.print("[");
			for(int k=0;k<arr.length;k++){
				
				if(rems[k]==1){
					
					System.out.print(arr[k] + " ");
				}
				else{
					System.out.print("");
				}
			}
			System.out.print("]");
			System.out.println();
		}
		
		

		
	


	}

}
