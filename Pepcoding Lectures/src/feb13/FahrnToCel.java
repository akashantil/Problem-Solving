package feb13;

public class FahrnToCel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int minf = 0;
		int maxf = 300;
//		
//		int i;
//		for (i = minf; i <= maxf; i += 20) {
//			System.out.print(i);
//			System.out.print("------>");
//			cel = (5 * (i - 32)) / 9;
//			System.out.print(cel);
//			System.out.println();
//		}

		int jump = 20;
		for (int i = minf; i <= maxf; i += jump) {
			int cel = (int) (5.0 / 9 * (i - 32));
			System.out.println(i + " ----->" + cel);

		}

	}

}
