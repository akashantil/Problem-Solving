package OrderStatistics;

import java.util.Arrays;

public class OS1KLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []  arr = {1, 2, 3, 5, 7, 9};
		int k=3;
		Arrays.sort(arr);
		int c=0;
		for(int i=arr.length-1;i>=0 &&c<k;i--){
			c++;
			System.out.print(arr[i]+" ");
		}

	}

}
