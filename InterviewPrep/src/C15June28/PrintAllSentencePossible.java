package C15June28;

import java.util.Scanner;

public class PrintAllSentencePossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scn = new Scanner(System.in);
		int row = scn.nextInt();
		int col = scn.nextInt();
		String arr[][] = new String[row][col];
		for(int i=0; i<arr.length; i++) {
			int noofcolineachrow=scn.nextInt();
			for(int j=0; j<noofcolineachrow; j++) {
				arr[i][j]=scn.next();
			}
		}
		solve(arr, 0, "");
		
	}
	private static void solve(String [][] arr,int idx,String asf){
		if(idx==arr.length){
			System.out.println(asf);
			return;
		}
		
		
//		for(idx=0;idx<arr.length;idx++){
			
			for(int j=0;j<arr[idx].length;j++){
				
				if(arr[idx][j]!=null){
					solve(arr, idx+1, asf+arr[idx][j]+" ");
				}
//			}
			
			
			
		}
	}

}
