package DPREVISION;

public class MinMaxValue {

	public static class pair {
		int max;
		int min;

		public pair(int max, int min) {
			this.max = max;
			this.min = min;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "1+2*3+4*5";

		pair ans = solve(ques);
		System.out.println(ans.max);
		System.out.println(ans.min);
	}

	public static pair solve(String ques) {

		pair ans = new pair(Integer.MIN_VALUE, Integer.MAX_VALUE);

		if (ques.length() == 1) {
			pair a = new pair(Integer.parseInt(ques), Integer.parseInt(ques));
			return a;
		}

		for (int i = 0; i < ques.length(); i++) {
			
			char op = ques.charAt(i);
			if (op == '+' || op == '*') {

				pair left = solve(ques.substring(0,i));
				pair right = solve(ques.substring(i + 1));

				if (op == '+') {

					if (left.max + right.max > ans.max)
						ans.max = left.max + right.max;
					if (left.min + right.min < ans.min)
						ans.min = left.min + right.min;
				} else {
					if (left.max * right.max > ans.max)
						ans.max = left.max * right.max;
					if (left.min * right.min < ans.min)
						ans.min = left.min * right.min;

				}

			}
		}

		return ans;

	}

}
