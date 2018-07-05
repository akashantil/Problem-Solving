package Graph;

public class graphClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graph g = new Graph();
		g.addvertex("A");
		g.addvertex("B");
		g.addvertex("C");
		g.addvertex("D");
		g.addvertex("E");
		g.addvertex("F");
		g.addvertex("G");

		g.addedge("A", "B", 10);
		g.addedge("D", "A", 40);
		// g.addedge("A", "C", 15);
		// g.addedge("C", "F", 5);

		g.addedge("B", "C", 10);
		g.addedge("D", "C", 10);
		g.addedge("D", "E", 2);
		g.addedge("F", "E", 3);
		g.addedge("E", "G", 8);
		g.addedge("F", "G", 3);

		// g.display();

		// System.out.println(g.hasPath("D", "E"));
		// g.removeEdge("D", "E");
		// System.out.println(g.hasPath("D", "E"));

		// g.multiSolver("A", "G", 40, 3);
		// g.removeVertex("D");
		//
		// g.display();
		// g.bfs("A", "G");
		// g.dfs("A", "G");

		 System.out.println(g.gcc());
		 System.out.println(g.cyclic());
		System.out.println(g.isBipartite());
	}

}
