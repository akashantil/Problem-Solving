package Arrays;

import java.util.Scanner;

public class stockbuysell1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		
		int msf=arr[0];
		int psf=Integer.MIN_VALUE;
		
		for(int i=1;i<soa;i++){
			
			if(arr[i]<msf)
				msf=arr[i];
			
			else
				psf=Math.max(psf, arr[i]-msf);
			
			
		}
		System.out.println(psf);

	}

}
