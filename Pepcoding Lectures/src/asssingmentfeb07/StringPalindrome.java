package asssingmentfeb07;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		 int i=0;
		 int flag=0;
		 int j=s.length()-1;
		 while(i<j){
			 char x=s.charAt(i);
			 char y=s.charAt(j);
			 if(x==y-'a'+'A'||x==y+'a'-'A'||x==y){
				 
				 i++;
				 j--;
			 }
			 else if(x!=y){
				 System.out.println("false");
				 
				 return ;
			 }
			 
		 }
		 if(flag==1){
			 System.out.println("false");
			 
		 }
		 else{
			 System.out.println("true");
		 }

	}

}
