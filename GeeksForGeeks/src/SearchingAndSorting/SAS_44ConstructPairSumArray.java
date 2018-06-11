package SearchingAndSorting;

public class SAS_44ConstructPairSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] pair ={14, 9, 10, 11, 12, 7};
		int n=4;
		construct(new int [n] , pair, n);
		
		
		
		

	}
	public static void construct(int[] arr,int [] pair,int n){
		
		arr[0]=(pair[0]+pair[1]-pair[n-1])/2;
		
		for(int i=1;i<n;i++){
			arr[i]=pair[i-1]-arr[0];
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}
	}
	

}
