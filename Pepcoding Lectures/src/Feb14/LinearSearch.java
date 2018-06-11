package Feb14;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 55, 9, 88, 17, 24,99

		};
		int ele=999;
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			if (ele == arr[i]) {
				index=i;
				
				break;
			} else {
				index=-1;

			}

		}
		System.out.println(index);
		
	

	}

}
