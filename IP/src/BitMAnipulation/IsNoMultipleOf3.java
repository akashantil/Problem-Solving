package BitMAnipulation;

import java.util.Scanner;

public class IsNoMultipleOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// other method is to find set bits at even and odd places if absolute
		// difference of set bits at even and odd is divisible by 3 then no is
		// divisible by 3
		// T.C --> O(log2n)

		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt();
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;

		}
		if (sum % 3 == 0)
			System.out.println("YES");
		else
			System.out.println("NO");

		// T.C -->O(log10n)

	}

}
