package DS;

public class ClientQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue qu= new Queue(5);
		
		qu.enqueue(10);
		qu.enqueue(20);
		qu.enqueue(30);
		qu.enqueue(40);
		qu.enqueue(50);
		//qu.display();
		qu.dequeue();
		qu.dequeue();
		qu.enqueue(60);
		qu.enqueue(70);
		qu.enqueue(80);
		qu.display();
		

	}

}
