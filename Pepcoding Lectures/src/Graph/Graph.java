package Graph;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

import PriorityQueue.GenericPriorityQueue;

public class Graph {
	protected HashMap<String, HashMap<String, Integer>> vts = new HashMap<>();

	public Graph() {

	}

	public int countVertices() {
		return this.vts.size();
	}

	public boolean containsVertex(String vname) {
		return vts.containsKey(vname);

	}

	public void addvertex(String vname) {

		if (vts.containsKey(vname)) {
			return;
		} else {
			vts.put(vname, new HashMap<>());
		}
	}

	public void removeVertex(String vname) {

		if (containsVertex(vname) == false) {
			return;

		}

		HashMap<String, Integer> nbmap = vts.get(vname);
		ArrayList<String> keys = new ArrayList<>(nbmap.keySet());
		for (String x : keys)
			removeEdge(vname, x);

		vts.remove(vname);
	}

	public int countedges() {
		int edges = 0;
		ArrayList<String> keys = new ArrayList<>(vts.keySet());

		for (String x : keys) {
			edges += vts.get(x).size();

		}
		return edges / 2;
	}

	public boolean containsedge(String v1name, String v2name) {

		if (containsVertex(v1name) == false || containsVertex(v2name) == false)
			return false;

		return vts.get(v1name).containsKey(v2name);

	}

	public void addedge(String v1name, String v2name, int weight) {

		if (containsedge(v1name, v2name) == true)
			return;

		vts.get(v1name).put(v2name, weight);
		vts.get(v2name).put(v1name, weight);
	}

	public void removeEdge(String v1name, String v2name) {
		if (containsedge(v1name, v2name) == false)
			return;

		vts.get(v2name).remove(v1name);
		vts.get(v1name).remove(v2name);

	}

	public void display() {
		System.out.println("-----------------------------------");

		ArrayList<String> keys = new ArrayList<>(vts.keySet());

		for (String x : keys) {
			HashMap<String, Integer> nb = vts.get(x);
			System.out.println(x + "-> " + nb);
		}

		System.out.println("-----------------------------------");

	}

	public boolean hasPath(String v1name, String v2name) {

		return hasPath(v1name, v2name, new HashSet<>());

	}

	private boolean hasPath(String v1name, String v2name, HashSet<String> visited) {
		HashMap<String, Integer> nbr = vts.get(v1name);
		if (nbr.containsKey(v2name))
			return true;

		visited.add(v1name);
		ArrayList<String> keys = new ArrayList<>(nbr.keySet());
		for (String x : keys) {

			if (visited.contains(x) == false) {

				boolean res = hasPath(x, v2name, visited);
				if (res)
					return true;

			}

		}
		return false;

	}

	public void printAllPath(String v1name, String v2name) {

		printAllPath(v1name, v2name, new HashSet<>(), v1name);

	}

	private void printAllPath(String v1name, String v2name, HashSet<String> visited, String asf) {

		if (v1name.equals(v2name)) {
			System.out.println(asf);
			return;
		}

		visited.add(v1name);

		for (String x : vts.get(v1name).keySet()) {

			if (visited.contains(x) == false) {

				printAllPath(x, v2name, visited, asf + x);

			}

		}
		visited.remove(v1name);

	}

	public void smallestPath(String v1name, String v2name) {

		smallestPath(v1name, v2name, new HashSet<>(), v1name, 0);

		System.out.println("Smallest PAth :" + path + "with cost : " + cost);

	}

	static int cost = Integer.MAX_VALUE;
	static String path = "";

	private void smallestPath(String v1name, String v2name, HashSet<String> visited, String asf, int csf) {

		if (v1name.equals(v2name)) {
			if (csf < cost) {
				cost = csf;
				path = asf + " ";
			}
			return;
		}

		visited.add(v1name);

		for (String x : vts.get(v1name).keySet()) {

			if (visited.contains(x) == false) {
				int weig = vts.get(v1name).get(x);

				smallestPath(x, v2name, visited, asf + x, csf + weig);

			}

		}
		visited.remove(v1name);

	}

	public void largestPAth(String v1name, String v2name) {

		largestPAth(v1name, v2name, new HashSet<>(), v1name, 0);

		System.out.println("Largest PAth is :" + lpath + "with cost : " + lcost);

	}

	static int lcost = Integer.MIN_VALUE;
	static String lpath = "";

