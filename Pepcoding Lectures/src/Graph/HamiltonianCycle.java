package Graph;

import java.util.HashSet;

public class HamiltonianCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int src = 2;

		HashSet<Integer> visited = new HashSet<>();

		int[][] graph = new int[7][7];
		graph[0][1] = 10;
		graph[1][0] = 10;

		graph[1][2] = 10;
		graph[2][1] = 10;

		graph[2][3] = 10;
		graph[3][2] = 10;

		graph[0][3] = 40;
		graph[3][0] = 40;

		graph[3][4] = 2;
		graph[4][3] = 2;

		graph[4][5] = 3;
		graph[5][4] = 3;
		
//		graph[2][5] = 3;
//		graph[5][2] = 3;

		graph[5][6] = 3;
		graph[6][5] = 3;

		graph[4][6] = 8;
		graph[6][4] = 8;

		visited.add(src);

		isHamiltonian(src, src+"", src, graph, visited);

	}

	public static void isHamiltonian(int src, String psf, int osrc, int[][] graph, HashSet<Integer> visited) {

		if (visited.size() == graph.length) {
			System.out.print(psf + ": is a HP ");
			if (graph[src][osrc] != 0) {
				System.out.print(" and a HC");
			}
			System.out.println();
			return;
		}

		for (int j = 0; j < graph.length; j++) {
			if (graph[src][j] != 0 && visited.contains(j) == false) {
				visited.add(j);

				isHamiltonian(j, psf + j, osrc, graph, visited);
				visited.remove(j);
			}
		}

	}

}
