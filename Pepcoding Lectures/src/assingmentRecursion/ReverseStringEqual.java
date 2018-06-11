package assingmentRecursion;

import java.util.Scanner;

public class ReverseStringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		String b;

		Scanner sc = new Scanner(System.in);

		s = sc.next();
		b=sc.next();
		boolean res= isReverse(s, b, 0, b.length()-1);
		System.out.println(res);
	}

	public static boolean isReverse(String x,String y,int idx,int vidx){
		if(x.length()==y.length()){
		if(idx==x.length()){
			return true;
		}
		char a=x.charAt(idx);
		char b = y.charAt(vidx);
		if(a==b){
			return isReverse(x, y, idx+1, vidx-1);
		}
		else return false;
		}
		else return false;
		
	}

}
