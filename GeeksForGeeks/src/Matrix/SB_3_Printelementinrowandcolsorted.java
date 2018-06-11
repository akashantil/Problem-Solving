package Matrix;

import java.util.Arrays;

public class SB_3_Printelementinrowandcolsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]  =  { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50},
              };
		int [] arr  = new int[mat.length*mat[0].length];
		
		int k=0;
		int i=0;
		
		
		while(i<mat.length){
			int j=0;
			while(j<mat[0].length){
				arr[k]=mat[i][j];
				j++;
				k++;
			}
			i++;
		}
		Arrays.sort(arr);
		for(int i1=0;i1<arr.length;i1++){
			System.out.println(arr[i1]);
		}

	}

}
