package GeeksArraysArrangements;

import java.util.Scanner;

public class FormBiggestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();

		}
		String x = arr[0];
		String max = arr[0];
		String y;
		for (int i = 1; i < arr.length; i++) {
			y = arr[i];
			String xy = max + y;
			String yx = y + max;
			int  res = xy.compareTo(yx);
			if(res>0){
				max=xy;
			}
			else{
				max=yx;
			}

		}
		System.out.println(max);

	}

}
