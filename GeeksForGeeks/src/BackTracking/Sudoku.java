package BackTracking;



public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] board = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

		
		
		
	boolean res=	sudokoSolver(board);
	System.out.println(res);
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static boolean colSafe(int[][] maze, int row, int col, int no) {
		for (int i = 0; i < 9; i++) {
			if (maze[i][col] == no)
				return false;

		}
		return true;
	}

	public static boolean rowSafe(int[][] maze, int row, int col, int no) {
		for (int i = 0; i < 9; i++) {
			if (maze[row][i] == no)
				return false;

		}
		return true;
	}
	public static boolean blockSafe(int [][]maze ,int row, int col,int no){
		int blockrow=row-row%3;
		int blockcol=col-col%3;
		for(int i=blockrow;i<blockrow+3;i++){
			for(int j=blockcol;j<blockcol+3;j++){
				if(maze[i][j]==no) 
					return false;
			}
		}
		return true;
	}
	public static boolean isSafetoPlace(int[][]maze,int row,int col,int no){
		if(!rowSafe(maze, row, col, no))
			return false;
		if(!colSafe(maze, row, col, no))
			return false;
		if(!blockSafe(maze, row, col, no))
		    return false;
		
		
		return true;
	}
	public static boolean sudokoSolver(int[][]maze){
		int row=-1;
		int col=-1;
		boolean isEmpty=false;
		for(int i=0;i<maze.length;i++){
			for(int j=0;j<maze[0].length;j++){
				if(maze[i][j]==0){
					isEmpty=true;
					row=i;
					col=j;
					break;
				}
			}
			if(isEmpty) break;
		}
		if(!isEmpty)
			return true;
		
		for(int i=1;i<=9;i++){
			if(isSafetoPlace(maze, row, col, i)){
				maze[row][col]=i;
				if(sudokoSolver(maze))
					return true;
				maze[row][col]=0;
			}
		}
		return false;
		
	}

}
