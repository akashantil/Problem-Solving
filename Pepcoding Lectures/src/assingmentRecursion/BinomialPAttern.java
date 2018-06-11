package assingmentRecursion;

import java.util.Scanner;

public class BinomialPAttern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc= new Scanner(System.in);
		
		n=sc.nextInt();
		binomialPattern(n, 0, 0, 1);
		
	}
	public static void binomialPattern(int n,int r,int c,int val){
		if(r==n){
			return;
		}
		if(c<=r){
			System.out.print(val);
			val=(val*(r-c))/(c+1);
			binomialPattern(n, r, c+1, val);
			
		}
		else{
		System.out.println();
		val=1;
		binomialPattern(n, r+1, 0, val);
		}
	}

}
