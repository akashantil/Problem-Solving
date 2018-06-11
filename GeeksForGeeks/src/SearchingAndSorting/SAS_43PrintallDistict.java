package SearchingAndSorting;

import java.util.Arrays;

public class SAS_43PrintallDistict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1]){
				System.out.print(arr[i] +" ");
			}
		}
		if(arr[arr.length-2]!=arr[arr.length-1])
			System.out.print(arr[arr.length-1]);
			
		
		
		

	}
	

}
