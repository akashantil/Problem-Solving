package asssingmentfeb07;

import java.util.Scanner;

public class PatternFib {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner (System.in);
		System.out.println(" ENter no of rows");
		n=sc.nextInt();
		int i,j,prev=0,cur=1,sum;
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print(prev + " ");
				sum=prev+cur;
				prev=cur;
				cur=sum;
			}
			System.out.println();
		}

	}

}
