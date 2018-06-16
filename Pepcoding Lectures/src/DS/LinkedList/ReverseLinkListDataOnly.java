package DS.LinkedList;

public class ReverseLinkListDataOnly extends Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Linkedlist ll = new Linkedlist();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.display();
		
		reversedataOnly(ll);

	}

	public static void reversedataOnly(Linkedlist ll) {

		node temp = ll.head;
		node nn = new node();
		nn = temp.next;

		for (int i = 0; i < ll.size - 1; i++) {

			node nex = nn.next;
			nn.next = temp;

			temp = nn;
			nn = nex;

		}
		node z=ll.head;
		ll.head=ll.tail;
		ll.tail=z;
		ll.tail.next=null;
		ll.display();

	}

}
