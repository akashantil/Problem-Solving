package LRJuly18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NoMinNoMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int i = 0; i < not; i++) {
			int soa = sc.nextInt();
			int k = sc.nextInt();

			int[] arr = new int[soa];

			for (int j = 0; j < soa; j++)
				arr[j] = sc.nextInt();

			Arrays.sort(arr);

			solve(arr, 0, new ArrayList<>(), k);
			System.out.println(resu);
			resu = 1;
		}

	}

	static long resu = 1;
	

	public static void solve(int[] arr, int idx, ArrayList<Integer> res, int k) {

		if (res.size() == k) {
//			System.out.println(res);
			
			for(int i=1;i<res.size()-1;i++){
				int curr=res.get(i);
				resu=(resu*curr)%1000000007;
			}
		
			return;

		}
		if (idx == arr.length) {
			return;
		}
		res.add(arr[idx]);
		solve(arr, idx + 1, res, k);
		res.remove(res.size() - 1);
		solve(arr, idx + 1, res, k);
	}

}
