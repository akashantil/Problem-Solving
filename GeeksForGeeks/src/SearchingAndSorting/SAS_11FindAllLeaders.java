package SearchingAndSorting;

public class SAS_11FindAllLeaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {16, 17, 4, 3, 5, 2};
		int mtn=Integer.MIN_VALUE;
		int leaders=0;
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]>mtn){
				mtn=arr[i];
				leaders++;
			}
			
		}
		System.out.println(leaders);
	}

}
