package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class RemoveInvalidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		HashMap<Integer, HashSet<String>> map = new HashMap<>();

		solve(inp, 0, map);

		ArrayList<Integer> al = new ArrayList<>(map.keySet());
		HashSet<String> ab = (map.get(al.get(0)));
		System.out.println(ab);
	}

	static int min = Integer.MAX_VALUE;

	public static void solve(String inp, int count, HashMap<Integer, HashSet<String>> map) {
		if (inp.length() == 1)
			return;

		if (isvalid(inp)) {

			if (count <= min) {

				if (map.isEmpty()) {
					HashSet<String> temp = new HashSet<>();
					temp.add(inp);
					map.put(count, temp);
				} else {
					if (count != min) {
						map.remove(min);
						HashSet<String> temp = new HashSet<>();
						temp.add(inp);

						map.put(count, temp);
					} else if (count == min && map.get(min) != null) {
						HashSet<String> temp = map.get(min);
						temp.add(inp);
						map.put(min, temp);
					}
				}

				min = count;
			}

			return;
		}

		for (int i = 0; i < inp.length(); i++) {

			String bp = inp.substring(0, i);
			String ap = inp.substring(i + 1);

			solve(bp + ap, count + 1, map);

		}

	}

	private static boolean isvalid(String inp) {
		// TODO Auto-generated method stub

		Stack<Character> st = new Stack<>();
		for (int i = 0; i < inp.length(); i++) {
			if (st.isEmpty())
				st.push(inp.charAt(i));
			else {
				char prev = st.peek();
				char curr = inp.charAt(i);
				if (prev == '(' && curr == ')')
					st.pop();
				else if (curr != '(' && curr != ')')
					continue;
				else
					st.push(curr);
			}
		}
		if (st.isEmpty())
			return true;

		return false;
	}

}
