package DS.LinkedList;



public  class GenericLInkedList<T>{

	public  class node {
		T data;
		node next;
	}

	protected node head;
	protected node tail;
	protected int size;

	public void addLast(T data) {

		node temp = new node();

		temp.data = data;

		if (size != 0) {
			tail.next = temp;
			tail = temp;

		}

		else {
			head = temp;
			tail = temp;

		}
		size++;

	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void display() {
		node temp = head;

		for (int i = 0; i < size; i++) {
			System.out.print(temp.data + "->");
			temp = temp.next;

		}
		System.out.print(".");
		System.out.println();

	}

	public void addFirst(T data) {
		node temp = new node();
		temp.data = data;

		if (size != 0) {

			temp.next = head;

		} else {
			head = temp;

			tail = head;

		}
		head = temp;
		size++;

	}

	public void addAt(T data, int idx) {

		node iterator = head;
		node temp = new node();
		temp.data = data;

		if (idx < 0 || idx > size) {
			System.out.println("Invalid Index");
			return;
		}

		else if (idx == 0) {
			this.addFirst(data);
			return;
		} else if (idx == size) {
			this.addLast(data);
			return;
		}

		else {

			for (int i = 1; i < idx; i++) {
				iterator = iterator.next;
			}

			temp.next = iterator.next;
			iterator.next = temp;

			size++;
		}
	}

	public void removelast() {
		if (size == 0) {
			System.out.println("Empty list");
			return;
		} else if (size == 1) {
			head = null;
			tail = null;
			size = 0;
			return;
		}

		node temp = head;

		for (int i = 0; i < size - 2; i++) {
			temp = temp.next;

		}
		temp.next = null;
		tail = temp;

		size--;

	}

	public T removefirst() {
		T temp = head.data;

		if (size != 1)
			head = head.next;
		else
			head = null;
		size--;

		return temp;

	}

	public T removeAt(int idx) {

		if (size == 0) {
			System.out.println("Empty list");
			return null;
		}

		if (idx < 0 || idx >= size) {
			System.out.println("Invalid Index");
			return null;
		}

		T temp = null;
		if (idx == 0) {
			if (size != 1) {
				temp = head.data;
				head = head.next;

			} else {
				temp = head.data;
				head = null;
			}
			size--;

		}

		node iterator = head;

		for (int i = 1; i < idx; i++) {
			iterator = iterator.next;
		}
		temp = iterator.data;
		iterator.next = iterator.next.next;

		return temp;

	}

	public T getFirst() {

		if (size == 0) {
			System.out.println("Empty List");
			return null;
		} else
			return head.data;
	}

	public T getLast() {

		if (size == 0) {
			System.out.println("Empty List");
			return null;
		} else
			return tail.data;

	}

	public T getAt(int idx) {

		if (idx < 0 || idx >= size) {
			System.out.println("Invalid Index");
			return null;
		} else {
			node temp = head;

			for (int i = 0; i < idx; i++) {
				temp = temp.next;

			}
			return temp.data;
		}

	}

	protected node getNodeAt(int idx) {
		node temp = head;
		if (idx < 0 || idx >= size) {
			System.out.println("Invalid Index");
			return null;
		} else {

			for (int i = 0; i < idx; i++) {
				temp = temp.next;

			}

		}
		return temp;

	}

}
