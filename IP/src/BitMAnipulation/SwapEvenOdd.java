package BitMAnipulation;

import java.util.Scanner;

public class SwapEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int no = sc.nextInt();
		int bm1 = 170;
		int even = no & bm1;
		int bm2 = ~bm1;
		int odd = no & bm2;
		
		even>>=1;
		odd<<=1;
		
		System.out.println(even | odd);
	}

}
