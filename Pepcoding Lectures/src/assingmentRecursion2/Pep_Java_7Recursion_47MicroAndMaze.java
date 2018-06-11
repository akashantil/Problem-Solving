package assingmentRecursion2;

import java.util.Scanner;

public class Pep_Java_7Recursion_47MicroAndMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n + 1][m + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int [][] visited = new int[n+1][m+1];
		boolean result = maze(arr,visited, 1, 1, n, m);
		if(result==true){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}

	}

	public static boolean maze(int[][] arr,int[][] visited ,int r, int c, int n, int m) {
		if (r == n && c == m) {
			return true;
		}
		if (r == n + 1 || c == m + 1) {
			return false;

		}
		boolean resright = false, resleft = false, resdown = false, resup = false;

		if (c + 1 <= m && arr[r][c + 1] != 0 && visited[r][c + 1] == 0) {
			visited[r][c + 1] = 1;
			resright = maze(arr,visited, r, c + 1, n, m);
			
			if(resright)
				return resright;
		}
		if (r + 1 <= n && arr[r + 1][c] != 0&&visited[r+1][c] == 0) {
			visited[r+1][c] = 1;
			resdown = maze(arr,visited, r + 1, c, n, m);
			if(resdown)
				return resdown;
		}

		if (c - 1 >= 1 && arr[r][c - 1] != 0&&visited[r][c-1] == 0) {
			visited[r][c-1] = 1;
			resleft = maze(arr,visited, r, c - 1, n, m);
			if(resleft)
				return resleft;
		}

		if (r - 1 >= 1 && arr[r - 1][c] != 0&&visited[r-1][c] == 0) {
			visited[r-1][c] =1;
			resup = maze(arr,visited, r - 1, c, n, m);
			if(resup)
				return resup;
				
			
		}

		return (resup || resdown || resright || resleft);
	}

}
