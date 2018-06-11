package Recursion;

public class QuickSortPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int qspartition(int[] arr, int low, int high) {

		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j <= high; j++) {
			if (arr[j] <= pivot) {
				// increment i and swap
				i++;

				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;

			}
		}
		// swap[i+1] and high
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;

	}

}
