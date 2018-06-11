package SearchingAndSorting;

public class SAS_25FindRepeatedAndNotOcuuring1ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {7, 3, 4, 5, 5, 6, 2};
		 int n=7;
		 int [] count = new int [n+1];
		 
		 for(int i=0;i<arr.length;i++){
			 count[arr[i]]++;
		 }
		 int x=0;
		 int y=0;
		 for(int i=1;i<count.length;i++){
			 if(count[i]==0){
				 x=i;
			 }
			 if(count[i]==2)
				 y=i;
			 
		 }
		 System.out.println(x+" not found and "+ y + " found two times");
		 

	}

}
