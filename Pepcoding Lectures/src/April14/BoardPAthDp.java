package April14;

public class BoardPAthDp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int src = 0;
		int des = 10;
		int no = boardPath(src, des, new int[des + 1]);
		System.out.println(no);

	}

	public static int boardPath(int src, int des, int[] boardmoves) {
		if (src == des) {
			return 1;

		}

		int pa = 0;
		if (boardmoves[src] != 0) {
			return boardmoves[src];
		}
		for (int i = 1; i <= 6; i++) {
			int inter = src + i;
			if (inter <= des) {
				int cp = boardPath(inter, des, boardmoves);
				pa += cp;

			}

		}
		boardmoves[src] = pa;
		return pa;

	}

}
