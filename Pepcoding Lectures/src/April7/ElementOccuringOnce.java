package April7;

public class ElementOccuringOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr ={55,8,6,55,3,6,8};
		int val=arr[0];
		for(int i=1;i<arr.length;i++){
			val=val^arr[i];
			
		}
		System.out.println(val);
		
		
		
		

	}
	

}
