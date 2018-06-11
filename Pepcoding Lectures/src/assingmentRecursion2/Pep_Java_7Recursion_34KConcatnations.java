package assingmentRecursion2;

import java.util.Scanner;

public class Pep_Java_7Recursion_34KConcatnations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int i = 0; i < not; i++) {
			int soa = sc.nextInt();
			int[] arr = new int[soa];
			long con = sc.nextLong();
			for (int j = 0; j < soa; j++) {
				arr[j] = sc.nextInt();

			}
			int sum = sumOfarray(arr, 0, 0);
			int [] info= new int[3];
			
			long maxsum = Long.MIN_VALUE;
			if (sum > 0) {
				
				maxsum = sum * (con - 2);
				
				int [] temp = new int[soa*2];
				for(int k=0;k<temp.length;k++){
					temp[k]=arr[k%arr.length];
				}
				int [] allinfo= recursivekadanes(temp, 0, Integer.MIN_VALUE, Integer.MIN_VALUE, false, info);
			maxsum+=allinfo[0];
			
			
			System.out.println(maxsum);
			}
			else if(sum<=0){
				int [] temp = new int[soa*2];
				for(int k=0;k<temp.length;k++){
					temp[k]=arr[k%arr.length];
				}
//				for(int k=0;k<temp.length;k++){
//					System.out.print(temp[k]+" ");
//				}
				int [] allinfo= recursivekadanes(temp, 0, Integer.MIN_VALUE, Integer.MIN_VALUE, false, info);
				
				System.out.println(allinfo[0]);
			}

		}

		// TODO Auto-generated method stub

	}
	

	public static int[] recursivekadanes(int[] arr, int idx, int sum, int maxsum, boolean winner, int[] info) {
		if (idx == arr.length) {
			return info;
		}

		if (winner == false && arr[idx] >= 0) {
			winner = true;

			sum = arr[idx];
			if (sum >= maxsum) {
				maxsum = sum;
				info[0] = sum;
				info[1] = idx;
				info[2] = idx;
			}
			int[] k = recursivekadanes(arr, idx + 1, sum, maxsum, winner, info);
			return k;

		} else if (winner == false && arr[idx] < 0) {
			sum = arr[idx];
			if (sum > maxsum) {
				info[0] = sum;
				info[1] = idx;
				info[2] = idx;
				maxsum = sum;
			}
			int[] k = recursivekadanes(arr, idx + 1, sum, maxsum, winner, info);
			return k;
		} else if (winner == true && arr[idx] > 0) {
			sum += arr[idx];
			if (sum >= maxsum) {
				info[0]=sum;
				maxsum = sum;
				info[2] = idx;
			}

			int[] k = recursivekadanes(arr, idx + 1, sum, maxsum, winner, info);
			return k;
		} else {
			sum += arr[idx];
			if (sum < 0) {
				winner = false;
			} else {
				winner = true;
			}
			int[] k = recursivekadanes(arr, idx + 1, sum, maxsum, winner, info);
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
