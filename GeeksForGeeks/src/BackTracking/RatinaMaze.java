package BackTracking;

public class RatinaMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = { { 1, 0, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
		int [][] solution=new int[array.length][array[0].length];
		
		
	boolean res =ratinMaze(array, solution, 0, 0);
	System.out.println(res);
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[0].length;j++){
				System.out.print(solution[i][j]);
			}
			System.out.println();
		}
		
	}
	public static boolean ratinMaze(int[][]array,int[][]sol,int r,int c){
		if(r==array.length-1&& c==array[0].length-1 && array[r][c]==1){
			
			return true;
		}
		else if(r==array.length-1&& c==array[0].length-1 && array[r][c]!=1){
			
			return false;
		}
		if(r==0&&c==0){
			sol[0][0]=1;
		}
		boolean down=false;
		boolean right=false;
		if(r+1<array.length&&c<array[0].length&&array[r+1][c]!=0 ){
			sol[r+1][c]=1;
		down=ratinMaze(array, sol, r+1, c);}
		if(r<array.length&&c+1<array[0].length&&array[r][c+1]!=0 ){
			sol[r][c+1]=1;
		right =ratinMaze(array, sol, r, c+1);
		
		
		}
		return down||right;
	}

}
