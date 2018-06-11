package GeeksArraysRotation;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int d;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		d = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		rotatebyjuggle(arr, d, n);

	}

	public static void rotate(int[] arr, int d, int n) {
		reverse(arr, 0, d - 1);
		reverse(arr, d, arr.length - 1);
		reverse(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void reverse(int[] arr, int s, int e) {

		while (s <= e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}

	}

	public static void rotateviaspace(int[] arr, int d, int n) {
		int[] temp = new int[d];
		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		// for(int i=0;i<d;i++){
		// System.out.println(temp[i]);
		// }
		for (int i = d; i < arr.length; i++) {
			arr[i - d] = arr[i];
		}
		int count = 0;
		for (int i = arr.length - d; i < arr.length; i++) {

			arr[i] = temp[count++];

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void rotateonebyone(int[] arr, int d, int n) {
		int c = 0;
		int r = 0;
		while (r < d) {
			int temp = arr[c];
			for (int i = 0; i < arr.length; i++) {
				if (i != arr.length - 1) {
					arr[i] = arr[i + 1];
				} else if (i == arr.length - 1) {
					arr[i] = temp;

				}
			}
			r++;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void rotatebyjuggle(int[] arr, int d, int n) {
		int g = 1;
		for (int i = 2; i < n; i++) {
			if (n % i == 0 && d % i == 0) {
				g = i;
			}
		}
System.out.println(g);
		// gcd=size of box and no of boxes=n/gcd
		int sb = 0;
		int nb = 0;
		int el=0;
		int fi=0;
		int tb = n / g;
		while (sb < g) {
			el=fi;
			while (nb < tb) {
				
				int temp=arr[el];
				
				arr[el]=arr[(el+d)%n];
				arr[(el+d)%n]=temp;
				el+=g;
					

				nb++;
			}
			fi++;
			sb++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
