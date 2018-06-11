package DS;

public class ClientStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stack st = new stack(4);
		st.push(10);
		st.display();
		st.push(20);
		st.display();
		st.push(30);
		st.display();
		st.push(40);
		st.display();
		st.push(50);
		st.display();
		
		
		
	   System.out.println(st.pop());
	   st.display();
	   System.out.println(st.pop());
	   st.display();
	   System.out.println(st.pop());
	   st.display();
	   System.out.println(st.pop());
	   st.display();
	   System.out.println(st.pop());
	   st.display();
	   

	}

}
