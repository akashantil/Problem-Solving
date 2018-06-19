package GenericTrees;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {

	private class node {

		int data;
		ArrayList<node> children = new ArrayList<>();
	}

	private int size;
	private node root;

	public GenericTree() {
		Scanner scn = new Scanner(System.in);
		this.root = TakeInp(scn, null, 0);
	}

	public int size() {
		return this.size;
	}

	public boolean isempty() {
		return this.size == 0;
	}

	private node TakeInp(Scanner scn, node parent, int i) {
		if (parent == null) {
			System.out.println("Enter root node data");
		} else {
			System.out.println("Enter data for " + i + " th  node");
		}

		int cdata = scn.nextInt();
		node child = new node();
		child.data = cdata;
		size++;

		System.out.println("Enter the no of children for" + cdata);
		int nofc = scn.nextInt();

		for (int j = 0; j < nofc; j++) {
			node gc = TakeInp(scn, child, j);
			child.children.add(gc);

		}

		return child;
	}

	public void display() {
		this.DisplayNode(this.root);
	}

	private void DisplayNode(node n) {
		String s = n.data + "->";

		for (node r : n.children) {
			s += r.data + "->";
		}

		System.out.println(s);
		for (node c : n.children) {
			DisplayNode(c);
		}

	}

	public int sizee() {
		return size2(this.root);
	}

	private int size2(node nd) {
		if (nd == null)
			return 0;

		int count = 0;

		for (node c : nd.children) {

			count += size2(c);

		}

		return count + 1;

	}

	public int max() {
		return max(this.root);

	}

	private int max(node nd) {

		int max = Integer.MIN_VALUE;

		for (node c : nd.children) {

			int childMax = max(c);
			if (max < childMax) {
				max = childMax;
			}

		}

		return Math.max(max, nd.data);

	}

	public boolean find(int data) {
		return find(this.root, data);
	}

	private boolean find(node nd, int data) {

		if (nd.data == data)
			return true;

		boolean res = false;

		for (node c : nd.children) {

			res = find(c, data);
			if (res)
				return res;

		}
		return res;

	}

	public int height() {
		return height(this.root);
	}

	private int height(node nd) {

		int oh = -1;

		for (node c : nd.children) {

			int maxheight = height(c);
			if (maxheight + 1 > oh)
				oh = maxheight;
		}

		return oh + 1;

	}

}
