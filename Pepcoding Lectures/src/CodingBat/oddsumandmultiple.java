package CodingBat;

public class oddsumandmultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr={5,5,6};
		int sumarr=sum(arr,0,arr.length-1);
		if(sumarr%2==0 ||sumarr<10){
			System.out.println("false");
		//	return false;
		}
		else{
		
		boolean res=partition(arr, 0, 0);
		System.out.println(res);
		}
	}
		public static int sum (int [] arr,int sidx,int eidx){
			if(sidx>eidx){
				return 0;
			}
			int sumarr =arr[sidx]+sum(arr,sidx+1,eidx);
			return sumarr;
			
		}
		
		public static boolean partition(int [] arr,int idx,int sum){
			
			if(idx==arr.length){
				if(sum%10==0){
					return true;
					
				}
				
				
				return false;
			}
			boolean in =partition(arr, idx+1, sum-arr[idx]);
			boolean ex=partition(arr, idx+1, sum);
			return in ||ex;
			
		}


	}