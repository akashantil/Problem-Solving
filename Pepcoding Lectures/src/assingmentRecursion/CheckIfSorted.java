package assingmentRecursion;

import java.util.Scanner;

public class CheckIfSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int [] arr = new int [n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
	boolean res=	checkSorted(arr, 0);
	System.out.println(res);

	}
	public static boolean checkSorted(int [] arr,int idx){
		if(idx +1==arr.length){
			return true;
		}
		if(arr[idx]<=arr[idx+1]){
			return checkSorted(arr, idx+1);
		}
		else return false;
		
	}

}
