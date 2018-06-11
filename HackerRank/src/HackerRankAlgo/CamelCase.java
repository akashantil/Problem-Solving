package HackerRankAlgo;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		boolean up=false;
		Scanner sc = new Scanner (System.in);
		s=sc.nextLine();
		if(s.charAt(0)>='a'&&s.charAt(0)<='z'){
			up=false;
		}
		else if(s.charAt(0)>='A'&&s.charAt(0)<='Z'){
			 up=true;
		}
		
		int count =1;
		for(int i=0;i<s.length()-1;i++){
			
		if( up==true && s.charAt(i)>='a'&&s.charAt(i)<='z'){
			count++;
			
		}
		else if(up==false && s.charAt(i)>='A'&&s.charAt(i)<='Z'){
			count++;
		}
		

	}
		System.out.println(count);
	}
}
