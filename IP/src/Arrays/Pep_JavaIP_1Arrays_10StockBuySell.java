package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_10StockBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int soa = sc.nextInt();

		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}
		int profit=0;
		int bo=0;
		int so=0;
		int i=0;
		
		while(i<arr.length-1){
			
			if(arr[i]<arr[i+1]){
				so=i+1;
			}
			else if(arr[i]>arr[i+1]){
				profit+=arr[so]-arr[bo];
				if(so!=bo)
					System.out.println(bo +" "+ so);
					
				
				
				so=i+1;
				bo=i+1;
			}
			i++;
		}
		if(i==arr.length-1 && bo!=so){
			System.out.println(bo + " "+ so);
			profit+=arr[so]-arr[bo];
			
		}
		System.out.println(profit);
		

	}

}
