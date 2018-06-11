package march24;

public class floodFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VUHVVLVHVHUUHUHUHVVLVHV
		int [][] maze ={
				{1,1,1,0,1,1},
				{1,0,0,1,1,1},
				{1,0,1,1,1,1},      
				{1,1,1,0,1,1},
				{1,1,1,1,0,1},
		};
		int [][]tc= new int [maze.length][maze[0].length];
		path(maze, tc, 0, 0,"");

	}
	public static void path(int[][] maze,int [][]tc,int row,int col,String asf){
		if(row==maze.length-1 && col==maze[0].length-1){
			System.out.println(asf);
			return;
		}
		
		
		//right
		if(col+1<maze[0].length && tc[row][col+1]==0&&maze[row][col+1]!=0){
			tc[row][col]=1;
			path(maze, tc, row, col+1,asf+"R");
			tc[row][col]=0;
			
		}
		//down
		if(row+1<maze.length && tc[row+1][col]==0&&maze[row+1][col]!=0){
			tc[row][col]=1;
			path(maze, tc, row+1, col,asf+"D");
			tc[row][col]=0;
			
		}
		//left
		if(col-1>=0 && tc[row][col-1]==0&& maze[row][col-1]!=0){
			tc[row][col]=1;
			path(maze, tc, row, col-1,asf+"L");
			tc[row][col]=0;
		}
		//up
		if(row-1>=0 && tc[row-1][col]==0 && maze[row-1][col]!=0){
			tc[row ][col]=1;
			path(maze, tc, row-1, col,asf+"U");
			tc[row][col]=0;
		}
		
		
	}

}
