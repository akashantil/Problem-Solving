package SearchingAndSorting;

public class SAS_47FindPositionInFiniteSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 
                140, 160, 170};
		int x = 10;
		int i = 0;
		int j = 1;

		while (j<arr.length-1 && arr[j] < x) {
			j *= 2;
			
			
		}
		
		int idx= bs(arr, i, j, x);
		if(x>=0){
			System.out.println(idx);
		}
		else{
			System.out.println("No such element exist");
		}

	}
	public static int bs(int [] arr,int l,int h,int x){
		
		if(l<=h){
			int mid=(l+h)/2;
			if(arr[mid]==x){
				return mid;
			}
			else if(arr[mid]>x){
				return bs(arr, l, mid-1, x);
			}
			else 
				return bs(arr, mid+1, h, x);
		}
		return -1;
		
	}

}
