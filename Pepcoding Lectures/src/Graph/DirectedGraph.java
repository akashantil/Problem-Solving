package Graph;

import java.util.ArrayList;

public class DirectedGraph extends Graph {

	public void removeVertex(String vname) {

		if (containsVertex(vname) == false) {
			return;

		}

		for (String currvtx : vts.keySet())
			removeEdge(currvtx, vname);

		vts.remove(vname);
	}

	public int countedges() {
		int edges = 0;
		ArrayList<String> keys = new ArrayList<>(vts.keySet());

		for (String x : keys) {
			edges += vts.get(x).size();

		}
		return edges;
	}

	public void addedge(String v1name, String v2name, int weight) {

		if (containsedge(v1name, v2name) == true)
			return;

		vts.get(v1name).put(v2name, weight);

	}

	public void removeEdge(String v1name, String v2name) {
		if (containsedge(v1name, v2name) == false)
			return;

		vts.get(v2name).remove(v1name);
	}
	
	

}
