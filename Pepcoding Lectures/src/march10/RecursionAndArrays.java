package march10;

public class RecursionAndArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 11, 33, 45, -1, 33, 64 };
		int count = 0;

		// reverse(arr, arr.length - 1);
		// System.out.println();
		//
		// int val = maxValue(arr, 0);
		// System.out.println(val);
		// boolean res= find(arr, 0, 45);
		// System.out.println(res);
		//
		// int fi=firstIndex(arr, 33, 0);
		// System.out.println(fi);

		// int li = lastIndex(arr, 33, 0);
		// System.out.println(li);

		int[] all = Ai(arr, 33, 0, count);
		for (int i = 0; i < all.length; i++) {
			System.out.print(all[i] + " ");
		}

	}

	public static void reverse(int[] arr, int lidx) {
		if (lidx == -1) {
			return;
		}

		System.out.print(arr[lidx] + " ");
		reverse(arr, lidx - 1);

	}

	public static int maxValue(int[] arr, int idx) {
		if (idx == arr.length) {
			return Integer.MIN_VALUE;
		}
		int data = maxValue(arr, idx + 1);
		if (data < arr[idx]) {
			return arr[idx];
		} else {
			return data;
		}

	}

	public static boolean find(int[] arr, int idx, int val) {
		if (idx == arr.length) {

			return false;
		}

		if (val == arr[idx]) {

			return true;
		} else {
			return find(arr, idx + 1, val);
		}

	}

	public static int firstIndex(int[] arr, int data, int idx) {
		if (idx == arr.length) {
			return -1;
		}
		if (arr[idx] == data) {
			return idx;
		} else {
			return firstIndex(arr, data, idx + 1);
		}
	}

	public static int lastIndex(int[] arr, int data, int idx) {
		if (idx == arr.length - 1 && arr[idx] == data) {

			return idx;
		} else if (idx == arr.length - 1 && arr[idx] != data) {
			return -1;
		}

		int li = lastIndex(arr, data, idx + 1);

		if (arr[idx] == data && idx > li) {
			return idx;
		} else if (arr[idx] == data && idx < li) {
			return li;
		} else if (arr[idx] != data && idx != li) {
			return li;
		}
		return li;

	}

	public static int[] Ai(int[] arr, int data, int idx, int count) {

		if (idx == arr.length) {
			int[] temp = new int[count];

			return temp;

		}

		if (arr[idx] == data) {
			count++;
		}

		int[] rarr = Ai(arr, data, idx + 1, count);

		if (arr[idx] == data) {
			rarr[count - 1] = idx;
		}
		return rarr;

	}

}
