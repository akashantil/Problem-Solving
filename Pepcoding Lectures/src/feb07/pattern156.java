package feb07;

public class pattern156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, j, current = 1,next=0,prev=0;
		
		for (i = 0; i <= 5; i++) {
			for (j = 0; j <= i; j++) {
				
				System.out.print(" " + prev + " ");
				next=current +prev;
				prev=current;
				current=next;
				
				
			}

			System.out.println(" ");
		}

	}

}
