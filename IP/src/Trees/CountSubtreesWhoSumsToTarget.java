package Trees;

import java.util.Scanner;

public class CountSubtreesWhoSumsToTarget {

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

		int tar = scn.nextInt();
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
		cool ab = solve(nodes[0], tar);
		System.out.println(ab.count);
	}

	public static class cool {
		int sum;
		int count;

		cool(int sum, int count) {
			this.sum = sum;
			this.count = count;
		}
	}

	// count of subtrees with sum equal to tar
	

	private static cool solve(Node node, int tar) {

		cool pair = new cool(0, 0);

		if (node == null) {
			cool ab = new cool(0, 0);
			return ab;
		}

		cool left = solve(node.left, tar);
		cool right = solve(node.right, tar);

		pair.sum = left.sum + right.sum + node.data;
		pair.count = left.count + right.count + (pair.sum == tar ? 1 : 0);

		return pair;

		// code this function
	}
}