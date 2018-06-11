package Recursion;

import java.util.Scanner;

public class PassWordCracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for(int i=0;i<not;i++){
			int nop=sc.nextInt();
			String [] pass= new String[nop];
			for(int j=0;j<nop;j++){
				pass[j]=sc.next();
				
			}
			String input=sc.next();
		}

	}

}
