package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Pep_JavaIP_1Arrays_6findpair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int diff=sc.nextInt();

		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int pf=0;
		for(int i=0;i<arr.length;i++){
			
			int x= bs(arr, (arr[i]+diff), i+1, arr.length-1);
			if(x!=-1){
				pf++;
				System.out.println(arr[i]+" "+arr[x]);
			}
			
			
		}
		if(pf==0)
			System.out.println(-1);
		

	}
	public static int bs(int [] arr,int no,int lo,int hi){
		
		if(lo<=hi){
			int mid=(lo+hi)/2;
			if(no==arr[mid]){
				return mid;
			}
			else if(no>arr[mid]){
				return bs(arr, no, mid+1, hi);
			}
			else
				return bs(arr, no, lo, mid-1);
		}
		return -1;
	
	}

}
