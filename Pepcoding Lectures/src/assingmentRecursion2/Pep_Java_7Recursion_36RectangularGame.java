package assingmentRecursion2;

import java.util.Scanner;

public class Pep_Java_7Recursion_36RectangularGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int not;
		long minr=Long.MAX_VALUE;
		long minc=Long.MAX_VALUE;

		
		Scanner sc = new Scanner(System.in);
		not=sc.nextInt();
		for(int i=0;i<not;i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			
			minr=Math.min(x, minr);
			minc=Math.min(y, minc);
		}
		long ans=(minr*minc);
		System.out.println(ans);
		
		
	}
	

}
