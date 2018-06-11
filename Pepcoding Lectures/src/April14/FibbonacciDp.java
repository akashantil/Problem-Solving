package April14;

public class FibbonacciDp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int fib =fibDp(n,new int[n+1]);
		System.out.println(fib);

	}

	public static int fibDp(int n, int[] tc) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (tc[n] != 0) {
			return tc[n];
		}

		int fi = fibDp(n - 1, tc);
		int se = fibDp(n - 2, tc);
		int th = fi + se;

		tc[n] = th;
		return th;
	}

}
