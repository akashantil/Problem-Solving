package NonCategory;

import java.math.BigInteger;
import java.util.Scanner;

public class Pep_Java_8NonCategory_10Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		BigInteger res = BigInteger.valueOf(1);
		for(int i=n;i>0;i--){
			BigInteger x=BigInteger.valueOf(i);
			res=res.multiply(x);
		}
		System.out.println(res);
		

	}

}
