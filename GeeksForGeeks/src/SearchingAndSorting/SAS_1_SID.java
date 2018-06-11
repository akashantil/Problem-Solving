package SearchingAndSorting;

public class SAS_1_SID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[20]; 
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40; 
        arr[4] = 50;
        arr[5] = 70;
//		int length = delete(arr, 30, arr.length);
//		for (int i = 0; i < length; i++) {
//			System.out.print(arr[i] + " ");
//		}

        int length= insert(arr, 45, 6, arr.length);
        for(int i=0;i<length;i++){
        	System.out.print(arr[i]+" ");
        }
	}

	public static int search(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {

				return i;
			}
		}
		return -1;
	}

	public static int delete(int[] arr, int key, int n) {

		int idx= search(arr, key);
		if(idx==-1){
			System.out.println("element not found ");
			return n;
			
		}
		for(int i=idx;i<n-1;i++){
			arr[i]=arr[i+1];
			
		}
		return n-1;
	}

	public static int insert(int[]arr,int key,int n,int cap){
		if(n>=cap){
			return n;
		}
		arr[n]=key;
		return n+1;
		
		
	}
}
