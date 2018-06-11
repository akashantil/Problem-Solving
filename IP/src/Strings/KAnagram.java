package Strings;

import java.util.Scanner;

public class KAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String  str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int k = sc.nextInt();
		
		int [] arr= new int [26];
		for(int i=0;i<str1.length();i++){
			char x= str1.charAt(i);
			arr[x-'a']++;
		}
		for(int i=0;i<str2.length();i++){
			char x= str2.charAt(i);
			
				arr[x-'a']--;
			
			
		}
		int noc=0;
		for(int i=0;i<26;i++){
			if(arr[i]>0){
				noc+=arr[i];
				
				
			}
			
		}
		if(noc<=k){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}

	}

}
