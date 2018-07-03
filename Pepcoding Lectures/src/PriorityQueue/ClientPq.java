package PriorityQueue;

import java.util.ArrayList;
import java.util.Arrays;

public class ClientPq {

	public static class Pair implements Comparable<Pair> {
		int data;
		int idx;
		int li;

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.data - o.data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		// lists.add(new ArrayList<>(Arrays.asList(10, 15, 20, 25)));
		// lists.add(new ArrayList<>(Arrays.asList(5, 7, 12, 18, 22)));
		// lists.add(new ArrayList<>(Arrays.asList(3, 14, 19, 23, 34)));
		// lists.add(new ArrayList<>(Arrays.asList(11, 17, 21)));
		//
		// System.out.println(merge(lists));
		// System.out.println(merge(lists).size());
		int[] arr = { 2, 5, 9, 1, 0, 8, 7, 6 };
		heapSort(arr);

//		GenericPriorityQueue<Integer> pq = new GenericPriorityQueue<>(arr);
//		pq.display();
//		while (!pq.isEmpty()) {
//			System.out.print(pq.remove() + " ");
//		}

	}

	public static ArrayList<Integer> merge(ArrayList<ArrayList<Integer>> lists) {
		ArrayList<Integer> al = new ArrayList<>();

		GenericPriorityQueue<Pair> pq = new GenericPriorityQueue<>(true);
		for (int i = 0; i < lists.size(); i++) {
			Pair temp = new Pair();
			temp.data = lists.get(i).get(0);
			temp.idx = 0;
			temp.li = i;
			pq.add(temp);
		}

		while (!pq.isEmpty()) {
			Pair ans = pq.remove();
			al.add(ans.data);

			Pair add = new Pair();
			int listidx = ans.li;
			int vidx = ans.idx + 1;

			if (vidx < lists.get(listidx).size()) {
				add.data = lists.get(listidx).get(vidx);
				add.idx = vidx;
				add.li = listidx;
				pq.add(add);
			}

		}
		return al;

	}

	public static void heapSort(int[] arr) {

		for (int i = arr.length - 1; i >= 0; i--) {
			downHeapify(arr, arr.length, i);
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			swap(i, 0, arr);
			downHeapify(arr, i, 0);
		}
		
		for(int  a:arr)
			System.out.print(a+" ");

	}

	private static void downHeapify(int[] arr, int ei, int pi) {

		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int min = pi;

		if (lci < ei && arr[lci] < arr[min])
			min=lci;
		if (rci < ei && arr[rci] < arr[min])
			min=rci;

		if (min != pi) {
			swap(min, pi, arr);

			downHeapify(arr, ei, min);

		}
	}

	private static void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
