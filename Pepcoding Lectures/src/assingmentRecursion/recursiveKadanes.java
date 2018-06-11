package assingmentRecursion;

import java.util.Scanner;

public class recursiveKadanes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nt;
		Scanner sc = new Scanner(System.in);
		nt = sc.nextInt();
		for (int i = 0; i < nt; i++) {
			int soa = sc.nextInt();
			long noa = sc.nextLong();
			int[] arr = new int[soa];
			for (int j = 0; j < soa; j++) {
				arr[j] = sc.nextInt();
			}

			int su = sumOfarray(arr, 0, 0);
			
			if (su <= 0) {
				int[] res1 = new int[2 * soa];
				for (int j = 0; j < res1.length; j++) {
					res1[j] = arr[j % arr.length];
				}
				
				int[] res = kadane(res1, 0, 0, 0, 0, Integer.MIN_VALUE, Integer.MIN_VALUE, 0, false);
				System.out.println(res[0]);

			}

			else {
				int[] res = kadane(arr, 0, 0, 0, 0, Integer.MIN_VALUE, Integer.MIN_VALUE, 0, false);
				if (su == res[0]) {
					long maxSum = noa * su;
					System.out.println(maxSum);
				} else {
					long maxSum = su * (noa - 2);
					// starting arr;
					for (int m = res[1]; m < arr.length; m++) {
						maxSum += arr[m];

						
					}
					//adding ending arr
					for(int m=0;m<=res[2];m++){
						maxSum+=arr[m];
					}
					System.out.println(maxSum);
				}

			}

		}

	}

	public static int[] kadane(int[] arr, int si, int ei, int fsi, int fei, int sum, int ms, int idx, boolean winner) {
		if (idx == arr.length) {
			int[] info = new int[3];
			info[0] = ms;
			info[1] = fsi;
			info[2] = fei;
			return info;
		}
		if (winner == true) {
			ei = idx;
			sum = sum + arr[idx];

			if (sum > ms) {
				fei = ei;
				ms = sum;

			}
			if (sum < 0) {
				sum = Integer.MIN_VALUE;
				winner = false;
			}

			int[] k = kadane(arr, si, ei, fsi, fei, sum, ms, idx + 1, winner);
			return k;
		}
		if (winner == false && arr[idx] > 0) {
			si = idx;
			winner = true;
			sum = arr[idx];
			if (sum > ms) {
				fsi = si;
				fei = ei;
				ms = sum;

			}
			int[] k = kadane(arr, si, ei, fsi, fei, sum, ms, idx + 1, winner);
			return k;
		}
		// if(winner==false && arr[idx]<0)
		else {
			si = idx;
			ei = idx;
			sum = arr[idx];
			if (sum > ms) {
				fsi = si;
				fei = ei;

				ms = sum;
				sum = 0;
			}
			int[] k = kadane(arr, si, ei, fsi, fei, sum, ms, idx + 1, winner);
			return k;

		}

	}

	public static int sumOfarray(int[] arr, int sum, int idx) {
		if (idx == arr.length) {
			return sum;
		}

		return sumOfarray(arr, sum + arr[idx], idx + 1);

	}

}
