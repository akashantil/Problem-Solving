package April7;

public class ElementFrom1ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,2,3,1,4,3};
		int ws=0;
		int cs=0;
		//other approach use xor with i below
		for(int i=0;i<arr.length;i++){
			ws+=arr[i];
			cs+=i;
			
		}
		System.out.println(ws-cs);
		
		int value=0;
		for(int i=0;i<arr.length;i++){
			value=value^arr[i]^i;
			
		}
		System.out.println(value);

	}

}
