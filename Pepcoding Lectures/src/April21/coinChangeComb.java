package April21;

import java.util.ArrayList;

public class coinChangeComb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int denoms[] = { 2, 3, 5, 6 };
		// ccct(denoms, 10);
		int amt = 20;
		
		System.out.println(cccmsb(denoms, amt, new ArrayList [amt+1][denoms.length], 0));

		//System.out.println(cccm(denoms, 10, 0, new int[amt + 1]));

	}
	static int counter=0;

	public static void ccct(int[] denoms, int amt) {

		int[] ways = new int[amt + 1];

		ArrayList<String>[] path = new ArrayList[amt + 1];
		for (int i = 0; i < path.length; i++) {

			path[i] = new ArrayList<>();

		}
		ways[0] = 1;
		path[0].add("");

		for (int i = 0; i < denoms.length; i++) {
			for (int j = denoms[i]; j <= amt; j++) {

				ways[j] += ways[j - denoms[i]];
				for (int k = 0; k < path[j - denoms[i]].size(); k++) {
					String ab = path[j - denoms[i]].get(k);
					path[j].add(ab + denoms[i] + "");
				}

			}

		}
		System.out.println(ways[amt]);
		System.out.println(path[amt]);

	}

	// dp not working on this one
	public static int cccm(int[] denoms, int amt, int idx, int[] qb) {
		qb[0] = 1;

		if (idx == denoms.length)
			return 0;
		if (amt == 0) {

			return 1;
		}
		if (amt < 0)
			return 0;

		if (qb[amt] != 0) {
			return qb[amt];
		}

		int a = cccm(denoms, amt - denoms[idx], idx, qb);
		int b = cccm(denoms, amt, idx + 1, qb);

		qb[amt] = a + b;

		// if(amt-denoms[idx]>=0)
		// qb[amt]+=qb[amt-denoms[idx]];

		return a + b;

	}

	public static ArrayList<String> cccmsb(int[] denoms, int amt, ArrayList [][] qb, int lpi) {

		if (amt == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		if (amt < 0) {

			ArrayList<String> bres = new ArrayList<>();

			return bres;
		}

		if (qb[amt][lpi] != null) {
			return qb[amt][lpi];
		}
		counter++;
		System.out.println("Call No -> "+ counter+". ");

		ArrayList<String> myres = new ArrayList<>();

		for (int i = lpi; i < denoms.length; i++) {
			ArrayList<String> rresult = cccmsb(denoms, amt - denoms[i], qb,i);

			for (String ab : rresult) {
				myres.add(ab + denoms[i] + "");

			}

		}
		qb[amt][lpi] = myres;
		return myres;

	}
}
