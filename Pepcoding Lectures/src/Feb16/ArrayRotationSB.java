package Feb16;

public class ArrayRotationSB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[] arr = { 5, 8, 9, 3, 7 };
		
		// reversePartial(arr,0,4);
		// for(int i=0; i<arr.length;i++){
		// System.out.print(arr[i]);
	
		int r = 2;
		int j=arr.length-1;
		int start=0;
		
		r = r % (arr.length);
		//part 1
		reversePartial(arr,(arr.length-r),j);
		reversePartial(arr,start,(arr.length-r-1));
		reversePartial(arr,start,(arr.length-1));
		
		for(int i=0; i<arr.length;i++){
			 System.out.print(arr[i]+" ");
		}
		
		

	}
	
	public static void reversePartial(int []arr,int left,int right){
		for(int i=left;i<=right;i++){
			int temp=arr[i];
			arr[i]=arr[right];
			arr[right]=temp;
			right--;

		}
		
	}

}
