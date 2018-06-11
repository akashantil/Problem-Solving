package feb09;

import java.util.Scanner;

public class BitManipulationRightMostOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		no = sc.nextInt();
		//0-no=two's complement
		int x=(no&(0-no));
		System.out.println(x);}

	}

