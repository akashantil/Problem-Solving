package DS.LinkedList;

public class MergeTwoSortedLinkedList extends Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist l1 = new Linkedlist();
		Linkedlist l2 = new Linkedlist();
		Linkedlist l3 = new Linkedlist();

		l1.addLast(10);
		l1.addLast(20);
		l1.addLast(30);
		l1.addLast(40);
		l1.addLast(50);
		l1.addLast(60);

		l2.addLast(5);
		// l2.addLast(15);
		// l2.addLast(25);
		// l2.addLast(35);
		// l2.addLast(45);
		// l2.addLast(55);

		l1.display();
		l2.display();
		l3.display();
		mergeSorted(l1, l2, l3);
		l1.display();
		l2.display();
		l3.display();

	}

	public static void mergeSorted(Linkedlist l1, Linkedlist l2, Linkedlist l3) {

		node head1 = l1.head;
		node head2 = l2.head;

		int count = l1.size + l2.size;

		while (count >= 0) {

			if (head1 != null && head2 != null) {
				if (head1.data <= head2.data) {
					l3.addLast(head1.data);
					head1 = head1.next;

					count--;
				} else if (head1.data > head2.data) {
					l3.addLast(head2.data);
					head2 = head2.next;
					count--;

				}

			} else if (head1 == null && head2 != null) {
				l3.addLast(head2.data);
				count--;
				head2 = head2.next;

			} else if (head1 != null && head2 == null) {
				l3.addLast(head1.data);
				head1 = head1.next;

				count--;
			}

		}

	}

}
