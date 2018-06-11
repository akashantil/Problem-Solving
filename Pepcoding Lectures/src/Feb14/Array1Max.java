package Feb14;

public class Array1Max {

	public static void main(String[] args) {

		int[] arr = { 11, 55, 9, 88, 17, 24,99

		};
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			} else {

			}

		}
		System.out.println(max);
		// TODO Auto-generated method stub

	}

}
