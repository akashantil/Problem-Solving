package SearchingAndSorting;

public class SAS_18UnIonIntersectionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 3, 4, 5, 7 };
		int arr2[] = { 2, 3, 5, 6 };

		union(arr1, arr2);
		System.out.println();
		intersection(arr1, arr2);

	}

	public static void union(int[] arr1, int[] arr2) {
		int f = 0;
		int s = 0;
		int[] union = new int[arr1.length + arr2.length];
		int i = 0;
		for (i = 0; i < union.length && f < arr1.length && s < arr2.length; i++) {
			if (arr1[f] < arr2[s]) {
				union[i] = arr1[f];
				f++;
			} else if (arr1[f] > arr2[s]) {
				union[i] = arr2[s];
				s++;
			} else {
				union[i] = arr1[f];
				f++;
				s++;
			}

		}
		if (f == arr1.length) {
			while (s < arr2.length) {
				union[i] = arr2[s];
				i++;
				s++;
			}
		}
		if (s == arr2.length) {
			while (f < arr1.length) {
				union[i] = arr1[f];
				i++;
				f++;
			}
		}

		for (int i1 = 0; i1 < union.length; i1++) {
			if (union[i1] != 0)
				System.out.print(union[i1] + " ");

				
		}

	}
	public static void intersection(int[] arr1, int[] arr2) {
		int f = 0;
		int s = 0;
		int[] inters = new int[arr1.length ];
		int i = 0;
		for (i = 0; i < inters.length && f < arr1.length && s < arr2.length; i++) {
			if (arr1[f] < arr2[s]) {
				
				f++;
			} else if (arr1[f] > arr2[s]) {
				
				s++;
			} else {
				inters[i] = arr1[f];
				f++;
				s++;
			}

		}
		for (int i1 = 0; i1 < inters.length; i1++) {
			if (inters[i1] != 0)
				System.out.print(inters[i1] + " ");

				
		}
	}

}
