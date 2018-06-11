package SearchingAndSorting;

import java.util.Arrays;

public class SAS_46Firstrepeatingelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {10, 4, 3, 4, 3, 5, 6};
		 int temp[] = new int[arr.length];
		 
		 for(int i=0;i<arr.length;i++){
			 temp[i]=arr[i];
		 }
		 Arrays.sort(temp);
		 for(int i=0;i<arr.length;i++){
		 int idx=bs(temp, 0, temp.length-1, arr[i]);
		 
		 if(idx>0){
			 System.out.println(arr[i]);
			 return;
		 }
		 }
		 
		 

	}
	public static int bs(int arr[] ,int l,int h,int x){
		
		if(l<=h){
			int mid=(l+h)/2;
			if(arr[mid]==x ){
				if(mid!=0 && arr[mid-1]==x)
				return mid;
				if(mid+1<arr.length-1 && arr[mid+1]==x)
					return mid;
				
				return -1;
			}
			else if(arr[mid]>x){
				return bs(arr, l, mid-1, x);
			}
			else return bs(arr, mid+1, h, x);
		}
		return -1;
	}

}
