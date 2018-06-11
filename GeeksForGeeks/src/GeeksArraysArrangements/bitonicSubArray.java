package GeeksArraysArrangements;

import java.util.Scanner;

public class bitonicSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// only for type that start increasing then decreases
		//next one for decreasing also
		int n;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int[] arr = new int[n];
		int count =0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		boolean up = false;
		
		int length=0;
		if(arr[0]<arr[1])
		{
			up=true;
			count++;
			
		}
		else{
			up=false;
		}
		for(int i=1;i<n-1;i++){
			if(up==true && arr[i]<arr[i+1]){
				count++;
				
			}
			else if(up==true && arr[i]>arr[i+1]){
				up=false;
				count++;
			}
			else if(count>0 &&up==false && arr[i]>arr[i+1]){
				up=false;
				count++;
		}
			else if(count>0 &&up==false && arr[i]<arr[i+1]){
				up=false;
				if(length<count){
					length=count;
					count=0;
				}
		}
			else if(up==false &&arr[i]>arr[i+1] && count==0){
				count++;
				up=true;
			}
			

	}
		System.out.println(length);

}
}
