package asssingmentfeb07;

import java.util.Scanner;

public class AsciiDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s;
	Scanner sc =new Scanner(System.in);
	s=sc.nextLine();
	differneceAcii(s);

	}
	public static void differneceAcii(String s){
		StringBuilder sb = new StringBuilder("");
		for(int i=0;i<s.length()-1;i++){
			char x=s.charAt(i);
			char y=s.charAt(i+1);
			int diff=y-x;
			sb.append(x);
			sb.append(diff);
		}
		sb.append(s.charAt(s.length()-1));
		System.out.println(sb);
		
		
	}

}
