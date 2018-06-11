package Recursion;

import java.util.Scanner;

public class KnightTour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[][] arr = new int[soa][soa];
		int max = soa * soa;
		int sx = sc.nextInt();
		int sy = sc.nextInt();

		System.out.println(move(arr, max, sx, sy,1));

	}

	
	static int[] xmoves = { 1, 2, 2, -2, -2, -1, -1, 1 };
	static int[] ymoves = { 2, 1, -1, 1, -1, 2, -2, -2 };

	public static boolean move(int [][] arr,int max,int sx,int sy,int count){
		
		if(count==max)
			return true;
		
		boolean res=false;
		
		arr[sx][sy]=count;
		if(checkValid(arr,sx,sy)){
			
			for(int i=0;i<xmoves.length;i++){
				
				 res=move(arr, max, sx+xmoves[i], sy+ymoves[i],count+1);
				if(res)
					return true;
							
			}
			
		}
		
		arr[sx][sy]=0;	
		return res;
		
	}

	private static boolean checkValid(int[][] arr, int sx, int sy) {
		if (sx < 0 || sx >= arr.length || sy < 0 || sy >= arr.length || arr[sx][sy] != 0) {
			return false;

		}
		return true;

	}

}
