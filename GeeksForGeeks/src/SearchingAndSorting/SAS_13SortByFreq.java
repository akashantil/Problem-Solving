package SearchingAndSorting;

import java.util.Arrays;

public class SAS_13SortByFreq {
	//problem -->if we sort count array how to maintain index array with it

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 5, 2, 8, 5, 6, 8, 8, 9 };
		Arrays.sort(arr);
		int unqc = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1])
				unqc++;

		}
		int[] indxarr = new int[unqc + 1];
		int[] countarr = new int[unqc + 1];
		int count = 1;
		int idx = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				indxarr[idx] = i;
				count++;
			} else {
				countarr[idx] = count;
				idx++;
				count = 1;
				indxarr[idx] = i + 1;
			}

		}
		if (arr[arr.length - 1] == arr[arr.length - 2])

			countarr[idx] = count;

		else
			countarr[idx] = 1;

		for (int i = 0; i < countarr.length; i++) {
			System.out.print(indxarr[i] + " ");

			System.out.print(countarr[i] + " ");
			System.out.println();
		}

	}

}
