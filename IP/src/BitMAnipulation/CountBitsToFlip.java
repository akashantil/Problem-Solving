package BitMAnipulation;

import java.util.Scanner;

public class CountBitsToFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int res=a^b;
		
		int btc=0;
		while(res>0){
			if(res%2==1)
				btc++;
			res/=2;
				
				
		}
		System.out.println(btc);
		
		}

}
