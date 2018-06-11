package April8;

public class moveAllZeroToEndPreservingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 0, 6, 0, 7, 0, 0, 0, 8, 0, 0, 9, 0 };
		int st = 0;
		int idx = 0;
		while (st < arr.length) {
			if (arr[st] != 0) {
				int temp = arr[st];
				arr[st] = arr[idx];
				arr[idx] = temp;
				st++;
				idx++;

			} else if (arr[st] == 0) {
				st++;

			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " " );
		}

	}

}
