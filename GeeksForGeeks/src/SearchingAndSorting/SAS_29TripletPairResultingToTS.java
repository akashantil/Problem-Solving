package SearchingAndSorting;

import java.util.Arrays;

public class SAS_29TripletPairResultingToTS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr ={1, 4, 45, 6, 10, 8};
		Arrays.sort(arr);
		triplet(arr, 22);
		
		
		
		

	}
	public static void triplet(int [] arr,int ts){
		int i=0;int j=1;int k=arr.length-1;
		while(i<j){
			if(j+1<=k){
			int sum= arr[i]+arr[j]+arr[k];
			if(sum>ts){
				k--;
			}
			else if(sum<ts){
				j++;
			}
			else{
				System.out.println("triplet Found " + arr[i]+" + "+arr[j]+" + " +arr[k]+" = "+ts);
				return;
			}
			}
			else{
				i++;
				 j=i+1;
			}
			
			
		}
		System.out.println("No such Triplet EXist");
	}

}
