package May30th;

public class BinaryRepOfNextGreaterWithsame01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ab = "111000011100111110";
		int temp = 0;
		StringBuilder inp = new StringBuilder(ab);
		for (int i = inp.length() - 2; i >= 0; i--) {

			char cno = (inp.charAt(i));
			char nno = (inp.charAt(i + 1));

			if (cno >= nno)
				continue;
			else {
				inp.setCharAt(i, nno);
				inp.setCharAt(i + 1, cno);
				temp = i + 1;
				break;

			}

		}
		int count = 0;
		for (int i = temp; i < inp.length(); i++) {

			char ch = inp.charAt(i);
			if (ch == '0')
				count++;
		}
		String bp = inp.substring(0, temp);
		String mp = "";
		for (int i = 0; i < count; i++) {
			mp += 0;

		}

		String cs = bp + mp;
		for (int i = cs.length(); i < inp.length(); i++) {
			cs += 1;

		}
		System.out.println(cs);

	}
}
