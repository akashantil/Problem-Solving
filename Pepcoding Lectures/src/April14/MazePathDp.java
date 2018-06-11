package April14;

public class MazePathDp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = cmp(0, 0, 4, 4, new int[5][5]);
		System.out.println(count);

	}

	public static int cmp(int sr, int sc, int dr, int dc, int[][] qb) {
		if (sr == dr && sc == dc) {
			return 1;
		}

		if (qb[sr][sc] != 0)
			return qb[sr][sc];
		int right = 0;
		int down = 0;
		if (sc + 1 < qb[0].length)
			right = cmp(sr, sc + 1, dr, dc, qb);

		if (sr + 1 < qb.length)
			down = cmp(sr + 1, sc, dr, dc, qb);
		
		System.out.println(sr+" "+sc+" = "+(right+down));

		qb[sr][sc] = right + down;
		


		return right + down;

	}

}
