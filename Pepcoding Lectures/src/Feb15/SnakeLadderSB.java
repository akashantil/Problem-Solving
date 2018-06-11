package Feb15;

public class SnakeLadderSB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test case 1 ans win
		// int[] moves = { 6,1, 2, 2, 2, 2, 2, 2, 4, 2, 2, 2, 2, 2 };
		// test case 2 ans 19
		// int[] moves = { 6,2, 2, 2, 2, 2, 2, 2, 4, 2, 2, 2, 2, 2 };
		// test case 3 ans 0
		int[] moves = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };

		int[] board = new int[21];
		board[3] = 19;
		board[5] = 13;
		board[11] = 7;
		board[17] = 3;

		int loc = 0;
		for (int i = 0; i < moves.length; i++) {
			// PArt 1
			if (loc == 0) {
				if (moves[i] == 1 || moves[i] == 6) {
					loc = 1;
					continue;
				} else {
					continue;
				}

			} else {
				// Part 2
				if ((loc + moves[i]) < board.length) {
					loc = loc + moves[i];
					if (board[loc] != 0) {
						loc = board[loc];
					}

				}

				if (loc == board.length - 1) {
					System.out.println("win");
					return;
				}
			}
		}
		System.out.println(loc);

	}

}
