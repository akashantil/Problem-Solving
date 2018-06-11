package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_26StocksBuySell2times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}
		
		int buy=0;
		int sell=0;
		int p1=0;
		int p2=0;
		int pp=0;
		int cp=0;
		int min=arr[0];
		
		
		
		while(sell<arr.length){
			
			cp=arr[sell]-arr[buy];
			if(arr[sell]<min){
				min=arr[sell];
				buy=sell;
							sell++;
			
		}
		
		if(sell==arr.length){
			cp=arr[sell]-arr[buy];
			
			if(p2==0)
				p2=cp;
			else if(p1==0)
				p1=cp;
			else if(p2<cp)
				if(p1<p2){
					p1=p2;
					p2=cp;
				}
				else
					
				
		
			
			
	
	}

}
