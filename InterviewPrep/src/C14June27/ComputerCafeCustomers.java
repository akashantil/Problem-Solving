package C14June27;

import java.util.HashSet;
import java.util.Scanner;


public class ComputerCafeCustomers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		int nos = sc.nextInt();

		

		HashSet<Character> st = new HashSet<>();
		HashSet<Character> wc = new HashSet<>();
		

		for (int i = 0; i < inp.length(); i++) {
			char ch = inp.charAt(i);

			if (st.size() == 0) {
				st.add(ch);
				nos--;
			} else if (st.contains(ch)) {
					nos++;
					st.remove(ch);
				} else if (nos > 0) {
					st.add(ch);
					nos--;

				} else {
					wc.add(ch);
				}
			}

		System.out.println(wc.size());
}

}
