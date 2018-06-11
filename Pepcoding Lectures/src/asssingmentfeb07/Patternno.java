package asssingmentfeb07;

import java.util.Scanner;

public class Patternno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner (System.in);
		System.out.println(" ENter no of rows");
		n=sc.nextInt();
		int i,j,count=1;
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}

	}

}
