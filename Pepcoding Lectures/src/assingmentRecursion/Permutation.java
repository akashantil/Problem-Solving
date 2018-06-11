package assingmentRecursion;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		permute(s, 0, s.length()-1);
//		int i = 0;
//only works for string length 3
//		while (i < s.length()) {
//			System.out.print(s.charAt(i));
//			for (int j = (i + 1) % s.length(); j != i; j = (j + 1) % s.length()) {
//				System.out.print(s.charAt(j));
//			}
//			System.out.println();
//			System.out.print(s.charAt(i));
//
//			int j = i - 1;
//			int c = 0;
//
//			while (j != i && c < s.length() - 1) {
//
//				if (j < 0) {
//					j = s.length() - 1;
//
//				}
//				System.out.print(s.charAt(j));
//				c++;
//				j--;
//
//			}
//			System.out.println();
//			i++;
//
//		}
// dc
	}
	public static String swap (String s,int i,int j){
		
	char [] strarr=	s.toCharArray();
		char temp='a';
		char fc=strarr[i];
		
		char sc=strarr[j];
		
		temp=fc;
		strarr[i]=sc;
		strarr[j]=temp;
		String ab = new String(strarr);
		return ab;
		
	}
	public static void permute(String str,int l,int r){
		 if (l == r)
	            System.out.println(str);
	        else
	        {
	            for (int i = l; i <= r; i++)
	            {
	                str = swap(str,l,i);
	                permute(str, l+1, r);
	                str = swap(str,l,i);
	            }
	        }

	}
}
