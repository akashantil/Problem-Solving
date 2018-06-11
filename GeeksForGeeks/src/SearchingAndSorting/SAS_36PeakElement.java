package SearchingAndSorting;

public class SAS_36PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//O(N) Approach can be done in O(logN)
		int [] arr={1,2,15,3,23,90,67};
		
		int pk = peak(arr, 0, arr.length-1, arr.length-1);
		System.out.println(pk);
		
//		if(arr[0]>=arr[1]){
//			System.out.println(arr[0]);
//			return;
//		}
//		
//		for(int i=1;i<arr.length-1;i++){
//			
//			if(arr[i]>=arr[i+1] && arr[i]>=arr[i-1]){
//				System.out.println(arr[i]);
//				return;
//			}
//		}
//		if(arr.length-1>=arr[arr.length-2]){
//			System.out.println(arr[arr.length-1]);
//			return;
//		}

	}
	//O(LogN)Approach
	public static int peak(int [] arr,int l,int h,int n){
		
		int mid=(l+h)/2;
		if((mid==0 ||arr[mid-1]<=arr[mid])&&(mid==n-1||arr[mid]>=arr[mid+1])){
			return arr[mid];
		}
		else if(mid>0 && arr[mid-1]>arr[mid]){
			return peak(arr, l, mid-1, n);
		}
		else {
			return peak(arr, mid+1, h, n);
		}
		
	}

}
