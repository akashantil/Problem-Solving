package BitMAnipulation;

import java.util.Scanner;

public class CopySetBitsInRAnge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int x = sc.nextInt(), y = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt();

		// finding those set bits in y

		int temp = 1;
		temp = temp << (r - l + 1);

		temp--;

		temp = temp << (l-1);

		temp = temp & y;

		x = x | temp;

		System.out.println(x);

	}

}
