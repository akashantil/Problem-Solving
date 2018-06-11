package assingmentRecursion;

import java.util.Scanner;

public class StringtoInt {

	public static void main(String[] args) {
		String s;
		int div;

		Scanner sc = new Scanner(System.in);
		s=sc.next();
		div=sc.nextInt();
		long res=stringToInt(s, 0);
		res=res/div;
		System.out.println(res);
		
		
		
		

	}
	public static long stringToInt(String s,int idx){
		if(idx==s.length()){
			return 0;
		}
		
		char x= s.charAt(idx);
		if(x!='-'){
		long no=x-'0';
		
		
		
		
		no=(long) (no*Math.pow(10,s.length()-1-idx)) + stringToInt(s, idx+1);
		return no;
		}
		else{
			idx++;
			x=s.charAt(idx);
			long no=x-'0';
			
			
			
			
			no=(long) (no*Math.pow(10,s.length()-1-idx)) + stringToInt(s, idx+1);
			return no *-1;
			
		}
		
		
		
		
	}

}
