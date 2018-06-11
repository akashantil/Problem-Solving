package feb17;

public class MazeSB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { { 0, 0, 1, 0 }, { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 1, 0, 1, 0 }

		};

		exitPoint(maze);

	}

	public static void exitPoint(int[][] arr) {
		int r = 0, c = 0, dir = 0;
		while (true) {
			dir = (dir + arr[r][c]) % 4;

			if (dir == 0) {
				if (c < arr[0].length - 1)
					c++;
				else {
					System.out.println(r + " " + c);
					break;
				}
			} else if (dir == 1) {
				if (r < arr.length - 1)
					r++;
				else {
					System.out.println(r + " " + c);
					break;

				}
			} else if (dir == 2) {
				if (c != 0)
					c--;
				else {
					System.out.println(r + " " + c);
					break;

				}

			} else {
				if (r != 0)
					r--;
				else {
					System.out.println(r + " " + c);
					break;

				}
			}

		}

	}

}
