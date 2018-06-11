package Feb15;

public class ArrayInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 0, 3,1, 2 };
		int [] inv ;
		inv = new int [arr.length];
		
		for(int i=0;i<arr.length;i++){
			inv[arr[i]]=i;
		}
		for(int i=0;i<inv.length;i++){
			System.out.print(inv[i]+" ");
		}
		
		System.out.print(".");

	}

}
