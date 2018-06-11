package HackerRankAlgo;

import java.util.Scanner;

public class FunnyorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		String s;
		int flag=0;
		StringBuilder sb = new StringBuilder("");
		for(int i=0;i<n;i++){
			s=sc.next();
			int st=0;
			int en=s.length()-1;
			while(st<=en){
				char f=s.charAt(st);
				char se=s.charAt(st+1);
				char l=s.charAt(en);
				char ls=s.charAt(en-1);
			int odiff=se-f;
			int rdiff=l-ls;
			odiff=Math.abs(odiff);
			rdiff=Math.abs(rdiff);
			
			if(odiff==rdiff){
				flag=1;
			}
			else{
				flag=0;
				break;
			}
			st++;
			en--;
			}
			if(flag==1){
				System.out.println("Funny");
			}
			else{
				System.out.println("Not Funny");
			}
			
		}

	}

}
