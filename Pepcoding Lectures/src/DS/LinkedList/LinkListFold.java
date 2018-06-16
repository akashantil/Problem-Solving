package DS.LinkedList;

public class LinkListFold extends Linkedlist {

	private static class HeapMover {
		node nodee;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist ll = new Linkedlist();

		ll.addFirst(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.addLast(60);
		ll.addLast(70);
		ll.display();

		HeapMover mover = new HeapMover();
		mover.nodee = ll.head;
		solve(ll, mover, ll.head, 0);
		ll.display();
	}

	public static void solve(Linkedlist ll, HeapMover left, node right, int size) {

		if (right == null)
			return;

		solve(ll, left, right.next, size + 1);

		if (size > ll.size / 2) {

			node onext = left.nodee.next;
			left.nodee.next = right;
			right.next = onext;

			left.nodee = onext;
		}
		else if (size == ll.size / 2) {
			ll.tail = right;
			ll.tail.next = null;
		}

	}

}
