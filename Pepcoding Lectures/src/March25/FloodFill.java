package March25;

public class FloodFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] maze = { { 1, 0, 1, 1 },
				         { 1, 1, 1, 1 }, 
				         { 1, 0, 1, 1 }, 
				         { 1, 1, 0, 1 } };
        int [][] tc = new int[maze.length][maze[0].length];
        
        path(maze, tc, 0, 0, "");
	}
	public static void path(int[][]maze,int[][]tc,int row,int col,String psf){
		if(row==maze.length -1 && col==maze[0].length -1){
			System.out.println(psf);
			return;
		}
		
		
		if(isValid(row, col, maze, tc)==true)
			return;
		
		tc[row][col]=1;
		path(maze, tc, row, col+1, psf+"R");
		path(maze, tc, row+1, col, psf+"D");
		path(maze, tc, row, col-1, psf+"L");
		path(maze, tc, row-1, col, psf+"U");
		tc[row][col]=0;
		
	}
	public static boolean isValid(int row,int col,int[][]maze,int [][]tc){
		
		if(row<0 || row>=maze.length)
			return true;
		else if(col<0 || col>=maze[0].length)
			return true;
		else if(maze[row][col]==0|| tc[row][col]==1)
			return true;
		else
			return false;
	}

}
