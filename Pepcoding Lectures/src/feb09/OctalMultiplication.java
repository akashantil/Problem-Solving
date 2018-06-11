package feb09;

import java.util.Scanner;

public class OctalMultiplication {

	public static void main(String[] args) {
		int no1,no2;
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter first Octal no");
		no1=sc1.nextInt();
		System.out.println("Enter second octal no");
		no2=sc1.nextInt();
		int r1,r2,carry=0,sum=0,mul,j=1,oct;
		while(no1!=0|no2!=0){
			r1=no1%10;
			r2=no2%10;
			mul=r1*r2;
			while(mul!=0){
				oct=mul%8 ;
				
			}
			carry=mul/10;
		}
		// TODO Auto-generated method stub

	}

}
