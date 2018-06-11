package Strings;

import java.util.Scanner;
import java.util.Stack;

public class FormMinNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp=sc.next();

		Stack<Integer> res = new Stack<>();
		String ans = "";

		for (int i = 0; i <= inp.length(); i++) {

			res.push(i + 1);
			if (i != inp.length() && inp.charAt(i) == 'D') {
				continue;
			} else {
				while (!res.isEmpty()) {
					ans += res.pop() + " ";

				}
			}

		}
		System.out.println(ans);

	}

}
