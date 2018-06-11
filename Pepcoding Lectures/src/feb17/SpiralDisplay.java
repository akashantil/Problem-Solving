package feb17;

public class SpiralDisplay {

	public static void main(String[] args) {

		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		SpiralDisplayer(arr);
		// TODO Auto-generated method stub

	}

	public static void SpiralDisplayer(int[][] arr) {
		int r = 0, c = 0;
		int tr = arr.length - 1;
		int tc = arr[0].length - 1;
		int dir = 0;
		int tn = arr.length * arr[0].length;
		while (tn > 0) {

			if (dir == 0) {
				if (r != tr) {
					System.out.println(arr[r][c]);
					tn--;
					r++;
				} else {
					System.out.println(arr[r][c]);
					dir = 1;
					c++;
					tc--;
					tn--;

				}
			}
			else if (dir == 1) {
				if (c <= tc) {
					System.out.println(arr[r][c]);
					c++;
					tn--;

				} else {
					System.out.println(arr[r][c]);
					dir = 2;
					r--;
					tr--;
					tn--;

				}
			}

			 else if (dir == 2)
			 {
				if (r <=tr) {
					System.out.println(arr[r][c]);
					r--;
					tn--;
				} else {
					System.out.println(arr[r][c]);
					dir = 3;
					c--;
					tc--;
					tn--;

				}

			}
			
			 else if (dir == 3)
			 {
				if (r <=tr) {
					System.out.println(arr[r][c]);
					c--;
					tn--;
				} else {
					System.out.println(arr[r][c]);
					dir = 3;
					r++;
					tr--;
					tn--;

				}

			}

		}

	}
}
