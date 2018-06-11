package BitMAnipulation;

import java.util.Scanner;

public class Calculate7nBY8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no=sc.nextInt();
		
		int temp=no;
		temp<<=3;
		temp-=no;
		temp>>=3;
		System.out.println(temp);
		

	}

}
