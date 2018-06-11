package HackerRankAlgo;

import java.util.Scanner;

public class HackerRankInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String s;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int j=0;j<n;j++){
		s=sc.next();
		String cons="hackerrank";
		
		int count =0;
		
		for(int i=0;i<s.length();i++){
			char temp=s.charAt(i);
			
			char temp2=cons.charAt(count);
			if(temp==temp2){
				if(count<9){
				count++;
				}
			}
		}
		if(count<9){
			System.out.println("NO");
		}
		if(count==9){
			System.out.println("YES");
		}
		}

	}

}
