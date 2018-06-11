package April14;

import java.util.Arrays;

public class MazePathIterativeOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mazepath(0, 0, 3, 3));

	}
	public static int mazepath(int sr, int sc, int dr, int dc) {

		int [] qb = new int  [dr+1];
		Arrays.fill(qb, 1);

		
		for (int r = dr-1; r >= 0; r--) {
			for (int c = dc; c >= 0; c--) {
				
				if(c==dc){
					
				}
				else{
					int temp=qb[c];
					qb[c]=qb[c+1]+qb[c]+temp;
				}

			}
			
		}
		return qb[0];

	}


}
