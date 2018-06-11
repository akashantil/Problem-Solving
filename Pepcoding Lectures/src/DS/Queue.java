package DS;

public class Queue {

	private int[] data;
	private int size;
	private int front;

	public Queue(int cap) {
		this.data = new int[cap];
		this.size = 0;
		this.front = 0;

	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public int peek() {
		if (size == 0) {
			System.out.println("Queue UnderFlow");
			return -1;

		}

		return data[front];
	}

	public void enqueue(int val) {
		if (size == data.length) {
			System.out.println("Queue Overflow");
			return;
		}
		int rear = (front + size) % data.length;
		data[rear] = val;
		size++;

	}
	public int dequeue(){
		if(size==0){
			System.out.println("Queue UnderFlow");
			return -1;
		}
		int rv=data[front];
		data[front]=0;
		front=(front+1)%data.length;
		size--;
		
		
		return rv;		
	}
	
	public void display(){
		
		int j=front;
		int tempsize=size;
		
		while( tempsize>0){
			System.out.print(data[j]+"->");
			j=(j+1)%data.length;
			tempsize--;
		}
	}

}
