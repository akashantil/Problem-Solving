package Recursion;

import java.util.Scanner;

public class EgpytianFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float nr = sc.nextInt();
		float dr = sc.nextInt();

		solve(nr, dr, "");
	}

	public static void solve(float nr, float dr, String ans) {

		if (nr == 0)
			return;
		if (dr % nr == 0) {
			int temp = (int) (dr / nr);
			ans += "1/" + (temp) + "";
			System.out.println(ans);
		}

		float temp1 = (float) (Math.ceil(dr / nr));

		float temp2 = 1;

		float nr1 = nr * temp1 - temp2 * dr;
		float denr1 = dr * temp1;

		int resnr = (int) temp2;
		int resdr = (int) temp1;

		solve(nr1, denr1, ans + resnr + "/" + resdr + " + ");

	}

}
