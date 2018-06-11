package assingmentRecursion;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		if(s.length()%2==0){
			int midx=s.length()/2;
			boolean res=isPalindrome(s, midx-1, midx);
			System.out.println(res);
			
		}
		else{
			int midx=s.length()/2;
		boolean res=isPalindrome(s, midx-1, midx+1);
		System.out.println(res);
		
	}
		

	}
	public static boolean isPalindrome(String s,int sidx,int eidx){
		if(sidx==-1 && eidx==s.length()){
			return true;
		}
		char x=s.charAt(sidx);
		char y= s.charAt(eidx);
		if(x==y||x-'a' == y-'A' || x-'A'==y-'a' ){
			return isPalindrome(s, sidx-1, eidx+1);
			
		}
		else return false;
		
		
		
	}

}
