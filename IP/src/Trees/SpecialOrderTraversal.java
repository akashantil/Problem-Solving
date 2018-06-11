package Trees;

import java.util.LinkedList;
import java.util.Scanner;

public class SpecialOrderTraversal {

	private static class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	public static void display(Node node) {
		if (node == null) {
			return;
		}

		String str = "";

		str += node.left == null ? "." : node.left.data;
		str += " => " + node.data + " <= ";
		str += node.right == null ? "." : node.right.data;

		System.out.println(str);

		display(node.left);
		display(node.right);
	}

	public static void main(String[] args) {
		Node root = null;

		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		Node[] nodes = new Node[arr.length];
		for (int i = 0; i < nodes.length; i++) {
			if (arr[i] != -1) {
				nodes[i] = new Node(arr[i], null, null);

				if (i > 0) {
					int pi = (i - 1) / 2;

					if (i == 2 * pi + 1) {
						nodes[pi].left = nodes[i];
					} else {
						nodes[pi].right = nodes[i];
					}
				}
			}
		}

		// display(nodes[0]);
		LinkedList<Node> q = new LinkedList<>();
		solve(nodes[0],q);
		

		

	}

	private static void solve(Node root, LinkedList<Node> q) {

		System.out.print(root.data + " ");
		
		q.add(root.left);
		q.add(root.right);

		while (!q.isEmpty()) {

			Node a = q.removeFirst();
			Node b = q.removeFirst();
			System.out.print(a.data+" ");
			System.out.print(b.data+" ");
			if (a.left != null)
				q.add(a.left);
			if (b.right != null)
				q.add(b.right);
			if (a.right != null)
				q.add(a.right);
			if (b.left != null)
				q.add(b.left);

		}

	}

	

}
