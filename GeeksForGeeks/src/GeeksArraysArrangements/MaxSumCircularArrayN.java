package GeeksArraysArrangements;

import java.util.Scanner;

public class MaxSumCircularArrayN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		int pc=0;
		int [] temp = new int[n+n];
		
		for(int i=0;i<n;i++){
			if(arr[i]>=0){
				pc++;
			}
			temp[i]=arr[i];
		}
		for(int i=n;i<n+n;i++){
			temp[i]=arr[i%n];
		}
		if(pc==n){
			int ms=kadanes(arr);
			System.out.println(ms);

			
		}
		else{
		int ms=kadanes(temp);
		System.out.println(ms);
		}

	}
	public static int kadanes(int []arr ){
		boolean winner=false;
		int sum=Integer.MIN_VALUE;
		int maxsum=Integer.MIN_VALUE;
		if(arr[0]>0){
			winner=true;
			sum+=arr[0];
		}
		
		
		for(int i=1;i<arr.length;i++){
			if(winner==true && arr[i]>0){
				sum+=arr[i];
			}
			else if(winner ==true && arr[i]<0){
				sum+=arr[i];
			}
			else if(winner==false ){
				sum=arr[i];
			}
			if(sum>maxsum){
				maxsum=sum;
			}
			
		}
		return maxsum;
		
		
	}

}
