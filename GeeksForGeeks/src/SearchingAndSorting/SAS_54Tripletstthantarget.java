package SearchingAndSorting;

import java.util.Arrays;

public class SAS_53Tripletstthantarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr ={5, 1, 3, 4, 7};
		Arrays.sort(arr);
		int tsum=12;
		int i=0;
		int j=i+1;
		int k=i+2;
		int tp=0;
		
		while(i<arr.length-2 && j<arr.length-1 && k<arr.length){
			int sum=arr[i]+arr[j]+arr[k];
			if(sum<tsum){
				tp++;
				k++;
			}
			else if(sum>=tsum){
				i++;
				j=i+1;
				k=j+2;
				
			}
			
		}
		System.out.println(tp);

	}

}
