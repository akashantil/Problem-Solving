package asssingmentfeb07;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows");
		n = sc.nextInt();
		int i, j, k, r, sp = 0;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			sp = n - i;
			sp = sp + (sp - 1);
			sp=2*sp;
			if (sp>0) {
				for (k = 1; k <= sp; k++) {
					System.out.print(" ");

				}
			}
			if(n!=i){
			for (r = i; r > 0; r--) {
				System.out.print(""+r+" ");
			}}
			else{
				for(r=i-1;r>0;r--){
					System.out.print(""+r+" ");
				}
			}
			System.out.println();
		}
	}

}
