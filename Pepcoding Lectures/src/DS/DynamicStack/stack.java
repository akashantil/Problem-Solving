package DynamicStack;

public class stack {
	protected int[] data;
	protected int tos;

	public stack(int cap) {
		this.data = new int[cap];
		this.tos = -1;
	}

	public void push(int val) {
		if (tos == data.length - 1) {
			System.out.println("Stack Overflow");
			return;
		}
		tos++;
		data[tos] = val;
	}

	public int pop() {
		if (this.isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		int poped = data[tos];
		tos--;

		return poped;
	}

	public int size() {
		return tos + 1;
	}

	public boolean isEmpty() {
		return tos == -1;
	}

	public void display() {

		int temp = tos;
		while (temp > 0) {
			System.out.print(data[temp] + "->");
			temp--;
		}
		if (temp == 0)

			System.out.print(data[temp]);
		System.out.print(".");
		System.out.println();

	}

}
