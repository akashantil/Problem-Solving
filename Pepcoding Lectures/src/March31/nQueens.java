package March31;

public class nQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[4][4];
		//nqueensReactive(board, -1, 0, "");
//		nQueensLikeSubsequence(board, 0, 0, "");
		nqueensProActive(board, -1, 0, "");

	}

	static int count = 0;

	public static void nqueensReactive(boolean[][] board, int lqpb, int qno, String psf) {
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
				nqueensReactive(board, i, qno + 1, psf + i + " ");
				board[i / board.length][i % board.length] = false;
			}

		}
	}

	public static void nqueensProActive(boolean[][] board, int lqpb, int qno, String psf) {
		if (qno == board.length) {

			if (isBoardValid(board) == true) {
				count++;
				System.out.println(count + "-->" + psf);
			}
			return;
		}

		for (int i = lqpb + 1; i < board.length * board[0].length; i++) {
			if (board[i / board.length][i % board.length] == false
					&& isQueenSafe(board, i / board.length, i % board.length) == true) {
				board[i / board.length][i % board.length] = true;
				nqueensProActive(board, i, qno + 1, psf + i + " ");
				board[i / board.length][i % board.length] = false;
			}

		}
	}

	public static void nQueensLikeSubsequence(boolean[][] board, int bno, int qno, String psf) {
		if (qno == board.length) {

			if (isBoardValid(board) == true) {
				count++;
				System.out.println(count + "-->" + psf);
			}
			return;
		}

		if (bno < board.length * board.length) {
			nQueensLikeSubsequence(board, bno + 1, qno, psf);

			if (board[bno / board.length][bno % board.length] == false
					&& isQueenSafe(board, bno / board.length, bno % board.length) == true) {

				board[bno / board.length][bno % board.length] =true;
				nQueensLikeSubsequence(board, bno + 1, qno+1, psf + " " + bno);
				board[bno / board.length][bno % board.length] =false;
			}
		}
	}

	public static boolean isBoardValid(boolean[][] chess) {
		for (int i = 0; i < chess.length; i++) {
			for (int j = 0; j < chess[0].length; j++) {
				if (chess[i][j] == true) {
					if (isQueenSafe(chess, i, j) == false) {
						return false;
					}
				}
			}
		}

		return true;
	}

	public static boolean isQueenSafe(boolean[][] board, int i, int j) {

		int[][] dirs = { { -1, 0 }, { -1, +1 }, { 0, +1 }, { +1, +1 }, { 1, 0 }, { +1, -1 }, { 0, -1 }, { -1, -1 }

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
