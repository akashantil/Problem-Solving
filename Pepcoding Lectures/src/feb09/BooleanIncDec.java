package feb09;

import java.util.Scanner;

public class BooleanIncDec {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many no you will give input");
		n = sc.nextInt();

		int current, next = 0;
		boolean flagup;

		System.out.println("enter no1");
		int no1 = sc.nextInt();
		current = no1;

		System.out.println("enter no2");
		int no2 = sc.nextInt();
		next = no1;
		if(current<next){
			flagup=true;
		}
		else{
			flagup=false;
		}
		
		
		
		for (int j = 3; j <= n; j++) {
			System.out.println("enter  no");
			 no2 = sc.nextInt();
			 current=next;
			next = no2;
			
	
if(flagup==true){
	if(current<next)
	{
		flagup=true;
	}
	else{
		
		System.out.println("Invalid");
		return;
			
	}
}
else{
	if(current>next){
		flagup=false;
		
	}
	else{
		flagup=true;
	}
}
}
		System.out.println("Valid");

	}
	
	}
		
		
			
				