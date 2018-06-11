package SearchingAndSorting;

public class SAS_7SearchInArrayAdjacentdifferingbyk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 2, 4, 5, 7, 7, 6 };
	        int x = 6;
	        int k = 2;
	        int n=arr.length;
	        int idx=findIndex(arr, x, k, n);
	        if(idx<0){
	        	System.out.println("Element not in array");
	        }
	        else{
	        	System.out.println(idx);
	        }
	        
	        

	}
	public static int  findIndex(int[]arr,int x,int k,int n){
		int i=0;
		while(i<n){
			if(arr[i]==x){
				return i;
			}
			i=i+Math.max(1, Math.abs(x-arr[i])/k);
			
			
		}
		return -1;
	}

}
