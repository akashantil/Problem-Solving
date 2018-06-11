package SearchingAndSorting;

public class SAS_49ElementApperaingOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {7, 3, 5, 4, 5, 3, 4};
		int res=0;
		
		for(int i=0;i<arr.length;i++){
			res=res^arr[i];
		}
		
		System.out.println(res);

	}

}
