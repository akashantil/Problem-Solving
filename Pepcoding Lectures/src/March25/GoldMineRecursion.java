package March25;

public class GoldMineRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] maze ={
				{2,4,1,0},
				{5,7,0,7},
				{0,9,8,2},
				{6,3,2,1}
		};
		int[][] tc = new int[maze.length][maze[0].length];
		int max=miner(maze, 0, 0, tc);
		System.out.println(max);

	}

	public static int miner(int[][] maze, int row, int col, int[][] tc) {

		if (isValid(row, col, maze, tc) == true)
			return 0;
		tc[row][col] = 1;
		int a = maze[row][col] + miner(maze, row + 1, col + 1, tc);
		int b = maze[row][col] + miner(maze, row + 1, col + 1, tc);
		int c = maze[row][col] + miner(maze, row, col, tc);
		tc[row][col] = 1;
		
		
		
		return Math.max(a,Math.max(b, c));

	}

	public static boolean isValid(int row, int col, int[][] maze, int[][] tc) {

		if (row < 0 || row >= maze.length)
			return true;
		else if (col < 0 || col >= maze[0].length)
			return true;
		else if (maze[row][col] == 0 || tc[row][col] == 1)
			return true;
		else
			return false;
	}

}
