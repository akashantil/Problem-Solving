package C06July19;

import java.util.Scanner;

public class SearchingInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//serach in log n when adjacent elements differ by atmost k
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		int ele=sc.nextInt();
		int diff=sc.nextInt();
		System.out.println(search(arr, ele, diff));
				
	}
	
	public static int search(int [] arr,int ele,int diff){
		
		int i=0;
		while(i<arr.length){
			if(arr[i]==ele)
				return i;
			int jumps=(ele-arr[i])/diff;
			i=Math.max(jumps, 1+i);
			
		}
		return -1;
	}

}
