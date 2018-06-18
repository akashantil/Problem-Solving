package DS.LinkedList;

public class RemoveDuplicates extends Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist ll = new Linkedlist();

		// ll.addFirst(10);
		// ll.addFirst(10);
		// ll.addLast(20);
		ll.addFirst(10);
		ll.addFirst(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(30);
		ll.addLast(30);
		ll.addLast(60);
		ll.addLast(60);
		ll.addLast(90);

		System.out.println(ll.size);
		ll.display();

		removeDuplicates(ll);
		ll.display();
		ll.addLast(100);
		ll.display();
		System.out.println(ll.size);

		// this one is also o(n) and o(1) space
		// but if we are asked not to change pointer then 2nd is preferable
		//

		// Linkedlist ans = new Linkedlist();
		// ans.addFirst(ll.removefirst());

		// while (ll.size > 0) {
		// int temp = ll.removefirst();
		// if (ans.tail.data != temp) {
		//
		// ans.addLast(temp);
		// }
		//
		// }
		//
		// ans.display();

	}

	public static void removeDuplicates(Linkedlist ll) {

		node prev = ll.head;
		node curr = ll.head;
		int counter = 1;

		while (curr.next != null) {

			if (curr.data != prev.data) {
				counter++;

				prev.next = curr;
				curr = prev;
				prev = prev.next;

			}
			curr = curr.next;

		}
		if (curr.data != prev.data) {
			counter++;

			prev.next = curr;
			ll.tail = curr;

		} else {
			ll.tail = prev;
		}

		ll.size = counter;

	}

}
