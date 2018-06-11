package Matrix;

public class SB_9_MatrixRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };

	int row=0;
	int col=0;
	int ridx=matrix.length;
	int cidx=matrix[0].length;
	int prev = matrix[0][0];
	int curr=0;
	
	while(row<ridx && col<cidx){
		
		if(row+1==ridx ||col+1==cidx){
			break;
		}
		prev = matrix[row + 1][col];
		
		for(int i=col;i<cidx;i++){
			curr=matrix[row][i];
			matrix[row][i]=prev;
			prev=curr;
			
		}
		row++;
		
		
		for(int i=row;i<ridx;i++){
			curr=matrix[i][cidx-1];
			matrix[i][cidx-1]=prev;
			prev=curr;
			
		}
		cidx--;
		
		for(int i=cidx-1;i>=col;i--){
			curr=matrix[ridx-1][i];
			matrix[ridx-1][i]=prev;
			prev=curr;
			
		}
		ridx--;
		
		
		for(int i=ridx-1;i>=row;i--){
			curr=matrix[i][col];
			matrix[i][col]=prev;
			prev=curr;
			
		}
		col++;
		
		
		
		
		
	}
		
	for(int i=0;i<matrix.length;i++){
		for(int j=0;j<matrix[0].length;j++){
			System.out.print(matrix[i][j]+"    ");
			
		}
		System.out.println();
	}
	}

}
