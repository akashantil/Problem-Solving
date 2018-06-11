package asssingmentfeb07;

import java.util.Scanner;

public class XORFrom1toN {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int res=0;
		for(int i=1;i<=n;i++){
			res=res^i;
		}
		System.out.println(res);
		// TODO Auto-generated method stub

	}

}
