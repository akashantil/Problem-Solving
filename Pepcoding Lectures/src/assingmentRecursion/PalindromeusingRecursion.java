package assingmentRecursion;

import java.util.Scanner;



public class PalindromeusingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int [] arr = new int [n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		boolean cp=isPalindrome(arr, 0, arr.length-1);
		System.out.println(cp);
		
		

	}

	public static boolean isPalindrome(int [] arr,int i,int j){
		if(i>arr.length/2){
			return true;
		}
		if(arr[i]==arr[j]){
			boolean res =isPalindrome(arr, i+1, j-1);
			return res;
		}
		else return false;
		
		
				
	}
}
