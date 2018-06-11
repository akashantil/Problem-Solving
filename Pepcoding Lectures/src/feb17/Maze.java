package feb17;

public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] maze = { { 0, 0, 1, 0 }, { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 1, 0, 1, 0 }

		};
		
		exitPoint(maze);

	}

	public static void exitPoint(int[][] arr) {
	int r=0,c=0,dir=0;
	while(r<(arr.length) && c<(arr[0].length)){
		if(r==-1 || c==-1){
			
			System.out.println(r);
			System.out.println(c);
			return;
		}
		if(dir==0 && arr[r][c]==0)
		{
			c++;
		}
		else if(dir==0 && arr[r][c]==1){
			
			dir=1;
			r++;
			
			
			
		}
		else if(dir==1 && arr[r][c]==0){
			r++;
		}
		else if(dir==1 && arr[r][c]==1){
			
			dir=2;
			c--;
			
			
		}
		else if(dir==2 && arr[r][c]==0){
			c--;
			
		}
		else if(dir==2 && arr[r][c]==1){
			
			dir=3;
			r--;
		}
		else if(dir==3 && arr[r][c]==0){
			r--;
		}
		else {
			dir=0;
			c++;
			
		}
		
	}
	System.out.print(r+" ");
	System.out.print(c);
	}
	}


