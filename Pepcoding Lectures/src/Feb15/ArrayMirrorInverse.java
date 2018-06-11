package Feb15;

public class ArrayMirrorInverse {

	public static void main(String[] args) {
		int[] arr={3,1,4,0,2};
		// TODO Auto-generated method stub
    boolean result = false;
		for(int i=0;i<arr.length;i++){
			int x=arr[i];
			if(arr[i]==x && arr[x]==i){
				result =true;
				
			}
			else{
				System.out.println("False");
				return;
			}
		}
		
			System.out.print(result);
		
	}

}
