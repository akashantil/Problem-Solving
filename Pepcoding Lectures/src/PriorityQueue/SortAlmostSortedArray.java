package PriorityQueue;

import java.util.PriorityQueue;

public class SortAlmostSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 3, 7, 15, 25, 20, 55, 66, 30 };

		// an elemnt can be atmost k position left or right

		int k = 2;

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i <= k; i++)
			pq.add(arr[i]);
		int i = 0;
		for (i = 0; i < arr.length - k - 1; i++) {

			arr[i] = pq.remove();

			pq.add(arr[i + k + 1]);

		}
		while (!pq.isEmpty()) {
			arr[i] = pq.remove();
			i++;
		}

		for (int i1 = 0; i1 < arr.length; i1++) {
			System.out.print(arr[i1] + " ");
		}
	}

}
