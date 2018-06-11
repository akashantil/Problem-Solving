package April28;

public class EggDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eggs=2;
		int floors=10;
		System.out.println(edt(2, 10,new int[eggs+1][floors+1]));

	}
	static int counter=0;
	

	public static int edt(int eggs, int floors,int[][]qb) {

		if (eggs == 1)
			return floors;

		if (floors == 1)
			return 1;

		if (floors == 0)
			return 0;
		if(qb[eggs][floors]!=0)
			return qb[eggs][floors];

		int mt = Integer.MAX_VALUE;
		
		System.out.println("call no -> " + ++counter);

		for (int f = 1; f <= floors; f++) {

			int eb = edt(eggs - 1, f - 1,qb);
			int el = edt(eggs, floors - f,qb);

			if (Math.max(eb, el) < mt)
				mt = Math.max(eb, el);
		}
		qb[eggs][floors]=mt+1;
		return mt+1;

	}

}
