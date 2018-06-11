package march11;

public class Pattern1Rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pattern(5, 1, 0);
		//int[] arr = { 5, 11, 33, 45, -1, 33, 64 };
		//bubbleSort(arr, 0, arr.length - 1);
		
		//selectionSort(arr, 0, 1);
		
		int [] arr = {1,2,3,4,0};
		inverse(arr, 0);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		//invertedPattern(3, 0, 0);
	}

	public static void pattern(int n, int r, int c) {
		if (r == n + 1) {

			return;
		}

		if (r != c) {
			System.out.print("* ");
			pattern(n, r, c + 1);
		} else {
			System.out.println();
			pattern(n, r + 1, 0);
		}

	}

	public static void bubbleSort(int[] arr, int i, int j) {

		if (j==-1) {

			return;
		}

		if (i<j) {
			int temp = 0;
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i + 1] = temp;
			}
			i++;

			bubbleSort(arr, i, j);
		} else if(i==j){
			i = 0;
			j--;
			bubbleSort(arr, i, j);
		}

	}

	public static void invertedPattern(int n, int r, int c) {
		if (r == n + 1) {

			return;
		}

		if (r != c) {

			invertedPattern(n, r, c + 1);
			System.out.print("* ");
		} else {

			invertedPattern(n, r + 1, 0);
			System.out.println();
		}

	}
	
	public static void selectionSort(int[] arr, int i, int j) {

		if (i>=arr.length) {

			return;
		}

		if (j<arr.length) {
			int temp = 0;
			if (arr[i] > arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			

			selectionSort(arr, i, j+1);

			
		} else {
			i=i+1;
			j=i+1;
			
			selectionSort(arr, i,j );
		}

	}
	public static void inverse(int [] arr ,int idx){
		if(idx==arr.length){
			return;
		}
		int count =arr[idx];
		inverse(arr, idx+1);
		arr[count]=idx;
	}



}
