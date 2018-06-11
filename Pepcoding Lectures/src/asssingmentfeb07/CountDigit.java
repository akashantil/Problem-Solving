package asssingmentfeb07;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d;
		long N;
		Scanner sc = new Scanner(System.in);
		
		N=sc.nextLong();
		d=sc.nextInt();
		int res=0;
		
		while(N!=0){
			int rem=(int) (N%10);
			if(rem==d) res++;
			N/=10;
		}
		
		System.out.println(res);

	}

}
