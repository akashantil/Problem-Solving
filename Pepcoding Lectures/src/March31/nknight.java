package March31;

public class nknight {

	public static void main(String[] args) {

		boolean[][] board = new boolean[4][4];
		nKnightLikeSubsequence(board, 0, 0, "");
//		nKnightProActive(board, -1, 0, "");
//		nKnightReactive(board, -1, 0, "");

	}

	static int count = 0;
	public static void nKnightReactive(boolean[][] board, int lqpb, int qno, String psf) {
		if (qno == board.length) {

			if (isBoardValid(board) == true) {
				count++;
				System.out.println(count + "-->" + psf);
			}
			return;
		}

		for (int i = lqpb + 1; i < board.length * board[0].length; i++) {
			if (board[i / board.length][i % board.length] == false) {
				board[i / board.length][i % board.length] = true;
				nKnightReactive(board, i, qno + 1, psf + i + " ");
				board[i / board.length][i % board.length] = false;
			}

		}
	}

	public static void nKnightProActive(boolean[][] board, int lqpb, int qno, String psf) {
		if (qno == board.length) {

			if (isBoardValid(board) == true) {
				count++;
				System.out.println(count + "-->" + psf);
			}
			return;
		}

		for (int i = lqpb + 1; i < board.length * board[0].length; i++) {
			if (board[i / board.length][i % board.length] == false
					&& isKnightSafe(board, i / board.length, i % board.length) == true) {
				board[i / board.length][i % board.length] = true;
				nKnightProActive(board, i, qno + 1, psf + i + " ");
				board[i / board.length][i % board.length] = false;
			}

		}
	}

	public static void nKnightLikeSubsequence(boolean[][] board, int bno, int qno, String psf) {
		if (qno == board.length) {

			if (isBoardValid(board) == true) {
				count++;
				System.out.println(count + "-->" + psf);
			}
			return;
		}

		if (bno < board.length * board.length) {
			nKnightLikeSubsequence(board, bno + 1, qno, psf);

			if (board[bno / board.length][bno % board.length] == false
					&& isKnightSafe(board, bno / board.length, bno % board.length) == true) {

				board[bno / board.length][bno % board.length] =true;
				nKnightLikeSubsequence(board, bno + 1, qno+1, psf + " " + bno);
				board[bno / board.length][bno % board.length] =false;
			}
		}
	}


	
	public static boolean isBoardValid(boolean[][] chess) {
		for (int i = 0; i < chess.length; i++) {
			for (int j = 0; j < chess[0].length; j++) {
				if (chess[i][j] == true) {
					if (isKnightSafe(chess, i, j) == false) {
						return false;
					}
				}
			}
		}

		return true;
	}
	
	
	
	

	public static boolean isKnightSafe(boolean[][] board, int i, int j) {

		int[][] dirs = { { 1, 2 }, { 2, +1 }, { 2, -1 }, { -2, +1 }, { -2, -1 }, { -1, 2 }, { -1, -2 }, { 1, -2 }

		};

		for (int k = 0; k < dirs.length; k++) {
			int radius = 1;
			while (true) {
				int rdash = i + radius * dirs[k][0];
				int cdash = j + radius * dirs[k][1];

				if (cdash < 0 || cdash >= board.length) {
					break;
				}
				if (rdash < 0 || rdash >= board.length) {
					break;
				}
				if (board[rdash][cdash] == true)
					return false;

				radius++;
			}

		}

		return true;

	}
}
