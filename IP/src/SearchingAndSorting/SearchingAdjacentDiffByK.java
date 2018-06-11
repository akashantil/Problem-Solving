package temp;

import java.util.Scanner;

public class SearchingAdjacentDiffByK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();

		}
		
		int target=sc.nextInt();
		int k=sc.nextInt();
		int idx=0;
		while(idx<arr.length){
			if(arr[idx]==target){
				System.out.println(idx);
				return;
			}
			int jump=(Math.abs(target-arr[idx]))/k;
			if(jump==0)
				idx++;
				else{
					idx+=jump;
					
				}
				
		}
	}

}
