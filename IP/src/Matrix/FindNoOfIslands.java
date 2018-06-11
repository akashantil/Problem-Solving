package Matrix;

public class FindNoOfIslands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 1 }, { 1, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1 } };

		System.out.println(noi(arr));
	}

	public static int noi(int[][] arr) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 1) {
					count++;
					markisland(arr, i, j);

				}

			}
		}
		return count;

	}

	public static void markisland(int[][] arr, int i, int j) {

		
		if (isvalid(arr, i, j) == false)
			return;

		arr[i][j] = 0;

		markisland(arr, i + 1, j);
		markisland(arr, i + 1, j + 1);
		markisland(arr, i + 1, j - 1);
		markisland(arr, i - 1, j + 1);
		markisland(arr, i - 1, j);
		markisland(arr, i - 1, j - 1);
		markisland(arr, i, j + 1);
		markisland(arr, i, j - 1);
	}

	private static boolean isvalid(int[][] arr, int i, int j) {

		if (i < 0 || i >= arr.length || j < 0 || j >= arr.length || arr[i][j] == 0)
			return false;
		// TODO Auto-generated method stub
		return true;

	}

}
