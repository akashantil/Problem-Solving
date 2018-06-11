package feb07;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check");
		number = sc.nextInt();
		int flag = 0;
		int i = 2;
		while (i * i <= number) {
			if (number % i == 0) {
				flag = 1;
				break;
			}
			i++;
		}
		if (flag == 0) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime");

		}
	}

}
