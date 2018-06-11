package DP;

import java.util.Scanner;

public class FriendsPAiringProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int nof=sc.nextInt();
		
		int [] arr= new int [nof+1];
		
		for(int i=0;i<=nof;i++){
			if(i<=2){
				arr[i]=i;
			}
			
			//else person saying n-1 persons you make your pair i will stay alone
			//or the person can form pairs with  any one of n-1 persons and now 
			//n-2 persons form their own pairs
			else
				arr[i]=arr[i-1]+(i-1)*arr[i-2];
		}
		
		System.out.println(arr[nof]);
		

	}

}
