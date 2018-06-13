package DynamicStack;

public class DynamicStackk extends stack{
	
	
	public DynamicStackk(int cap){
		
		super(cap);
	}
	
	@Override
	public void push(int val) {
		// TODO Auto-generated method stub
		if(tos==data.length-1){
			
			int [] newdata = new int [2*data.length];
			
			for(int i=0;i<data.length;i++)
				newdata[i]=data[i];
			
			this.data=newdata;
		}
		super.push(val);
	}

}
