package DS.LinkedList;

public class MergeSort extends Linkedlist {

	public static void main(String[] args) {

		Linkedlist l1 = new Linkedlist();

		l1.addLast(10);
		l1.addLast(20);
		l1.addLast(30);
		l1.addLast(40);
		l1.addLast(50);
		l1.addLast(60);

		l1.addLast(5);
		l1.addLast(15);
		l1.addLast(25);
		l1.addLast(35);
		l1.addLast(45);
		l1.addLast(55);

		l1.display();

		Linkedlist ans = mergeSort(l1);
		System.out.println(ans.size);

		ans.display();

		// TODO Auto-generated method stub

	}

	public static Linkedlist mergeSort(Linkedlist ll) {

		if (ll.head == ll.tail) {

			return ll;
		}

		node mid = midnode(ll);

		Linkedlist l1 = new Linkedlist();
		Linkedlist l2 = new Linkedlist();

		l1.head = ll.head;
		l1.tail = mid;

		l2.head = mid.next;
		l2.tail = ll.tail;
		l1.tail.next = null;

		Linkedlist first = mergeSort(l1);
		Linkedlist second = mergeSort(l2);

		Linkedlist res = mergePro(first, second);

		res.size = ll.size;

		return res;

	}

	public static node midnode(Linkedlist ll) {
		int count = 1;

		node mid = ll.head;
		node i = ll.head;
		while (i.next != null) {
			i = i.next;

			count++;

			if (count % 2 == 1) {
				mid = mid.next;

			}
		}
		return mid;

	}

	public static Linkedlist mergePro(Linkedlist l1, Linkedlist l2) {

		node head1 = l1.head;
		node head2 = l2.head;

		Linkedlist l3 = new Linkedlist();

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
		return l3;

	}

}
