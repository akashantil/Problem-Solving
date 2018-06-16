package DS.LinkedList;

import DS.LinkedList.Linkedlist.node;

public class ReversePointerRecursive extends Linkedlist {

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

		ll.display();

		node prev = ll.head;
		node curr = prev.next;
		node nexP = curr.next;

		// solve(ll, curr, prev, nexP);

		HeapMover mover = new HeapMover();
		mover.nodee = ll.head;
		reverseData(ll, mover, prev, 0);

		ll.display();

	}

	private static void solve(Linkedlist ll, node curr, node prev, node nexP) {

		if (curr == null) {
			node temp = ll.head;
			ll.head = prev;
			ll.tail = temp;
			ll.tail.next = null;
			return;
		}

		curr.next = prev;
		prev = curr;
		curr = nexP;
		if (nexP != null)
			nexP = nexP.next;

		solve(ll, curr, prev, nexP);

	}

	private static void reverseData(Linkedlist ll, HeapMover temp, node iter, int size) {

		if (iter == null)
			return;

		reverseData(ll, temp, iter.next, size + 1);
		if (size >= ll.size / 2) {
			int tem = iter.data;
			iter.data = temp.nodee.data;
			temp.nodee.data = tem;
			temp.nodee = temp.nodee.next;
		}

	}

}
