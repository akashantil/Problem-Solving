package SearchingAndSorting;

public class SAS_27FixedPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-10, -5, 0, 3, 7};
		int fp=bs(arr, 0, arr.length-1);
		System.out.println(fp);

	}
	public static int bs(int [] arr,int l,int h){
		int lp=0;
		int rp=0;
		if(l<=h){
			int mid=(l+h)/2;
			if(arr[mid]==mid){
				return mid;
			}
			else if(arr[mid]<mid){
				rp=bs(arr, mid+1, h);
				
				
			}
			else{
				lp=bs(arr, lp, mid-1);
				
			}
			return lp+rp;
		}
		return -1;
	}

}
