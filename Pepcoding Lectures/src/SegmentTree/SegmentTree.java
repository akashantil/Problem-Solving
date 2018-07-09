package SegmentTree;

public class SegmentTree {

	public class Node {
		int data;
		Node left;
		Node right;
		int ssi;
		int sei;
	}

	protected int size;
	protected Node root;
	IRangeOperator rop;

	public SegmentTree(int[] arr, IRangeOperator rop) {
		this.rop = rop;
		this.root = construct(arr, 0, arr.length - 1);

	}

	private Node construct(int[] arr, int ssi, int sei) {

		if (ssi == sei) {
			Node a = new Node();
			a.data = arr[ssi];

			a.ssi = ssi;
			a.sei = sei;
			this.size++;

			return a;

		}

		int mid = (ssi + sei) / 2;

		Node left = construct(arr, ssi, mid);
		Node right = construct(arr, mid + 1, sei);

		Node temp = new Node();

		temp.ssi = ssi;
		temp.sei = sei;

		temp.data = rop.operation(left.data, right.data);

		temp.left = left;
		temp.right = right;
		this.size++;

		return temp;

	}

	public void display() {

		display(this.root);

	}

	private void display(Node node) {

		if (node == null)
			return;

		String str = "";

		str += node.left == null ? " . " : node.left.data + " ";
		str += " <- ";
		str += node.data + " [ " + node.ssi + " -> " + node.sei + " ] ";
		str += " - >";
		str += node.left == null ? " . " : node.right.data + " ";
		System.out.println(str);

		display(node.left);
		display(node.right);

	}

	public void update(int idx, int val) {
		update(this.root, idx, val);

	}

	private void update(Node node, int idx, int val) {

		if (idx >= node.ssi && idx <= node.sei) {

			if (node.ssi == idx && idx == node.sei) {

				node.data = val;

			} else {
				update(node.left, idx, val);
				update(node.right, idx, val);
				node.data = rop.operation(node.left.data, node.right.data);
			}

		}

	}

	public int query(int qsi, int qei) {
		return query(this.root, qsi, qei);

	}

	private int query(Node node, int qsi, int qei) {

		if (node.ssi > qei || node.sei < qsi)
			return rop.Identity();
		if (node.ssi >= qsi && node.sei <= qei)
			return node.data;

		int left = query(node.left, qsi, qei);
		int right = query(node.right, qsi, qei);
		return rop.operation(left, right);

	}

}
