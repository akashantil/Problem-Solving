package march24;

public class RecursionQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardPath(0, 15, "");

	}

	static int count = 0;

	public static void BoardPath(int src, int des, String asf) {
		if (src == des) {
			count++;
			System.out.println(count + "->  " + asf);
		}

		if (src == 0) {
			BoardPath(1, des, asf + 1);
			BoardPath(1, des, asf + 6);
		} else {
			for (int dice = 1; dice <= 6; dice++) {

				int i = src + dice;

				if (i <= des) {

					BoardPath(i, des, asf + dice);
				}

			}

		}
	}
}
