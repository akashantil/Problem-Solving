package DP;

import java.util.Scanner;

public class TempleOffering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 method one using stack like DIIDIDIDI //WONT WORK AS IT STORE ONLY ONE 
		//ARRAY
		//other one using two arrays
		Scanner sc = new Scanner(System.in);
		int soa=sc.nextInt();
		int [] arr = new int [soa];
		for(int i=0;i<soa;i++)
			arr[i]=sc.nextInt();
		
		//temp1 maintaining no of consecutive small in left
		//temp2 maintaining no of consecutive small in right
		int [] temp1= new int [soa];
		int [] temp2=new int [soa];
		temp1[0]=1;
		temp2[soa-1]=1;
		
		
		for(int i=1;i<arr.length;i++){
			if (arr[i]>arr[i-1]){
				temp1[i]=1+temp1[i-1];
				
			}
			else
				temp1[i]=1;
		}
		
		for(int i=soa-2;i>=0;i--){
			if (arr[i]>arr[i+1]){
				temp2[i]=1+temp2[i+1];
				
			}
			else
				temp2[i]=1;
			
		}
		int sum=0;
		for(int i=0;i<soa;i++){
			sum+=Math.max(temp1[i], temp2[i]);
			
		}
		System.out.println(sum);
	}

}
