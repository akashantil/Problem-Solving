package DpAndGreedy.class2;

import java.util.Scanner;

public class TilingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int t = 0; t < not; t++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			int[] count = new int[x + 1];

			for (int i = 1; i <= x; i++) {

				if (i > y) {
					count[i] = count[i - 1] + count[i - y];

				} else if (i < y) {
					count[i] = 1;
				} else {
					count[i] = 2;
				}

			}

			System.out.println(count[x]);

		}
	}

}