	private void largestPAth(String v1name, String v2name, HashSet<String> visited, String asf, int csf) {

		if (v1name.equals(v2name)) {
			if (csf > lcost) {
				lcost = csf;
				lpath = asf + " ";
			}
			return;
		}

		visited.add(v1name);

		for (String x : vts.get(v1name).keySet()) {

			if (visited.contains(x) == false) {
				int weig = vts.get(v1name).get(x);

				largestPAth(x, v2name, visited, asf + x, csf + weig);

			}

		}
		visited.remove(v1name);

	}

	static int jcost = Integer.MAX_VALUE;
	static String jpath = "";

	private class Pair implements Comparable<Pair> {
		int dist;
		String path;

		Pair(int dist, String path) {
			this.dist = dist;
			this.path = path;
		}

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.dist - o.dist;
		}
	}

	private class heapMover {
		int mincost = Integer.MAX_VALUE;
		String minPath = "";
		int maxCost = Integer.MIN_VALUE;
		String maxPath = "";
		int justLargerCost = Integer.MAX_VALUE;
		String justLargerPath = "";

		PriorityQueue<Pair> pq = new PriorityQueue<>();

	}

	// this one solves smallest ,largest ,just larger ,k th largest problem

	public void multiSolver(String src, String des, int jl, int k) {

		heapMover result = new heapMover();

		multiSolver(src, des, jl, k, new HashSet<>(), result, 0, src);

		System.out.println("Max Cost PAth is :" + result.maxPath + " whose cost is :" + result.maxCost);
		System.out.println("Min Cost PAth is :" + result.minPath + " whose cost is :" + result.mincost);
		System.out
				.println("Just larger Path is :" + result.justLargerPath + " whose cost is :" + result.justLargerCost);
		System.out
				.println("kth largest PAth is :" + result.pq.peek().path + " whose cost is :" + result.pq.peek().dist);

	}

	private void multiSolver(String src, String des, int jl, int k, HashSet<String> visited, heapMover mover, int wsf,
			String psf) {

		if (src.equals(des)) {

			System.out.println(psf + " @ " + wsf);

			if (wsf < mover.mincost) {
				mover.mincost = wsf;
				mover.minPath = psf;
			}
			if (wsf > mover.maxCost) {
				mover.maxCost = wsf;
				mover.maxPath = psf;
			}
			if (wsf > jl && wsf < mover.justLargerCost) {
				mover.justLargerCost = wsf;
				mover.justLargerPath = psf;
			}
			if (mover.pq.size() < k) {
				Pair a = new Pair(wsf, psf);
				mover.pq.add(a);
			} else {
				int top = mover.pq.peek().dist;
				if (wsf > top) {
					mover.pq.remove();
					Pair a = new Pair(wsf, psf);
					mover.pq.add(a);
				}
			}
			return;

		}

		visited.add(src);
		for (String nbr : vts.get(src).keySet()) {
			if (!visited.contains(nbr)) {

				multiSolver(nbr, des, jl, k, visited, mover, wsf + vts.get(src).get(nbr), psf + nbr);

			}

		}
		visited.remove(src);

	}

	private class TPair {
		String psf;
		String vname;
		String color;

		public TPair(String psf, String vname) {
			// TODO Auto-generated constructor stub
			this.psf = psf;
			this.vname = vname;
		}

		public TPair(String psf, String vname, String color) {
			// TODO Auto-generated constructor stub
			// this.psf = psf;
			// this.vname = vname;
			this(psf, vname);
			this.color = color;
		}
	}

	public void bfs(String src, String des) {
		HashSet<String> visited = new HashSet<>();

		LinkedList<TPair> q = new LinkedList<>();

		TPair rootPair = new TPair(src, src);
		q.addLast(rootPair);

		while (!q.isEmpty()) {

			TPair rp = q.removeFirst();

			System.out.println("Path is " + rp.vname + " @ " + rp.psf);

			if (rp.vname == des) {
				System.out.println(" Path Found");
				System.out.println("Path is" + rp.vname + " @ " + rp.psf);
				return;
			}

			visited.add(rp.vname);

			for (String a : vts.get(rp.vname).keySet()) {

				if (visited.contains(a) == false)
					q.add(new TPair(rp.psf + a, a));
			}
		}

	}

	public void dfs(String src, String des) {
		HashSet<String> visited = new HashSet<>();

		LinkedList<TPair> q = new LinkedList<>();

		TPair rootPair = new TPair(src, src);
		q.addFirst(rootPair);

		while (!q.isEmpty()) {

			TPair rp = q.removeFirst();

			System.out.println("Path is " + rp.vname + " @ " + rp.psf);

			if (rp.vname == des) {
				System.out.println(" Path Found");
				System.out.println("Path is" + rp.vname + " @ " + rp.psf);
				return;
			}

			visited.add(rp.vname);

			ArrayList<String> keys = new ArrayList<>(vts.get(rp.vname).keySet());

			for (int i = keys.size() - 1; i >= 0; i--) {
				String a = keys.get(i);

				if (visited.contains(a) == false)
					q.addFirst(new TPair(rp.psf + a, a));
			}
		}

	}

	public void bft() {

		HashSet<String> visited = new HashSet<>();

		for (String a : vts.keySet()) {

			if (visited.contains(a) == false) {

				System.out.println("One part of Graph");
				printBftComponent(a, visited);
			}
		}

	}

	private void printBftComponent(String src, HashSet<String> visited) {

		LinkedList<TPair> q = new LinkedList<>();

		TPair rootPair = new TPair(src, src);
		q.addLast(rootPair);

		while (!q.isEmpty()) {

			TPair rp = q.removeFirst();

			System.out.println("Reached to node  " + rp.vname + " @ " + rp.psf);

			visited.add(rp.vname);

			for (String a : vts.get(rp.vname).keySet()) {

				if (visited.contains(a) == false)
					q.add(new TPair(rp.psf + a, a));
			}
		}

	}

	public void dft() {

		HashSet<String> visited = new HashSet<>();

		for (String a : vts.keySet()) {

			if (visited.contains(a) == false) {

				System.out.println("One part of Graph");
				printdftComponent(a, visited);
			}
		}

	}

	public void printdftComponent(String src, HashSet<String> visited) {

		LinkedList<TPair> q = new LinkedList<>();

		TPair rootPair = new TPair(src, src);
		q.addFirst(rootPair);

		while (!q.isEmpty()) {

			TPair rp = q.removeFirst();

			System.out.println("Path is " + rp.vname + " @ " + rp.psf);

			visited.add(rp.vname);

			ArrayList<String> keys = new ArrayList<>(vts.get(rp.vname).keySet());

			for (int i = keys.size() - 1; i >= 0; i--) {
				String a = keys.get(i);

				if (visited.contains(a) == false)
					q.addFirst(new TPair(rp.psf + a, a));
			}
		}

	}

	public boolean isConnected() {

		HashSet<String> visited = new HashSet<>();
		ArrayList<String> keys = new ArrayList<>(vts.keySet());

		printBftComponent(keys.get(0), visited);
		if (visited.size() == vts.size()) {
			return true;
		} else {
			return false;
		}

	}

	public ArrayList<String> gcc() {

		ArrayList<String> res = new ArrayList<>();
		HashSet<String> visited = new HashSet<>();

		for (String a : vts.keySet()) {

			if (visited.contains(a) == false) {

				String x = solve(a, visited);
				res.add(x);
			}

		}
		return res;

	}

	private String solve(String src, HashSet<String> visited) {
		LinkedList<TPair> q = new LinkedList<>();
		String ans = "";

		TPair rootPair = new TPair(src, src);
		q.addFirst(rootPair);

		while (!q.isEmpty()) {

			TPair rp = q.removeFirst();

			// System.out.println("Path is " + rp.vname + " @ " + rp.psf);

			if (!visited.contains(rp.vname))
				ans += rp.vname;
			visited.add(rp.vname);
			for (String a : vts.get(rp.vname).keySet()) {
				if (visited.contains(a) == false) {
					q.addFirst(new TPair(rp.psf + a, a));

				}
			}
		}
		return ans;

	}

	public boolean cyclic() {

		HashSet<String> visited = new HashSet<>();

		for (String a : vts.keySet()) {

			if (visited.contains(a) == false) {

				boolean ans = containsCycle(a, visited);
				if (ans)
					return ans;
			}
		}
		return false;

	}

	private boolean containsCycle(String src, HashSet<String> visited) {
		LinkedList<TPair> q = new LinkedList<>();

		TPair rootPair = new TPair(src, src);
		q.addFirst(rootPair);

		while (!q.isEmpty()) {

			TPair rp = q.removeFirst();

			if (visited.contains(rp.vname))
				return true;

			visited.add(rp.vname);

			for (String a : vts.get(rp.vname).keySet()) {
				if (visited.contains(a) == false)
					q.addFirst(new TPair(rp.psf + a, a));

			}
		}
		return false;

	}

	public boolean isBipartite() {

		for (String a : vts.keySet()) {

			boolean x = isBipartite(a);
			if (!x)
				return x;
		}
		return true;

	}

	private boolean isBipartite(String src) {
		LinkedList<TPair> q = new LinkedList<>();
		HashMap<String, String> visited = new HashMap<>();

		TPair rootPair = new TPair(src, src, "red");
		q.addFirst(rootPair);

		while (!q.isEmpty()) {

			TPair rp = q.removeFirst();

			if (visited.containsKey(rp.vname)) {
				String oldcolor = visited.get(rp.vname);
				if (!rp.color.equals(oldcolor))
					return false;

			}

			visited.put(rp.vname, rp.color);

			for (String a : vts.get(rp.vname).keySet()) {

				if (visited.containsKey(a) == false)
					q.addFirst(new TPair(rp.psf + a, a, rp.color.equals("red") ? "green" : "red"));

			}
		}
		return true;

	}

	public class dPair implements Comparable<dPair> {
		int csf;
		String psf;
		String vname;

		dPair(int csf, String psf, String vname) {
			this.csf = csf;
			this.psf = psf;
			this.vname = vname;
		}

		@Override

		public int compareTo(dPair o) {
			// TODO Auto-generated method stub
			return this.csf - o.csf;
		}

		public String toString() {
			return "[" + this.psf + " @ " + this.csf + "]";
		}
	}

	public void dijkstra(String src) {
		GenericPriorityQueue<dPair> pq = new GenericPriorityQueue<Graph.dPair>();

		HashMap<String, dPair> res = new HashMap<>();

		for (String a : vts.keySet()) {

			dPair temp = new dPair(Integer.MAX_VALUE, "", a);

			if (a.equals(src)) {
				temp.csf = 0;
				temp.psf = "A";
			}

			res.put(a, temp);
			pq.add(temp);
		}

		while (pq.size() > 0) {
			dPair x = pq.remove();

			for (String nbr : vts.get(x.vname).keySet()) {

				int newcost = x.csf + vts.get(x.vname).get(nbr);
				String newPath = x.psf + nbr;

				dPair op = res.get(nbr);

				if (newcost < op.csf) {

					op.csf = newcost;
					op.psf = newPath;

					pq.updateElement(op);

				}

			}

		}
		System.out.println(res);

	}

	public void dijkastraNP(String src) {
		PriorityQueue<dPair> pq = new PriorityQueue<>();
		HashMap<String, dPair> map = new HashMap<>();
		HashSet<String> visited = new HashSet<>();

		pq.add(new dPair(0, src, src));
		map.put("A", new dPair(0, src, src));

		while (!pq.isEmpty()) {

			dPair rp = pq.remove();

			if (visited.contains(rp.vname))
				continue;
			visited.add(rp.vname);

			for (String a : vts.get(rp.vname).keySet()) {

				int newcost = rp.csf + vts.get(rp.vname).get(a);
				String newPath = rp.psf + a;

				if (map.containsKey(a) == false || newcost < map.get(a).csf) {
					dPair np = new dPair(newcost, newPath, a);

					map.put(a, np);
					pq.add(np);
				}
			}

		}

		System.out.println(map);

	}

	public class pPair implements Comparable<pPair> {
		int csf;
		String pname;
		String vname;

		pPair(int csf, String pname, String vname) {
			this.csf = csf;
			this.pname = pname;
			this.vname = vname;
		}

		@Override

		public int compareTo(pPair o) {
			// TODO Auto-generated method stub
			return this.csf - o.csf;
		}

	}

	public Graph prims() {
		GenericPriorityQueue<pPair> pq = new GenericPriorityQueue<>();
		Graph mst = new Graph();

		HashMap<String, pPair> res = new HashMap<>();

		for (String a : vts.keySet()) {

			pPair temp = new pPair(Integer.MAX_VALUE, null, a);

			res.put(a, temp);
			pq.add(temp);
		}

		while (pq.size() > 0) {
			pPair rp = pq.remove();

			for (String nbr : vts.get(rp.vname).keySet()) {
				
				pPair nbrpair = res.get(nbr);
				
				

				int newCost = vts.get(rp.vname).get(nbr);

				if (!mst.containsVertex(nbrpair.vname)) {

					if (newCost < nbrpair.csf) {

						nbrpair.pname = rp.vname;
						nbrpair.csf = newCost;

						pq.updateElement(nbrpair);

						// add vertex to mst

						mst.addvertex(rp.vname);

						if (rp.pname != null) {
							mst.addedge(rp.vname, rp.pname, rp.csf);
						}

						// add edges

					}
				}

			}

		}
		return mst;

	}

}
