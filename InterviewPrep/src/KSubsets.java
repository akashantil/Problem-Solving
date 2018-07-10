import java.util.ArrayList;

public class KSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 3;
		ArrayList<Integer>[] subset = new ArrayList[k];
		// ArrayList[] subset = new ArrayList[k];
		// this is arraylist of objects in this one index can be int and other
		// can be string as it is arraylist of object

		for (int i = 0; i < k; i++)
			subset[i] = new ArrayList<>();

		solve(arr, 0, new int[k], subset, k);
	}

	public static boolean solve(int[] arr, int idx, int[] sum, ArrayList<Integer>[] subset, int k) {

		if (idx == arr.length) {
			for (int i = 0; i < sum.length - 1; i++) {
				if (sum[i] != sum[i + 1])
					return false;
			}
			for (int i = 0; i < k; i++)
				System.out.print(subset[i] + " ");

			System.out.println();

			return true;
		}

		boolean res = false;

		for (int i = 0; i < k; i++) {

			subset[i].add(arr[idx]);
			sum[i] += arr[idx];
			res = res || solve(arr, idx + 1, sum, subset, k);
			sum[i] -= arr[idx];
			subset[i].remove(subset[i].size() - 1);

		}
		return false;

	}

}
