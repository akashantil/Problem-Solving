package assingmentRecursion;

import java.util.Scanner;

public class RemoveAdjacentDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String s;
		Scanner sc = new Scanner(System.in);
		
		s=sc.next();
		i=sc.nextInt();
		
		StringBuilder sb =new StringBuilder("");

		replaceConsecutiveChar(s, 0, sb);
		System.out.println(sb);
		System.out.println(sb.charAt(i));
		
	}
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
			
			
			replaceConsecutiveChar(s, idx+1, sb);
		}
		
		
	
}
}
