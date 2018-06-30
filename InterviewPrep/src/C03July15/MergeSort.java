package C03July15;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 1, 0, 4, 5, 7, -3, 10 };

		int[] sorted = mergeSort(arr, 0, arr.length - 1);
		for (int i = 0; i < sorted.length; i++)
			System.out.print(sorted[i] + " ");

	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {
		if (lo==hi) {
			int [] ba= new int [1];
			ba[0]=arr[lo];
			return ba;
		}
		
		

		int mid = (lo + hi) / 2;

		int[] left = mergeSort(arr, lo, mid);
		int[] right = mergeSort(arr, mid + 1, hi);

		int[] merged = mergeProcedure(left, right);

		return merged;
	}

	public static int[] mergeProcedure(int[] left, int[] right) {

		int[] merged = new int[left.length + right.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				merged[k] = left[i];

				i++;
			} else {
				merged[k] = right[j];
				j++;
			}
			k++;

		}
		while ( j != right.length) {
			merged[k] = right[j];
			j++;
			k++;

		}
		while (i != left.length ) {
			merged[k] = left[i];
			i++;
			k++;

		}
		return merged;

	}
	public static int[] merge(int[] one, int[] two) {

		int[] result = new int[one.length + two.length];

		int i = 0;
		int j = 0;
		int k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] <= two[j]) {
				result[k] = one[i];
				i++;
			} else {
				result[k] = two[j];
				j++;

			}
			k++;
		}

		while (j < two.length) {
			result[k] = two[j];
			j++;
			k++;

		}

		while (i < one.length) {
			result[k] = one[i];
			i++;
			k++;

		}
		return result;
	}


}
