package feb09;

import java.util.Scanner;

public class BitManipulationToggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte no;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		no = sc.nextByte();
		byte bn;
		System.out.println("enter bit no to toogle");
		bn = sc.nextByte();
		byte fb = (byte) ((1) << bn);

		no = (byte) (no ^ fb);

		// TODO Auto-generated method stub
		System.out.println(no);

	}

}
