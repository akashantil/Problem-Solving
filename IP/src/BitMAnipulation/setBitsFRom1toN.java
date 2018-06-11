package BitMAnipulation;

public class setBitsFRom1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//working for small
		int no = 7;

		int bits = count(no);

		no += 1;

		int i = 1;
		int div = 2;
		int res = 0;

		while (bits > 0) {

			// no of blocks containing i ones
			int nob = no / div;
			res += i * nob;
			if (no % div > 0 && nob!=0) {
				// finding remaining ones
				int rem = no % div;
				res +=   rem / 2 ;
			}
			else if(no % div > 0 && nob==0) {
				// finding remaining ones
				int rem = no % div;
				res +=   rem  -(div/2);
			}

			bits--;
			i *= 2;
			div *= 2;

		}
		System.out.println(res);
	}

	private static int count(int no) {
		int nob = 0;
		while (no > 0) {
			nob++;
			no /= 2;

		}
		return nob;
		// TODO Auto-generated method stub

	}

}
