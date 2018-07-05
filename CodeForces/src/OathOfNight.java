import java.util.Scanner;

public class OathOfNight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] < min)
				min = arr[i];
			if (arr[i] > max)
				max = arr[i];
		}

		int count = 0;

		for (int a : arr) {
			if (a > min && a < max)
				count++;

		}
		System.out.println(count);

	}

}
