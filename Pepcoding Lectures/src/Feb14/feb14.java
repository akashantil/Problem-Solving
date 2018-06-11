package Feb14;

import java.util.Scanner;

public class feb14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		n = sc.nextInt();
		System.out.println("enter upto how many precision");
		p = sc.nextInt();
		double sqrt = 0;
		double mult=0;

		for (int ip = 0; ip <= p; ip++) {
			double inc = Math.pow(10, -ip);
			while (sqrt * sqrt <= n) {
				sqrt = sqrt + inc;
			}

			sqrt = sqrt - inc;
			 mult = Math.pow(10, p);
		}
		System.out.println(Math.round(sqrt * mult) / mult);
	}

}
