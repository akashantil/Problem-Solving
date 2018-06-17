package C3July15;

import java.util.Scanner;
import java.util.Stack;

public class MinimumNumberDISequenc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i <= inp.length(); i++) {
			st.push(i + 1);
			if(i!=inp.length()){
			char x = inp.charAt(i);
			if (x == 'D')
				continue;
			else if (x == 'I') {
				while (!st.isEmpty()) {
					System.out.print(st.pop() + "");
				}
			}
			}

		}
		while (!st.isEmpty()) {
			System.out.print(st.pop() + "");
		}

	}

}
