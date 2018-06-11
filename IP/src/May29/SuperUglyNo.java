package May29;

import java.util.Collections;
import java.util.PriorityQueue;

public class SuperUglyNo {

	public static class pair implements Comparable<pair> {
		int product;
		int idx;
		int ele;

		public pair(int product, int idx, int ele) {
			this.product = product;
			this.idx = idx;
			this.ele = ele;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return this.product - o.product;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 9;
		int[] arr = new int[no];
		int[] prime = { 3, 5, 7, 11, 13 };
		int[] indices = new int[prime.length];
		for (int i = 0; i < prime.length; i++) {
			indices[i] = 0;
		}

		arr[0] = 1;

		PriorityQueue<pair> pq = new PriorityQueue<>();

		for (int i = 0; i < prime.length; i++) {
			pair a = new pair(prime[i] * arr[0], 0, prime[i]);
			pq.add(a);
		}

		for (int i = 1; i < arr.length; i++) {
			pair cp = pq.remove();
			pair np = pq.peek();
			while (cp.product == np.product) {

				pq.remove();
				pair newp = new pair(np.ele * arr[np.idx + 1], np.idx + 1, np.ele);
				pq.add(newp);

				np = pq.peek();

			}

			arr[i] = cp.product;
			pair newp = new pair(cp.ele * arr[cp.idx + 1], cp.idx + 1, cp.ele);
			pq.add(newp);

		}
		System.out.println(arr[arr.length - 1]);

	}
}
