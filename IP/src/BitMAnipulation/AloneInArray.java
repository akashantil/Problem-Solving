package BitMAnipulation;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class AloneInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < soa; i++) {
			if (map.containsKey(arr[i]) == false)
				map.put(arr[i], 1);
			else

				map.put(arr[i], map.get(arr[i]) + 1);

		}
		ArrayList<Integer> ab = new ArrayList<>(map.keySet());

		for (int i = 0; i < ab.size(); i++) {
			int x = map.get(ab.get(i));
			if (x == 1) {
				System.out.println(ab.get(i));
				return;
			}
		}

	}

}
