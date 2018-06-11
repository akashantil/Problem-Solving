package asssingmentfeb07;

import java.util.Scanner;

public class pattern1232 {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows");
		n = sc.nextInt();
		boolean mirror=false;
		int i, j, k, value = 1, count = 0,sp=(n-value);
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (k = 1; k <= value; k++) {
				if(value==count){
					
					mirror=true;
				}
				if(mirror==false){
					
				count++;
				System.out.print("" + count +" ");
							
			}
				else{
					count--;
					System.out.print("" +count+ " ");
				
					
				}
			}
			
			for (j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			value += 2;
			sp-=1;
			mirror=false;

			System.out.println();
		}

	}

}
