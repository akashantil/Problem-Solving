package C08;

import java.util.Scanner;

public class TripletsLessThanTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for(int i=0;i<soa;i++)
			arr[i]=sc.nextInt();
		int tar= sc.nextInt();
		
		
		int i=0;
		int j=soa-1;
		int count=0;
		while(i<j){
			int currSum=arr[i]+arr[j];
			
			if(currSum>=tar)
				j--;
		
		else{
			count+=(j-i);
			i++;
			
		}
		
		}
		System.out.println(count);

	}

}
