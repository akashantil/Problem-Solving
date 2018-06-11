package SearchingAndSorting;

public class SAS_23_EquilibriumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -7, 5, 1, 2, -4, 3, 0 };
		int sumofarr = sum(arr, 0);

		int equiindex = equiidx(arr, 0, 0, sumofarr);
		System.out.println(equiindex);

	}

	public static int sum(int[] arr, int idx) {

		if (idx == arr.length) {
			return 0;
		}
		int sum = arr[idx] + sum(arr, idx + 1);
		return sum;

	}

	public static int equiidx(int[] arr, int idx, int sum, int tot) {
		if (idx == arr.length) {
			return -1;
		}

		if (sum == ((tot - sum) - arr[idx])) {
			return idx;
		}

		int index = equiidx(arr, idx + 1, sum + arr[idx], tot);

		return index;

	}

}
