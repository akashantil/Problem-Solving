package DpAndGreedy.class2;

import java.util.ArrayList;
import java.util.Scanner;

public class NumericKeyPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList[] numpad = new ArrayList[10];

		for (int i = 0; i < 10; i++) {
			numpad[i] = new ArrayList<>();
		}

		((ArrayList<Integer>) numpad[0]).add(0);

		((ArrayList<Integer>) numpad[0]).add(8);
		((ArrayList<Integer>) numpad[1]).add(1);
		((ArrayList<Integer>) numpad[1]).add(2);
		((ArrayList<Integer>) numpad[1]).add(4);
		((ArrayList<Integer>) numpad[2]).add(1);
		((ArrayList<Integer>) numpad[2]).add(2);
		((ArrayList<Integer>) numpad[2]).add(3);
		((ArrayList<Integer>) numpad[2]).add(5);
		((ArrayList<Integer>) numpad[3]).add(2);
		((ArrayList<Integer>) numpad[3]).add(3);
		((ArrayList<Integer>) numpad[3]).add(6);
		((ArrayList<Integer>) numpad[4]).add(1);
		((ArrayList<Integer>) numpad[4]).add(7);
		((ArrayList<Integer>) numpad[4]).add(4);
		((ArrayList<Integer>) numpad[4]).add(5);
		((ArrayList<Integer>) numpad[5]).add(2);
		((ArrayList<Integer>) numpad[5]).add(5);
		((ArrayList<Integer>) numpad[5]).add(8);
		((ArrayList<Integer>) numpad[5]).add(6);
		((ArrayList<Integer>) numpad[5]).add(4);
		((ArrayList<Integer>) numpad[6]).add(6);
		((ArrayList<Integer>) numpad[6]).add(5);
		((ArrayList<Integer>) numpad[6]).add(3);
		((ArrayList<Integer>) numpad[6]).add(9);
		((ArrayList<Integer>) numpad[7]).add(7);
		((ArrayList<Integer>) numpad[7]).add(4);
		((ArrayList<Integer>) numpad[7]).add(8);
		((ArrayList<Integer>) numpad[8]).add(8);
		((ArrayList<Integer>) numpad[8]).add(5);
		((ArrayList<Integer>) numpad[8]).add(9);
		((ArrayList<Integer>) numpad[8]).add(7);
		((ArrayList<Integer>) numpad[8]).add(0);
		((ArrayList<Integer>) numpad[9]).add(9);
		((ArrayList<Integer>) numpad[9]).add(8);
		((ArrayList<Integer>) numpad[9]).add(6);

		Scanner sc = new Scanner(System.in);
		// int not=sc.nextInt();
		// for(int t=0;t<not;t++){
		int moves = sc.nextInt();
		long[][] arr = new long[10][moves + 1];

		for (int i = 0; i < arr.length; i++) {
			arr[i][1] = 1;
		}

		for (int i = 2; i <= moves; i++) {
			for (int j = 0; j < arr.length; j++) {

				ArrayList<Integer> currmoves = numpad[j];

				for (int x : currmoves) {

					long fact = arr[x][i - 1];

					arr[j][i] += fact;
				}

			}

		}
		long ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans += arr[i][moves];
		}
		System.out.println(ans);

	}
	// }

}
