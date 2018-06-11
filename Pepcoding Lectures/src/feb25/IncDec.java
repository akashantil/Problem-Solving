package feb25;

import java.util.Scanner;

public class IncDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		// PdI(n);
		// int r= factorial(n);
		// System.out.println(r);
		// int p=sc.nextInt();
		// int res=powerlogn(n,p);
		// System.out.println(res);
//		pattern1(n);
		ToH("A","B","C",3);

	}

	public static void PdI(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PdI(n - 1);
		System.out.println(n);
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		int res = n * factorial(n - 1);
		return res;

	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int res = x * power(x, n - 1);
		return res;

	}

	public static int powerlogn(int x, int n) {
		int res = 0;
		if (n == 0) {
			return 1;
		}
		if (n % 2 == 0) {
			int y = power(x, n / 2);
			res = y * y;
		}
		if (n % 2 == 1) {
			int y = power(x, n / 2);
			res = y * y * x;

		}
		return res;
	}

	public static void pattern1(int n) {
		
		

	}
	public static void ToH(String src,String des,String aux,int n){
		if(n==0){
			return;
		}
		
		
		ToH(src,aux,des,n-1);
		
		System.out.println("Move disk" +n + " from "+src+"------>"+des+" using"+aux);
		
		ToH(des,aux,src,n-1);
		
		
	}
}
