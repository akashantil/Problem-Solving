package Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
	private HashMap<String, HashMap<String, Integer>> vts = new HashMap<>();

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
		if (vts.containsKey(v2name) == false || vts.containsKey(v1name) == false) {
			return;
		}

		if (containsedge(v1name, v2name) == false)
			return;

		vts.get(v2name).remove(v1name);
		vts.get(v1name).remove(v2name);

	}

	public void display() {
		System.out.println("-----------------------------------");
		
		ArrayList<String> keys = new ArrayList<>(vts.keySet());
		
		for(String x:keys){
			HashMap<String, Integer> nb= vts.get(x);
			System.out.println(x+"-> "+ nb);
		}
		
		System.out.println("-----------------------------------");

	}

}
