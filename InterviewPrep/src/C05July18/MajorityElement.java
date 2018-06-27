package C05July18;

import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		int majele = arr[0];
		int count = 1;

		for (int i = 1; i < soa; i++) {
			if (arr[i] == majele) {
				count++;
			} else if (count > 0) {
				count--;
			} else {
				majele = arr[i];
				count = 1;
			}
		}
		if (count > 0) {
			count = 0;
			for (int i = 0; i < soa; i++) {
				if (arr[i] == majele)
					count++;
			}
			if (count >= (soa / 2) + 1) {
				System.out.println(majele);
			} else {
				System.out.println("NO Majority Element");
			}
		} else {
			System.out.println("NO Majority Element");
		}

	}

}
