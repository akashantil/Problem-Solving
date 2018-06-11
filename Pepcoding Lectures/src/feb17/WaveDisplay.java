package feb17;

public class WaveDisplay {

	public static void main(String[] args) {

		int[][] arr = { { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 }, { 31, 32, 33, 34, 35 },
				{ 41, 42, 43, 44, 45 } };

		WaveDisplayer(arr);
		// TODO Auto-generated method stub

	}

	public static void WaveDisplayer(int[][] arr) {
		int dir = 0;
		int r = 0, c = 0;
		int tt = ((arr.length) * (arr[0].length));
		while (tt > 0) {
			if (dir == 0) {

				if (r == arr.length - 1) {
					System.out.println(arr[r][c] + " ");
					c++;
					dir = 1;
					tt--;
				} else {
					System.out.println(arr[r][c] + " ");
					r++;
					tt--;
				}
			}
			else if (dir == 1) {

				if (r != 0) {

					System.out.println(arr[r][c] + " ");
					r--;
					tt--;
				} else if (r == 0) {
					System.out.println(arr[r][c] + " ");
					c++;
					dir = 0;
					tt--;
				}
			}

		}
	}

}
