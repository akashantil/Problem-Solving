package SearchingAndSorting;

public class SAS_51DeleteinOneTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 1, 2, 5, 90};
		int x=2;
		int n=5;
		boolean found=false;
		for(int i=0;i<n-1;i++){
			if(arr[i]==x){
				found=true;
				
				arr[i]=arr[i+1];
				arr[i+1]=x;
				
			}
		}
		if(found==true){
			n--;
		}
			for(int i=0;i<n;i++){
				System.out.print(arr[i]+" ");
			}
		

	}

}
