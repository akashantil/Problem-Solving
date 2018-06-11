import java.util.Scanner;

public class CodingBatRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int fact= factorial(n, 1);
		System.out.println(fact);
		
		
	}
	public static int factorial(int n,int fact){
		if(n==0){
			return fact;
		}
		return n*factorial(n-1, fact);
		
	}

}
