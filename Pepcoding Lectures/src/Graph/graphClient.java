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
		g.addedge("B", "C", 10);
		g.addedge("D", "C", 10);
		g.addedge("D", "E", 2);
		g.addedge("F", "E", 3);
		g.addedge("E", "G", 8);
		g.addedge("F", "G", 3);
		
		g.display();
		
		g.removeVertex("D");
		
		g.display();
		
	}

}
