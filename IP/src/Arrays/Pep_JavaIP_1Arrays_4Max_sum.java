package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_4Max_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		
		int[] arr = new int[soa];
		int [] temp = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}
		
		temp [0]=arr[0];
		
		for(int i=1;i<arr.length;i++){
			int k=i-1;
			temp[i]=arr[i];
			while(k>=0){
				if(arr[i]>arr[k]){
					temp[i]=Math.max(arr[i]+temp[k], temp[i]);
					
				}
				k--;
				
			}
			
			
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<temp.length;i++){
			if(temp[i]>max)
				max=temp[i];
			
		}
		System.out.println(max);

	}

}
