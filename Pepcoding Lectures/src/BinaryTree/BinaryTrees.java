package BinaryTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;

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

	public Node find(int data) {
		return this.find(this.root, data);

	}

	private Node find(Node node, int data) {

		if (node == null) {
			// return false;
			return new Node();
		}
		if (node.data == data)
			return node;

		Node left = find(node.left, data);
		if (left != null)
			return left;
		Node right = find(node.right, data);
		if (right != null)
			return right;

		return new Node();

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

	// public ArrayList<Integer> nodeToRoot(int data) {
	//
	// return nodeToRoot(this.root, data);
	//
	// }
	//
	// private ArrayList<Integer> nodeToRoot(Node node, int data) {
	//
	// if (node == null) {
	// ArrayList<Integer> a = new ArrayList<>();
	// return a;
	// }
	// if (node.data == data) {
	//
	// ArrayList<Integer> a = new ArrayList<>();
	// a.add(node.data);
	// return a;
	// }
	//
	// ArrayList<Integer> left = nodeToRoot(node.left, data);
	// if (left.size() != 0) {
	// left.add(node.data);
	// return left;
	// }
	// ArrayList<Integer> right = nodeToRoot(node.right, data);
	// if (right.size() != 0) {
	// right.add(node.data);
	// return right;
	// }
	//
	// // return left or right or new empty array list dosent matter as at this
	// // point it
	// // means we havent found ans and both left right will be empty
	// return left;
	//
	// }
	public ArrayList<Node> nodeToRoot(int data) {

		return nodeToRoot(this.root, data);

	}

	private ArrayList<Node> nodeToRoot(Node node, int data) {

		if (node == null) {
			ArrayList<Node> a = new ArrayList<>();
			return a;
		}
		if (node.data == data) {

			ArrayList<Node> a = new ArrayList<>();
			a.add(node);
			return a;
		}

		ArrayList<Node> left = nodeToRoot(node.left, data);
		if (left.size() != 0) {
			left.add(node);
			return left;
		}
		ArrayList<Node> right = nodeToRoot(node.right, data);
		if (right.size() != 0) {
			right.add(node);
			return right;
		}

		// return left or right or new empty array list dosent matter as at this
		// point it
		// means we havent found ans and both left right will be empty
		return new ArrayList<>();

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

		targetSumRoottoLeaf(node.left, low, high, ssf + node.data, psf + node.data + "-> ");
		targetSumRoottoLeaf(node.right, low, high, ssf + node.data, psf + node.data + "-> ");

	}

	public void dataFromNtoK(int k, int data) {

		dataFromNtoK(this.root, data, k);

	}

	private void dataFromNtoK(Node node, int data, int k) {

		ArrayList<Node> temp = nodeToRoot(data);
		for (int i = 0; i <= k; i++) {

			if (i == 0) {
				dataFromNtoKDeep(temp.get(i), k - i);

			} else if (i < k) {
				Node curr = temp.get(i);
				Node prev = temp.get(i - 1);

				if (curr.left == prev) {
					dataFromNtoKDeep(curr.right, k - i - 1);
				} else {
					dataFromNtoKDeep(curr.left, k - i - 1);
				}
			} else {
				System.out.println(temp.get(i).data);
			}

		}

	}

	private void dataFromNtoKDeep(Node node, int k) {
		if (node == null)
			return;
		if (k == 0) {
			System.out.println(node.data);
			return;
		}

		dataFromNtoKDeep(node.left, k - 1);
		dataFromNtoKDeep(node.right, k - 1);

	}

	// public BinaryTrees(int[] preorder, int[] inorder) {
	// this.root = construct(preorder, inorder, 0, postorder.length - 1, 0,
	// preorder.length - 1);
	//
	// }

	private Node construct(int[] preorder, int[] inorder, int psi, int pei, int isi, int iei) {

		if (psi < pei || isi > iei) {
			return null;
		}
		int si = -1;
		Node child = new Node();
		child.data = preorder[psi];

		for (int i = isi; i <= iei; i++) {
			if (child.data == inorder[i]) {

				si = i;
				break;
			}
		}
		int noe = si - isi;
		child.left = construct(preorder, inorder, psi + 1, psi + noe, isi, si - 1);
		child.right = construct(preorder, inorder, psi + noe + 1, pei, si + 1, iei);

		return child;

	}

	public BinaryTrees(int[] postorder, int[] inorder) {
		this.root = construct2(postorder, inorder, 0, postorder.length - 1, 0, postorder.length - 1);

	}

	public Node construct2(int[] postorder, int[] inorder, int psi, int pei, int isi, int iei) {

		if (pei < psi || isi > iei) {
			return null;
		}
		int si = -1;
		Node child = new Node();
		child.data = postorder[pei];

		for (int i = isi; i <= iei; i++) {
			if (child.data == inorder[i]) {

				si = i;
				break;
			}
		}
		int noe = si - isi;
		child.left = construct2(postorder, inorder, psi, pei - noe, isi, si - 1);
		child.right = construct2(postorder, inorder, pei - noe + 1, pei - 1, si + 1, iei);

		return child;

	}

	public void preo() {
		preo(this.root);

	}

	private void preo(Node node) {
		if (node == null)
			return;

		System.out.print(node.data + " -> ");
		preo(node.left);
		preo(node.right);

	}

	public void ino() {
		ino(this.root);

	}

	private void ino(Node node) {
		if (node == null)
			return;

		ino(node.left);
		System.out.print(node.data + " -> ");
		ino(node.right);

	}

	public void posto() {
		posto(this.root);

	}

	private void posto(Node node) {
		if (node == null)
			return;

		posto(node.left);

		posto(node.right);
		System.out.print(node.data + " -> ");

	}

	public void levelOrder() {
		levelOrder(this.root);

	}

	private void levelOrder(Node node) {
		LinkedList<Node> qu = new LinkedList<>();
		qu.add(node);
		while (!qu.isEmpty()) {
			Node a = qu.removeFirst();
			System.out.print(a.data + " ");
			if (a.left != null)
				qu.addLast(a.left);
			if (a.right != null)
				qu.addLast(a.right);
		}

	}
}
