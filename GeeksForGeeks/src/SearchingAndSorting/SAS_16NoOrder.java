package SearchingAndSorting;

public class SAS_16NoOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] arr =	 { 1,2,2,3};
	boolean inc=false;
	boolean dec=false;
	int ml=0;
	int moa=0;
	
	if(arr[0]==arr[1]){
		System.out.println("length of neither increasing neither decreasing sub array is 2");
		return;
	}
	else if(arr[0]>arr[1])
		dec=true;
	else
		inc=true;
	
	
	for(int i=1;i<arr.length-1;i++){
		if(arr[i]==arr[i+1]){
			System.out.println("length of neither increasing neither decreasing sub array is 2");
			return;
		}
		else if(dec==true && arr[i]<arr[i+1]){
			 ml=3;
			 moa=3;
			
		}
		else if(inc==true && arr[i]>arr[i+1]){
			ml=3;
		 moa=3;
		}
		else {
			ml=0;
			
			
		}
	}
	System.out.println("length of neither increasing neither decreasing sub array is "+ moa);
	}

}
