package asssingmentfeb07;

import java.util.Scanner;

public class WavePrint {

	public static void main(String[] args) {
		int r;
		int c;
		Scanner sc = new Scanner(System.in);
		r=sc.nextInt();
		c=sc.nextInt();
		int [] [] arr = new int [r][c];
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j]=sc.nextInt();
				
			}
		}
		WavePrinter1(arr);
		WavePrinter2(arr);

	}
	public static void WavePrinter1(int [][]arr){
		
		int rmin=0;
		int rmax=arr.length;
		int cmax =arr[0].length;
		
		int count =rmax*cmax;
		while(count>0){
			for(int col=0;col<cmax;col++){
				if(count>0){
				System.out.print(arr[rmin][col]+" ");
				count--;
			}}
			rmin++;
			for(int col=cmax-1;col>=0;col--){
				if(count>0){
				System.out.print(arr[rmin][col]+" ");
				count--;
			}}
			rmin++;
		}
		System.out.println();
	}
	
public static void WavePrinter2(int [][]arr){
		
		int cmin=0;
		int rmax=arr.length;
		int cmax =arr[0].length;
		
		int count =rmax*cmax;
		while(count>0){
			for(int row=0;row<rmax;row++){
				if(count>0){
				System.out.print(arr[row][cmin]+" ");
				count--;
			}}
			cmin++;
			for(int row=rmax-1;row>=0;row--){
				if(count>0){
				System.out.print(arr[row][cmin]+" ");
				count--;
			}}
			cmin++;
		}
	}


}
