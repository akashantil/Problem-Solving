package BitMAnipulation;

import java.util.Scanner;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int bc=0;
		while(n>0){
			if(n%2==1)
				bc++;
			
			n/=2;
		}
		System.out.println(bc);

	}

}
