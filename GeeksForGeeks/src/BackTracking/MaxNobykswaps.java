package BackTracking;

public class MaxNobykswaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 2595;
		int k = 1;

		int[] array = inttoarray(no);
		for (int i = 0; i < 4; i++) {
			System.out.print(array[i]);
		}

	}

	public static int[] inttoarray(int no) {
		int temp = no;

		int nd = 0;
		while (temp != 0) {

			nd++;

			temp /= 10;

		}
		// System.out.println(nd);
		int[] array = new int[nd];

		while (no != 0) {
			int dig = no % 10;
			no /= 10;
			array[nd - 1] = dig;
			nd--;

		}
		return array;

	}
	
	public static int[] max(int [] arr ,int idx,int k){
		
		for(int i=0;i<arr)
		int temp=arr[idx];
		if(idx+i<arr.length && arr[idx+i])
		
		int [] res= 
		
	}
}
