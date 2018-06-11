package GeeksArraysArrangements;

public class ArrayZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 4, 3, 7, 8, 6, 2, 1 };

		boolean flag = true;
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (flag) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

				}
			} else {
				if (arr[i] < arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

				}

			}
			flag = !flag;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
