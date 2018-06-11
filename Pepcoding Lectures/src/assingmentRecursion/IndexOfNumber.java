package assingmentRecursion;

import java.util.Scanner;

public class IndexOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int [] arr = new int [n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			
		}
		int f=sc.nextInt();
		int idx=Index(arr, f, 0);
		System.out.println(idx);
		
	}
	public static int Index(int [] arr ,int data,int idx){
		if(idx==arr.length){
			return -1;
		}
		if(arr[idx]==data){
			return idx;
		}
		else{
			return Index(arr, data, idx+1);
		}
	}

}
