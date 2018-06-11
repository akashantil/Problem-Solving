package Feb16;

public class ArrayRotation {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int[] arr = { 5, 8, 9, 3, 7 };
		
		int r = 2;
		
		r = r % (arr.length);
		int[] temp;
		temp = new int[r];

		for (int i = 0; i < r; i++) {

			temp[i] = arr[arr.length - r + i];
		}

		for (int i = arr.length - 1 - r; i >= 0; i--) {
			arr[i + r] = arr[i];

		}
		for (int i = 0; i < r; i++) {
			arr[i] = temp[i];
		}

		for (int i = 0; i < arr.length; i++) {
		
			System.out.print(arr[i]+ " ");
		}
	}

}
