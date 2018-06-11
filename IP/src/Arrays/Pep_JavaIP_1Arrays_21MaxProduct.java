package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_21MaxProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();

		}
		boolean containzero=false;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0)
				containzero=true;
		}
		long omax=Integer.MIN_VALUE;
		long max=1;
		long min=1;
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]==0){
				max=1;
				min=1;
			}
			
			long temp=max;
			max=Math.max(arr[i], Math.max(arr[i]*max, arr[i]*min));
			min=Math.min(arr[i], Math.min(arr[i]*temp, arr[i]*min));
			
			
			if(max>omax)
				omax=max;
			
		}
		if(omax<0 && containzero==true){
			System.out.println(0);
			return;
			
		}
			
		System.out.println(omax);

	}

}
