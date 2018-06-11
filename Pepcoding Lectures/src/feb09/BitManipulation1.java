package feb09;

import java.util.Scanner;

public class BitManipulation1 {

	public static void main(String[] args) {
		byte no;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		no = sc.nextByte();
		byte bn;
		System.out.println("enter bit no check");
		bn = sc.nextByte();
		byte fb = (byte) ((1) << bn);
		if ((no & fb) == 0) {
			System.out.println("False");

		} else {
			System.out.println("True");
		}
		// TODO Auto-generated method stub

	}

}
