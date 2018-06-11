package April14;

public class MazepathIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mazepath(0, 0, 4, 4));

	}

	public static int mazepath(int sr, int sc, int dr, int dc) {

		int qb[][] = new int[dr + 1][dc + 1];

		qb[dr][dc] = 1;
		for (int r = dr; r >= 0; r--) {
			for (int c = dc; c >= 0; c--) {

				if (c + 1 <= dc) {
					qb[r][c] += qb[r][c + 1];
				}  if (r + 1 <= dr) {
					qb[r][c] += qb[r + 1][c];
				}
			}
		}
		return qb[0][0];

	}

}
