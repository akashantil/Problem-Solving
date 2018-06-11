package OrderAndStats;

import java.util.Arrays;
import java.util.Scanner;

public class ConnectMinRopes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		
		for(int i=0;i<soa;i++)
			arr[i]=sc.nextInt();
		
		Arrays.sort(arr);
		
		arr[1]+=arr[0];
		
		for(int i=2;i<arr.length;i++){
			arr[i]+=arr[i-1];
		}
		int sum=0;
		for(int i=2;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.println(sum);

	}

}
