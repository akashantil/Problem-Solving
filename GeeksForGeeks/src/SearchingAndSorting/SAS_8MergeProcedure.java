package SearchingAndSorting;

public class SAS_8MergeProcedure {

	public static void main(String[] args) {
		 int mPlusN[] = {2, 8, -1, -1, -1, 13, -1, 15, 20};
	        int N[] = {5, 7, 9, 25};

		movevalidtoend(mPlusN);
		merge(mPlusN, N);
		
		for (int i = 0; i < mPlusN.length; i++) {
			System.out.print(mPlusN[i] + " ");
		}
	}

	public static void movevalidtoend(int[] a) {
		int i = a.length-1;
		int j = a.length-1;
		while (i >=0) {

			if (a[i] != -1 && a[j] != -1) {
				i--;
				j--;
				
			} else if (a[i] == -1 && a[j] == -1) {
				i--;
			} else if (a[i] != -1 && a[j] == -1) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i--;
				j--;

			}

		}

	}
	public static void merge(int [] a,int [] b){
		int i=b.length;
		int j=0;
		int k=0;
		while(k<a.length ){
			if(j<b.length && i<a.length && a[i]<b[j]){
				a[k]=a[i];
				a[i]=-1;
				i++;
				
			}
			else if(j<b.length && i<a.length &&a[i]>b[j]){
				a[k]=b[j];
				j++;
			}
			else if(i==a.length && j!=b.length){
				a[k]=b[j];
				j++;
			}
			else if(i!=a.length && j==b.length){
				return;
			}
			k++;
		}
		
	}

	
}
