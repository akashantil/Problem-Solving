package April8;

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 0, 2, 2, 2, 1, 1, 1, 2, 2, 0, 0, 0, 1, 1, 1, 2, 2 };

		int i = 0;
		int j = 0;
		int k = arr.length - 1;
		while (j <= k) {
			if (arr[j] == 2) {
				int temp = arr[k];
				arr[k] = arr[j];
				arr[j] = temp;
				k--;

			} else if (arr[j] == 1) {
				j++;

			} else if (arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;

			}

		}
		for (int i1 = 0; i1 < arr.length; i1++) {
			System.out.print(arr[i1] + " ");
		}

	}

}
