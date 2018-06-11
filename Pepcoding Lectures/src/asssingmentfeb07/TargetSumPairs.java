package asssingmentfeb07;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();

		}
		Arrays.sort(arr1);
		int ts;
		ts=sc.nextInt();
		TargetSumPairsInArray(arr1,ts);

	}
	public static void TargetSumPairsInArray(int [] arr , int ts){
		for (int i=0;i<arr.length-1; i++){
			
			int l=arr.length;
			
				for(int j=i+1;j<l &&j!=i;j++){
					if(arr[i]+arr[j]==ts){
						if(arr[i]>arr[j]){
						System.out.println(arr[j] + " and "+ arr[i]);
						arr[j]=arr[l-1];
						l--;
						
						break;
						}
						else{
							System.out.println(arr[i] + " and "+ arr[j]);
							arr[j]=arr[l-1];
							l--;
							
							break;
							
						}
					}
					else{
						continue;
					}
				
				
				
				
			}
		}
		
	}

}
