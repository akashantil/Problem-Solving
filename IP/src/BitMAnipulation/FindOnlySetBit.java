package BitMAnipulation;

import java.util.Scanner;

public class FindOnlySetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int n=sc.nextInt();
		
		
		for(int i=0;i<n;i++){
			
			if((1<<i)==n){
				System.out.println("YEs"+" "+(i+1));
				return;
			}
				
		}
		System.out.println("INvalid");

	}

}
