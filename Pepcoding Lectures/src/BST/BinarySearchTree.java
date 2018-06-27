package BST;

public class BinarySearchTree {

	public class Node {
		int data;
		Node left;
		Node right;
	}

	public Node root;
	public int size;

	public BinarySearchTree(int[] sa) {
		root = construct(sa, 0, sa.length - 1);

	}

	private Node construct(int[] sa, int lo, int hi) {

		int mid = (lo + hi) / 2;
		if (lo <= hi) {

			Node child = new Node();
			child.data = sa[mid];
			this.size++;

			child.left = construct(sa, lo, mid - 1);
			child.right = construct(sa, mid + 1, hi);

			return child;
		} else {

			return null;

		}
	}

	public void display() {
		display(this.root);

	}

	private void display(Node node) {

		if (node == null)
			return;
		String str = node.left != null ? node.left.data + " " : " . ";
		str += "-> " + node.data + " <- ";
		str += node.right != null ? node.right.data + " " : " . ";

		System.out.println(str);
		display(node.left);
		display(node.right);

	}

	public int max() {
		return max(this.root);

	}

	private int max(Node node) {
		if (node.right == null) {
			return node.data;

		}
		int right = max(node.right);

		return right;
	}

	public int min() {
		return min(this.root);

	}

	private int min(Node node) {
		if (node.left == null) {
			return node.data;

		}
		int right = min(node.left);

		return right;
	}

	public boolean find(int data) {

		return find(this.root, data);

	}

	private boolean find(Node node, int data) {

		if (node == null) {
			return false;
		}
		if (node.data == data)
			return true;

		boolean ans = false;

		if (node.data > data) {
			ans = find(node.left, data);
			if (ans)
				return true;
		} else {
			ans = find(node.right, data);
			if (ans)
				return true;
		}
		return false;
	}

	public void printInrange(int lo, int high) {
		printInrange(this.root, lo, high);

	}

	private void printInrange(Node node, int lo, int high) {

		if (node == null)
			return;
		if (node.data >= lo && node.data <= high) {

			printInrange(node.left, lo, high);
			// to print them in sorted way
			if (node.data >= lo && node.data <= high)
				System.out.print(node.data + " ");
			printInrange(node.right, lo, high);
		} else if (node.data < lo)
			printInrange(node.right, lo, high);
		else if (node.data > high)
			printInrange(node.left, lo, high);

	}

	public void replaceWithSum() {

		replaceWithSum(this.root);

	}

	static int ssf = 0;
	// do it with heap mover

	private void replaceWithSum(Node node) {

		if (node == null)
			return;

		replaceWithSum(node.right);
		int x = node.data;
		node.data = ssf;
		ssf += x;
		replaceWithSum(node.left);

	}

	public void addNode(int data) {

		addNode(this.root, data);
	}

	private void addNode(Node node, int data) {

		if (node == null)
			return;

		if (data > node.data) {
			if (node.right != null) {

				// if (node.right.data > data) {
				// Node temp = node.right;
				// Node a = new Node();
				// a.data = data;
				// a.right = temp;
				// node.right = a;
				// } else

				addNode(node.right, data);
			} else {
				Node a = new Node();
				a.data = data;
				node.right = a;
			}
		} else {

			if (node.left != null) {

				// if (node.left.data < data) {
				// Node temp = node.left;
				// Node a = new Node();
				// a.data = data;
				// a.left = temp;
				// node.left = a;
				// } else

				addNode(node.left, data);
			} else {
				Node a = new Node();
				a.data = data;
				node.left = a;

			}
		}

	}

	public void removeNode(int data) {
		root = removeNode(this.root, data);

	}

	private Node removeNode(Node node, int data) {

		if (data > node.data) {
			node.right = removeNode(node.right, data);
			return node;
		} else if (data < node.data) {
			node.left = removeNode(node.left, data);
			return node;

		} else {
			if (node.left == null && node.right == null) {
				return null;
			} else if (node.left == null && node.right != null)
				return node.right;
			else if (node.left != null && node.right == null)
				return node.left;
			else {

				int no = min(node.right);
				Node temp = new Node();
				temp.data = no;
				temp.left = node.left;
				temp.right = node.right;
				removeNode(no);
				return temp;

			}

		}

	}

}
