package SearchingAndSorting;

import java.util.Arrays;

public class SAS_31PairWithTArget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={5, 20, 3, 2, 50, 80};
		Arrays.sort(arr);
		pairDifference(arr, 48);
		

	}
	public static void pairDifference(int[]arr,int td){
		int i=0;
		int j=arr.length-1;
		while(i<j){
			if(arr[j]-arr[i]==td){
				System.out.println("Pair found "+arr[j]+" - "+arr[i]+" = "+td);
				return;
			}
			else if(arr[j]-arr[i]>td)
				j--;
			else 
				i++;
				
		}
	}
	

}
