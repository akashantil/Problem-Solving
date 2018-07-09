package C11;

import java.util.Scanner;

public class BooleanArrayPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int [] a = new int [2];
		a[0]=sc.nextInt();
		a[1]=sc.nextInt();
		
		 a[0] = a[a[0]];
		  a[1] = a[0];
		  
		  System.out.println(a[0]+" "+a[1]);

	}

}
