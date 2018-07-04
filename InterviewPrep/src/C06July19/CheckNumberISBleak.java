package C06July19;

import java.util.Scanner;

public class CheckNumberISBleak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		int nsb=nob(no);
		
		int ls=no-nsb;
		while(ls<no){
			
			int temp=nob(ls);
			
			if(temp+ls==no){
				System.out.println("Yes");
				return;
			}
				
				
				ls++;
			}
			
			
			
		
		System.out.println("No");

	}

	public static int nob(int no) {

		int nsb = 0;
		while (no > 0) {
			if (no % 2 == 1)
				nsb++;
			no /= 2;
		}

		return nsb;

	}

}
