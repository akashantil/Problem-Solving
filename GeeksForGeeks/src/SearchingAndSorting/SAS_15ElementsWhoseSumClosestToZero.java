package SearchingAndSorting;

import java.util.Arrays;

public class SAS_15ElementsWhoseSumClosestToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1, 60, -10, 70, -80, 85};
		 Arrays.sort(arr);
		 
		 int i=0;
		 int j=arr.length-1;
		 int mindiff=Integer.MAX_VALUE;
		 while(i<j){
			 int sum =arr[i]+arr[j];
			 if(sum>=0)
				j--;
			 else
				 i++;
			 
			 mindiff=Math.min(mindiff, Math.abs(sum));
			 
		 }
		 System.out.println(mindiff);

	}

}
