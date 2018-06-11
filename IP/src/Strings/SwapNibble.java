package Strings;

import java.util.Scanner;

public class SwapNibble {

	//nibble is a set of 4 bits
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		int bitmask1=1;
		bitmask1<<=4;
		bitmask1-=1;
		int  bitmask2=~bitmask1;
		
		bitmask1&=num;
		bitmask1<<=4;
		bitmask2&=num;
		bitmask2>>=4;
		
		System.out.println(bitmask1|bitmask2);
		 
		 

	}

}
