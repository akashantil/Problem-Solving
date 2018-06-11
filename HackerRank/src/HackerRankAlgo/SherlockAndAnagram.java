package HackerRankAlgo;

import java.util.Scanner;

public class SherlockAndAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String s;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=0;i<n;i++){
			s=sc.next();
			int [] arr =new int[26];
			for(int j=0;j<s.length();j++){
				char x=s.charAt(j);
				arr[x-'a']++;
				
			}
			
			
		}
		
		

	}

}
