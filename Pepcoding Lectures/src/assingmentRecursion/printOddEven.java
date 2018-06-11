package assingmentRecursion;

import java.util.Scanner;

public class printOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0){
			PrintdecEven(n);
		}
		else PrintdecOdd(n,n);
		

	}

	public static void PrintdecEven(int i) {
		if (i <= 0) {

			return;
		}

		System.out.println(i - 1);
		PrintdecEven(i - 2);
		System.out.println(i );

	}

	public static void PrintdecOdd(int i,int n) {
		if (i < 0) {

			return;
		}

		System.out.println(i);
		PrintdecOdd(i - 2,n);
		if(i+1<n){
		System.out.println(i +1);
		}

	}

}
