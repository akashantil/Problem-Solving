package DS.LinkedList;

public class KthFromLast extends Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Linkedlist ll = new Linkedlist();

		ll.addFirst(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
//		ll.addLast(60);
//		ll.addLast(70);
//		ll.addLast(80);
		ll.display();
		int k = 2;
		System.out.println(solve(ll, k));
		System.out.println(mid(ll, 1));

	}

	public static int solve(Linkedlist ll, int k) {

		node kth = ll.getNodeAt(k);
		node i = ll.head;

		while (kth != null) {
			kth = kth.next;
			i = i.next;

		}

		return i.data;

	}

	public static int mid(Linkedlist ll, int count) {

		node mid = ll.head;
		node i = ll.head;
		while (i.next != null) {
			i = i.next;

			count++;

			if (count % 2 == 1) {
				mid = mid.next;

			}
		}
		return mid.data;

	}

}
