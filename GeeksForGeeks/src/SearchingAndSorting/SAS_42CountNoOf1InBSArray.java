package SearchingAndSorting;

public class SAS_42CountNoOf1InBSArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {  0, 0, 0, 0, 0 };
		
		int count=coo(arr, 0, arr.length-1, arr.length-1);
		if(count>=0){
			System.out.println(count+1);
		}
		else{
			System.out.println(0);
		}

	}
	public static int coo(int [] arr,int l,int h,int n){
		
		if(l<=h){
			int mid=(l+h)/2;
			if(mid!=n-1 && arr[mid]==1 && arr[mid+1]==0){
				return mid;
			}
			
			else if(mid!=n-1 && arr[mid]==1 && arr[mid+1]==1){
				return coo(arr, mid+1, h, n);
			}
			else{
				return coo(arr, l, mid-1, n);
			}
			
		}
		return -1;
		
	}
		
		
	}


