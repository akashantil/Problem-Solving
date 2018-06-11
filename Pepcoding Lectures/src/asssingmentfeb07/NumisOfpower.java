package asssingmentfeb07;

import java.util.Scanner;

public class NumisOfpower {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=0;i<=n/2;i++){
			int c=(2<<i);
			if(n==c){
				System.out.println("true");
				return;
			}
		}
		System.out.println("false");
	}

}
