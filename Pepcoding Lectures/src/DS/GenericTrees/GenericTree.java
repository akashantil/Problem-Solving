package DS.GenericTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class GenericTree {

	private class node {

		int data;
		ArrayList<node> children = new ArrayList<>();
	}

	// private class Node {
	// int data;
	// Node head;
	// Node tail;
	// ArrayList<Node> children = new ArrayList<>();
	//
	// }

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

	public void removeLeaves() {
		removeLeaves(this.root);

	}

	private void removeLeaves(node nd) {

		for (int i = 0; i < nd.children.size(); i++) {
			node child = nd.children.get(i);

			if (child.children.size() == 0) {
				nd.children.remove(child);
				i--;
			}

		}

	}

	public void preOrder() {
		preOrder(this.root);

	}

	private void preOrder(node nd) {

		System.out.print(nd.data + "  ");
		for (node c : nd.children) {
			preOrder(c);
		}
	}

	public void postOrder() {
		postOrder(this.root);

	}

	private void postOrder(node nd) {

		for (node c : nd.children) {
			postOrder(c);
		}
		System.out.print(nd.data + " ");
	}

	public void levelOrder() {

		LinkedList<node> queue = new LinkedList<>();
		queue.addLast(this.root);

		while (queue.size() > 0) {
			node rem = queue.removeFirst();
			System.out.print(rem.data + " ");
			for (node x : rem.children) {
				queue.addLast(x);

			}

		}
	}

	public void levelOrderLW() {

		LinkedList<node> queue = new LinkedList<>();
		queue.addLast(this.root);
		node temp = new node();
		temp.data = -1;
		queue.add(temp);

		while (queue.size() > 1) {
			node rem = queue.removeFirst();
			if (rem.data == -1) {

				System.out.println();
				queue.add(temp);

			} else {
				System.out.print(rem.data + " ");
			}
			for (node x : rem.children) {
				queue.addLast(x);

			}

		}
	}

	public void levelOrderZigZag() {

		Stack<node> stack1 = new Stack<>();
		Stack<node> stack2 = new Stack<>();

		stack1.push(this.root);
		while (stack1.size() > 0 || stack2.size() > 0) {

			while (!stack1.isEmpty()) {
				node temp = stack1.pop();

				System.out.print(temp.data + " ");
				for (node x : temp.children)
					stack2.push(x);

			}
			if (stack1.isEmpty())
				System.out.println();
			while (!stack2.isEmpty()) {

				node temp = stack2.pop();

				System.out.print(temp.data + " ");
				for (int i = temp.children.size() - 1; i >= 0; i--)
					stack1.push(temp.children.get(i));

			}
			if (stack2.isEmpty())
				System.out.println();

		}

	}

	public void makeLinearFake() {

		makeLinearFake(this.root);

	}

	private void makeLinearFake(node nd) {

		for (node x : nd.children) {

			makeLinearFake(x);

		}
		for (int i = nd.children.size() - 1; i >= 1; i--) {

			node im1 = nd.children.get(i - 1);

			node cn = nd.children.get(i);

			nd.children.remove(i);

			node tail = getTail(im1);
			tail.children.add(cn);

		}

	}

	private node getTail(node cn) {

		node temp = cn;
		while (temp.children.size() != 0) {
			temp = temp.children.get(0);
		}

		return temp;

	}

}
