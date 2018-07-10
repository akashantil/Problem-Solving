import java.util.ArrayList;
import java.util.HashSet;

public class WordBreakProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> dict = new HashSet<>();
		dict.add("i");
		dict.add("love");
		dict.add("ice");
		dict.add("cream");
		dict.add("icecream");
		dict.add("and");
		dict.add("man");
		dict.add("go");
		dict.add("mango");
		String inp = "iloveicecreamandmango";

		solve(dict, inp, "", new ArrayList<>());
		;

	}

	public static void solve(HashSet<String> dict, String inp, String sf, ArrayList<String> ans) {

		if (inp.length() == 0) {
			if (sf.length() == 0)
				System.out.println(ans);
			return;
		}

		char ch = inp.charAt(0);
		String ros = inp.substring(1);
		sf += ch;
		if (dict.contains(sf)) {
			ans.add(sf);
			solve(dict, ros, "", ans);
			ans.remove(ans.size() - 1);

		}

		solve(dict, ros, sf, ans);

	}

}
