package Matrix;

public class SB1_DiagonalTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 }, };

		int r = 0;
		int c = 0;
		// start from row=0 and print diagonally till last row
		while (r < matrix.length) {
			int tr = r;
			while (tr >= 0 && c < matrix[0].length) {
				System.out.print(matrix[tr][c] + " ");
				tr--;
				c++;
			}
			System.out.println();
			r++;
			c = 0;
		}
		// start from last row and print diagonally till last col
		r = matrix.length - 1;
		c = 1;
		while (c < matrix[0].length) {
			int tc = c;
			while (tc < matrix[0].length && r >= 0) {
				System.out.print(matrix[r][tc] + " ");
				tc++;
				r--;
			}
			System.out.println();
			r = matrix.length - 1;
			c++;

		}

	}

}
