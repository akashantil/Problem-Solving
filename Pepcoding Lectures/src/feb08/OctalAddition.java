package feb08;

import java.util.Scanner;

public class OctalAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first octal no");
		n1 = sc.nextInt();

		int n2;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter second octal");
		n2 = sc.nextInt();
		int sum = 0, r1, r2, j = 1, fsum = 0, carry = 0;

		while (n1 != 0 || n2 != 0) {
			r1 = n1 % 10;
			r2 = n2 % 10;
			sum = (r1 + r2 + carry);
			
			carry = sum / 8;
			sum = sum % 8;

			fsum = fsum + sum * j;
			j = j * 10;
			n1 = n1 / 10;
			n2 = n2 / 10;

		}
		if (carry != 0) {
			fsum = fsum + carry * j;
		}
		System.out.println(fsum);
	}

}
