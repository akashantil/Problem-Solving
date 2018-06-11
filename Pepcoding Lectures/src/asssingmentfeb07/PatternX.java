package asssingmentfeb07;

import java.util.Scanner;

public class PatternX {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		n = sc.nextInt();

		int st, sp0, sp1, ln;
		int check = (n+1) / 2, x = 0, count = 1;
		boolean half = false;
		boolean oh=false;
		for (ln = 1; ln <= n; ln++) {
			if (check == ln) {half=true;}
			if(half==false){
				for (sp0 = 0; sp0 < x; sp0++) {
					System.out.print(" ");

				}
				x++;
				for (st = 1; st <= 1; st++) {
					System.out.print("*");
					count++;

				}
				for (sp1 = 1; sp1 <= (n - count); sp1++) {
					System.out.print(" ");
				}
				for (st = 1; st <= 1; st++) {
					System.out.print("*");
					count++;

			}
			}
					
			else if(half==true && oh==false){
				for(sp0=0;sp0<x;sp0++){
					System.out.print(" ");
				}
				for(st=1;st<=1;st++){
					System.out.print("*");
				}
				oh=true;
				
				
			}
			else{
				for(sp0=x;sp0>1;sp0--){
					System.out.print(" ");
				}
				x--;
				for(st=1;st<=1;st++){
					System.out.print("*");
					count--;
				}
				for(sp1=1;sp1<=(n-count);sp1++){
					System.out.print(" ");
				}
				for(st=1;st<=1;st++){
					System.out.print("*");
					count--;
				}
				
			}
			System.out.println();
			}
	
}
}