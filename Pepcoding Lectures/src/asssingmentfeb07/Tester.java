package asssingmentfeb07;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		no = sc.nextInt();
		int bn;
		System.out.println("enter bit no to turn on");
		bn = sc.nextInt();
		int fb = (int) ((1) << bn);

		no = (int) (no | fb);
		// TODO Auto-generated method stub
		System.out.println(no);
	}
}