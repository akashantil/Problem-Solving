package asssingmentfeb07;

import java.util.Scanner;

public class FibtillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter till which  number you want");
		number = sc.nextInt();
		int first = 0, second = 1, sum = 0;
		while (first <= number) {
			System.out.print(first+" ");
			sum = first + second;
			first = second;
			second = sum;
			

		}
		

	}

}
