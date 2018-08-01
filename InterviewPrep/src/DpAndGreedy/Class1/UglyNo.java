package DpAndGreedy;

import java.util.Scanner;

public class UglyNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		arr[1] = 1;
		int p2 = 1;
		int p3 = 1;
		int p5 = 1;

		for (int i = 2; i <= n; i++) {
			int f1 = arr[p2] * 2;
			int f2 = arr[p3] * 3;
			int f3 = arr[p5] * 5;

			arr[i] = Math.min(f1, Math.min(f2, f3));
			if(arr[i]==f1)
				p2++;
			if(arr[i]==f2)
				p3++;
			if(arr[i]==f3)
				p5++;

		}
		System.out.println(arr[n]);

	}

}
