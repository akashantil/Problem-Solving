package assingmentRecursion;

import java.util.Scanner;

public class allIndex {

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
		int g=sc.nextInt();
		int [] idx=Index(arr, f, 0,0);
		System.out.println(idx[g]);
		
		
	}
	public static int [] Index(int [] arr ,int data,int idx,int count){
		if(idx==arr.length){
			int [] temp = new int[count];
			return temp;
		}
		if(arr[idx]==data){
			count++;
		int []idxarr=	 Index(arr, data, idx+1, count);
			idxarr[count-1]=idx;
			return idxarr;
		}
		else{
			return Index(arr, data, idx+1,count);
		}
	}

}
