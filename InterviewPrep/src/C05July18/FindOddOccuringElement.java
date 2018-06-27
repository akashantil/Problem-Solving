package C05July18;

import java.util.Scanner;

public class FindOddOccuringElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		int res=0;
		for(int x:arr)
			res^=x;
		
		System.out.println(res);

	}

}
