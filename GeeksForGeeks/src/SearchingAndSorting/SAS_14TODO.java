package SearchingAndSorting;

public class SAS_14NoOfInversions {
//left TODO
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 20, 6, 4, 5 };

	}

	public static int merge(int[] one, int[] two) {

		int noi = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] <= two[j]) {

				noi++;
				i++;
			} else {

				j++;

			}
			k++;
		}

		while (j < two.length) {

			j++;
			k++;

		}

		while (i < one.length) {

			i++;
			k++;

		}
		return noi;

	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] ba = new int[1];
			ba[0] = arr[lo];
			return ba;
		}
		int noi = 0;
		int mid = (lo + hi) / 2;
		int[] fhalf = mergeSort(arr, lo, mid);
		int[] ohalf = mergeSort(arr, mid + 1, hi);
		int inv=merge(fhalf, ohalf);

		
		return fhalf;
	}
}
