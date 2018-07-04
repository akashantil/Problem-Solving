package C16June29;

import java.util.Scanner;

public class ValidityTicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char[] arr = new char[9];
		for (int i = 0; i < 9; i++)
			arr[i] = sc.next().charAt(0);

		int countX = 0;
		int countO = 0;

		for (int j = 0; j < 9; j++) {
			if (arr[j] == 'X')
				countX++;
			else if (arr[j] == 'O')
				countO++;
		}

		if (Math.abs(countO - countX) > 1) {
			System.out.println(false);
			return;

		}
		if (winning(arr, 'X') && winning(arr, 'O')) {
			System.out.print(false);
		} else
			System.out.println(true);

	}

	public static boolean winning(char[] arr, char ch) {

		boolean found = false;

		for (int i = 0; i < 9; i += 3) {
			for (int j = i; j < 3; j++) {
				if (arr[j] == ch && j == 2)
					return true;
				else if (arr[j] != ch)
					break;
			}
		}
		for (int j = 0; j < 3; j++) {
			for (int i = j; i < 9; i += 3) {
				if (arr[i] != ch)
					break;
				else if (arr[i] == ch && (i == 6 || i == 7 || i == 8))
					return true;
			}
		}
		if (arr[0] == ch && arr[4] == ch && arr[8] == ch)
			return true;

		return false;

	}

}
