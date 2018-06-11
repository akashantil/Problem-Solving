package CodingBat;


public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2,2,5};
		boolean res = sum(0, arr, 8, 0,0);
		System.out.println(res);

	}

	// public static boolean TargetSum(int[] arr, int ts, int idx, int sum) {
	// if (sum == ts) {
	// return true;
	// }
	//
	// if (idx == arr.length) {
	// return false;
	// }
	//
	// boolean rinclude = TargetSum(arr, ts, idx + 1, sum + arr[idx]);
	// boolean rexclude = TargetSum(arr, ts, idx + 1, sum);
	//
	// return rinclude || rexclude;
	// }

//	 public static boolean sum(int idx,int[] arr, int ts, int s) {
//	
//	 if(idx==arr.length){
//	 if(s==ts){
//	 return true;
//	 }
//	 return false;
//	 }
//	 if(arr[idx]==6){
//	 boolean in=sum(idx+1,arr,ts,s+arr[idx]);
//	
//	 boolean ex=sum(idx+1,arr,ts,s+arr[idx]);
//	 return in||ex;
//	 }
//	 else{
//	 boolean in=sum(idx+1,arr,ts,s+arr[idx]);
//	 boolean ex=sum(idx+1,arr,ts,s);
//	 return in||ex;
//	 }
//	
//	 }
//	public static boolean sum(int idx, int[] arr, int ts, int s) {
//
//		if (idx+1 > arr.length) {
//			if (s == ts) {
//				return true;
//			}
//			return false;
//		}
//
//		boolean in = sum(idx + 2, arr, ts, s + arr[idx]);
//
//		boolean ex = sum(idx + 1, arr, ts, s);
//		return in || ex;
//
//	}
//	 public static boolean sum(int idx,int[] arr, int ts, int s) {
//			
//		 if(idx==arr.length){
//		 if(s==ts){
//		 return true;
//		 }
//		 return false;
//		 }
//		 if(idx-1>0){if(arr[idx]%5==0){
//			 boolean in =sum(idx+1,arr,ts,s+arr[idx]);
//			 return in;
//		 }
//		 else  if(arr[idx-1]%5!=0 && arr[idx]==1){
//		 boolean in=sum(idx+1,arr,ts,s+arr[idx]);
//		
//		 
//		 return in;
//		 }
//		 else if(arr[idx-1]%5==0 && arr[idx]==1){
//			 boolean in=sum(idx+1,arr,ts,s);
//				
//			 boolean ex=sum(idx+1,arr,ts,s);
//			 return in||ex;
//			 }
//		 else{
//		 boolean in=sum(idx+1,arr,ts,s+arr[idx]);
//		 boolean ex=sum(idx+1,arr,ts,s);
//		 return in||ex;
//		 }
//		 }
//		 else{
//			 
//			 if(arr[idx]%5==0 ){
//				 boolean in=sum(idx+1,arr,ts,s+arr[idx]);
//				
//				 
//				 return in;
//				 }
//				 
//				 else{
//				 boolean in=sum(idx+1,arr,ts,s+arr[idx]);
//				 boolean ex=sum(idx+1,arr,ts,s);
//				 return in||ex;
//				 }
//			 
//		 }
//		 }
	
	 public static boolean sum(int idx,int[] arr, int ts, int s,int psum) {
			
		 if(idx==arr.length){
		 if(s==ts){
		 return true;
		 }
		 return false;
		 }
		 if(idx+1<arr.length){
			 int prev =arr[idx];
			 int curr=arr[idx+1];
		   if(prev==curr){
		 boolean in=sum(idx+1,arr,ts,s,psum+arr[idx]);
		
		 
		 return in;
		 }
		
		 else{
		 boolean in=sum(idx+1,arr,ts,s+arr[idx]+psum,0);
		 boolean ex=sum(idx+1,arr,ts,s,0);
		 return in||ex;
		 }
		 }
		 else{
			 boolean in=sum(idx+1,arr,ts,s+arr[idx]+psum,0);
			 boolean ex=sum(idx+1,arr,ts,s,0);
			 return in||ex;
			 
			 
		 }
		
		 }

	
	
}
