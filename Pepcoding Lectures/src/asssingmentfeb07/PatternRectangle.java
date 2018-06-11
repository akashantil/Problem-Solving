package asssingmentfeb07;

import java.util.Scanner;

public class PatternRectangle {

	public static void main(String[] args) {
		int n;
		boolean up = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		n = sc.nextInt();
		int st, cst, sp, t = 0, csp = 1, i;
		cst = (n + 1) / 2;
		int dcst=1;
		int dcsp=0;
		

		for (i = 1; i <= n; i++) {
			if (up == true) {
				for (st = 1; st <= cst; st++) {
					System.out.print("*");
				}
				for (sp = 1; sp <= csp; sp++) {
					System.out.print(" ");
					if (csp == n){
						up = false;
						dcsp=n-(2*cst);
											}
				}
				for (st = 1; st <= cst; st++) {
					System.out.print("*");
				}
				csp += 2;
				cst -= 1;
				
				

			}
			else{
				dcst+=1;
				dcsp-=t;
				t=2;
				for (st = 1; st <= dcst; st++) {
					System.out.print("*");
				}
				for (sp = 1; sp <= dcsp; sp++) {
					System.out.print(" ");
					
				}
				for (st = 1; st <= dcst; st++) {
					System.out.print("*");
				}
			}
			System.out.println();

		}

	}
}
