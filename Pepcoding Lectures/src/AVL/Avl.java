package AVL;


public class Avl {
	public class Node {
		int data;
		Node left;
		Node right;
		int ht;
		int bf;
	}

	public Node root;
	public int size;

	public Avl(int[] sa) {
		root = construct(sa, 0, sa.length - 1);

	}

	private Node construct(int[] sa, int lo, int hi) {

		int mid = (lo + hi) / 2;
		if (lo <= hi) {

			Node self = new Node();
			self.data = sa[mid];
			this.size++;

			self.left = construct(sa, lo, mid - 1);
			self.right = construct(sa, mid + 1, hi);
			self.ht = height(self);
			self.bf = getBalanceFactor(self);
			

			return self;
		} else {

			return null;

		}
	}

	private int height(Node self) {
		// TODO Auto-generated method stub
		if (self == null)
			return -1;
		int lh = -1;
		int rh = -1;

		if (self.left != null)
			lh = self.left.ht;
		if (self.right != null)
			rh = self.right.ht;

		return Math.max(lh, rh) + 1;
	}

	private int getBalanceFactor(Node self) {
		// TODO Auto-generated method stub
		if (self == null) {
			return 0;
		}
		return height(self.left) - height(self.right);
	}

	public void display() {
		display(this.root);

	}

	private void display(Node node) {

		if (node == null)
			return;
		String str = node.left != null ? node.left.data + " " : " . ";
		str += "-> " + node.data + "[ " + node.ht + " " + node.bf + "]<- ";
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

		root = addNode(this.root, data);
	}

	private Node addNode(Node node, int data) {

		if (node == null) {
			Node nn = new Node();
			nn.data = data;
			return nn;

		}

		if (data > node.data) {

			node.right = addNode(node.right, data);
		}

		else if(data < node.data){
			node.left = addNode(node.left, data);
		}

		node.ht = height(node);
		node.bf = getBalanceFactor(node);

		if (node.bf > 1) {

			// unbalanced node find which unbalancing it is and balance it

			if (node.left.bf > 0) {
				// mean unbalancing at left
				// find ll or lr

				node = RightBalance(node);
			} else {

				node.left = LeftBalance(node.left);
				node = RightBalance(node);

				// means lr
			}
		}

		else if (node.bf < -1) {
			// means unbalancing in right

			if (node.right.bf < 0) {
				// means rr
				node = LeftBalance(node);
			} else {
				// means rl
				node.right = RightBalance(node.right);

				node = LeftBalance(node);
			}

		}

		return node;

	}

	private Node LeftBalance(Node z) {
		// TODO Auto-generated method stub

		Node y = z.right;
		Node t3 = y.left;

		z.right = t3;
		y.left = z;

		z.ht = height(z);
		z.bf = getBalanceFactor(z);
		
		y.ht = height(y);
		y.bf = getBalanceFactor(y);

		return y;
	}

	private Node RightBalance(Node z) {
		// TODO Auto-generated method stub
		Node y = z.left;
		Node t3 = y.right;

		z.left = t3;
		y.right = z;

		z.ht = height(z);
		z.bf = getBalanceFactor(z);
		
		y.ht = height(y);
		y.bf = getBalanceFactor(y);

		return y;
	}

	public void removeNode(int data) {
		root = removeNode(this.root, data);

	}

	private Node removeNode(Node node, int data) {

		if (data > node.data) {
			node.right = removeNode(node.right, data);
			node = node.right;
		} else if (data < node.data) {
			node.left = removeNode(node.left, data);
			node = node.left;

		} else {
			if (node.left == null && node.right == null) {
				return null;
			} else if (node.left == null && node.right != null)
				node = node.right;
			else if (node.left != null && node.right == null)
				node = node.left;
			else {

				int no = min(node.right);
				Node temp = new Node();
				temp.data = no;
				temp.left = node.left;
				temp.right = node.right;
				removeNode(no);
				node = temp;

			}
			node.ht = height(node);
			node.bf = getBalanceFactor(node);

			if (node.bf > 1 || node.bf < -1) {

				// unbalanced node find which unbalancing it is and balance it

				int lh = node.left.ht;
				int rh = node.right.ht;

				if (lh - rh > 1) {
					// mean unbalancing at left
					// find ll or lr
					if (node.left.bf > 0) {
						// means ll

						node = RightBalance(node);
					} else {

						node.left = LeftBalance(node.left);
						node = RightBalance(node);

						// means lr
					}
				}

				else {
					// means unbalancing in right

					if (node.right.bf < 0) {
						// means rr
						node = LeftBalance(node);
					} else {
						// means rl
						node.right = RightBalance(node.right);

						node = LeftBalance(node);
					}

				}

			}

		}
		return node;

	}

}
