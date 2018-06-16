package DS.LinkedList;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist ll = new Linkedlist();
		// ll.addLast(10);
		// ll.addLast(20);
		// ll.addLast(30);
		// ll.addLast(40);
		// ll.addLast(50);
		// ll.display();
		// ll.addAt(25, 2);
		// ll.display();
		// ll.removeAt(2);
		// ll.display();
		// System.out.println(ll.getAt(3));
		// ll.removelast();
		// ll.removelast();
		// ll.removelast();
		// ll.removelast();
		// ll.removelast();
		// ll.display();
		// ll.addLast(10);
		// ll.addAt(20, 0);
		// ll.addFirst(30);
		// ll.display();

		// if i say just ll.size then it searches in client file and when
		// cant find it then it go
		// to linkedlist class and find variable size and
		// print it if its not declared as private
		// but if it is priate then it can't access it.
		// System.out.println(ll.size());
		ll.addFirst(10);
		ll.display();
		ll.removefirst();
		ll.display();
		ll.addLast(10);
		ll.display();
		ll.removelast();
		ll.display();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.addAt(50, 2);
		ll.display();
		ll.removefirst();
		ll.display();
		ll.removelast();
		ll.display();
		ll.addAt(80, 3);
		ll.display();

	}

}
