package asssingmentfeb07;

import java.util.Scanner;

public class SumOfEvenOddPlaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long no;
		Scanner sc = new Scanner(System.in);
		no = sc.nextLong();

		int ES = 0;
		int OS = 0;
		long rem = 0;

		while (no != 0) {
			rem = no % 10;
			OS = (int) (OS + rem);

			no /= 10;

			rem = no % 10;
			ES = (int) (ES + rem);

			no /= 10;

		}

		System.out.println(OS + " " + ES);

	}

}
