package C14June27;

import java.util.Scanner;

public class PrintZigZagFashion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		int k = sc.nextInt();

		String[] arr = new String[k];
		for (int i = 0; i < k; i++)
			arr[i] = "";
		boolean down = true;
		int count = 0;

		for (int i = 0; i < inp.length(); i++) {
			arr[count] = arr[count] + inp.charAt(i);
			if (down == true) {

				if (count == k - 1) {
					count--;
					down = false;
				} else
					count++;

			} else {
				if (count == 0) {
					down = true;
					count++;
				} else
					count--;

			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
