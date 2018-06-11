package assingmentRecursion;


import java.util.Scanner;

public class Pep_Java_7Recursion_36RectangularGame {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] board = new int[Integer.MAX_VALUE-100][Integer.MAX_VALUE-100];
		int n;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int mr = 0;
		int mc = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			recursiveBoard(board, 1, a, 1, b);
			mr = Math.max(a, mr);
			mc = Math.max(b, mc);

			// for(int j=1;j<=a;j++){
			// for(int k=1;k<=b;k++){
			// board[j][k]++;
			// }
			// }

		}
	int c=	findMaxIn2D(board, 1, mr, 1, mc, Integer.MIN_VALUE, 0);
		System.out.println(c);
//		for (int j = 1; j <= 106; j++) {
//			for (int k = 1; k <= 106; k++) {
//				System.out.print(board[j][k] + " ");
//			}
//			System.out.println();
//		}

	}

	public static void recursiveBoard(int[][] board, int i, int gr, int j, int gc) {
		if (i == gr + 1) {

			return;

		}
		if (j <= gc) {
			board[i][j]++;
			recursiveBoard(board, i, gr, j + 1, gc);

		} else
			recursiveBoard(board, i + 1, gr, 1, gc);

	}

	public static int findMaxIn2D(int[][] board, int i, int mr, int j, int mc, int max, int count) {
		if (i == mr + 1) {

			return count;

		}
		if (j <= mc) {
			if (board[i][j] > max) {
				
				max = board[i][j];
				int a= findMaxIn2D(board, i, mr, j + 1, mc, max, 1);
				return a;

			} else  if (board[i][j]== max){
				int a= findMaxIn2D(board, i, mr, j + 1, mc, max, 1 + count);
				return a;
			}

			
		else{
		int a=	findMaxIn2D(board, i, mr, j + 1, mc, max,  count);
		return a;
			

		}

	

	}
		int b=	findMaxIn2D(board, i + 1, mr, 1, mc, max, count);
		return b;
	}
}
