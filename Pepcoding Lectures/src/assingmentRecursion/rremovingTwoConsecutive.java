package assingmentRecursion;

import java.util.Scanner;

public class rremovingTwoConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int n;
		Scanner sc = new Scanner(System.in);
		s=sc.next();
		n=sc.nextInt();
		
		
		StringBuilder sb = new StringBuilder("");
		replaceConsecutiveChar(s, 0, sb);
		char res1=sb.charAt(n);
		System.out.println(res1);
		System.out.println(sb);
	}
//	public static char charatIndex(String s,int idx,int n){
//		if(idx==s.length()){
//			return '0';
//		}
//		if(idx==n){
//			return s.charAt(idx);
//		}
//		return charatIndex(s, idx+1, n);
//	}
	public static void replaceConsecutiveChar(String s,int idx,StringBuilder sb){
		
		if(idx+1==s.length()){
			sb.append(s.charAt(s.length()-1));
			
			return;
		}
		
		char x=s.charAt(idx);
		char y= s.charAt(idx+1);
		if(x!=y){
			sb.append(s.charAt(idx));
			
			replaceConsecutiveChar(s, idx+1, sb);
		}
		else if(s.charAt(idx)==s.charAt(idx+1)){
			sb.append(s.charAt(idx));
			sb.append("*");
			
			replaceConsecutiveChar(s, idx+1, sb);
		}
		
		
			}
		
	}

