package Recursion;

import java.util.Scanner;

public class ThePowerSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int p=sc.nextInt();
		
		int count=powers(p, x, 0, 1);
		System.out.println(count);

	}
	public static int powers(int power,int target,int sum,int no){
		if(sum==target){
			return 1;
		}
		if(sum>target ||(int)( Math.pow(no, power))>target){
			return 0;
		}
		
		int inc=powers(power,target,(int)(sum+Math.pow(no, power)),no+1);
		int exc=powers(power,target,sum,no+1);
		return inc+exc;
		
	}

}
