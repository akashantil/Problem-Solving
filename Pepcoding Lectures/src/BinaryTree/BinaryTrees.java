package BinaryTree;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTrees {

	public class Node {

		int data;
		Node left;
		Node right;
	}

	private Node root;
	private int size;

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public BinaryTrees() {
		this.root = takeInput(new Scanner(System.in), null, false);
	}

	private Node takeInput(Scanner sc, Node parent, boolean ilc) {

		if (parent == null) {
			System.out.println("Enter data for root node");

		} else if (ilc == true) {
			System.out.println("Enter data for left child of -> " + parent.data);

		} else {
			System.out.println("Enter data for right child of -> " + parent.data);

		}
		Node child = new Node();
		int cdata = sc.nextInt();
		child.data = cdata;
		this.size++;

		System.out.println("Do you ( " + child.data + " ) you have a left child");

		boolean hlc = sc.nextBoolean();
		if (hlc) {

			child.left = takeInput(sc, child, true);

		}
		System.out.println("Do you ( " + child.data + " ) have a right child");
		boolean hrc = sc.nextBoolean();
		if (hrc) {

			child.right = takeInput(sc, child, false);
		}

		return child;

	}

	public void display() {
		display(this.root);

	}

	private void display(Node nodee) {

		if (nodee == null)
			return;
		String str = nodee.left != null ? nodee.left.data + " " : " . ";
		str += "-> " + nodee.data + " <- ";
		str += nodee.right != null ? nodee.right.data + " " : " . ";

		System.out.println(str);
		display(nodee.left);
		display(nodee.right);

	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {

		if (node == null) {
			return Integer.MIN_VALUE;
		}

		int left = max(node.left);
		int right = max(node.right);

		return Math.max(node.data, Math.max(left, right));

	}

	public int size2() {
		return size2(this.root);
	}

	private int size2(Node node) {
		if (node == null) {
			return 0;
		}

		int left = size2(node.left);
		int right = size2(node.right);

		return left + right + 1;

	}

	public boolean find(int data) {
		return this.find(this.root, data);

	}

	private boolean find(Node node, int data) {

		if (node == null) {
			return false;
		}
		if (node.data == data)
			return true;

		boolean left = find(node.left, data);
		if (left)
			return true;
		boolean right = find(node.right, data);
		if (right)
			return true;

		return false;

	}

	public int height() {
		return height(this.root);
	}

	private int height(Node node) {
		if (node == null)
			return -1;
		// if (node.left == null && node.right == null)
		// return 0;

		int lh = height(node.left);
		int rh = height(node.right);

		return Math.max(lh, rh) + 1;

	}

	public void removeLeaves() {
		removeLeaves(this.root);

	}

	private Node removeLeaves(Node node) {
		if (node == null) {
			return null;
		}
		if (node.left == null && node.right == null)
			return null;

		node.left = removeLeaves(node.left);
		node.right = removeLeaves(node.right);

		return node;

	}

	public void singleChild() {

		singleChild(this.root);

	}

	private void singleChild(Node node) {
		if (node == null)
			return;
		else if (node.left != null && node.right == null) {
			System.out.println(node.left.data);
		} else if (node.right != null && node.left == null) {
			System.out.println(node.right.data);
		}

		singleChild(node.left);
		singleChild(node.right);

	}

	public ArrayList<Integer> nodeToRoot(int data) {

		return nodeToRoot(this.root, data);

	}

	private ArrayList<Integer> nodeToRoot(Node node, int data) {

		if (node == null) {
			ArrayList<Integer> a = new ArrayList<>();
			return a;
		}
		if (node.data == data) {

			ArrayList<Integer> a = new ArrayList<>();
			a.add(node.data);
			return a;
		}

		ArrayList<Integer> left = nodeToRoot(node.left, data);
		if (left.size() != 0) {
			left.add(node.data);
			return left;
		}
		ArrayList<Integer> right = nodeToRoot(node.right, data);
		if (right.size() != 0) {
			right.add(node.data);
			return right;
		}

		// return left or right or new empty array list dosent matter as at this
		// point it
		// means we havent found ans and both left right will be empty
		return left;

	}

	public void targetSumroottoLeaf(int low, int high) {
		targetSumRoottoLeaf(this.root, low, high, 0, "");
	}

	private void targetSumRoottoLeaf(Node node, int low, int high, int ssf, String psf) {

		if (node == null)
			return;
		if (node.left == null && node.right == null) {
			ssf += node.data;
			if (ssf >= low && ssf <= high)
				System.out.println(psf + node.data + " ");

			return;

		}

		targetSumRoottoLeaf(node.left, low, high, ssf + node.data, psf + node.data+"-> ");
		targetSumRoottoLeaf(node.right, low, high, ssf + node.data, psf + node.data+"-> ");

	}
}
