package SearchingAndSorting;

public class SAS_57MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 4, 5, 7, 9 };
		int arr2[] = { 4, 5, 7, 9 };
		
		int res= 0;
		for(int i=0;i<arr1.length;i++){
			res=res^arr1[i];
		}
		for(int i=0;i<arr2.length;i++){
			res=res^arr2[i];
		}
		System.out.println(res);

	}
	

}
