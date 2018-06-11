package BackTracking;

public class LandMines {
	static String fpsf=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				         { 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
				         { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 },
				         { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 },
				         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				         { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 }, 
				         { 1, 0, 1, 1, 1, 1, 1, 1, 0, 1 }, 
				         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, 
				         { 0, 1, 1, 1, 1, 0, 1, 1, 1, 1 }, 
				         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				         { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 }

		};
		int[][] tc = new int[maze.length][maze[0].length];
		markInvalidPoints(maze);
		
		for(int i=0;i<maze.length;i++){
			path(maze, tc, i, 0, "");
		}
		System.out.println(fpsf);
		System.out.println(fpsf.length());
		
	
	}

	public static void markInvalidPoints(int[][] maze) {
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if (maze[i][j] == 0) {
					if (i - 1 >= 0 && maze[i-1][j]!=0)
						maze[i - 1][j] = 2;
					if (i + 1 < maze.length && maze[i+1][j]!=0)
						maze[i + 1][j] = 2;
					if (j - 1 >= 0 && maze[i][j-1]!=0)
						maze[i][j - 1] = 2;
					if (j + 1 < maze[0].length && maze[i][j+1]!=0)
						maze[i][j + 1] = 2;
				}
			}
		}
	}
	
	
	
	public static void path(int[][]maze,int[][]tc,int row,int col,String psf){
		if( col==maze[0].length -1){
			if(fpsf==null){
				fpsf=psf;
				
			}
			else if(psf.length()<fpsf.length()){
				fpsf=psf;
				
				
			}
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
		else if(maze[row][col]==2|| tc[row][col]==1||maze[row][col]==0)
			return true;
		else
			return false;
	}

}


