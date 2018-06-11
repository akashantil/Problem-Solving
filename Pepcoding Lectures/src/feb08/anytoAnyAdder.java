package feb08;

import java.util.Scanner;

public class anytoAnyAdder {

	public static void main(String[] args) {
		int n1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first  no");
		n1 = sc.nextInt();

		int n2;
		// only one scanner is enough as object created once can be used again
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter second no");

		int base = sc.nextInt();
		System.out.println("Enter base");
		n2 = sc.nextInt();
		int sum = 0, r1, r2, j = 1, fsum = 0, carry = 0;

		while (n1 != 0 || n2 != 0 || carry != 0) {

			r1 = n1 % 10;
			r2 = n2 % 10;
			sum = r1 + r2 + carry;
			sum = sum % base;

			carry = carry / base;
			n1 = n1 / 10;
			n2 = n2 / 10;

			fsum = fsum + sum * j;
			j = j * 10;
		}

		System.out.println(fsum);
	}

}
