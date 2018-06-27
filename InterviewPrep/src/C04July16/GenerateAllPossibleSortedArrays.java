package C04July16;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateAllPossibleSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		int soa2 = sc.nextInt();
		int[] arr2 = new int[soa2];
		for (int i = 0; i < soa2; i++)
			arr2[i] = sc.nextInt();

		ArrayList<Integer> result = new ArrayList<>();
		solve(arr, arr2, result, false, 0, 0, 0);

	}

	public static void solve(int[] arr, int[] arr2, ArrayList<Integer> result, boolean first, int ia, int ib, int ic) {

		if (ib == arr2.length)
			return;

		if (first == false && result.size() > 0) {
			for(int i:result){
				System.out.print(i+" ");
			}
			System.out.println();

		}

		for (int i = ia; i < arr.length && first == false; i++) {

			if (result.size() == 0) {
				result.add(arr[i]);
				solve(arr, arr2, result, true, ia + 1, ib, ic + 1);
				result.remove(result.size() - 1);
			} else {
				if (arr[i] > result.get(result.size() - 1)) {
					result.add(arr[i]);
					solve(arr, arr2, result, true, ia + 1, ib, ic + 1);
					result.remove(result.size() - 1);

				}

			}

		}

		for (int i = ib; i < arr2.length && first == true; i++) {
			if (arr2[i] > result.get(result.size() - 1)) {

				result.add(arr2[i]);
				solve(arr, arr2, result, false, ia, ib + 1, ic + 1);
				result.remove(result.size() - 1);

			}
		}

	}

}
