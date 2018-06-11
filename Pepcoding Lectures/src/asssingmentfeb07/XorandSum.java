package asssingmentfeb07;

import java.util.Scanner;

public class XorandSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int p;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		int count =0;
		for(p=0;p<=n;p++){
			int temp=n^p;
			if(p+n==temp){
				count++;
				
			}
			
			
		}
		System.out.println(count);

	}

}
