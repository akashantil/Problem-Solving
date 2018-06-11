package SearchingAndSorting;

public class SAS_24CountFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1,2,3};
		int x = 2;

		int sp = fi(arr, 0, arr.length - 1, x);
		int ep=li(arr, 0, arr.length-1, x);
		System.out.println("element x="+x+" appears "+ (ep-sp+1)+" times");
		
	}

	public static int fi(int[] arr, int l, int h, int x) {

		int lp = 0;
		int rp = 0;

		if (l <= h) {
			int mid = (l + h) / 2;
			if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x) {
				return mid;
			} else if (x > arr[mid]) {
				rp = fi(arr, mid + 1, arr.length - 1, x);
			} else {
				lp = fi(arr, l, mid - 1, x);

			}
			return lp + rp;

		}
		return -1;

	}

	public static int li(int[] arr, int l, int h, int x) {

		int lp = 0;
		int rp = 0;
		if (l <= h) {
			int mid = (l + h) / 2;

			if ((mid == arr.length - 1 || x < arr[mid + 1]) && x == arr[mid]) {
				return mid;
			} else if (x < arr[mid]) {
				lp = li(arr, lp, mid - 1, x);

			} else {
				rp = li(arr, mid + 1, h, x);
			}
			return lp + rp;
		}
		return -1;
	}
}
