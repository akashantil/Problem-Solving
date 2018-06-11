package Recursion;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class ArithmeticExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		BigInteger ress= new BigInteger(arr[0]+"");
		boolean res = precedence(arr, ress, 1, arr[0] + "");
		// ArrayList<pair> res = prec1(arr, arr.length-1);
		// for(int i=0;i<res.size();i++){
		// if((res.get(i).result%101==0)){
		// System.out.println(res.get(i).expr);
		// break;
		// }
		//
		// }

	}

	public static boolean precedence(int[] arr, BigInteger res, int idx, String ans) {
		if (idx == arr.length) {
			BigInteger div = new BigInteger(101+"");
			BigInteger rem = new BigInteger(0+"");
			
			if (res.divideAndRemainder(div)[1].intValue() == 0) {

				System.out.println(ans);
				return true;

			}
			return false;
		}
		BigInteger temp = new BigInteger(arr[idx]+"");

		
		if (precedence(arr, res.add(temp), idx + 1, ans + "+" + arr[idx]))
			return true;

		if (precedence(arr, res.subtract(temp), idx + 1, ans + "-" + arr[idx]))
			return true;
		
		if (precedence(arr, res.multiply(temp), idx + 1, ans + "*" + arr[idx]))
			return true;


		return false;
	}

	public static ArrayList<String> prec(int[] arr, int idx) {
		if (idx == arr.length - 1) {
			ArrayList<String> base = new ArrayList<String>();
			base.add(arr[idx] + "");
			return base;

		}
		String x = arr[idx] + "";
		ArrayList<String> ab = prec(arr, idx + 1);
		ArrayList<String> myres = new ArrayList<>();
		for (String rstr : ab) {
			myres.add(x + "+" + rstr);
			myres.add(x + "*" + rstr);
			myres.add(x + "-" + rstr);

		}
		return myres;
	}

	private static class pair {
		String expr = "";
		int result = 0;

		pair(String expr, int result) {
			this.expr = expr;
			this.result = result;
		}
	}

	public static ArrayList<pair> prec1(int[] arr, int idx) {
		if (idx == 0) {
			ArrayList<pair> base = new ArrayList<pair>();
			base.add(new pair(arr[idx] + "", arr[idx]));
			return base;

		}
		String x = arr[idx] + "";
		ArrayList<pair> ab = prec1(arr, idx - 1);
		ArrayList<pair> myres = new ArrayList<>();
		for (pair rstr : ab) {

			myres.add(new pair(rstr.expr + "+" + x, arr[idx] + rstr.result));
			myres.add(new pair(rstr.expr + "*" + x, arr[idx] * rstr.result));
			myres.add(new pair(rstr.expr + "-" + x, arr[idx] - rstr.result));

		}
		return myres;
	}
}