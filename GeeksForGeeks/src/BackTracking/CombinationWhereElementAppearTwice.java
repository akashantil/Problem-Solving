package BackTracking;

public class CombinationWhereElementAppearTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		String ques = "";
		for (int i = 1; i <= n; i++) {
			ques += i;

		}
		// System.out.println(ques);

		int[] arr = new int[2 * n];
//		combo(ques, arr, 0);
		combi(1, n, arr);
	}

	//fuddu
	public static void combo(String ques, int[] arr, int idx) {
		if (ques.length() == 0) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 0)
					return;

			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");

			}
			System.out.println();
		}

		for (int i = 0; i < ques.length() && idx < arr.length; i++) {
			char ch = ques.charAt(i);
			String bp = ques.substring(0, i);
			String ap = ques.substring(i + 1);
			if (idx + (ch - '0') + 1 < arr.length && arr[idx] == 0 && arr[idx + (ch - '0') + 1] == 0) {
				arr[idx] = ch - '0';
				arr[idx + (ch - '0') + 1] = ch - '0';

				combo(bp + ap, arr, idx + 1);

				arr[idx + (ch - '0') + 1] = 0;

				arr[idx] = 0;
				if (idx >= 1)
					idx -= 1;

			} else if (idx + (ch - '0') + 1 < arr.length && (arr[idx] != 0 || arr[idx + (ch - '0') + 1] != 0))
				combo(bp + ap, arr, idx + 1);
		}

	}
//better
	public static void combi(int elem, int n, int[] arr) {
		if (elem > arr.length / 2) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0 && i + elem + 1 < arr.length && arr[i + 1 + elem] == 0) {
				arr[i] = elem;
				arr[i + elem + 1] = elem;
				combi(elem + 1, n, arr);
				arr[i] = 0;
				arr[i + elem + 1] = 0;

			}
		}
	}
}
