package BackTracking;

import java.util.Scanner;

public class PartitionOfSetIntoKSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 1, 4, 5, 3, 3};
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		int sum=sumofArray(arr, 0);
		if(sum % k ==0)
			System.out.println("Possible");
		else{
			System.out.println("Not Possible");
		}
		
		

	}
	public static int sumofArray(int[] arr ,int idx){
		if(idx==arr.length){
			return 0;
		}
		return arr[idx]+sumofArray(arr, idx+1);
	}

}
