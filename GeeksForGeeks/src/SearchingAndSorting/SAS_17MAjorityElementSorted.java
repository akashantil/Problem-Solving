package SearchingAndSorting;

public class SAS_17MAjorityElementSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 3, 3, 3, 10};
		int x = 3;

		int idx = search(arr, x, 0, arr.length - 1);
		int n = arr.length;
		if (idx < 0) {
			System.out.println("No");
		} else {
			if ((idx + (n / 2)) < n && arr[idx + (n / 2)] == x) {
				System.out.println("YES");
			} else
				System.out.println("NO");
		}

	}

	public static int search(int[] arr, int key, int si, int ei) {
		if(si<=ei){
			int mid=(si+ei)/2;
			int idx=-1;
			
			if((mid==0 ||key>arr[mid-1] )&&key==arr[mid])
				return mid;
			else if(key>arr[mid])
				idx=search(arr, key, mid+1,ei);
			else
				idx=search(arr, key, 0, mid-1);
				
			
			return idx;
		}
		return -1;
		
}
}
