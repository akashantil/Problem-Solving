package April21;

public class RodCuttingMemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 3, 5, 6, 15, 10, 25, 12, 24 };
		System.out.println(rcm(arr, arr.length-1, new int[arr.length]));

	}

	public static int rcm(int[] arr, int rl, int[] qb) {
	
		if(rl==0||rl==1){
			return arr[rl];
		}
		if(qb[rl]!=0){
			return qb[rl];
		}
		int msp=arr[rl];
		int left=1;
		int right=rl-1;
		while(left<=right){
			
			int mspl=rcm(arr, left, qb);
			int mspr=rcm(arr, right, qb);
			
			if(mspl+mspr>msp){
				msp=mspr+mspl;
			}
			left++;
			right--;
			
			
			
		}
		qb[rl]=msp;
		return msp;
		
	}
}
