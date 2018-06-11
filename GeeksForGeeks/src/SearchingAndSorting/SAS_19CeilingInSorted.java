package SearchingAndSorting;

public class SAS_19CeilingInSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 8, 10, 10, 12, 19 };
		int x = 5;

		int[] cf = ceil(arr, 0, arr.length - 1, x);
		System.out.println(cf[1] + " " + cf[0]);

	}

	public static int[] ceil(int[] arr, int l, int h, int x) {

		int mid = (l + h) / 2;
		int[] cf = new int[2];

		if (l <= h) {
			if (arr[mid] > x && (mid != 0) && arr[mid - 1] < x) {

				cf[0] = arr[mid];
				cf[1] = arr[mid - 1];
				return cf;
			} else if (arr[mid] < x && mid != arr.length - 1 && arr[mid + 1] > x) {
				cf[0] = arr[mid + 1];
				cf[1] = arr[mid];
				return cf;

			} else if (arr[mid] == x) {
				cf[0] = x;
				cf[1] = x;
				return cf;

			} else if (arr[mid] < x) {
				cf = ceil(arr, mid + 1, h, x)
						;
			} else if (arr[mid] > x) {
				cf = ceil(arr, 0, mid - 1, x);
			}

		}
		return cf;
	}

}
