package HackerRankAlgo;

import java.util.Scanner;

public class StringConstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		String s1;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int k = 0; k < n; k++) {

			
				int cost = 0;
				s1 = sc.next();
				int[] arr = new int[26];
				StringBuilder sb = new StringBuilder("");

				for (int i = 0; i < s1.length(); i++) {
					char x = s1.charAt(i);

					
					
					if (sb.length() == 0) {

						sb.append(x);
						cost++;
						arr[x - 'a']++;
					} else if (sb.length() > 0 && arr[x - 'a'] == 0) {
						sb.append(x);
						arr[x - 'a']++;
						cost++;

					} else if (sb.length() > 0 && arr[x - 'a'] != 0) {
						sb.append(x);
						arr[x - 'a']++;

					}
				}
				System.out.println(cost);

			}

		}

	}

