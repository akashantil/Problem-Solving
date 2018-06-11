package GeeksArraysArrangements;

public class OrderingArrayViaIndexOfOtherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[]{50, 40, 70, 60, 90,100};
	     int index[] = new int[]{3,  0,  4,  1,  5,2};
	     
	     
	     for(int i=0;i<arr.length;i++){
//	    	 while(index[i]!=i){
	    		 int npos= index[i];
	    		 int nch=arr[i];
	    		 int oldchar=arr[index[i]];
	    		 int oldcharp=index[index[i]];
	    		 
	    		 arr[npos]=nch;
	    		 index[npos]=npos;
	    		 arr[i]=oldchar;
	    		 index[i]=oldcharp;
	    		 
	    		 
	    		 
	    	 
	     }
	     for(int i=0;i<arr.length;i++){
	    	 System.out.print(arr[i] + " ");
	     }

	}

}
