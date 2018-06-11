package DPREVISION;

public class DPBillBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2 Approach O(M) or 
		//O(n^2)  like LIS
		int m = 20;
		int[] billboard = { 6, 9, 12, 14 };
		int[] rev = { 5,6,3,7 };
		int dis = 2;

		int[] arr = new int[m + 1];
		arr[0] = 0;

		int i = 0;

		for (int j = 1; j <= m ; j++) {
			
			if(i<billboard.length){

			if (j != billboard[i]) {
				arr[j] = arr[j - 1];
			} else {
				if (j - dis -1>= 0) {
					arr[j] = Math.max(arr[j-1], rev[i] + arr[j - dis - 1]);

				}

				else {
					arr[j] = rev[i];

				}
			
			i++;
			}
			}
			else{
				arr[j]=arr[j-1];
			}
		}
		System.out.println(arr[m]);

	}

}
