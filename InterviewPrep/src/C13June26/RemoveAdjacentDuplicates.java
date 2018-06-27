package C13June26;

import java.util.Scanner;
import java.util.Stack;

public class RemoveAdjacentDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		
		solve(inp);

	}

	public static void solve(String inp) {
		Stack<Character> st = new Stack<>();
		boolean cts = false;

		for (int i = 0; i < inp.length(); i++) {
			char ch = inp.charAt(i);
			if (st.isEmpty()) {
				st.push(ch);
			} else {
				char top = st.peek();
				if (ch == top) {
					cts = true;
				} else {
					if (cts == true) {
						st.pop();
						
						cts = false;
						i--;
					} else
						st.push(ch);
				}

			}

		}
		if(cts==true)
			st.pop();
		
		String ans="";
		Stack<Character> res= new Stack<>();
		while(!st.isEmpty()){
			char ch = st.pop();
			res.push(ch);
			
		}
		while(!res.isEmpty()){
			char ch = res.pop();
			ans+=ch;
			
		}
		System.out.println(ans);
	}

}
