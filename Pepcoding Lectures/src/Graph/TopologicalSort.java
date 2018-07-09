package Graph;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.HashSet;

public class TopologicalSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] graph = new int [7][7];
		graph[0][1]=10;

	}

	public void topsort(int[][] graph, int src) {
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		HashSet<Integer> visited = new HashSet<>();

		for (int i = 0; i < graph.length; i++) {
			if (graph[src][i] != 0) {

				topSort(graph, i, visited, stack);

			}
		}
		System.out.println(stack);

	}

	public void topSort(int[][] graph, int src, HashSet<Integer> visited, ArrayDeque<Integer> stack) {

		visited.add(src);

		for (int j = 0; j < graph.length; j++) {
			if (graph[src][j] != 0 && visited.contains(j) == false)
				topSort(graph, src, visited, stack);
		}

		stack.add(src);
		visited.remove(src);

	}

}
