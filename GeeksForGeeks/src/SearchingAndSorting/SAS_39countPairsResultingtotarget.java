package SearchingAndSorting;

import java.util.Arrays;

public class SAS_39countPairsResultingtotarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr =  {1, 5, 3, 4, 2};
		int k=3;
		Arrays.sort(arr);
		
		noofpairs(arr, k);
		

	}
	public static void noofpairs(int[]arr,int k){
		
		int i=0;
		int j= arr.length-1;
		int count =0;
		String ans="";
		
		while(i<=j){
			
			
			System.out.println(bs(arr, 0, arr.length-1, k+arr[i]));
			
			
			if(bs(arr, 0, arr.length-1, k+arr[i]) >=0){
			
			count++;
			ans+="{ "+arr[i]+" , "+arr[j]+" } ";
			count++;
			
			}
			
			i++;
			
			
		}
		System.out.println("There are "+(count/2)+" pairs with difference "+k+", the pairs are" +ans);
	}
	public static int bs(int [] arr,int l,int h,int x){
		
		int  mid=(l+h)/2;
		if(l<=h){
		
		if(arr[mid]==x){
			return x;
			
		}
		else if(arr[mid]>x){
			return bs(arr, l, mid-1, x);
			
		}
		else return bs(arr, mid+1, h,x);
		}
		
		return -1;
		
		
		
		
	}

}
