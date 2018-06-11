package asssingmentfeb07;

import java.util.Scanner;

public class SubsetPalindromeandcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();

		
		PalindromicSubstring(s);
	}

	public static boolean Ispalindrome(String s) {
		int j = s.length() - 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			j--;
		}
		return true;
	}
	public static void PalindromicSubstring(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<=s.length();j++){
			String temp=	s.substring(i, j);
			boolean res= Ispalindrome(temp);
			if(res==true){
				System.out.println(temp);
				count++;
			}
			}
		}
		System.out.println(count);
	}

}
