package GeeksArraysArrangements;

public class MultiplicationWithnextAndPrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 3, 4, 5, 6};
		
		int n=arr.length;
		if(n<=1){
			return;
		}
		int prev=arr[0];
		arr[0]=prev*arr[1];
		
		for(int i=1;i<n-1;i++){
			int curr=arr[i];
			arr[i]=prev*arr[i+1];
			prev=curr;
			
		}
		arr[n-1]=prev*arr[n-1];
		
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}

	}

}
