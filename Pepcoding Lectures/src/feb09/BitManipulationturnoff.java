package feb09;

import java.util.Scanner;

public class BitManipulationturnoff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		byte no;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		no = sc.nextByte();
		byte bn;
		System.out.println("enter bit no to turn off");
		bn = sc.nextByte();
		byte fb = (byte) ((1) << bn);
		fb = (byte) ~fb;

		no = (byte) (no & fb);

		// TODO Auto-generated method stub
		System.out.println(no);

	}

}
