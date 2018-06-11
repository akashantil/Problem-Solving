package SearchingAndSorting;

public class SAS_48CheckforduplicatesAtkDist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 1, 2, 3, 4};
		int k=3;
		
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<=i+k && j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println("yes");
					return;
				}
			}
		}
		System.out.println("No");

	}

}
