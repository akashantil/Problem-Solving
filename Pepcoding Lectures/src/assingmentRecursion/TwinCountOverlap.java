package assingmentRecursion;

import java.util.Scanner;

public class TwinCountOverlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s=sc.next();
		int tc=twinCounter(s,0,0,0);
		System.out.println(tc);
		

	}
	public static int twinCounter(String s,int cmax,int omax,int idx){
		if(idx+2==s.length()){
			return omax;
		}
		char x=s.charAt(idx);
		char y=s.charAt(idx+1);
	
		char z=s.charAt(idx+2);
		
		if(x==z && x!=y){
			cmax++;
			if(cmax>omax) omax=cmax;
			return twinCounter(s, cmax, omax, idx+1);
			
		}
		else return twinCounter(s, cmax, omax, idx+1);
		
		
		
	}

}
