package SearchingAndSorting;

public class SAS_5noOccuringOddNoOftimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0;
		int [] arr = {1, 2, 3, 2, 3, 1, 3};
		for(int i=0;i<arr.length;i++){
			result^=arr[i];
			
			
		}
		System.out.println(result);

	}

}
