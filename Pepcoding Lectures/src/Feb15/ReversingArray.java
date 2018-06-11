package Feb15;

public class ReversingArray {

	public static void main(String[] args) {
		int[] arr = { 55, 92, 35, 17, 11, 48 };
		int i = 0;
		int j = arr.length - 1;
		for (i = 0; i <=j; i++) {
			int temp = arr[i];

			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}
		// TODO Auto-generated method stub

		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
