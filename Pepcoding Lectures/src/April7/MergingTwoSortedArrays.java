package April7;

public class MergingTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] one = { 10, 20, 30, 40, 50 };
//		int[] two = { 11, 15, 21, 25, 29, 35 };
//		int[] res = merge(one, two);
		
		int [] res={10,-3,2,0,12,45,55,67,99};
		res=mergeSort(res, 0, res.length-1);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}

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
	public static int [] mergeSort(int []arr,int lo,int hi){
		if(lo==hi){
			int [] ba = new int[1];
			ba[0]=arr[lo];
			return ba;
		}
		int mid=(lo+hi)/2;
		int [] fhalf= mergeSort(arr, lo, mid);
		int []ohalf=mergeSort(arr, mid+1, hi);
		int []farr=merge(fhalf, ohalf);
		return farr;
	}

}
