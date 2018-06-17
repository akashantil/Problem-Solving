package C3July15;

import java.util.Scanner;

public class SmalestPossiblePositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		
		int cid=1;//elemenent we are  currently in doubt of
		//element less than cid can be represented
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<=cid)
				cid+=arr[i];
			else 
			{
				System.out.println(cid);
				return;
			}
		}
		System.out.println(cid);
	}

}
