package SearchingAndSorting;

public class SAS_41PairWhoseSumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 22, 28, 29, 30, 40 };
		pair(arr, 54);

	}

	public static void pair(int[] arr, int x) {
		int cudiff = 0;
		int mdiff = Integer.MAX_VALUE;
		int iidx = 0;
		int jidx = 0;

		int i = 0;
		int j = arr.length - 1;
		
		while (i < j) {
			int sum = arr[i] + arr[j];
			if (sum == x) {
				System.out.println(arr[i] + "," + arr[j]);
				return;
			} else if (sum < x) {
				
				cudiff = Math.abs(sum-x);
				
				if (cudiff < mdiff) {
					mdiff = cudiff;
					iidx = i;
					jidx = j;

				}

				i++;

			} else if (sum > x) {
				cudiff = Math.abs(sum-x);
				if (cudiff < mdiff) {
					mdiff = cudiff;
					iidx = i;
					jidx = j;

				}

				j--;

			}
		}
		System.out.println("closest pair is " + arr[jidx] + " , " + arr[iidx]);

	}

}
