package asssingmentfeb07;

import java.util.Scanner;

public class TraceOfMatrix {

	public static void main(String[] args) {
		int r;
		int c;
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		int[][] arr1 = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr1[i][j] = sc.nextInt();

			}
		}
		
		int[][] arr2 = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr2[i][j] = sc.nextInt();

			}
		}

TraceOfMatrices(arr1,arr2);
		

	}
	public static void TraceOfMatrices(int [][]arr1,int [][]arr2 ){
		int rmin=0,cmin=0;
		int rmax=arr1.length-1;
		int cmax=arr1[0].length-1;
		int trace=0;
		
		while(rmin!=rmax+1 && cmin!=cmax+1){
			
			trace=trace+arr1[rmin][cmin]+arr2[rmin][cmin];
			rmin++;
			cmin++;
			
		}
		System.out.println(trace);
	}

}
