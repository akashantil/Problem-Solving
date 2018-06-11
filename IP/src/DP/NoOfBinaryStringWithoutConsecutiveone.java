package DP;

import java.util.Scanner;

public class NoOfBinaryStringWithoutConsecutiveone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// no of digit
		int nod = sc.nextInt();

		// ending with zero
		long zero = 1;
		// ending with one

		long one = 1;

		for (int i = 1; i < nod; i++) {
			long temp=zero;
			zero += one;
			one = temp;

		}
		
		System.out.println((long)(zero + one));

	}

}
