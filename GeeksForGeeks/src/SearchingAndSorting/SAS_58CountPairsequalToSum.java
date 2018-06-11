package SearchingAndSorting;

import java.util.Arrays;

public class SAS_58CountPairsequalToSum {

	public static void main(String[] args) {
		int arr[] = { 1,-1,-1,-1,-1,7};
		Arrays.sort(arr);
		int i = 0;
		int j=arr.length-1;
		int target = 6;
		int cp=0;
		while(i<j){
			int sum =arr[i]+arr[j];
			
			if(sum>target){
				j--;
				
			}
			else if(sum == target){
				if(arr[i]!=arr[i+1] && arr[j]!=arr[j-1]){
				cp++;
				i++;
				j--;
				}
				else if(arr[i]==arr[i+1] && arr[j]!=arr[j-1]){
					cp+=2;
					i+=2;
					
					
				}
				else if(arr[i]!=arr[i+1] && arr[j]==arr[j-1]){
					cp+=2;
					j-=2;
					
					
				}
			}
			else{
				i++;
			}
			
		}
		System.out.println(cp);

	}

}
