package C04July16;

import java.util.Scanner;

public class MaxiSumof3NonOverlappingSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		int k = sc.nextInt();
		int leftarr[] = new int[soa];
		int rightarr[] = new int[soa];

		int sum = 0;
		for (int i = 0; i < k; i++)
			sum += arr[i];
		leftarr[k - 1] = sum;

		for (int i = k; i < soa; i++) {
			sum = sum - arr[i - k] + arr[i];
			leftarr[i] = Math.max(leftarr[i - 1], sum);
		}
		sum = 0;
		for (int i = soa - 1; i >= soa - k; i--)
			sum += arr[i];
		rightarr[soa - k] = sum;

		for (int i = soa - k - 1; i >= 0; i--) {
			sum = sum - arr[i + k] + arr[i];
			rightarr[i] = Math.max(rightarr[i + 1], sum);
		}
		sum = 0;
		int max = 0;

		for (int i = 0; i < k; i++)
			sum += arr[i];

		
		for (int i = k ; i < soa - k; i++) {
			sum = sum -arr[i - k] + arr[i];
			if (sum + leftarr[i - k] + rightarr[i + 1] > max)
				max = sum + leftarr[i - k] + rightarr[i + 1];

		}

		System.out.println(max);

	}

}
