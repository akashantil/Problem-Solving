package BitMAnipulation;

import java.util.Scanner;

public class CheckBleak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A number ‘n’ is called Bleak if
		// it cannot be represented as sum of a positive number x and set bit
		// count in x, i.e., x + countSetBits(x) is not equal to n for any
		// non-negative number x.
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();

		

		int nsb = 0;
		int no = n - 1;
		while (no > 0) {
			if (no % 2 == 1)
				nsb++;
			no /= 2;
		}

		int start = n - nsb;
		while (start < n) {
			int c=0;
			
			int temp=start;

			while (temp > 0) {
				if (temp % 2 == 1)
					c++;
				temp /= 2;

			}
			if(start+c==n){
				System.out.println("YES");
				return;
			}
			start++;

		}
		System.out.println("NO");

	}

}
