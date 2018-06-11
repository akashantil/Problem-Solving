package Feb14;

public class ArraySubset {

	public static void main(String[] args) {
		//Not complete Todo
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30,40

		};
		for (int s = 0; s < arr.length; s++) {

			for (int e = s; e < arr.length; e++) {
				
				for (int i = s; i <= e; i+=s) {
					System.out.print(arr[i] + "  ");
				}
				System.out.println();
			}
		}
	}

}

