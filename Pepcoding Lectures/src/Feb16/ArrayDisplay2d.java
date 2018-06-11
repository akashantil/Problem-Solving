package Feb16;

public class ArrayDisplay2d {

	public static void main(String[] args) {
		
		int [] [] arr1 ={{10,20,30},{20,30,40},{30,40,50}};
		// TODO Auto-generated method stub
		Display(arr1);

	}
	public static void Display(int [] [] arr){
		int i =arr.length;
		int j=arr[0].length;
		
		for(int k=0;k<i;k++){
			for(int l=0;l<j;l++){
//				System.out.print("|");
				
				System.out.print(arr[k][l] + " ");
			} 
			System.out.println();
		}
	}

}
