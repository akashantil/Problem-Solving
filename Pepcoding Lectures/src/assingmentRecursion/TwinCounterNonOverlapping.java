package assingmentRecursion;

import java.util.Scanner;

public class TwinCounterNonOverlapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s;
		Scanner sc = new Scanner(System.in);
		s=sc.next();
		int tc=twinCounter(s,false,0,0,0);
		System.out.println(tc);
		

	}
	public static int twinCounter(String s,boolean prev,int cmax,int omax,int idx){
		if(idx+2>=s.length()){
			return omax;
		}
		char x=s.charAt(idx);
		char y=s.charAt(idx+1);
	
		char z=s.charAt(idx+2);
		
		if(x==z && x!=y && prev ==false){
			cmax++;
			prev = true;
			if(cmax>omax) omax=cmax;
			return twinCounter(s,prev, cmax, omax, idx+2);
			
		}
		else return twinCounter(s,false, cmax, omax, idx+1);
		
		
		
	}

}
