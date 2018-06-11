package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_22CountingInversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();

		}
		if(arr.length==1||arr.length==0){
			System.out.println(0);
			return;
		}

		int[] temp = mergeSort(arr, 0, arr.length - 1);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		System.out.println(noi);
	}
	static int noi=0;

	public static int[] mergeSort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] ba = new int[1];
			ba[0] = arr[lo];
			return ba;
		}
		int mid = (lo + hi) / 2;
		
		int[] ohalf = mergeSort(arr, mid + 1, hi);
		int[] fhalf = mergeSort(arr, lo, mid);
		int[] farr = merge(fhalf, ohalf);
		return farr;
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
				noi+=one.length-i;

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
