package C4July16;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumSwaps {

	public static class pair implements Comparable<pair> {

		int data;
		int ind;

		public pair(int data, int ind) {
			this.data = data;
			this.ind = ind;
		}

		public int compareTo(pair o) {

			return this.data - o.data;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		pair[] temp = new pair[soa];
		for (int i = 0; i < soa; i++)
			temp[i] = new pair(arr[i], i);
		
		
		Arrays.sort(temp);
		int count
		
		for(int i=0;i<soa;i++){
			if()
		}

	}

}
