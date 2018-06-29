package PriorityQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class MergeKSortedLists {
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

		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		lists.add(new ArrayList<>(Arrays.asList(10, 15, 20, 25)));
		lists.add(new ArrayList<>(Arrays.asList(5, 7, 12, 18, 22)));
		lists.add(new ArrayList<>(Arrays.asList(3, 14, 19, 23, 34)));
		lists.add(new ArrayList<>(Arrays.asList(11, 17, 21)));

		System.out.println(merge(lists));

	}

	public static ArrayList<Integer> merge(ArrayList<ArrayList<Integer>> lists) {
		ArrayList<Integer> al = new ArrayList<>();

		PriorityQueue<Pair> pq = new PriorityQueue<>();
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

}
