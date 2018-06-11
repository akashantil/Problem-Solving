package BackTracking;

public class KnightTour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = new int[8][8];
		int[][] temp = new int[8][8];
		temp[0][0] = 1;

		knightPath(board, temp, 0, 0);

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(board[i][j] + "\t");
			}
			System.out.println();
		}

	}

	static int count = 1;
	static int[] xmoves = { 1, 2, 2, -2, -2, -1, 1, -1, 1 };
	static int[] ymoves = { 2, 1, -1, 1, -1, 2, 2, -2, -2 };

	public static void knightPath(int[][] board, int[][] temp, int row, int col) {
		if (count == 63) {
			return;
		}
		// if (row + 1 <= 7 && col + 2 <= 7 && temp[row + 1][col + 2] == 0) {
		// board[row + 1][col + 2] = count;
		// temp[row + 1][col + 2] = 1;
		// count++;
		// knightPath(board, temp, row + 1, col + 2);
		//
		// }
		//
		// if (row + 2 <= 7 && col + 1 <= 7 && temp[row + 2][col + 1] == 0) {
		// board[row + 2][col + 1] = count;
		// temp[row + 2][col + 1] = 1;
		// count++;
		// knightPath(board, temp, row + 2, col + 1);
		//
		// }
		//
		// if (row + 2 <= 7 && col - 1 >= 0 && temp[row + 2][col - 1] == 0) {
		// board[row + 2][col - 1] = count;
		// temp[row + 2][col - 1] = 1;
		// count++;
		// knightPath(board, temp, row + 2, col - 1);
		//
		// }
		//
		// if (row - 2 >= 0 && col + 1 <= 7 && temp[row - 2][col + 1] == 0) {
		// board[row - 2][col + 1] = count;
		// count++;
		// temp[row - 2][col + 1] = 1;
		//
		// knightPath(board, temp, row - 2, col + 1);
		// }
		//
		// if (row - 2 >= 0 && col - 1 >= 0 && temp[row - 2][col - 1] == 0) {
		// board[row - 2][col - 1] = count;
		// temp[row - 2][col - 1] = 1;
		// count++;
		// knightPath(board, temp, row - 2, col - 1);
		//
		// }
		//
		// if (row - 1 >= 0 && col + 2 <= 7 && temp[row - 1][col + 2] == 0) {
		// board[row - 1][col + 2] = count;
		// temp[row - 1][col + 2] = 1;
		// count++;
		// knightPath(board, temp, row - 1, col + 2);
		//
		// }
		// if (row + 1 <= 7 && col + 2 <= 7 && temp[row + 1][col + 2] == 0) {
		// board[row + 1][col + 2] = count;
		// temp[row + 1][col + 2] = 1;
		// count++;
		// knightPath(board, temp, row + 1, col + 2);
		//
		// }
		//
		// if (row + 1 <= 7 && col - 2 >= 0 && temp[row + 1][col - 2] == 0) {
		// board[row + 1][col - 2] = count;
		// temp[row + 1][col - 2] = 1;
		// count++;
		// knightPath(board, temp, row + 1, col - 2);
		//
		// }
		//
		// if (row - 1 >= 0 && col - 2 >= 0 && temp[row - 1][col - 2] == 0) {
		// board[row - 1][col - 2] = count;
		// temp[row - 1][col - 2] = 1;
		// count++;
		// knightPath(board, temp, row - 1, col - 2);
		//
		// }

		for (int i = 0; i < xmoves.length; i++) {

			if (row + xmoves[i] >= 0 && row+xmoves[i]<=7 && col + ymoves[i] >= 0 && col + ymoves[i] <=7 && temp[row + xmoves[i]][col + ymoves[i]] == 0) {
				board[row + xmoves[i]][col + ymoves[i]] = count;
				temp[row + xmoves[i]][col + ymoves[i]] = 1;
				count++;
				knightPath(board, temp, row + xmoves[i], col + ymoves[i]);
			}

		}
	}

}
