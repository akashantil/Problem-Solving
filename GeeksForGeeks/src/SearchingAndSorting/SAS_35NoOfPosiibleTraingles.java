package SearchingAndSorting;

import java.util.Arrays;

public class SAS_35NoOfPosiibleTraingles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 21, 22, 100, 101, 200, 300 };

		Arrays.sort(arr);
		if (arr.length < 3) {
			System.out.println("Not posiible with this size array");
			
		}
		long start= System.currentTimeMillis();
//		printTriangle(arr);
		
		
		System.out.println(countTraingle(arr));
		long end = System.currentTimeMillis();
		System.out.println(end-start);

	}

	//O(N^3)
	public static void printTriangle(int[] arr) {

		int i = 0;
		int j = 1;
		int k = arr.length - 1;

		while (i <= arr.length - 3) {

			if (arr[i] + arr[j] > arr[k] && arr[j] + arr[k] > arr[i] && arr[i] + arr[k] > arr[j]) {
				System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);

			}
		
			j++;

			if (i + 1 != j && j == k) {
				j = i + 1;
				k--;

			}  if (k<i+2) {
				i++;
				j = i + 1;
				k = arr.length - 1;
			}

		}

	}
	//O(N^2)
	public static int countTraingle(int[] arr){
		int count=0;
		
		for(int i=0;i<arr.length-2;i++){
			int k=i+2;
			for(int j=i+1;j<arr.length;j++){
				
				while(k<arr.length && arr[i]+arr[j]>arr[k]){
					 ++k;
				}
				
				count+=k-j-1;
				
			}
		}
		return count;
	}
	public static int geeks(int [] arr){
		  int n = arr.length;
	        // Sort the array elements in non-decreasing order
//	        Arrays.sort(arr);
	 
	        // Initialize count of triangles
	        int count = 0;
	 
	        // Fix the first element.  We need to run till n-3 as
	        // the other two elements are selected from arr[i+1...n-1]
	        for (int i = 0; i < n-2; ++i)
	        {
	            // Initialize index of the rightmost third element
	            int k = i + 2;
	 
	            // Fix the second element
	            for (int j = i+1; j < n; ++j)
	            {
	                /* Find the rightmost element which is smaller
	                   than the sum of two fixed elements
	                   The important thing to note here is, we use
	                   the previous value of k. If value of arr[i] +
	                   arr[j-1] was greater than arr[k], then arr[i] +
	                   arr[j] must be greater than k, because the
	                   array is sorted. */
	                while (k < n && arr[i] + arr[j] > arr[k])
	                    ++k;
	 
	               /* Total number of possible triangles that can be
	                  formed with the two fixed elements is k - j - 1.
	                  The two fixed elements are arr[i] and arr[j].  All
	                  elements between arr[j+1] to arr[k-1] can form a
	                  triangle with arr[i] and arr[j]. One is subtracted
	                  from k because k is incremented one extra in above
	                  while loop. k will always be greater than j. If j
	                  becomes equal to k, then above loop will increment
	                  k, because arr[k] + arr[i] is always/ greater than
	                  arr[k] */
	                count += k - j - 1;
	            }
	        }
	        return count;
	}

}
