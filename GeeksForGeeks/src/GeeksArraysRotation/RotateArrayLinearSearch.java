package GeeksArraysRotation;

import java.util.Scanner;

public class RotateArrayLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int k;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		int [] arr = new int [n];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int i=search(arr, 0, n-1,k);
		if(i==-1){
			System.out.println("key doesnt exist");
		}
		else{
			System.out.println("Element found at Index ----->"+i);
			
		}
		

	}
	public static  int search(int []arr,int s,int e,int k){
		if(s>e){
			return -1;
		}
		int mid= (s+e)/2;
		if(arr[mid]==k)
			return mid;
		
		if(arr[s]<=arr[mid]){
			if(k>=arr[s]&&k<=arr[mid]){
				return search(arr,s,mid-1,k);
			}
			return search(arr,mid+1,e,k);
		}
		if(k>=arr[mid]&&k<=arr[e]){
			return search(arr,mid+1,e,k);
		}
		return search(arr,s,mid-1,k);
	}

}
