package Feb16;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr ={10,20,30,40,50,60,70,80,90};
		int left=0;
		int right=arr.length-1;
		int mid=(left +right)/2;
		int data = 0;
		while(left<=right){
			if(arr[mid]==data){
				System.out.println("found at index  " + mid);
				return;
			}
			else if(data>arr[mid]){
				left=mid+1;
				mid=(left +right)/2;
			}
			else{
				right=mid-1;
				mid=(left +right)/2;
			}
			
		}
		System.out.println("-1");

	}

}
