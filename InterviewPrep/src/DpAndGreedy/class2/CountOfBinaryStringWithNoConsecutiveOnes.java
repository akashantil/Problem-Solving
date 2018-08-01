package DpAndGreedy.class2;

import java.util.Scanner;

public class CountOfBinaryStringWithNoConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		
		int enat0=1;
		int enat1=1;
		
		for(int i=2;i<=len;i++){
			int temp=enat1;
			enat1=enat0;
			enat0+=temp;
			
		}
		System.out.println(enat0+enat1);

	}

}
