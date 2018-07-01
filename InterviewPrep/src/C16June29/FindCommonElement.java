package C16June29;

import java.util.Scanner;

public class FindCommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];

		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				arr[i][j] = sc.nextInt();
		
		int [] index=new int[arr.length];
		
		for(int i=0;i<row;i++)
			index[i]=row-1;
		
		int min= Integer.MAX_VALUE;
		
		for(int i=0;i<row;i++){
			min=Math.min(min,arr[i][index[i]]);
		}
		for(int i=0;i<row;i++){
			if(arr[i][index[i]]>min)
				index[i]--;
			else if(arr[i][index[i]]<min)
				min=arr[i][index[i]];
			
			if(index[i]<0)
			{
				System.out.println(-1);
				return;
			}
		}
		System.out.println(arr[0][index[0]]);
		
		

	}

}
