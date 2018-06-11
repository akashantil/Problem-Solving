package Arrays;

public class NoOfSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 0, 11, 3, 0 };
		int l=1;
		int r=10;
		int count=0;
		int msf=Integer.MIN_VALUE;
		int res=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>msf)
				msf=arr[i];
			if(msf>l && msf<r){
				count++;
			}
			if(msf>r){
				res+=(count*(count+1))/2;
				count=0;
				res-=((i+1)*(i+2))/2;
				msf=Integer.MIN_VALUE;
			}
			
		}

	}

}
