package MedianPriorityQueue;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueueMedian pqm = new PriorityQueueMedian();
		
		pqm.add(10);
		pqm.add(20);
		pqm.add(30);
		pqm.add(40);
		pqm.add(50);
		pqm.add(60);
		System.out.println(pqm.remove());
		System.out.println(pqm.remove());
		System.out.println(pqm.peek());
		pqm.add(35);
		System.out.println(pqm.peek());

	}

}
