package Recursion;

import java.util.Scanner;

public class ArithmeticExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		
	boolean ab=	print(arr, 1, arr[0], arr[0]+"");

	}

	public static boolean print(int[] arr, int idx, int ans, String res) {

		if (ans % 101 == 0 && idx==arr.length) {
			System.out.println(res);
			return true;
		}
		if (idx == arr.length)
			return false;

		boolean add = print(arr, idx + 1, ans + arr[idx], res + "+" + arr[idx]);
		if (add)
			return true;
		boolean mult = print(arr, idx + 1, ans * arr[idx], res + "*" + arr[idx]);
		if (mult)
			return true;
		boolean sub = print(arr, idx + 1, ans - arr[idx], res + "-" + arr[idx]);
		if (sub)
			return true;

		return false;

	}

}
