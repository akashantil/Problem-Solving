package April14;

public class BoardPathIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(boardpath(0, 10));

	}

	public static int boardpath(int src, int des) {

		int bp[] = new int[des + 1];

		bp[des] = 1;

		for (int i = des - 1; i >= 0; i--) {

			for (int j = 1; j <= 6; j++) {
				int inter = i + j;
				if (inter <= des) {
					bp[i] += bp[inter];
				}

			}

		}
		return bp[0];
	}

}
