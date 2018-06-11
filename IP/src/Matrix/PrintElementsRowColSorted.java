package Matrix;

import java.util.PriorityQueue;

public class PrintElementsRowColSorted {

	public static class pair implements Comparable<pair> {
		int value;
		int row;
		int col;

		pair(int value,int row,int col){
		this.value=value;
		this.row=row;
		this.col=col;}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return this.value-o.value;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 }, };

		PriorityQueue<pair> pq = new PriorityQueue<>();

		for (int i = 0; i < matrix.length; i++){
			pair a= new pair(matrix[i][0], i,0);
			pq.add(a);

		}
		for (int j = 0; j < matrix[0].length; j++) {
			for (int k = 1; k < matrix.length; k++) {

				

					pair x = pq.remove();
					System.out.print(x.value + " ");
					
					pair a= new pair(matrix[x.row][x.col+1],x.row,x.col+1);
					pq.add(a);

				
			}

		}
		while (!pq.isEmpty()) {
			pair x = pq.remove();
			System.out.print(x.value + " ");

		}

	}

}
