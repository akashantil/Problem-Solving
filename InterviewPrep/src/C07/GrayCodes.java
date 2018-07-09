package C11;

import java.util.ArrayList;
import java.util.Scanner;

public class GrayCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int i = 0; i < not; i++) {
			int no = sc.nextInt();
			solve(no);
		}

	}

	public static void solve(int n) {

		ArrayList<String> gc = new ArrayList<>();
		gc.add("0");
		gc.add("1");
		n--;

		while (n > 0) {

			for (int i = gc.size() - 1; i >= 0; i--) {
				gc.add(gc.get(i));
			}
			for (int i = 0; i < gc.size(); i++) {
				String a = gc.get(i);
				if (i < gc.size() / 2) {
					gc.set(i, "0" + a);
				} else {
					gc.set(i, "1" + a);

				}
			}
			n--;

		}
		for (int i = 0; i < gc.size(); i++) {
			String a = gc.get(i);
			System.out.print(a + " ");
		}
		System.out.println();
	}

}
