package Strings;

public class NoOfBitsToBeFlipped {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 7;

		int res = a ^ b;
		int nob = 0;

		while (res > 0) {

			if (res % 2 == 1)
				nob++;
			res /= 2;

		}
		System.out.println(nob);

	}

}
