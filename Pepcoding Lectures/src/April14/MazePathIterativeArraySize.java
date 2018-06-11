package April14;

public class MazePathIterativeArraySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mazepath(0, 0, 3, 3));

	}

	public static int mazepath(int sr, int sc, int dr, int dc) {

		int[] qb = new int[dr + dc + 2];

		
		

		for (int r = dr; r >= 0; r--) {
			for (int c = dc; c >= 0; c--) {

				if (c == dc && r == dr) {
					qb[c] = 1;
					qb[c+4]=1;
				} else if (c == dc) {
					qb[r + 4] = 1;
				} else if (r == dr) {
					qb[c] = 1;
				} else {

					qb[r+4]+=qb[r]+qb[c+4];
					
			}
		}
			qb[0]=qb[4];
			qb[1]=qb[5];
			qb[2]=qb[6];
			qb[3]=qb[7];
		

	}
		return qb[0];

}
}
