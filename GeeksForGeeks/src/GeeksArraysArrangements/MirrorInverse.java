package GeeksArraysArrangements;

public class MirrorInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1, 3, 0, 2};
		 magicInverse(arr, 0);
		 for(int i=0;i<arr.length;i++){
			 System.out.print(arr[i]+" ");
		 }
		 

	}
	public static void magicInverse(int[]arr,int idx){
		if(idx==arr.length){
			return;
		}
		
		int c=arr[idx];
		magicInverse(arr, idx+1);
		arr[c]=idx;
	}

}
