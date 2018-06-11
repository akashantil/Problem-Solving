package Strings;

import java.util.Scanner;

public class CheckIfBinaryRepAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=sc.nextInt();
		
		int c1=0;
		int c2=0;
		
		while(a>0){
			if(a%2==1)
				c1++;
			a/=2;
			
		}
		
		while(b>0){
			if(b%2==1)
				c2++;
			b/=2;
			
		}
		if(c1==c2)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
