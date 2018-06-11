package April14;

public class BoardPathArraySize6 {

	public static void main(String[] args) {
		System.out.println(cbp(0, 10));

	}

	public static int cbp(int src, int des) {
		int[] bp = new int[6];

		bp[5] = 1;

		for (int i = des - 1; i >= 0; i--) {

			int nv = 0;

			for (int j = 1; j <= 6; j++) {
				int inter = i + j;
				if (inter <= des) {
					nv = bp[0] + bp[1] + bp[2] + bp[3] + bp[4] + bp[5];

				} else {
					break;

				}

			}
			bp[0] = bp[1];
			bp[1] = bp[2];
			bp[2] = bp[3];
			bp[3] = bp[4];
			bp[4] = bp[5];
			bp[5] = nv;

		}
		return bp[5];

	}
}
