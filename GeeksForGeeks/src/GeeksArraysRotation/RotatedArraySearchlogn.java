package GeeksArraysRotation;

import java.util.Scanner;

public class RotatedArraySearchlogn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int k;
		Scanner sc =new Scanner(System.in);
		n= sc.nextInt();
		k=sc.nextInt();
		int [] arr= new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			
		}
		int s=0;
		int end=arr.length-1;
		int mid =(end+s)/2;
		
	for(int i=0; i<arr.length;i++){
	
		if(k==arr[end]){
			System.out.println("found at index --->" +end);
			return;
		}
		else if(k==arr[s]){
			System.out.println("found at index --->" + s);
			return;
		}
		else if(k==arr[mid]){
			System.out.println("found at index --->" + mid);
			return;
		}
		else if (k>arr[s] && k<arr[mid]){
		end=mid;
		mid=(end+s)/2;
		
		
			
		}
		else if(k>arr[s]&&k>arr[mid]){
			s=mid;
			mid=(end+s)/2;
			
		}
		else if(k<arr[s]&& k<arr[mid]){
			s=mid;
			mid=(end+s)/2;
			
		}
	}
	System.out.println("ELement DOesn't Exist");

	}

}
