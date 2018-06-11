package SearchingAndSorting;

public class SAS_12FindRepeatitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr ={1, 3, 2, 3, 4};
		int res=0;
		for(int i=0;i<arr.length;i++){
			res=res^i^arr[i];
			
		}
		System.out.println(res);

	}

}
