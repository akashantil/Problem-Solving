package march17;

import java.util.ArrayList;

public class arrayListWithRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// subsequence with ascii

		ArrayList<String> sses = BoardPathSmart(0, 10);
		System.out.println(sses);
	}

	public static ArrayList<String> getSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> f = new ArrayList<String>();
			f.add("");
			return f;
		}
		char ch = str.charAt(0);
		String ss = str.substring(1);

		ArrayList<String> rres = getSS(ss);
		ArrayList<String> mres = new ArrayList<String>();
		for (String rstr : rres) {
			mres.add(rstr);
			mres.add((int) (ch) + " " + rstr);
			mres.add(ch + rstr);

		}
		return mres;

	}

	// }
	// mres.add(p2+rstr);count++;
	// mres.add(p3+rstr);count++;
	// mres.add(p4+rstr);count++;
	// mres.add(p5+rstr);count++;
	// mres.add(p6+rstr);count++;

	public static ArrayList<String> Subsequence(String str) {
		if (str.length() == 0) {
			ArrayList<String> f = new ArrayList<String>();
			f.add("");
			return f;
		}
		char ch = str.charAt(0);
		String ss = str.substring(1);

		ArrayList<String> rres = Subsequence(ss);
		ArrayList<String> mres = new ArrayList<String>();
		for (String rstr : rres) {
			mres.add(rstr);

			mres.add(ch + rstr);

		}
		return mres;

	}

	public static ArrayList<String> BoardPath(int src, int dest) {
		if (src > dest) {
			ArrayList<String> f = new ArrayList<String>();
			return f;
		}
		if (src == dest) {
			ArrayList<String> f = new ArrayList<String>();
			f.add("");
			return f;
		}

		ArrayList<String> p1 = BoardPath(src + 1, dest);
		ArrayList<String> p2 = BoardPath(src + 2, dest);
		ArrayList<String> p3 = BoardPath(src + 3, dest);
		ArrayList<String> p4 = BoardPath(src + 4, dest);
		ArrayList<String> p5 = BoardPath(src + 5, dest);
		ArrayList<String> p6 = BoardPath(src + 6, dest);
		ArrayList<String> mres = new ArrayList<String>();
		for (String rstr : p1) {

			mres.add("1" + rstr);

		}
		for (String rstr : p2) {

			mres.add("2" + rstr);

		}
		for (String rstr : p3) {

			mres.add("3" + rstr);

		}
		for (String rstr : p4) {

			mres.add("4" + rstr);

		}
		for (String rstr : p5) {

			mres.add("5" + rstr);

		}
		for (String rstr : p6) {

			mres.add("6" + rstr);

		}

		return mres;

	}

	public static ArrayList<String> BoardPathSmart(int src, int dest) {

		if (src == dest) {
			ArrayList<String> f = new ArrayList<String>();
			f.add("\n");
			return f;
		}
		ArrayList<String> pathfromstod = new ArrayList<String>();

		for (int dice = 1; dice <= 6; dice++) {

			int i = src + dice;

			if (i <= dest) {
				ArrayList<String> pathfromitod = BoardPathSmart(i, dest);
				for (String rstr : pathfromitod) {
					
					pathfromstod.add(dice + rstr);

				}

			}

		}
		return pathfromstod;

	}

}