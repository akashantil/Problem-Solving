package feb07;

import java.util.Scanner;

public class primetillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter a no");
		n = number.nextInt();
		int i = 2;
		int flag = 0;
		int gn = 2;

		while (gn <= n) {
			flag = 0;
			i = 2;

			while (i * i <= gn) {
				if (gn % i == 0) {
					flag = 1;
					break;
				}
				i++;
			}
			if (flag == 0) {
				System.out.println(gn);
			}
			gn++;
		}

	}

}
