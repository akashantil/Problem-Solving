package asssingmentfeb07;

import java.util.Scanner;

public class Fibbonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many number you want");
		number = sc.nextInt();
		int first = 0, second = 1, sum = 0, count = 0;
		while (count < number) {
			
			sum = first + second;
			first = second;
			second = sum;
			count++;

		}
		System.out.print(first);

	}

}
