package asssingmentfeb07;

import java.util.Scanner;

public class IncOrDecSequence {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		boolean up = false;
		int flag = 0;
		boolean res= false;
		

		if (arr[0] < arr[1]) {
			up = true;
			flag = 1;
		} else if (arr[0] > arr[1]) {
			up = false;
			flag = 1;
		}

		for (int i = 1; i < n - 2; i++) {
			if (up == true && arr[i] < arr[i + 1]) {

				
			} else if (up == false && arr[i] > arr[i + 1]) {

				

			} else if (up == true && arr[i] > arr[i + 1]) {
				up = false;
				
				flag++;

			}
			if (up == false && arr[i] < arr[i + 1]) {
				up = true;

				
				flag++;
			}

		}
		if (flag <= 2) {
			res=true;

		} else {
			res=false;
		}
		System.out.println(res);
	}

}
