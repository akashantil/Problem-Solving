package Feb15;

public class ArraySubset {

	public static void main(String[] args) {
		
		int[] arr = { 10, 20, 30,40

		};
		int [] rems;
		rems= new int[arr.length];
		for(int i=0;i<(1<<arr.length);i++){
			int temp=i;
			for(int j=0;j<rems.length;j++){
				
				int rem =temp%2;
				temp=temp/2;
				
				rems[(rems.length)-1-j]=rem;
				
			}
			for(int k=0;k<arr.length;k++){
				if(rems[k]==1){
					System.out.print(arr[k] + " ");
				}
				else{
					System.out.print(" - ");
				}
			}
			System.out.println();
		}
		
		

		
	}

}
