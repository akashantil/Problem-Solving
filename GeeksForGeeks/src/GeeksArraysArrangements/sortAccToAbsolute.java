package GeeksArraysArrangements;

import java.util.Scanner;

public class sortAccToAbsolute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int x;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		x=sc.nextInt();
		int[] arr = new int[n];
		int []absdiff=new int[n];
		int [] sort = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		for(int i=0;i<n;i++){
			int abdiff=arr[i]-x;
			absdiff[i]=Math.abs(abdiff);
		}
		int j=0;
		int index=0;
		
		for(int i=0;i<n;i++){
			int min=Integer.MAX_VALUE;
			for(j=0;j<n;j++){
				if(min>absdiff[j]){
					min=absdiff[j];
					index=j;
				}


				
				
			}
			absdiff[index]=Integer.MAX_VALUE;
			sort[i]=arr[index];
		}
		for(int i=0;i<n;i++){
			System.out.print(sort[i]+" ");
		}
		

	}

}
