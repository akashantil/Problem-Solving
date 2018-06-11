package march24;

public class Board16WithLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ladders = new int[16];
		ladders[2] = 13;
		ladders[3] = 11;
		ladders[5] = 7;

		BoardPath(0, 15, "", ladders);

	}

	static int count = 0;

	public static void BoardPath(int src, int des, String asf, int[] ladders) {
		if (src == des) {
			count++;
			System.out.println(count + "->  " + asf);
		}

		if (src == 0) {
			BoardPath(1, des, asf + 1, ladders);
			BoardPath(1, des, asf + 6, ladders);
		} else if (src != 0 && ladders[src] == 0) {
			for (int dice = 1; dice <= 6; dice++) {

				int i = src + dice;

				if (i <= des) {

					BoardPath(i, des, asf + dice, ladders);
				}

			}
		} else {
			BoardPath(ladders[src], des, asf + " [" + src + "->" + ladders[src] + "] ", ladders);
		}
	}

}
