package SearchingAndSorting;

public class SAS_2_SIDInSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[20];
		arr[0] = 12;
		arr[1] = 16;
		arr[2] = 20;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 70;

		int noe = 6;
		// int idx=search(arr, 5, 0, noe);
		// System.out.println(idx);
		int key = 25;
		int idx = insert(arr, noe, key, arr.length);
		System.out.println(idx);
		if(idx!=noe)
			noe++;
		for (int i = idx; i < noe; i++) {
			int temp = arr[i];
			arr[i] = key;
			key = temp;

		}
		for (int i = 0; i < noe; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(".");
		int delidx=delete(arr, 25, noe);
		if(delidx!=noe)
			noe--;
		for(int i=delidx;i<noe;i++){
			arr[i]=arr[i+1];
		}
		for (int i = 0; i < noe; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static int search(int[] arr, int key, int si, int ei) {
		if (si == ei && arr[si] != key) {
			return 0 - si;
		}
		int mid = (si + ei) / 2;
		int idx;
		if (key == arr[mid]) {
			return mid;
		} else if (key < arr[mid]) {
			idx = search(arr, key, 0, mid - 1);
		} else {
			idx = search(arr, key, mid + 1, ei);
		}
		return idx;
	}

	public static int insert(int[] arr, int n, int key, int cap) {
		if (n >= cap) {
			return n;
		}
		int idx = search(arr, key, 0, n);
		if (idx >= 0) {

			return idx + 1;

		} else {
			idx *= -1;

			return idx + 1;
		}
	}

	public static int delete(int [] arr ,int key,int n){
		
		int idx= search(arr, key, 0, n);
		if(idx<0){
			return n;
		}
		else{
			return idx;
			
		}
		
	}
}
