package SearchingAndSorting;

public class SAS_6GetMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] arr =	{1,2,4,5,6};
	int cs=0;
	int ws=0;
	int n=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
				if(arr[i]>n){
					n=arr[i];
				}
		ws+=arr[i];
		
		
	}
		for(int i=0;i<n;i++){
			cs+=i;
		}
	System.out.println(Math.abs(ws-cs));

	}

}
