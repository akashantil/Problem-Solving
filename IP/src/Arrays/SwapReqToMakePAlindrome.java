package Arrays;

import java.util.Scanner;

public class SwapReqToMakePAlindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int soa= sc.nextInt();
		int [] arr = new int [soa];
		for(int i=0;i<soa;i++)
			arr[i]=sc.nextInt();
		
		
		int i=0;
		int j=arr.length-1;
		int noa=0;
		while(i<j){
			
			if(arr[i]==arr[j]){
				i++;
				j--;
			}
			else if(arr[i]>arr[j]){
				arr[j-1]+=arr[j];
				j--;
				noa++;
				
			}
			else {
				arr[i+1]+=arr[i];
				i++;
				noa++;
			}
			
		}
		System.out.println(noa);
		

	}

}
