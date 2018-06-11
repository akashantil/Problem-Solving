package assingmentRecursion;

import java.util.Scanner;

public class Find {

	public static void main(String[] args) {
		int n;
		int d;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int [] arr = new int [n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		d=sc.nextInt();
	boolean res =	find(arr, d,0);
	System.out.println(res);
		
		// TODO Auto-generated method stub

	}
	public static boolean find(int [] arr ,int data,int idx){
		if(idx==arr.length){
			return false;
		}
		if(arr[idx]==data){
			return true;
			
		}
		else{
			return find(arr, data, idx+1);
		}
		
	}

}
