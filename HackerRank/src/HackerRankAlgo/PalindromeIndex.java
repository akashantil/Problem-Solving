package HackerRankAlgo;

import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int n;
			String s ;
			Scanner sc = new Scanner(System.in);
			n=sc.nextInt();
			for(int j=0;j<n;j++){
			s=sc.next();
			
			
			int itr=-1;
			char [] arr = new char[s.length()];
			arr=s.toCharArray();
			int i = 0;
			int k=arr.length-1;
			while(i<k){
				if(arr[i]==arr[k]){
					i++;
					k--;
					continue;
					
				}
				else if(arr[i]!=arr[k]){
					boolean res=isPalindrome(arr, i, k-1);
					if(res==true){
						itr=k;
						break;
					}
					else {
						itr=i;
						break;
					}
				}
				i++;
				k--;
			}
			System.out.println(itr);
			
			
			
			
			
			
			}
			
	}
	public static boolean isPalindrome(char[] arr,int i,int j){
	
		while(i<j){
			if(arr[i]!=arr[j]){
				return false;
			}
			else{
				i++;
				j--;
				continue;
			}
			
		}
		return true;
	}
}
