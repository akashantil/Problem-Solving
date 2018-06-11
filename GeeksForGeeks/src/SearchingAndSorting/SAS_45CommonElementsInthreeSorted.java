package SearchingAndSorting;

public class SAS_45CommonElementsInthreeSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar1[] = {1, 5, 5};
		int ar2[] = {3, 4, 5, 5, 10};
		int ar3[] = {5, 5, 10, 20};
		int i = 0;
		int j = 0;
		int k = 0;

		int a = ar1.length ;
		int b = ar2.length ;
		int c = ar3.length ;

		while (i < a && j < b && k < c) {
			if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
				System.out.println(ar1[i]);
				i++;
				j++;
				k++;

			}
			else if(ar1[i]<ar2[j] && ar1[i]<ar3[k]){
				i++;
			}
			else if(ar2[j]<ar1[i] && ar2[j]<ar3[k]){
				j++;
			}else if(ar3[k]<ar2[j] && ar3[k]<ar1[i]){
				k++;
			}
			

		}

	}

}
