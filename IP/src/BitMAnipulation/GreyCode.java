package BitMAnipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class GreyCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nob = sc.nextInt();
		ArrayList<String> first = new ArrayList<>();

		first.add("0");
		first.add("1");

		while (nob - 1 > 0) {
			ArrayList<String> second = new ArrayList<>();

			for (int i = first.size() - 1; i >= 0; i--) {
				second.add(first.get(i));
			}
			for (int i = first.size() - 1; i >= 0; i--) {
				String x = second.get(i);
				x = "1" + x;
				second.set(i, x);
			}
			for (int i = first.size() - 1; i >= 0; i--) {
				String x = first.get(i);
				x = "0" + x;
				first.set(i, x);

			}
			for (int i = 0; i < second.size(); i++) {
				first.add(second.get(i));
			}

			nob--;

		}
		for (int i = 0; i < first.size(); i++)
			System.out.println(first.get(i));
		

	}

}
