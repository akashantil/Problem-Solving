package April22;



public class MCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dims[] = { 10, 20, 30, 40, 50, 60 };
		//System.out.println(mcmm(dims, 0, dims.length - 1, new int[dims.length][dims.length]));
		
		System.out.println(mcmt(dims));

	}

	static int counter = 0;

	public static int mcmm(int[] dims, int si, int ei, int[][] qb) {

		if (ei - si == 1)
			return 0;

		if (qb[si][ei] != 0)
			return qb[si][ei];

		int mc = Integer.MAX_VALUE;
		counter++;
		System.out.println("CAll No -> . " + counter);

		for (int bp = si + 1; bp < ei; bp++) {

			int part1c = mcmm(dims, si, bp, qb);
			int part2c = mcmm(dims, bp, ei, qb);
			int pc = dims[si] * dims[ei] * dims[bp];

			int tc = part1c + part2c + pc;

			if (tc < mc)
				mc = tc;

		}
		qb[si][ei] = mc;
		return mc;

	}

	public static int mcmt(int[] dims) {
		
		int[][] arr = new int[dims.length][dims.length];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				arr[i][j]=Integer.MAX_VALUE;
			}
			
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < arr[0].length; j++) {
				if(i>=j)
					arr[i][j]=-1;
				else if(j-i==1)
					arr[i][j]=0;
				else{
					int k=j-1;
					while(k-i>0){
						
						int cost=arr[i][k] +arr[k][j]+(dims[i]*dims[j]*dims[k]);
						if(arr[i][j]>cost)
							arr[i][j]=cost;
						k--;
						
					}
				}
				

			}
		}
		return arr[0][arr.length-1];
	}
}
