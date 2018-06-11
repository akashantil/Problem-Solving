package SearchingAndSorting;

import java.util.ArrayList;
import java.util.Arrays;

public class SAS_3ArrayAndsumX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,2,3,3,3,4,4};
	    int n = 7;
	    sumpair(arr, 0, n, 0, new ArrayList<Integer>());

	    sumpairusingsorting(arr, n);
	}
	//recursion
	public static void sumpair (int [] arr ,int sum,int target,int idx,ArrayList<Integer> pair){
		
		if(idx==arr.length){
			if(pair.size()==2 && sum ==target
					){
				System.out.println(pair);
				return;
			}
			return;
		}
		
		pair.add(arr[idx]);
		sumpair(arr, sum+arr[idx], target, idx+1, pair);
		pair.remove(pair.size()-1);
		
		sumpair(arr, sum, target, idx+1, pair);
		
	}

	
	public static void sumpairusingsorting(int [] arr,int target){
		Arrays.sort(arr);
		int i=0;
		
		int j=arr.length-1;
		
		while(i<j){
			int fp=arr[i];
			int sp=arr[j];
			if(fp+sp<target){
				i++;
			}
			else if(fp+sp>target){
				j--;
			}
			else {
				System.out.println("Array has two pairs resulting in target sum");
				return;
		}
		
		
	}
	}
}
