package Matrix;

public class SB_10_CommonElementsInRowWiseSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2, 3, 4, 5 }, { 2, 4, 5, 8, 10 }, { 1, 6, 7, 9, 11 }, };
		int row = matrix.length;
		int col = matrix[0].length;
		
		

		int[] temp = new int[row];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = col - 1;

		}
		int mrow=0;
		while(temp[mrow]>=0){
		for(int i=0;i<row;i++){
			if(matrix[i][temp[i]]<matrix[mrow][temp[mrow]]){
				mrow=i;
			}
			
			
		}
		int eqc=0;
		for(int i =0;i<row;i++){
			if(matrix[i][temp[i]]>matrix[mrow][temp[mrow]]){
				
				if(temp[i]==0){
					System.out.println("-1");
					return;
				}
				
				temp[i]--;
				
			}
			else
				eqc++;
		}
		
		if(eqc==row){
			System.out.println(matrix[mrow][temp[mrow]]);
			return;
		}
		
		}
		
		

	}

}
