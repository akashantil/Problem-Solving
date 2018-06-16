package DynamicQueue;

public class dynamicQueuee extends Queue {

	public dynamicQueuee(int cap) {

		super(cap);
	}

	@Override
	public void enqueue(int val) {
		// TODO Auto-generated method stub
		if (size == data.length) {
			int[] newdata = new int[2 * data.length];

			int j = front;
			int tempsize = size;
			int i = 0;

			while (tempsize > 0) {
				newdata[i] = data[j];
				
				j = (j + 1) % data.length;
				tempsize--;
				i++;
			}
			this.data=newdata;
			front =0;
			
		}
			
			super.enqueue(val);

		
	}

}
