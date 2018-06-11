package feb07;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {

		int numb1, numb2;
		Scanner scn1 = new Scanner(System.in);
		System.out.println("Enter a number");
		numb1 = scn1.nextInt();
		Scanner scn2 = new Scanner(System.in);
		System.out.println("enter other number");
		numb2 = scn2.nextInt();

		int divisor = numb1;
		int divident = numb2;
		int rem = 1;

		while (rem != 0) {
			rem = divident % divisor;
			if (rem == 0) {
				System.out.println(divisor);
				return;
			}
			divident = divisor;
			divisor = rem;
			

		}
		

		// TODO Auto-generated method stub

	}

}

