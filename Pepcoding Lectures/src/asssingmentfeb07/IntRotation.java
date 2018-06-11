package asssingmentfeb07;

import java.util.Scanner;

public class IntRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		long r;
		Scanner sc = new Scanner(System.in);
		r = sc.nextLong();
		n = sc.nextInt();
		int result = rotate(n, r);
		System.out.println(result);

	}

	public static int rotate(int n, Long r) {
		int nd = 0;
		int temp = n;
		int fno = 0;
		int rot = 0;
		while (n > 0) {
			n /= 10;
			nd++;

		}
		rot = (int) (r % (nd - 1));
		if (r < 0) {
			int rem = (int) (temp % Math.pow(10, rot));
			int tno = (int) (temp / Math.pow(10, rot));
			fno = (int) (rem * (Math.pow(10, nd - rot)) + tno);
		} else {
			int rem = (int) (temp % Math.pow(10, nd - rot));
			int tno = (int) (temp / Math.pow(10, nd - rot));
			fno = (int) (rem * (Math.pow(10, rot)) + tno);

		}

		return fno;
	}

}
