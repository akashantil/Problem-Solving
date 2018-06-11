package Trees;

import java.util.Scanner;

public class BoundaryTraversal {

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
		solve(nodes[0]);
	}

	private static void solve(Node node) {
		printleftboundary(node);
		printleaves(node);
		printrightboundary(node);
	}

	private static void printleftboundary(Node node) {
		if(node==null)
			return;

		if (node.left == null && node.right == null)
			return;

		System.out.print(node.data + " ");

		if (node.left == null && node.right != null) {

			printleftboundary(node.right);

		}

		printleftboundary(node.left);

	}

	private static void printrightboundary(Node node) {
		if(node==null)
			return;

		if (node.left == null && node.right == null)
			return;

		if (node.left != null && node.right == null) {

			printrightboundary(node.left);

		}

		printrightboundary(node.right);
		System.out.print(node.data + " ");

	}
	private static void printleaves(Node node) {
		if(node==null)
			return;
		
		
		
		if(node.left==null && node.right==null){
			System.out.print(node.data + " ");
			return;
				
			}
			

		printleaves(node.left);
		printleaves(node.right);

		
		

	}
}
