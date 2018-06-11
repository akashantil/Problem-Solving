package asssingmentfeb07;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		int n2;
		char sy;
		Scanner sc = new Scanner(System.in);

		sy = sc.next().charAt(0);
		if (sy != '+' && sy != '-' && sy != '*' && sy != '/' && sy != '%') {
			System.out.println("Invalid Operation.");
			sy = sc.next().charAt(0);
		}
		while (sy != 'x' && sy!='X') {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			calculator(sy, n1, n2);
			sy = sc.next().charAt(0);
			if (sy != '+' && sy != '-' && sy != '*' && sy != '/' && sy != '%'&&sy!='X'&&sy!='X') {
				System.out.println("Invalid Operation.");
				sy = sc.next().charAt(0);
			}
			

		}

	}

	public static void calculator(char sy, int n1, int n2) {
		switch (sy) {
		case '+':
			System.out.println(n1 + n2);
			break;
		case '-':
			System.out.println(n1 - n2);
			break;
		case '/':
			System.out.println(n1 / n2);
			break;
		case '%':
			System.out.println(n1 % n2);
			break;
		case '*':
			System.out.println(n1 * n2);
			break;
		default:
			System.out.println("Invalid Operation.");
		}

	}

}
