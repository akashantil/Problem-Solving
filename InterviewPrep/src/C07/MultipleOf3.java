package C11;

import java.util.Scanner;

public class MultipleOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int i = 0; i < not; i++) {

			int no = sc.nextInt();

			int res = ismultiple(no);
			if (res > 0)
				System.out.println(true);
			else
				System.out.println(false);

		}
	}

	public static int ismultiple(int no) {

		if (no < 0)
			no = -no;
		if (no == 0)
			return 1;
		if (no == 1)
			return 0;

		int oddcount = 0;
		int evencount = 0;

		while (no != 0) {

			if ((no & 1) != 0)
				oddcount++;

			no >>= 1;

			if ((no & 1) != 0)
				evencount++;

			no >>= 1;

		}
		return ismultiple(Math.abs(evencount - oddcount));
	}
}
