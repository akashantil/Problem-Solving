package assingmentRecursion;

import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		Traingle(n, 0, 0);
		

	}
	public static void Traingle(int n,int r,int c){
		if(r==n){
			return;
		}
		if(c<=r){
			
			Traingle(n, r, c+1);
			System.out.print("*");
		}
		else{
			
			Traingle(n, r+1, 0);
			if(r+1!=n){
			System.out.println();
			}
		}
	}

}
