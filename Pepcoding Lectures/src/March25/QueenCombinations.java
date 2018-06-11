package March25;

public class QueenCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12345";

		path(s, "");

	}

	static int c = 0;

	public static void path(String ques, String asf) {
		int[] v = new int[ques.length()];
		if (asf.length() == 3) {
			c++;
			System.out.println(c + "  " + asf);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			//
			String roq = ques.substring(i + 1);

			if (v[i] == 0) {
				v[i] = 1;
				path(roq, asf + ques.charAt(i));

			}

		}

	}

}
