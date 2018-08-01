package DpAndGreedy.class2;

import java.util.Scanner;

public class SolutionsToLinearEquations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}
		
		int res = sc.nextInt();
		
		int [] dp = new int [res+1];
		
		
		dp[0]=1;
		
		for(int i=0;i<soa;i++){
			int currCoin=arr[i];
			
			for(int j=currCoin;j<dp.length;j++){
				
				dp[j]+=dp[j-currCoin];
				
			}
			
		}
		System.out.println(dp[res]);

	}

}
