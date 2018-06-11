package April15;


public class April15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { { 1, 2, 3, 1 }, { 2, 0, 5, 2 }, { 7, 1, 1, 1 }, { 0, 0, 4, 2 } };
		// System.out.println(mincostPAthrec(maze, 0, 0));

		// System.out.println(mincostPAthrecmemo(maze, 0, 0, new
		// int[maze.length][maze[0].length]));

//		System.out.println(mincosttabular(maze));
	mincosttabularwithpath(maze);
	}

	static int counter = 0;

	public static int mincostPAthrec(int[][] maze, int sr, int sc) {

		if (sr == maze.length - 1 && sc == maze[0].length - 1) {
			return maze[sr][sc];
		}
		int h = Integer.MAX_VALUE;
		int v = Integer.MAX_VALUE;

		if (sc + 1 < maze[0].length) {
			h = maze[sr][sc] + mincostPAthrec(maze, sr, sc + 1);
		}
		if (sr + 1 < maze.length) {
			v = maze[sr][sc] + mincostPAthrec(maze, sr + 1, sc);
		}

		System.out.println(++counter + "." + sr + " " + sc + " =" + maze[sr][sc]);
		return Math.min(h, v);

	}

	public static int mincostPAthrecmemo(int[][] maze, int sr, int sc, int[][] qb) {

		if (sr == maze.length - 1 && sc == maze[0].length - 1) {
			return maze[sr][sc];
		}
		int h = Integer.MAX_VALUE;
		int v = Integer.MAX_VALUE;
		if (qb[sr][sc] != 0) {
			return qb[sr][sc];
		}

		if (sr + 1 < maze.length) {
			v = maze[sr][sc] + mincostPAthrecmemo(maze, sr + 1, sc, qb);
		}
		if (sc + 1 < maze[0].length) {
			h = maze[sr][sc] + mincostPAthrecmemo(maze, sr, sc + 1, qb);
		}

		System.out.println(++counter + "." + sr + " " + sc + " =" + maze[sr][sc]);

		qb[sr][sc] = Math.min(h, v);

		return Math.min(h, v);

	}

	public static int mincosttabular(int[][] maze) {
		int[][] qb = new int[maze.length][maze[0].length];
		qb[maze.length - 1][maze[0].length - 1] = maze[maze.length - 1][maze[0].length - 1];

		for (int i = qb.length - 1; i >= 0; i--) {
			for (int j = qb[0].length - 1; j >= 0; j--) {
				if (i == qb.length - 1) {
					if (j + 1 < maze[0].length)
						qb[i][j] = maze[i][j] + qb[i][j + 1];
				} else if (j == maze[0].length - 1) {
					if (i + 1 < maze.length)
						qb[i][j] = maze[i][j] + qb[i + 1][j];

				} else {
					qb[i][j] = maze[i][j] + Math.min(qb[i][j + 1], qb[i + 1][j]);
				}

			}
		}

		return qb[0][0];
	}

	public static void mincosttabularwithpath(int[][] maze) {
		int[][] qb = new int[maze.length][maze[0].length];
		String [][] path = new String [maze.length][maze[0].length];
		qb[maze.length - 1][maze[0].length - 1] = maze[maze.length - 1][maze[0].length - 1];
		path[maze.length - 1][maze[0].length - 1]="";

		for (int i = qb.length - 1; i >= 0; i--) {
			for (int j = qb[0].length - 1; j >= 0; j--) {
				if (i == qb.length - 1) {
					if (j + 1 < maze[0].length){
						path[i][j]="H"+path[i][j+1];
						qb[i][j] = maze[i][j] + qb[i][j + 1];
					}
				} else if (j == maze[0].length - 1) {
					if (i + 1 < maze.length){
						path[i][j]="V"+path[i+1][j];
						qb[i][j] = maze[i][j] + qb[i + 1][j];
					}

				} else {
					if(qb[i][j+1]<qb[i+1][j]){
						path[i][j]="H"+path[i][j+1];
						qb[i][j] = maze[i][j]+qb[i][j+1];
					}
					else{
						path[i][j]="V"+path[i+1][j];
						qb[i][j] = maze[i][j]+qb[i+1][j];
					}
					
				}

			}
		}

		System.out.println(qb[0][0] +" path is "+path[0][0]);
	}
}
