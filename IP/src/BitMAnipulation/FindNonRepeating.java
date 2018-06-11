package BitMAnipulation;

import java.util.Scanner;

public class FindNonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int soa=sc.nextInt();
		
		int [] arr = new int[soa];
		for(int i=0;i<soa;i++){
			arr[i]=sc.nextInt();
		}
		
		int x=0;
		int y=0;
		int res= 0;
		int lsb =0;
		
		
		
		for(int i=0;i<arr.length;i++){
			res^=arr[i];
		}
		
		lsb=res&(-res);
		for(int i=0;i<arr.length;i++){
			
			if((lsb & arr[i]) ==lsb){
				x^=arr[i];
				
				
			}
			else{
				y^=arr[i];
			}
		}
		System.out.println(x);
		System.out.println(y);
		

	}

}
