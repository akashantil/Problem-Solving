package LRJuly18;

import java.util.Scanner;

public class StrikeOrSpare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int i = 0; i < not; i++) {
			int size = sc.nextInt();

			solve(size);

		}

	}

	public static void solve(int size) {

		StringBuilder sb = new StringBuilder();
		System.out.print(1 + " " + 1);
		for (int i=0;i<size/2;i++) {
			if (sb.length() < 1000) {
				sb.append("0");
			} else {
				System.out.print(sb);
				sb = new StringBuilder();
				sb.append("0");
			}

		}
		System.out.print(sb);
		System.out.println();

	}

}
