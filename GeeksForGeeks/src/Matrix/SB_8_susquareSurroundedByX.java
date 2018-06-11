package Matrix;

public class SB_8_susquareSurroundedByX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char [][] matrix = { 
				{'X', 'O', 'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X', 'O', 'X'},
                {'X', 'X', 'X', 'O', 'O', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'O', 'X', 'O'},
               };
		int r=matrix.length;
		int c= matrix[0].length;
		
		int [][] horiz = new int [r][c];
		int [][] vert= new int [r][c];
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				
				if(matrix[i][j]=='O'){
					horiz[i][j]=0;
					vert[i][j]=0;
				}
				else{
					horiz[i][j]=(j==0)?1:horiz[i][j-1]+1;
					vert[i][j]=(i==0)?1:vert[i-1][j]+1;
				}
			}
		}
		
		int sizee=size(matrix, horiz, vert, r, c);
		System.out.println(sizee);
		
		
		
		

	}
	public static int size(char[][]matrix,int [][]h,int [][]v,int r,int c){
		
		int max=1;
		for(int i=r-1;i>=0;i--){
			for(int j=c-1;j>=0;j--){
				
				int min = Math.min(v[i][j], h[i][j]);
				
				while(min>max){
					if(h[i-min+1][j]>=min && v[i][j-min+1]>=min){
						max=min;
					}
					min--;
					
				}
				
			}
		}
		return max;
	}

}
