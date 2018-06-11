package assingmentRecursion;

import java.util.Scanner;

public class NthTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
	int sum =	nthTraingle(n, 0, 0);
	System.out.println(sum);
		

	}
	public static int nthTraingle(int n,int i,int sum){
		if(i==n){
			return sum+n;
		}
		return i+nthTraingle(n, i+1, sum);
	}

}
