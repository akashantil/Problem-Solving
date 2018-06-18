package DS.LinkedList;

public class KReverse extends Linkedlist {

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
		ll.addLast(80);
		ll.addLast(90);
		int k = 3;

		Linkedlist curr = new Linkedlist();
		Linkedlist prev = new Linkedlist();

		for (int i = 0; i < k; i++) {
			int temp = ll.removefirst();
			prev.addFirst(temp);

		}

		while (ll.size > 0) {
			for (int i = 0; i < k; i++) {
				int temp = ll.removefirst();
				curr.addFirst(temp);

			}
			prev.tail.next = curr.head;

			prev.tail = curr.tail;
			prev.size += curr.size;
			curr = new Linkedlist();

		}

		prev.display();
	}

}
