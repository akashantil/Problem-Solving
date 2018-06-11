package BitMAnipulation;

import java.util.Scanner;

public class IsPowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int count = countbits(no);
		System.out.println(count);
		if (count == 1)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	public static int countbits(int no) {

		int b = 0;
		while (no > 0) {
			if (no % 2 == 1)
				b++;

			no /= 2;

		}
		return b;

	}

}