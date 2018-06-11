package assingmentRecursion2;

import java.util.Scanner;

public class Pep_Java_7Recursion_42TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println((int)(Math.pow(2, n))-1);
		
		TowerOfhanoi("A", "C", "B", n);
		

	}
	public static void TowerOfhanoi(String src,String des,String aux,int n){
		if(n==0){
			return;
		}
		
		TowerOfhanoi(src,aux,des,n-1);
		System.out.println("Move disc ["+n+"] from "+ src+ " to "+ des);
		TowerOfhanoi(aux,des,src,n-1);
	}

}
