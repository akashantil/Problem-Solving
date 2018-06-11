package asssingmentfeb07;

import java.util.Scanner;

public class SquarerootInAndPre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		int P;
		 Scanner sc = new Scanner (System.in);
		 N=sc.nextInt();
		 P=sc.nextInt();
		 Sqrt(N);
		 SqrtAndPrecision(N, P);
		}
	public static void Sqrt(int n){
		int sqrt =0;
		while(sqrt*sqrt<n){
			sqrt++;
		}
		sqrt--;
		System.out.print(sqrt +" ");
		
		
	}
	public static void SqrtAndPrecision(int n,int p){
		 double sqrt = 0;
			double inc = 0;
			
			
			
			for (int i = 0; i <= p; i++) {
				inc = Math.pow(10, -i);
				while (sqrt * sqrt <= n) {
					sqrt = sqrt + inc;
				}
				sqrt = sqrt - inc;
			}
			double mult = Math.pow(10, p);
			System.out.print(Math.round(sqrt * mult) / mult);
	
	}
	}