package Graph;

import java.util.ArrayList;

import java.util.PriorityQueue;

public class KrushkalClient {
	public static class Edge implements Comparable<Edge> {
		int v1;
		int v2;
		int wt;

		public Edge(int v1, int v2, int wt) {
			this.v1 = v1;
			this.v2 = v2;
			this.wt = wt;
		}

		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return this.wt - o.wt;
		}

		public String toString() {
			return "[ V" + this.v1 + " :" + this.wt + "-> V" + this.v2 + "]";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Edge> edges = new ArrayList<>();
		int vces = 6;

		edges.add(new Edge(0, 1, 10));
		edges.add(new Edge(1, 2, 10));
		edges.add(new Edge(2, 3, 10));
		edges.add(new Edge(0, 3, 10));
		edges.add(new Edge(3, 4, 2));
		edges.add(new Edge(4, 5, 3));
		edges.add(new Edge(4, 6, 8));
		edges.add(new Edge(5, 6, 3));

		System.out.println(krushkal(edges, vces));

	}

	public static void union(int[] dset, int v1set, int v2set, int[] rank) {

		if (rank[v1set] < rank[v2set]) {
			dset[v1set] = v2set;
		} else if (rank[v1set] > rank[v2set]) {
			dset[v2set] = v1set;
		} else {
			dset[v2set] = v1set;
			rank[v1set]++;
		}
	}

	public static int find(int[] dset, int v) {

		if (dset[v] != v) {
			dset[v] = find(dset, dset[v]);

		}
		return dset[v];

	}

	public static ArrayList<Edge> krushkal(ArrayList<Edge> edges, int vces) {

		int[] dset = new int[vces + 1];
		int[] rank = new int[vces + 1];
		for (int i = 0; i < dset.length; i++) {
			dset[i] = i;
			rank[i] = 1;
		}

		ArrayList<Edge> mst = new ArrayList<>();
		PriorityQueue<Edge> pq = new PriorityQueue<>(edges);

		while (!pq.isEmpty()) {

			Edge re = pq.remove();

			int v1set = find(dset, re.v1);
			int v2set = find(dset, re.v2);

			if (v1set != v2set) {
				mst.add(re);

				union(dset, v1set, v2set, rank);
			}
		}
		return mst;

	}

}
