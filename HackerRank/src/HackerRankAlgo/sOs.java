package HackerRankAlgo;

import java.util.Scanner;

public class sOs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s=sc.next();
		char x='S';
		char y='O';
		char z='S';
		int count =0;
		
		
		int m=s.length()/3;
		for(int i=0;i<s.length();i++){
			int ch=i%3;
			char temp=s.charAt(i);
			if(ch==0){
				if(s.charAt(i)!='S'){
					count++;
					
				}
				
			}
			if(ch==1){
				if(s.charAt(i)!='O'){
					count++;
					
				}
				
			}
			if(ch==2){
				if(s.charAt(i)!='S'){
					count++;
					
				}
				
			}
			
			
		}
		System.out.println(count);

	}

}
