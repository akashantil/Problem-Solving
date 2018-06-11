package asssingmentfeb07;

import java.util.Scanner;

public class Pattern16SB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner (System.in);
		n=sc.nextInt();
		int nsp=2*n-3;
		int nst=1;
		int i,j,k;
		int val;
		//part 1 row
		for(i=1;i<=n;i++){
			val=1;
			//part 2 print * 
			for(j=1;j<=nst;j++){
				System.out.print(val);
				val++;
			}
			//print spaces
			for(k=1;k<=nsp;k++){
				System.out.print(" ");
			}
			//print *
			for(j=1;j<=nst;j++){
				val--;
				if(j==1 && i==n){
					continue;
				}
				System.out.print(val);
			}
			//preparing for next level
			nsp-=2;
			nst+=1;
			System.out.println();
		}

	}

}
